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
        String [] tabligne = new String [30];
        String revet;
        double prixM2;
        double surface;
        
        
        i=1;
        prixM2=0;
    
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
   
   /*System.out.println("Combien de batiment ? ");
   nbBat=Lire.i();*/
   
  System.out.println("");
   
   Batiment B1;
   B1=new Batiment(i);
   B1.afficher();
   
   
   
   
   
   /*File fichmur = new File("mur.txt");
   
   System.out.println(fichmur.getAbsolutePath());
   
   try
   {
 BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));
 
 
 out.write();
 out.newLine();
 
 out.close();
 }
 catch (IOException err)
 {
     System.out.println("Erreur :\n"+err);
 }
   
   */
   
   
  System.out.println(" quel revetement  ");
  revet=Lire.S();
  System.out.println("surface du sol");
  surface=Lire.d();
   
   try 
   {


    BufferedReader in=new BufferedReader(new FileReader("revetement.txt"));
    String ligne;
       
    
 
   while((ligne=in.readLine())!=null)
    {
      tabligne = ligne.split("\n");
      if ((tabligne[1].compareTo(revet) == 0) && (tabligne[3].compareTo("1")==0)){
          prixM2=Integer.parseInt(tabligne[3]);
          
        
      }
     }
   
in.close();
   }


 catch(FileNotFoundException err){
 System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}

 catch (IOException err){
 System.out.println(" Erreur :\n "+err);}
  
   
 
  

  
 
     System.out.println(surface*prixM2);

     
    
    
    
    }     
      
    }

