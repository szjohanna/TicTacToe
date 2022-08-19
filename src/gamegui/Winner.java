
package gamegui;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Winner {
    
    PopupW w = new PopupW();
    PopupL l = new PopupL();
    Components c = new Components();
    
    static Stage window = new Stage();
    static boolean wasNotRun = true;
    
    public void isWinner(String win, ArrayList elementsO, ArrayList elementsX, ArrayList buttons) {
    
        if (            (elementsO.get(0).equals(true) & elementsO.get(3).equals(true) & elementsO.get(6).equals(true)) || 
                        (elementsO.get(1).equals(true) & elementsO.get(4).equals(true) & elementsO.get(7).equals(true)) || 
                        (elementsO.get(2).equals(true) & elementsO.get(5).equals(true) & elementsO.get(8).equals(true)) ||
                        (elementsO.get(0).equals(true) & elementsO.get(1).equals(true) & elementsO.get(2).equals(true)) || 
                        (elementsO.get(3).equals(true) & elementsO.get(4).equals(true) & elementsO.get(5).equals(true)) || 
                        (elementsO.get(6).equals(true) & elementsO.get(7).equals(true) & elementsO.get(8).equals(true)) || 
                        (elementsO.get(0).equals(true) & elementsO.get(4).equals(true) & elementsO.get(8).equals(true)) || 
                        (elementsO.get(2).equals(true) & elementsO.get(4).equals(true) & elementsO.get(6).equals(true)) )   {
        
                    win = "win";
            
        } else if (     (elementsX.get(0).equals(true) & elementsX.get(3).equals(true) & elementsX.get(6).equals(true)) || 
                        (elementsX.get(1).equals(true) & elementsX.get(4).equals(true) & elementsX.get(7).equals(true)) || 
                        (elementsX.get(2).equals(true) & elementsX.get(5).equals(true) & elementsX.get(8).equals(true)) ||
                        (elementsX.get(0).equals(true) & elementsX.get(1).equals(true) & elementsX.get(2).equals(true)) || 
                        (elementsX.get(3).equals(true) & elementsX.get(4).equals(true) & elementsX.get(5).equals(true)) || 
                        (elementsX.get(6).equals(true) & elementsX.get(7).equals(true) & elementsX.get(8).equals(true)) || 
                        (elementsX.get(0).equals(true) & elementsX.get(4).equals(true) & elementsX.get(8).equals(true)) || 
                        (elementsX.get(2).equals(true) & elementsX.get(4).equals(true) & elementsX.get(6).equals(true)) )   {
 
                    win = "lose";
            
        }  else {
            win = "neither";
        }
        
        System.out.println("Win before entering main if statement: " + win);
        
        
        //checkes winner based on values stored in arrayLists
                if (win.equals("win")) {
                    if (wasNotRun) {
                        try {
                            w.start(window);
                        } catch (Exception ex) {
                            Logger.getLogger(Winner.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            wasNotRun = false;
                        }
                    }
                } else if (win.equals("lose")) {
                    if (wasNotRun) {
                        try {
                            l.start(window);
                        } catch (Exception ex) {
                            Logger.getLogger(Winner.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            wasNotRun = false;
                        }
                    }
                } 
       
    
    }
    
}
