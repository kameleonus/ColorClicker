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
    @FXML
    public Label time;
    int live = 3;
    long czas;
    Random random = new Random();
    String cc="";
    public int wynik;
    long meantime =System.currentTimeMillis();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };
Thread thread = new Thread(runnable);
    public void score(){
        czas+=System.currentTimeMillis()-meantime;
        wynik++;
        points.setText(String.valueOf(wynik));
        RandomColor(random.nextInt(15));
        a.setStyle("-fx-background-color: "+cc+"; -fx-background-radius: 30px;");
        lookFor.setStyle("-fx-background-color: "+cc);
        if(wynik>5){
        createFalseButton(wynik);}
        a.setLayoutY(random.nextInt(550)+30);
        a.setLayoutX(random.nextInt(450)+30);
        meantime=System.currentTimeMillis();
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
            case 12:
                cc ="AZURE";
                break;
            case 13:
                cc ="CORAL";
                break;
            case 14:
                cc ="FUCHSIA";
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
        tlo.setVisible(false);
        endMessage.setDisable(false);
    endMessage.setVisible(true);
    a.setDisable(true);
    time.setText("AVG time: "+czas/wynik+"\n score: "+wynik);
    time.setVisible(true);

    }
    public void createFalseButton(int wynik) {

    }
}
