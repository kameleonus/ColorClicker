package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Controller {
    @FXML
    public Label points;
    @FXML
     Button a = new Button();
    public int wynik;
    Random random = new Random();
    public void score(){
        wynik++;
        points.setText(String.valueOf(wynik));
        a.setLayoutX(random.nextInt(450)+20);
        a.setLayoutY(random.nextInt(350)+20);
    }
}
