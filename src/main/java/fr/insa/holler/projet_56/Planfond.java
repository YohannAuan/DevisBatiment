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
public class Planfond {
    int idPlanfond ;
    Point p1, p2;
    String revetement;
    ArrayList <Point> listePoints = new ArrayList<Point>() ;
    ArrayList <Revetement> listeRevetements = new ArrayList<Revetement>() ;

    Planfond(int id, String revet, Point p1, Point p2) {
        this.idPlanfond = id ;
        this.revetement=revet;
        this.p1=p1;
        this.p2=p2;
    }
    
    void afficher() {
        System.out.println("Piece : idSol : "+this.idPlanfond) ;
    }

     double surface()
    {
        
        return Math.sqrt(Math.pow((-(this.p1.py)+(this.p2.py))*(-(this.p1.px)+(this.p2.px)),2));

    }
    
    
    /*  Méthodes :
    
    
    toString()
    surface()
*/
}
