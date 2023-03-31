/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.holler.projet_56;
import java.util.Map ;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 *
 * @author yohann
 */
public class Projet_56 {

    public static void main(String[] args) {
     
        int nbBat;
        int i;
    
   /*Point p1,p2;
   Mur M1;
   double a,b;
   p1=new Point(1,10.75,25.1);
   p2=new Point(2,10,25);
   p1.afficher();
   p2.afficher();
   
   
   M1=new Mur(1,p1,p2);
   a= +M1.longueur();
   System.out.println(a);
   b= +M1.surface();
   System.out.println(b);*/
   
   System.out.println("Combien de batiment ? ");
   nbBat=Lire.i();
   
   for (i=1 ; i<=nbBat ; i++) {
   Batiment B1;
   B1=new Batiment(i);
   B1.afficher();
   
   }
   
   /*File fichmur = new File("mur.txt");
   
   System.out.println(fichmur.getAbsolutePath());*/
   
   try
   {
 BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));
 
 
 out.write(i);
 out.newLine();
 
 out.close();
 }
 catch (IOException err)
 {
     System.out.println("Erreur :\n"+err);
 }
   
   
   
        }
        
      
    }

