/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.holler.projet_56;
import java.util.Map ;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Projet_56 {
    
    public static void ecriture(String nom_donnee, double valeur) 
    {
        String pointEs ;
        pointEs=Double.toString(valeur);
         
        
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
    
    public static void ecriture_S(String nom_donnee, String valeur_S) 
    {
        
         
        
        try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));

          out.write(nom_donnee + " : ");
          out.write(valeur_S);
          out.newLine();

          out.close();
          }
          catch (IOException err)
          {
              System.out.println("Erreur :\n"+err);
          }
    }
    
     public static void ecriture_() 
    {
       try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));

          out.write("_-_-_-_-_-_-_-_");
          out.newLine();
          out.close();
          }
          catch (IOException err)
          {
              System.out.println("Erreur :\n"+err);
          }
    }
     
      public static void ecriture_espace(int espace) 
    {
       int i;
        
        try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));

          for ( i=1 ; i<=espace ; i++){
          
          out.newLine();
          out.close();
          }
            
            }
          catch (IOException err)
          {
              System.out.println("Erreur :\n"+err);
          }
    }

    public static double prix(double surface, String revet ) 
    {
        
        
        String [] tabligne = new String [30];
        String prixM2;
        double double_prixM2;
        double prix;
        int i;
        
        prixM2="0";
     
             try 
             {
              BufferedReader in=new BufferedReader(new FileReader("revetement.txt"));
              String ligne;
              
             /* while((ligne=in.readLine())!=null) */
                 
             for ( i=0 ; i<=18 ; i++)
              {
                tabligne = in.readLine().split(";");
                /*System.out.println(tabligne[1]);*/
                if ((tabligne[1].compareTo(revet) == 0) && (tabligne[2].compareTo("1")==0)){
                    System.out.println("oui");
                    prixM2=tabligne[5];
                    System.out.println(prixM2 );
                 }
               }

              in.close();
             }


           catch(FileNotFoundException err){
           System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}

           catch (IOException err){
           System.out.println(" Erreur :\n "+err);}
         
        
         double_prixM2=Double.parseDouble(prixM2);
         prix=double_prixM2*surface;
         ecriture("prix au m2", double_prixM2);
         ecriture_S("revêtement", revet);
         return prix;    
    }

    public static void memoire_mur(Mur M, int id_memoire)
    {
        
        Point p1, p2;
        int idM;
        
        p1=M.debut;
        p2=M.fin;
        idM=M.idMur;
         
        
        try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("memoire.txt",true));
          
          System.out.println(id_memoire);

          out.write( Double.toString(id_memoire));out.write( ";");
          out.write(p1.px + ";" + p1.py + ";" + p2.px + ";" + p2.py);
          out.newLine();

          out.close();
          }
          catch (IOException err)
          {
              System.out.println("Erreur :\n"+err);
          }
        
    }
    
    public static void prix_mur_ecriture(Mur M) 
    {
    String revet;
    double surface;
    Point p1, p2;
    int idM;
    
    p1=M.debut;
    p2=M.fin;
    idM=M.idMur;
    
        ecriture("mur" ,idM);
        ecriture_espace(3);
        ecriture("x1" ,p1.px);
        ecriture("y1" ,p1.py);
        ecriture("x2" ,p2.px);
        ecriture("y2" ,p2.py);
        ecriture_espace(3);
        ecriture("longueur" ,M.longueur());
        ecriture("surface" , M.surface());
        ecriture_espace(3);



         System.out.println(" quel revetement  ");
         revet=Lire.S();
         surface=M.surface();
         ecriture("prix", prix(surface, revet));
         ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);
    
}
    
    
   public static void creation_piece(int idP_plus, int idM_plus, int id_memoire)
   {
    
   Point p1,p2,p3,p4;
   double diag1x, diag1y, diag2x, diag2y;
   Mur M1, M2, M3, M4;
   Piece P1;
   double a,b;
   
   
       
   System.out.println("entrer deux points diagonals de la pièce :");
   
   diag1x=Lire.d();
   diag1y=Lire.d();
   diag2x=Lire.d();
   diag2y=Lire.d();
   
   p1=new Point(1,diag1x,diag1y);
   p3=new Point(3,diag2x,diag2y);
   p2=new Point(2,diag1x,diag2y);
   p4=new Point(4,diag2x,diag1y);
   p1.afficher();
   p2.afficher();
   p3.afficher();
   p4.afficher();
   
   
   /*p1=new Point(1,10.75,25.1);
   p2=new Point(2,10,25);
   p1.afficher();
   p2.afficher();*/
   
   M1=new Mur(idM_plus,p1,p2,0,0);
   idM_plus=idM_plus+1;
   
   M2=new Mur(idM_plus,p2,p3,0,0);
   idM_plus=idM_plus+1;

   M3=new Mur(idM_plus,p3,p4,0,0); 
   idM_plus=idM_plus+1;

   M4=new Mur(idM_plus,p4,p1,0,0); 
   idM_plus=idM_plus+1;

   P1=new Piece(idP_plus, 0, 0);
   P1.afficher();
   
   memoire_mur(M1, id_memoire);
   memoire_mur(M2, id_memoire);
   memoire_mur(M3, id_memoire);
   memoire_mur(M4, id_memoire);
   
   ecriture("Piece numero : ", P1.idPiece);
   prix_mur_ecriture(M1);
   prix_mur_ecriture(M2);
   prix_mur_ecriture(M3);
   prix_mur_ecriture(M4);
   
   
   ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);ecriture_();
   ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);
   }
    
    public static void main(String[] args) {
     
        int nbBat;
        int i;
        String [] tabligne = new String [30];
        String revet;
        String prixM2;
        double surface;
        int nbpiece;
        int idP_plus; idP_plus=1;
        int idM_plus; idM_plus=1;
        int id_memoire; id_memoire=1;
        
        i=1;
        prixM2="0";
        surface=3;
   
  System.out.println("");
   
   Batiment B1;
   B1=new Batiment(i);
   B1.afficher();
   
   
   
   
   System.out.println("nombre de pièce : ");
   nbpiece=Lire.i();

   for ( i=1 ; i<=nbpiece ; i++){
        creation_piece(idP_plus, idM_plus, id_memoire);
        idP_plus=idP_plus+1;
        
   }
   
   
   
   /* id memoire pour +1 */

   
  
   
    }     
      
    }

