package inc.faregh.chess_javafx.modle;

import java.util.HashMap;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Amir
 */
public class App extends Application {

    /**
     *our pieces in game
     */
    public static HashMap<String,pieces> pieces = new HashMap<>();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Play.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Chess");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0 ; i<7 ; i++){
            for(int j = 0 ; j<7 ; j++){
                String id = Integer.toString(i)+","+Integer.toString(j);
                Color c=null;
                if(i<2||i>4){
                    if(i<2){
                        c = Color.w;
                    }else if(i>4){
                        c = Color.b;
                    }
                    if(i==1||i==5){
                            pieces.put(id, new Pawn(id,c));
                    }else{
                        if(j==0||j==6){
                            pieces.put(id, new Rook(id,c));
                        }
                        if(j==1 || j==5){
                            pieces.put(id, new Knight(id,c));
                        }
                        if(j==2 || j==4){
                            pieces.put(id, new Bishop(id,c));
                        }
                        if(j==3||j==4){
                            if(c==Color.b){
                                if(j==4){
                                    pieces.put(id, new Queen(id,c));
                                }else{
                                    pieces.put(id, new King(id,c));
                                }
                            }else{
                                if(j==3){
                                    pieces.put(id, new Queen(id,c));
                                }else{
                                    pieces.put(id, new King(id,c));
                                }
                            }
                        }
                    }
                }
            }
        }
        launch(args);
    }

}
