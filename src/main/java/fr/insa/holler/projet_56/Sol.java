/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;
import java.util.ArrayList;
/**
 *
 * @author anato
 */
public class Sol {
    int idSol ;
    String revetement;
    Point p1, p2;
   
    
    Sol(int id, String revet, Point p1, Point p2) {
        this.idSol = id ;
        this.revetement=revet;
        this.p1=p1;
        this.p2=p2;
        
    }
    void afficher() {
        System.out.println("Piece : idSol : "+this.idSol) ;
        p1.afficher();p2.afficher();
    }
    
    
    double surface()
    {
        
        return Math.sqrt(Math.pow((-(this.p1.py)+(this.p2.py))*(-(this.p1.px)+(this.p2.px)),2));
    }
    
/*  Méthodes :
    afficher()
    toString()
    surface()
*/
}
