package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {


    private Button button;

    @FXML
    public void onClickMethod(){

        button.setText("Thanks!");
    }
}