package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Olivi on 03-03-2017.
 */
public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/salarySystem.fxml"));
        primaryStage.setTitle("Lønudregningssystem");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


        /*Double normSalary = 115.32; //Grundløn
        Double eveSalary = 25.20; //Bonus på hverdag efter 18.00
        Double satBonus = 44.75; //Bonus om lørdagen efter 15.00
        Double sunBonus = 50.60; //Bonus om søndagen

        Double yourHours = 0.00;

        Double yourSalary = 0.00;

        Double afterTax;


        //udregnLoen()
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast antal timer - hverdag før kl. 18:00: ");
        yourHours = sc.nextDouble();
        yourSalary += yourHours * normSalary;

        System.out.println("Indtast antal timer - hverdag efter kl. 18:00: ");
        yourHours = sc.nextDouble();
        yourSalary += ((yourHours * normSalary) + (yourHours * eveSalary));

        System.out.println("Indtast antal timer - lørdag før kl. 15:00: ");
        yourHours = sc.nextDouble();
        yourSalary += yourHours * normSalary;

        System.out.println("Indtast antal timer - lørdag efter kl. 15:00: ");
        yourHours = sc.nextDouble();
        yourSalary += ((yourHours * normSalary) + (yourHours * satBonus));

        System.out.println("Indtast antal timer - søndag: ");
        yourHours = sc.nextDouble();
        yourSalary += ((yourHours * normSalary) + (yourHours * sunBonus));


        System.out.println("Dette er din estimerede løn før skat: " + yourSalary);

        //Beregner skat
        afterTax = (yourSalary - (yourSalary / 100 * 37));
        System.out.println("Dette er din estimerede løn efter skat: " + afterTax);*/

