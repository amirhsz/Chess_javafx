package inc.faregh.chess_javafx.controll;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController{

    @FXML
    private void PlayButtonAction(ActionEvent event) throws IOException {
        Parent play = FXMLLoader.load(getClass().getResource("/fxml/Genrate_game.fxml"));
        Stage playstg = new Stage();
        playstg.setScene(new Scene(play));
        playstg.setTitle("Play");
        playstg.show();
        hide(event);
    }

    @FXML
    private void SettingButtonAction(ActionEvent event) throws IOException {
        Parent setting = FXMLLoader.load(getClass().getResource("/fxml/Setting.fxml"));
        Stage settingstg = new Stage();
        settingstg.setScene(new Scene(setting));
        settingstg.setTitle("Play");
        settingstg.show();
        hide(event);
    }

    @FXML
    private void AboutusButtonAction(ActionEvent event) throws IOException {
        Parent aboutus = FXMLLoader.load(getClass().getResource("/fxml/About_us.fxml"));
        Stage aboutusstg = new Stage();
        aboutusstg.setScene(new Scene(aboutus));
        aboutusstg.setTitle("Play");
        aboutusstg.show();
        hide(event);
    }

    private void hide(ActionEvent e){
        Node here = (Node) e.getSource();
        here.getScene().getWindow().hide();
    }

}