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
              //System.out.println("Erreur :\n"+err);
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
              //System.out.println("Erreur :\n"+err);
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
              //System.out.println("Erreur :\n"+err);
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
              //System.out.println("Erreur :\n"+err);
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
                    
                    prixM2=tabligne[5];
                    
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
         
        
         double_prixM2=Double.parseDouble(prixM2);
         prix=double_prixM2*surface;
       
         return prix;    
    }

    public static void memoire_mur(Mur M, int idP_plus, int id_bat)
    {
        
        Point p1, p2;
        
        String S_id_memoire;
        
        p1=M.debut;
        p2=M.fin;
        
         
        
        try
            {
          BufferedWriter out=new BufferedWriter(new FileWriter("memoire.txt",true));
          
          S_id_memoire=Double.toString(M.idMur);
          out.write(id_bat + ";" + idP_plus + ";" + M.idMur + ";" + "    " + ";" + p1.px + ";" 
                  + p1.py + ";" + p2.px + ";" + p2.py + ";" +  "   " + ";" + prix(M.surface(), M.revet) + ";");
          
          out.newLine();

          out.close();
          }
          catch (IOException err)
          {
              //System.out.println("Erreur :\n"+err);
          }
        
    }
    
    public static void prix_mur_ecriture(Mur M) 
    {
    
    double surface;
    Point p1, p2;
    
    
    p1=M.debut;
    p2=M.fin;

    
        ecriture("mur" ,M.idMur);
        ecriture_espace(3);
        ecriture("x1" ,p1.px);
        ecriture("y1" ,p1.py);
        ecriture("x2" ,p2.px);
        ecriture("y2" ,p2.py);
        ecriture_espace(3);
        ecriture("longueur" ,M.longueur());
        ecriture("surface" , M.surface());
        ecriture_espace(3);



         
         surface=M.surface();
         ;
         ecriture_S("revêtement", M.revet);
         ecriture("prix", prix(surface, M.revet));
         
         ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);
    
}
    
    public static boolean verification_non_existence(int idp, int idB)
    {
       String [] tabligne = new String [30];
       String S_idp;
       
       int int_tab, int_tab2;
       boolean verif; verif=true;
       
        try 
             {
             BufferedReader in=new BufferedReader(new FileReader("memoire.txt"));
             S_idp=Double.toString(idp); 
             String ligne; 
             while((ligne=in.readLine())!=null) 
              {
                
        

                tabligne = ligne.split(";");
                /*System.out.println(tabligne[1]);*/             
                 
                    
                 int_tab=Integer.parseInt(tabligne[1]);           
                 int_tab2=Integer.parseInt(tabligne[0]);
                 
                if ((idp==int_tab)&&(idB==int_tab2)) {
                    
                    verif=false;

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
        
        return verif;
    }
    
   public static void creation_piece(int idP_plus, int idB)
   {
    
   Point p1,p2,p3,p4;
   double diag1x, diag1y, diag2x, diag2y;
   Mur M1, M2, M3, M4;
   Piece P1;
   double a,b;
   String revet;
   int idM_plus;
   
   idM_plus=1;
   
   
       
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
   
   System.out.println(" quel revetement  ");
         revet=Lire.S();
   
   M1=new Mur(idM_plus,p1,p2,0,0, revet);
   memoire_mur(M1, idP_plus, idB);
   idM_plus=idM_plus+1;
   
   System.out.println(" quel revetement  ");
         revet=Lire.S();
   
   M2=new Mur(idM_plus,p2,p3,0,0, revet);
   memoire_mur(M2, idP_plus, idB);
   idM_plus=idM_plus+1;

   System.out.println(" quel revetement  ");
         revet=Lire.S();
         
   M3=new Mur(idM_plus,p3,p4,0,0, revet); 
   memoire_mur(M3, idP_plus, idB);
   idM_plus=idM_plus+1;
   
   System.out.println(" quel revetement  ");
         revet=Lire.S();

   M4=new Mur(idM_plus,p4,p1,0,0, revet); 
   memoire_mur(M4, idP_plus, idB);
   

   P1=new Piece(idP_plus, 0, 0);
   P1.afficher();
  
   
   
   /*ecriture("Piece numero : ", P1.idPiece);
   prix_mur_ecriture(M1);
   prix_mur_ecriture(M2);
   prix_mur_ecriture(M3);
   prix_mur_ecriture(M4);
   
   
   ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);ecriture_();
   ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);*/
   }
   
    public static void ecriture_Piece(int idp, int idB){

       String [] tabligne = new String [30];
       String S_idp;
       double prix_tot_piece , double_prix; prix_tot_piece=0;
       int int_tab, int_tab2;
             
       double idB_d=idB, idp_d=idp;
       
       ecriture("Batiment n°", idB_d);
       ecriture("Piece n°", idp_d);
       ecriture_espace(3);
       
       try 
             {
             
             BufferedReader in=new BufferedReader(new FileReader("memoire.txt"));
             S_idp=Double.toString(idp); 
             String ligne; 
             
             
             while((ligne=in.readLine())!=null) 
              {
                
        

                tabligne = ligne.split(";");
                /*System.out.println(tabligne[1]);*/             
                 
                    
                int_tab=Integer.parseInt(tabligne[1]);           
                int_tab2=Integer.parseInt(tabligne[0]); 
                if ((idp==int_tab)&&(idB==int_tab2)) {
                    
                    
                            try
                              {
                            BufferedWriter out=new BufferedWriter(new FileWriter("mur.txt",true));

                            out.write("Mur " + tabligne[2] + "     cout : " + tabligne[9] + " €");                          
                            out.newLine();
                            out.close();
                            }
                            catch (IOException err)
                            {
                                //System.out.println("Erreur :\n"+err);
                            }                           
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
        
        ecriture_espace(3);
        ecriture("prix total de la piece : ", total_piece(idp, idB));
        ecriture_espace(3);ecriture_espace(3);ecriture_espace(3);
        ecriture_();
        ecriture_espace(3);
       
        
   }
    
   public static void creation_bat(int idB_plus)
   {
        Batiment B1;
        B1=new Batiment(idB_plus);
        B1.afficher();
   }
   
   public static double total_piece(int idp, int idB)
   {
       
       String [] tabligne = new String [30];
       String S_idp;
       double prix_tot_piece , double_prix; prix_tot_piece=0;
       int int_tab, int_tab2;
       
        try 
             {
             BufferedReader in=new BufferedReader(new FileReader("memoire.txt"));
             S_idp=Double.toString(idp); 
             String ligne; 
             while((ligne=in.readLine())!=null) 
              {
                
        

                tabligne = ligne.split(";");
                /*System.out.println(tabligne[1]);*/             
                 
                    
                 int_tab=Integer.parseInt(tabligne[1]);           
                 int_tab2=Integer.parseInt(tabligne[0]);
                 
                if ((idp==int_tab)&&(idB==int_tab2)) {
                    double_prix=Double.parseDouble(tabligne[9]);
                    prix_tot_piece=prix_tot_piece+double_prix;
                    // System.out.println(double_prix);

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
         
        return prix_tot_piece;
       
      
   }
   
    public static void main(String[] args) {
     
        //-------------------
        
        String [] tabligne = new String [30];
        String revet , prixM2  ;
        double surface;
        int i , idP_plus , idM_plus , nbpiece , id_memoire , nbBat , choisissateur , idB_plus, idp, idB; 
        idM_plus=1; idP_plus=1; id_memoire=1; choisissateur=10; idB_plus=1 ;
        
        //-------------------
        
        i=1;
        prixM2="0";
        surface=3;
        
        //-------------------
   
        
    while ( choisissateur!=0)
      {
           System.out.println("");
           System.out.println("Que voulez vous faire ?  ");
           System.out.println(" 1 - creer batiment ");
           System.out.println(" 2 - ajouter piece ");
           System.out.println(" 3 - calcul du prix piece ");
           System.out.println(" 4 - ecrire prix piece ");
           System.out.println("");
           choisissateur=Lire.i();
           
          
            if (choisissateur==1)
           {
               
               
               creation_bat(idB_plus);
               idB_plus=idB_plus+1;              
               
           } 
           
           
           if (choisissateur==2)
           {
               System.out.println(" ajouter a quel batiment ? ");
               idB=Lire.i();
               System.out.println("");
               
               System.out.println("Numero de la piece : ");
               idP_plus=Lire.i();
               System.out.println("");
               
                if (verification_non_existence(idP_plus, idB)==true)
                {
                            creation_piece(idP_plus, idB);
                }
                else
                {
                                    System.out.println("");
                                    System.out.println("cette piece existe deja");
                                    System.out.println("");

                }
            
               
               /*id_memoire=i*4+1;*/
               
           }
           
           
           if (choisissateur==3)
           {
             System.out.println("Calcul prix total de la piece : ");
             System.out.println("Quel bat ? ");
             idB=Lire.i();
             System.out.println("");
             System.out.println("Quel piece ? ");
             idp=Lire.i();
             System.out.println("");
             
             
             System.out.println("total de la piece " + total_piece(idp, idB));
             System.out.println("");
                         
           }
           
           if (choisissateur==4)
           {
             
              
                System.out.println("Ecrire le prix de la piece : quel bat? : ");
                idB=Lire.i();
                System.out.println("");
                System.out.println("quel piece? : ");
                idp=Lire.i();
                System.out.println("");

                if (verification_non_existence(idP_plus, idB)==false)
                {
                             ecriture_Piece(idp, idB);
                }
                else
                {
                                    System.out.println("");
                                    System.out.println("cette piece n'existe pas");
                                    System.out.println("");

                }
                  
               
                         
           } 

      }
   
   
   
   
   
   
   /* System.out.println("nombre de pièce : ");
   nbpiece=Lire.i();

   for ( i=1 ; i<=nbpiece ; i++){
        
   }*/
   
   
   
   

   
  
   
    }    
      
    }

