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
    public Label outOF;
    @FXML
    public Label Tpoints;
    @FXML
    Button a = new Button();
    @FXML
    Button Ta = new Button();
    @FXML
    Button startButton = new Button();
    @FXML
    Button TimedStartButton = new Button();
    @FXML
    public Label lookFor;
    @FXML
    public Label TlookFor;
    @FXML
    public Label lives;
    @FXML
    public Pane pane;
    @FXML
    public Pane Tpane;
    @FXML
    public Pane startPane;
    @FXML
    public Label time;
    int live = 3;
    long czas;
    Random random = new Random();
    String cc="";
    public int wynik;
    long meantime;
    long startTime;
    public void Standard(){
        startButton.setDisable(true);
        startButton.setVisible(false);
        TimedStartButton.setDisable(true);
        TimedStartButton.setVisible(false);
        startPane.setVisible(false);
        startPane.setDisable(true);
        pane.setVisible(true);
        pane.setDisable(false);
        meantime=System.currentTimeMillis();
    }
    public void Timed(){
        startButton.setDisable(true);
        startButton.setVisible(false);
        TimedStartButton.setDisable(true);
        TimedStartButton.setVisible(false);
        startPane.setVisible(false);
        startPane.setDisable(true);
        Tpane.setVisible(true);
        Tpane.setDisable(false);
        meantime=System.currentTimeMillis();
        startTime=System.currentTimeMillis()/1000;
    }

//basic version
    public void score(){
        czas+=System.currentTimeMillis()-meantime;
        wynik++;
        points.setText(String.valueOf(wynik));
        RandomColor(random.nextInt(15));
        a.setStyle("-fx-background-color: "+cc+"; -fx-background-radius: 30px;");
        lookFor.setStyle("-fx-background-color: "+cc);
        a.setLayoutY(random.nextInt(550)+30);
        a.setLayoutX(random.nextInt(450)+30);
        meantime=System.currentTimeMillis();
    }

     //timed version
        public void Timedscore(){
            czas+=System.currentTimeMillis()-meantime;
            wynik++;
            Tpoints.setText(String.valueOf(wynik));
            RandomColor(random.nextInt(15));
            Ta.setStyle("-fx-background-color: "+cc+"; -fx-background-radius: 30px;");
            TlookFor.setStyle("-fx-background-color: "+cc);
            Ta.setLayoutY(random.nextInt(550)+30);
            Ta.setLayoutX(random.nextInt(450)+30);
            meantime=System.currentTimeMillis();
            if((System.currentTimeMillis()/1000)-startTime>=10){
                message("OUT OF TIME");
            }
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
            message("OUT OF LIVES");
        }
    }
    public void message(String type){
        pane.setVisible(false);
        pane.setDisable(true);
        Tpane.setVisible(false);
        Tpane.setDisable(true);
        outOF.setText(type);
        outOF.setDisable(false);
    outOF.setVisible(true);
    a.setDisable(true);
    Ta.setDisable(true);
    time.setText("AVG time: "+czas/wynik+"\n score: "+wynik);
    time.setVisible(true);

    }

}
