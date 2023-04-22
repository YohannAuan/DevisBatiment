/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56.gui;


import fr.insa.holler.projet_56.Lire;
import static fr.insa.holler.projet_56.Projet_56.creation_piece;
import static fr.insa.holler.projet_56.Projet_56.ecriture;
import static fr.insa.holler.projet_56.Projet_56.ecriture_Piece;
import static fr.insa.holler.projet_56.Projet_56.ecriture_espace;
import static fr.insa.holler.projet_56.Projet_56.prix_revet;
import static fr.insa.holler.projet_56.Projet_56.surf_revet;
import static fr.insa.holler.projet_56.Projet_56.total_piece;
import static fr.insa.holler.projet_56.Projet_56.verification_non_existence;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Dialog;



import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Window;



public class MainPane extends BorderPane {


    
    
    
    
    private Button rCreation, rDessin, rCalcul, rPiece, rCalcul2, rCreation2;
    private Label lDevis, lEspace, lCalcul, lCreation;
    
    private TextField fiPx1, fiPy1,fiPx2, fiPy2, rNumPiece,
            rRevet1, rRevet2, rRevet3, rRevet4, rRevetS, rRevetP, fiBat, fiPiece;
    
    private DessinCanvas cDessin;
    
    //private DessinPane dessin;
    
        String [] tabligne = new String [30];
        String revet , prixM2, R1, R2, R3, R4, RS, RP ;
        double surface, diag1x, diag1y, diag2x, diag2y;
        int i, Bat, Piece; 
        
        GraphicsContext context;
        
        
        //-------------------
   
    
public MainPane() {           
    
       this.rCreation2 = new Button("Creation test fenetre");
       this.rCreation2.setOnAction((t) -> {
           
          entrerP.demandePoint();
           
       });
        
    
        this.rCreation = new Button("Creation piece");
        this.rCreation.setOnAction((t) -> {
                            
            
            
            diag1x=Double.parseDouble(this.fiPx1.getText());
            diag1y=Double.parseDouble(this.fiPy1.getText());
            diag2x=Double.parseDouble(this.fiPx2.getText());
            diag2y=Double.parseDouble(this.fiPy2.getText());
            Bat=Integer.parseInt(this.fiBat.getText());
            Piece=Integer.parseInt(this.fiPiece.getText());
            R1=this.rRevet1.getText();
            R2=this.rRevet2.getText();
            R3=this.rRevet3.getText();
            R4=this.rRevet4.getText();
            RS=this.rRevetS.getText();
            RP=this.rRevetP.getText();
            
            
            if (verification_non_existence(Piece, Bat)==true){
                System.out.println("non"+ Piece + Bat);
                i=i+1;
            }
            else{
                System.out.println("oui" + Piece + Bat);
                
            }
            
                        
            creation_piece(diag1x, diag1y, diag2x, diag2y, R1, R2, R3, R4, RS, RP, Bat, Piece);  
            
            this.rPiece = new Button("Piece "+ i);
           
            
            GridPane grid2 = new GridPane();
            grid2.add(rPiece, 1, 0);
            this.setTop(grid2);
            
            

            
        });       
        
        
        
        this.lCreation = new Label("Creation");
        
        this.lDevis = new Label("Ecriture Devis");
        
        this.lEspace = new Label("");
        
        this.lCalcul = new Label("Calcul");
        
        
        
        this.rCalcul = new Button("Calcul revet");
        this.rCalcul.setOnAction((t) -> {
            
            
               
               revet=this.rRevet1.getText();
                
               

               ecriture("surface de  " + revet , surf_revet(revet));
               ecriture_espace(3);
               ecriture("cout " + revet , prix_revet(revet));  
               ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);
            
                              
        }); 
        
        this.rCalcul2 = new Button("Calcul Piece");
        this.rCalcul2.setOnAction((t) -> {
            Bat=Integer.parseInt(this.fiBat.getText());
            Piece=Integer.parseInt(this.fiPiece.getText());

                if (verification_non_existence(Piece, Bat)==false)
                {
                             ecriture_Piece(Piece, Bat);
                }
                else
                {
                                    System.out.println("");
                                    System.out.println("cette piece n'existe pas");
                                    System.out.println("");

                }
                              
        }); 
        
        
        
       
        
        this.rDessin = new Button("Info piece");
        this.rDessin.setOnAction((t) -> {
            
       String [] tabligne = new String [30];
       
       int int_tab, int_tab2;
       
        try 
             {
             BufferedReader in=new BufferedReader(new FileReader("memoire.txt"));
             String ligne; 
             while((ligne=in.readLine())!=null) 
              {
                
                
                tabligne = ligne.split(";");
                /*System.out.println(tabligne[1]);*/             
                 
                    
                            
                int_tab2=Integer.parseInt(tabligne[1]);
                                  
                if ((tabligne[0].compareTo("S")==0)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("toutes les pieces");
                    alert.setHeaderText(null);
                    alert.setContentText("Piece n° " + tabligne[2] + "    du Bat " + tabligne[1]
                    + "\n \n revetement du sol : " + tabligne[11] + "    prix : " + tabligne[10] + "€");

                    alert.showAndWait();

                 }
               }

              in.close();
             }


           catch(FileNotFoundException err){
           //System.out.println( "Erreur :le fichier n’existe pas!\n "+err);
           }

           catch (IOException err){
           //System.out.println(" Erreur :\n "+err);
           }
        
       
                              
        }); 
        
        
        VBox vbGauche = new VBox(this.rCreation2, this.rCreation, this.rCalcul2, 
                this.rDessin, this.rCalcul);
        this.setLeft(vbGauche);
  
        


        Label Px = new Label("px :");
        Label Py = new Label("py :");

        this.fiPx1 = new TextField("1");
        this.fiPx1.setOnMouseClicked((t) -> {
            
            double w = (Double.parseDouble(this.fiPx2.getText())-Double.parseDouble(this.fiPx1.getText()));
            double h = (Double.parseDouble(this.fiPy2.getText())-Double.parseDouble(this.fiPy1.getText()));
            
           // this.cDessin = new DessinCanvas(w,h);
           this.setCenter(cDessin);
           
                         
        }); 
        
        
        
        this.fiPy1 = new TextField("1");
        this.fiPx2 = new TextField("2");
        this.fiPy2 = new TextField("2");
        
        this.fiBat = new TextField("0");
        this.fiPiece = new TextField("0");

        VBox vbDroit = new VBox(this.fiPx1, this.fiPy1, this.fiPx2,
                this.fiPy2, this.lEspace, this.fiBat, this.fiPiece);
        this.setRight(vbDroit);


        
        this.rRevet1 = new TextField("Peinture");
        this.rRevet2 = new TextField("Marbre");
        this.rRevet3 = new TextField("Lambris");
        this.rRevet4 = new TextField("Lambris");
        this.rRevetS = new TextField("Moquette");
        this.rRevetP = new TextField("Peinture");
        
        GridPane grid = new GridPane();
        
        grid.add(this.rRevet1, 0, 1);
        grid.add(this.rRevet2, 1, 0);
        grid.add(this.rRevet3, 1, 2);
        grid.add(this.rRevet4, 2, 1);
        
        grid.add(this.rRevetS, 3, 0);
        grid.add(this.rRevetP, 3, 1);


        this.setBottom(grid);
        
        
        
        this.cDessin = new DessinCanvas(this );
        this.setCenter(cDessin);

}

}
 