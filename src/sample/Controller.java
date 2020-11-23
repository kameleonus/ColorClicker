package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
        a.setLayoutY(random.nextInt(550)+30);
        a.setLayoutX(random.nextInt(450)+30);
    }
    public void misclic(){
        if(wynik>0)
        wynik--;
        else wynik=0;
        points.setText(String.valueOf(wynik));
    }
}
