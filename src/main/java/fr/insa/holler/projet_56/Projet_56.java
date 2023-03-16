/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.holler.projet_56;

/**
 *
 * @author yohann
 */
public class Projet_56 {

    public static void main(String[] args) {
    
   Point p1,p2;
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
   System.out.println(b);
   
        }
        
      
    }

