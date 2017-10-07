package View; /**
 * Created by Olivi on 23-03-2017.
 */
import javafx.scene.control.Alert;

public final class WindowUtility {
    private WindowUtility() {
    }

    public static void showWindow(Alert.AlertType type, String title, String headerText, String contentText) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}
