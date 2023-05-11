/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56.gui;
import fr.insa.holler.projet_56.gui.MainPane;
import static fr.insa.holler.projet_56.gui.MainPane.creap;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class MainBar extends MenuBar{
    
    public MainPane main;
    public TextField fiPx1, fiPy1,  fiPx2,  fiPy2,  fiBat
             ,  fiPiece,  rRevet1,  rRevet2,  rRevet3,  rRevet4,
              rRevetS,  rRevetP;
    
    public MainBar(MainPane main) {
        this.main = main;
        Menu file = new Menu("Action");
        MenuItem test1 = new MenuItem("Nouveau");
        test1.setOnAction((t) -> {
            
       String a = fiPx2.getText();
       System.out.println(a);
            
        //creap( fiPx1,  fiPy1,  fiPx2,  fiPy2,  fiBat
            // ,  fiPiece,  rRevet1,  rRevet2,  rRevet3,  rRevet4,
            //  rRevetS,  rRevetP);
            
        });
        MenuItem test2 = new MenuItem("Creer");
        test2.setOnAction((t) -> {
        });
        MenuItem test3 = new MenuItem("Modifier");
        test3.setOnAction((t) -> {
        });
        MenuItem test4 = new MenuItem("Suprimer");
        test4.setOnAction((t) -> {
        });        
        file.getItems().addAll(test1,test2,test3,test4);
               
        
        this.getMenus().addAll(file);
    }
    
    
}