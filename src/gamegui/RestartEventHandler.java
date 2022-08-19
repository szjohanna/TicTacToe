
package gamegui;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import static gamegui.Components.*;
import static gamegui.Winner.wasNotRun;
import static gamegui.Winner.window;

public class RestartEventHandler implements EventHandler<ActionEvent> {
    
    Components c = new Components();
    
    @Override
    public void handle(ActionEvent e) {
                    //sets all buttons clickable
                       b1.setDisable(true);
                       b2.setDisable(true);
                       b3.setDisable(true);
                       b4.setDisable(true);
                       b5.setDisable(true);
                       b6.setDisable(true);
                       b7.setDisable(true);
                       b8.setDisable(true);
                       b9.setDisable(true);
                       
                    //resets arrayLists    
                       buttons.clear();
                       buttons.add(0, b1);
                       buttons.add(1, b2);
                       buttons.add(2, b3);
                       buttons.add(3, b4);
                       buttons.add(4, b5);
                       buttons.add(5, b6);
                       buttons.add(6, b7);
                       buttons.add(7, b8);
                       buttons.add(8, b9);
                       
                       elementsO.set(0, false);
                       elementsO.set(1, false);
                       elementsO.set(2, false);
                       elementsO.set(3, false);
                       elementsO.set(4, false);
                       elementsO.set(5, false);
                       elementsO.set(6, false);
                       elementsO.set(7, false);
                       elementsO.set(8, false);
         
                       elementsX.set(0, false);
                       elementsX.set(1, false);
                       elementsX.set(2, false);
                       elementsX.set(3, false);
                       elementsX.set(4, false);
                       elementsX.set(5, false);
                       elementsX.set(6, false);
                       elementsX.set(7, false);
                       elementsX.set(8, false);
                       
                    //resets button imageViews   
                       b1.setGraphic(null);
                       b2.setGraphic(null);
                       b3.setGraphic(null);
                       b4.setGraphic(null);
                       b5.setGraphic(null);
                       b6.setGraphic(null);
                       b7.setGraphic(null);
                       b8.setGraphic(null);
                       b9.setGraphic(null);
                       
                    //ensures that the popup windows can appear even after restarting   
                       wasNotRun = true;
                       
                    //disables the start button, and closes popup window   
                       start.setDisable(false);
                       System.out.println();
                       window.close();
                       
    }
}
