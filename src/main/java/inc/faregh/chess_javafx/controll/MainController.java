package inc.faregh.chess_javafx.controll;

import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController implements Initializable {
    private Parent here;
    @FXML
    private void PlayButtonAction(ActionEvent event) throws IOException {
        Parent play = FXMLLoader.load(getClass().getResource("Play.fxml"));
        Stage playstg = new Stage();
        playstg.setScene(new Scene(play));
        playstg.setTitle("Play");
        playstg.show();
        here.getScene().getWindow().hide();
    }
    @FXML
    private void SettingButtonAction(ActionEvent event) throws IOException {
        Parent setting = FXMLLoader.load(getClass().getResource("Setting.fxml"));
        Stage settingstg = new Stage();
        settingstg.setScene(new Scene(setting));
        settingstg.setTitle("Play");
        settingstg.show();
        here.getScene().getWindow().hide();
    }
    @FXML
    private void AboutusButtonAction(ActionEvent event) throws IOException {
        Parent aboutus = FXMLLoader.load(getClass().getResource("About_us.fxml"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            here = FXMLLoader.load(location);
        } catch (IOException ex) {}
    }
}