
package gamegui;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.stream.IntStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


public class Components {
    
    
    public Components() {
        //using a constructor to initialize the ArrayLists
         elementsO = new ArrayList<>();
         elementsO.add(0, false);
         elementsO.add(1, false);
         elementsO.add(2, false);
         elementsO.add(3, false);
         elementsO.add(4, false);
         elementsO.add(5, false);
         elementsO.add(6, false);
         elementsO.add(7, false);
         elementsO.add(8, false);
         
         elementsX = new ArrayList<>();
         elementsX.add(0, false);
         elementsX.add(1, false);
         elementsX.add(2, false);
         elementsX.add(3, false);
         elementsX.add(4, false);
         elementsX.add(5, false);
         elementsX.add(6, false);
         elementsX.add(7, false);
         elementsX.add(8, false);
                           
    }
    
//creating objects the main functionality of the program relies on
    
    ButtonController obj = new ButtonController();
    static ArrayList<Boolean> elementsO;
    static ArrayList<Boolean> elementsX;
    
    String win;
    static ArrayList<Button> buttons = new ArrayList();
    
    static Button b1 = new Button("");
    static Button b2 = new Button("");
    static Button b3 = new Button("");
    static Button b4 = new Button("");
    static Button b5 = new Button("");
    static Button b6 = new Button("");
    static Button b7 = new Button("");
    static Button b8 = new Button("");
    static Button b9 = new Button("");
    static Button start = new Button("Start");
    
     
    SecureRandom rand = new SecureRandom();
    
    
    Image firstX = new Image("css/x.png");
    ImageView firstImgV = new ImageView(firstX); 
    
    Image circle = new Image("css/c.png");
    ImageView imgV1 = new ImageView(circle);
    Image x = new Image("css/x.png");
    ImageView imgV2 = new ImageView(x);
    
    Image circle2 = new Image("css/c.png");
    ImageView imgV12 = new ImageView(circle);
    Image x2 = new Image("css/x.png");
    ImageView imgV22 = new ImageView(x);
    
    Image circle3 = new Image("css/c.png");
    ImageView imgV13 = new ImageView(circle);
    Image x3 = new Image("css/x.png");
    ImageView imgV23 = new ImageView(x);
    
    Image circle4 = new Image("css/c.png");
    ImageView imgV14 = new ImageView(circle);
    Image x4 = new Image("css/x.png");
    ImageView imgV24 = new ImageView(x);
    
    Image circle5 = new Image("css/c.png");
    ImageView imgV15 = new ImageView(circle);
    Image x5 = new Image("css/x.png");
    ImageView imgV25 = new ImageView(x);
    
    Image circle6 = new Image("css/c.png");
    ImageView imgV16 = new ImageView(circle);
    Image x6 = new Image("css/x.png");
    ImageView imgV26 = new ImageView(x);
    
    Image circle7 = new Image("css/c.png");
    ImageView imgV17 = new ImageView(circle);
    Image x7 = new Image("css/x.png");
    ImageView imgV27 = new ImageView(x);
    
    Image circle8 = new Image("css/c.png");
    ImageView imgV18 = new ImageView(circle);
    Image x8 = new Image("css/x.png");
    ImageView imgV28 = new ImageView(x);
    
    Image circle9 = new Image("css/c.png");
    ImageView imgV19 = new ImageView(circle);
    Image x9 = new Image("css/x.png");
    ImageView imgV29 = new ImageView(x);
    
    
   
    //returns the gridPane object used in the main start method
    public GridPane getGrid() {
        
        GridPane g = new GridPane();
        g.setAlignment(Pos.TOP_CENTER);
        
        b1.setMaxSize(150, 150);
        b2.setMaxSize(150, 150);
        b3.setMaxSize(150, 150);
        b4.setMaxSize(150, 150);
        b5.setMaxSize(150, 150);
        b6.setMaxSize(150, 150);
        b7.setMaxSize(150, 150);
        b8.setMaxSize(150, 150);
        b9.setMaxSize(150, 150);
        
        start.setId("start");
        
        Button restart = new Button("Restart");
        restart.setId("restart");
        
    //makes sure the game can only start when the "start" button is clicked 
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);
    //adds buttons to a specific index of the arrayList    
        buttons.add(0, b1);
        buttons.add(1, b2);
        buttons.add(2, b3);
        buttons.add(3, b4);
        buttons.add(4, b5);
        buttons.add(5, b6);
        buttons.add(6, b7);
        buttons.add(7, b8);
        buttons.add(8, b9);
    //adds elements to the gridPane returned by this method   
        g.add(b1, 0, 0);
        g.add(b2, 1, 0);
        g.add(b3, 2, 0);
        g.add(b4, 0, 1);
        g.add(b5, 1, 1);
        g.add(b6, 2, 1);
        g.add(b7, 0, 2);
        g.add(b8, 1, 2);
        g.add(b9, 2, 2);
        g.add(start, 1, 2);
        start.setMaxSize(60, 20);
        start.setTranslateX(47);
        start.setTranslateY(120);
        g.add(restart, 1, 2);
        restart.setMaxSize(60, 20);
        restart.setTranslateX(47);
        restart.setTranslateY(165);
        
        ColumnConstraints column1 = new ColumnConstraints(145); 
        ColumnConstraints column2 = new ColumnConstraints(145); 
        ColumnConstraints column3 = new ColumnConstraints(145); 
        g.getColumnConstraints().addAll(column1, column2, column3); 
        RowConstraints row1 = new RowConstraints(150); 
        RowConstraints row2 = new RowConstraints(150);
        RowConstraints row3 = new RowConstraints(150);
        g.getRowConstraints().addAll(row1, row2, row3); 
      
        Winner w = new Winner();

        start.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            
                       b1.setDisable(false);
                       b2.setDisable(false);
                       b3.setDisable(false);
                       b4.setDisable(false);
                       b5.setDisable(false);
                       b6.setDisable(false);
                       b7.setDisable(false);
                       b8.setDisable(false);
                       b9.setDisable(false);
                       int index = rand.nextInt(buttons.size());
                       
                        firstImgV.setFitHeight(110);
                        firstImgV.setPreserveRatio(true);
                    
                            buttons.get(index).setGraphic(firstImgV);
                            buttons.get(index).setDisable(true); 
                            buttons.set(index, null); //instead of removing elements the "bot" pressed, set them to null after used once 
                            
                            elementsX.set(index, true);
                            System.out.println("Index from start button: " + index);
                            System.out.println(buttons + " Buttons arrayList");
                            System.out.println(elementsX + " elementsX arrayList");
                            
                        obj.isUsersTurn = true; 
                        start.setDisable(true);
            }
        });
        
        
        RestartEventHandler RestartEventHandler = new RestartEventHandler();
        restart.setOnAction(RestartEventHandler);
      
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {      //if the user clicks a button, set the imageView to a circle, and updates the values stored in the arrayLists
                    imgV1.setFitHeight(130);
                    imgV1.setPreserveRatio(true);
                    b1.setGraphic(imgV1);
                    
                    elementsO.set(0, true);
                    elementsX.set(0, false);
                    
                    System.out.println("b1: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);     //checks if there is a winner so far
                        

                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b1.fire());      //automatically executes the "bot"'s response (elseMethod)
                    b1.setDisable(true); 
                } else {
                        obj.elseMethod(imgV2, buttons, b1, elementsX);
                        System.out.println("elementsX of b1 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);     //checks if there is a winner so far
                        
                       obj.isUsersTurn = true; 
                }
            }
        });
        
         b2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV12.setFitHeight(130);
                    imgV12.setPreserveRatio(true);
                    b2.setGraphic(imgV12);
                    
                    elementsO.set(1, true);
                    elementsX.set(1, false);
                    
                    System.out.println("b2: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b2.fire());
                    b2.setDisable(true); 
                } else {
                        obj.elseMethod(imgV22, buttons, b2, elementsX); 
                        System.out.println("elementsX of b2 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                      obj.isUsersTurn = true;   
                }
            }
        });
         
         b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV13.setFitHeight(130);
                    imgV13.setPreserveRatio(true);
                    b3.setGraphic(imgV13);
                    
                    elementsO.set(2, true);
                    elementsX.set(2, false);
                    
                    System.out.println("b3: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                   
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b3.fire());
                    b3.setDisable(true);
                } else {
                        obj.elseMethod(imgV23, buttons, b3, elementsX); 
                        System.out.println("elementsX of b3 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                       
                    obj.isUsersTurn = true;    
                }
            }
        });
         
         b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV14.setFitHeight(130);
                    imgV14.setPreserveRatio(true);
                    b4.setGraphic(imgV14);
                    
                    elementsO.set(3, true);
                    elementsX.set(3, false);
                    
                    System.out.println("b4: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b4.fire());
                    b4.setDisable(true); 
                } else {
                        obj.elseMethod(imgV24, buttons, b4, elementsX); 
                        System.out.println("elementsX of b4 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;    
                }
            }
        });
         
         b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV15.setFitHeight(130);
                    imgV15.setPreserveRatio(true);
                    b5.setGraphic(imgV15);
                    
                    elementsO.set(4, true);
                    elementsX.set(4, false);
                    
                    System.out.println("b5: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                       
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b5.fire());
                    b5.setDisable(true); 
                } else {
                        obj.elseMethod(imgV25, buttons, b5, elementsX);
                        System.out.println("elementsX of b5 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;    
                }
            }
        });
         
         b6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV16.setFitHeight(130);
                    imgV16.setPreserveRatio(true);
                    b6.setGraphic(imgV16);
                    
                    elementsO.set(5, true);
                    elementsX.set(5, false);
                    
                    System.out.println("b6: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b6.fire());
                    b6.setDisable(true); 
                } else {
                        obj.elseMethod(imgV26, buttons, b6, elementsX); 
                        System.out.println("elementsX of b6 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;    
                }
            }
        });
         
         b7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV17.setFitHeight(130);
                    imgV17.setPreserveRatio(true);
                    b7.setGraphic(imgV17);
                    
                    elementsO.set(6, true);
                    elementsX.set(6, false);
                    
                    System.out.println("b7: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    
                    IntStream.range(0, 1).forEach(i -> b7.fire());
                    b7.setDisable(true);
                } else {
                        obj.elseMethod(imgV27, buttons, b7, elementsX); 
                        System.out.println("elementsX of b7 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;    
                }
            }
        });
         
         b8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV18.setFitHeight(130);
                    imgV18.setPreserveRatio(true);
                    b8.setGraphic(imgV18);
                    
                    elementsO.set(7, true);
                    elementsX.set(7, false);
                    
                    System.out.println("b8: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b8.fire());
                    b8.setDisable(true); 
                } else {
                        obj.elseMethod(imgV28, buttons, b8, elementsX);
                        System.out.println("elementsX of b8 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;  
                }
            }
        });
         
         b9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                if (obj.isUsersTurn) {
                    imgV19.setFitHeight(130);
                    imgV19.setPreserveRatio(true);
                    b9.setGraphic(imgV19);
                   
                    elementsO.set(8, true);
                    elementsX.set(8, false);
                    
                    System.out.println("b9: user's turn");
                    System.out.println(elementsO + " elementsO");
                    System.out.println(elementsX + " elementsX");
                    
                    
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    
                    obj.isUsersTurn = false;
                    IntStream.range(0, 1).forEach(i -> b9.fire());
                    b9.setDisable(true); 
                } else {
                        obj.elseMethod(imgV29, buttons, b9, elementsX); 
                        System.out.println("elementsX of b9 else: " + elementsX);
                        w.isWinner(win, elementsO, elementsX, buttons);
                        
                    obj.isUsersTurn = true;    
                }
            }
        });
        
        
        g.setAlignment(Pos.CENTER);
        g.setGridLinesVisible(false);
        return g;
    }
    
    
}
