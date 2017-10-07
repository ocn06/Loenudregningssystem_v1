package Controller;


import View.WindowUtility;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


/**
 * Created by Olivi on 16-03-2017.
 */
public class salarySystemController implements Initializable{

    //GUI
    public TextArea shiftTextArea;
    public RadioButton everydayRadioButton;
    public RadioButton saturdayRadioButton;
    public RadioButton sundayRadioButton;

    public ToggleGroup dayGroup;

    public javafx.scene.control.TextField startTimeTextField;
    public javafx.scene.control.TextField endTimeTextField;

    public Button addShiftButton;
    public Button calculateSalaryButton;

    public DatePicker dateDatePicker;



    //Variabler
    public String shiftString;      //Indeholder en shift
    public String day;              //Dagen på ugen
    public String datePickerday;    //Indeholder dagen på ungen - 1, 2, 3, 4 etc.

    String sTime;                   //Indeholder input om starttid fra brugeren
    String eTime;                   //Indeholder input og sluttid fra brugeren

    Date date;                      //Indeholder datoen
    Date sT;                        //
    Date eT;                        //

    Double hours;                   //Indeholder den enkelte vagts varighed
    Double totalHours;              //Indeholder antal timer i alt


    //TODO CHECK ift. løn -- bruges ikke - endnu
    //String eveningTime = "18:00";
    //String satTime = "15:00";


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void addShift(ActionEvent actionEvent) throws IOException {
        //Gemmer input fra brugeren
        date = java.sql.Date.valueOf(dateDatePicker.getValue());
        sTime = startTimeTextField.getText();
        eTime = endTimeTextField.getText();
        datePickerday = String.valueOf(date.getDay());

        //Checker på dag på ugen
        if (datePickerday.equals("1")) {
            day = "Mandag";
        } else if (datePickerday.equals("2")) {
            day = "Tirsdag";
        } else if (datePickerday.equals("3")) {
            day = "Onsdag";
        } else if (datePickerday.equals("4")) {
            day = "Torsdag";
        } else if (datePickerday.equals("5")) {
            day = "Fredag";
        } else if (datePickerday.equals("6")) {
            day = "Lørdag";
        } else {
            day = "Søndag";
        }

        //TODO check om sluttid er før starttid
        if (sTime.matches(".*[a-z].*") || eTime.matches(".*[a-z].*")) {
            wrongInputType();
        }

        else {

            //Formaterer String til Date
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
            try {

                sT = simpleDateFormat.parse(sTime);
                eT = simpleDateFormat.parse(eTime);

            } catch (Exception e) {
                //wrongInputType();
            }

            //Udregner vagtens varighed
            hours = Double.valueOf(getMinute(eT.getTime(), sT.getTime()));

            //Gemmer vagt
            shiftString = day + " " + date + " " + sTime + "-" + eTime + " " + hours + "\n";

            //Udskriver vagt
            shiftTextArea.appendText(shiftString);

            //TODO - GEM VAGT SOM OBJEKT ---- mega lort
            //Shift shift = new Shift(sDate, eDate, date);
        }
    }

    public static long getMinute(long end, long start) {
        return TimeUnit.MILLISECONDS.toMinutes(end - start) / 60;
    }

    public static long getHours(long end, long start) {
        return TimeUnit.MILLISECONDS.toHours(end - start);
    }

    //Alert box
    private void wrongInputType () {
        WindowUtility.showWindow(
        Alert.AlertType.ERROR,
                "Ups",
                "Det indtastede er ikke en tid",
                "Prøv igen!");
    }

    //TODO - skal udregne lønnen
    public void calculateSalary(ActionEvent actionEvent) {
    }

    //TODO - skal udregne det samlede antal timer
    //TODO - mangler GUI knap
    public void calculateHours(ActionEvent actionEvent) {
    }
}