package front.calculater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FrontController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}