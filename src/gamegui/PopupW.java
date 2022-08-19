
package gamegui;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class PopupW extends Application {

    Components c = new Components();
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Winner w = new Winner();
        primaryStage = new Stage();
        w.window = primaryStage;
        System.out.println(w.window);        
        System.out.println(primaryStage); 
        
        GridPane grid = new GridPane(); 
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER_RIGHT);
        Button exit = new Button("Exit");
        Button restart = new Button("Restart");
        GridPane.setHalignment(restart, HPos.CENTER);
        GridPane.setHalignment(exit, HPos.CENTER);
        
        restart.setTranslateX(-20);
        exit.setTranslateX(-20);
        grid.add(restart, 0, 0);
        grid.add(exit, 0, 1);
        
        exit.setOnAction(x -> System.exit(0));
        
        restart.setOnAction(new RestartEventHandler());
        
        Scene scene = new Scene(grid, 300, 160);
        primaryStage.setScene(scene);
        primaryStage.setTitle("You won!");
        scene.getStylesheets().add(PopupW.class.getResource("/css/won.css").toExternalForm());
        grid.setGridLinesVisible(false);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
}
