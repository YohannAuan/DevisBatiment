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
    
    public static void ecriture(String nom_donnee, double pointE) 
    {
        String pointEs ;
        pointEs=Double.toString(pointE);
         
        
        try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));

          out.write(nom_donnee + " : ");
          out.write(pointEs);
          out.newLine();

          out.close();
          }
          catch (IOException err)
          {
              System.out.println("Erreur :\n"+err);
          }
    }

    public static void main(String[] args) {
     
        int nbBat;
        int i;
        String [] tabligne = new String [30];
        String revet;
        String prixM2;
        double surface;
        
        
        i=1;
        prixM2="0";
        surface=3;
   
   
   /*System.out.println("Combien de batiment ? ");
   nbBat=Lire.i();*/
   
  System.out.println("");
   
   Batiment B1;
   B1=new Batiment(i);
   B1.afficher();
   
   
   Point p1,p2;
   Mur M1;
   double a,b;
   
   
   p1=new Point(1,10.75,25.1);
   p2=new Point(2,10,25);
   p1.afficher();
   p2.afficher();
   
   M1=new Mur(1,p1,p2,0,0);
   a= +M1.longueur();
   System.out.println(a);
   b= +M1.surface();
   System.out.println(b);
   
   
   System.out.println("");
   ecriture("x1" ,p1.px);
   ecriture("x2" ,p2.py);
   System.out.println("");
   ecriture("longueur" ,a);
   ecriture("surface" , b);
   
   /*File fichmur = new File("mur.txt");
   
   System.out.println(fichmur.getAbsolutePath());
   */
   
  
   /*
   
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
      tabligne = ligne.split(";");
      if ((tabligne[1].compareTo(revet) == 0) && (tabligne[3].compareTo("1")==0)){
          prixM2=tabligne[5];
           System.out.println(tabligne[5]);
          System.out.println(prixM2 );
           

        
      }
       

     }
   
in.close();
   }


 catch(FileNotFoundException err){
 System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}

 catch (IOException err){
 System.out.println(" Erreur :\n "+err);}
  
   
   double pm2 = Double.parseDouble(prixM2);

      System.out.println(pm2*surface);

    */
    
    
    }     
      
    }

