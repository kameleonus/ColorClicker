package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Controller {
    @FXML
    public Label points;
    @FXML
    Button a = new Button();
    @FXML
    public Label lookFor;
    @FXML
    public Label lives;
    @FXML
    public Label endMessage;
    @FXML
    public Pane tlo;
    int live = 3;
    Random random = new Random();
    String cc="";

    public int wynik;

    public void score(){
        wynik++;
        points.setText(String.valueOf(wynik));
        RandomColor(random.nextInt(12));
        a.setStyle("-fx-background-color: "+cc+"; -fx-background-radius: 30px;");
        lookFor.setStyle("-fx-background-color: "+cc);
        a.setLayoutY(random.nextInt(550)+30);
        a.setLayoutX(random.nextInt(450)+30);
    }

    private void RandomColor(int pointerColor) {
        switch (pointerColor) {
            case 0:
                cc = "PURPLE";
                break;
            case 1:
                cc = "LIGHTBLUE";
                break;
            case 2:
                cc = "YELLOW";
                break;
            case 3:
                cc = "PINK";
                break;
            case 4:
                cc ="ORANGE";
                break;
            case 5:
                cc ="crimson";
                break;
            case 6:
                cc ="VIOLET";
                break;
            case 7:
                cc ="Brown";
                break;
            case 8:
                cc ="DEEPSKYBLUE";
                break;
            case 9:
                cc ="HONEYDEW";
                break;
            case 10:
                cc ="AQUA";
                break;
            case 11:
                cc ="BISQUE";
                break;
            default:
                cc="RED";
        }
    }
    public void misclic() {
        live--;
        lives.setText("LIVES: "+live);
        if(live==0) {
            message();
        }
    }
    public void message(){
    endMessage.setVisible(true);
    a.setDisable(true);
    tlo.setDisable(true);
    }
}
