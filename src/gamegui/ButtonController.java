
package gamegui;

import java.security.SecureRandom;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;


public class ButtonController {
    
    SecureRandom rand = new SecureRandom();
    boolean isUsersTurn = false;
    
 
    
    public void elseMethod(ImageView imgVX, ArrayList<Button> buttons, Button b, ArrayList<Boolean> elementsX) {
    
        imgVX.setFitHeight(110);
        imgVX.setPreserveRatio(true);
        
        int i = buttons.indexOf(b);
        buttons.set(i, null); //instead of removing elements the user pressed, sets them to null after used once
        System.out.println(buttons.size() + " buttons size from elseMethod");
    
    //makes sure that the elements that have already been used are not reusable    
        int index;
    do {    
        int localIndex = rand.nextInt(buttons.size());
        index = localIndex;
    } while (buttons.get(index) == null);   
        
                    System.out.println("Index used in elseMethod: " + index);  
                    System.out.println(buttons + " buttons from elseMethod");
                    
                            buttons.get(index).setGraphic(imgVX); 
                            elementsX.set(index, true);
                            buttons.get(index).setDisable(true); 
                            buttons.set(index, null); //instead of removing elements the "bot" pressed, sets them to null after used once      
                            
                            
    }
      
}
