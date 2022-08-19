
package gamegui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameGUI extends Application {
Stage window;
Components c = new Components();   
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        Scene s = new Scene(c.getGrid(), 457, 600);
        
        
        s.getStylesheets().add(GameGUI.class.getResource("/css/main.css").toExternalForm());
        window.setTitle("TicTacToe");
        window.setScene(s);
        window.show();
    }
    
    public static void main(String[] args) {  
        launch(args);
    }
    
}
