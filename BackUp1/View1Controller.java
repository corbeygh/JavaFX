package sample; /**
 * Created by Calvin on 25/06/2016.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Controller class for the first vista.
 */
public class View1Controller {

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        ViewNavigator.loadView(ViewNavigator.VIEW_2);
    }

}
