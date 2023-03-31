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
    ArrayList <Point> listePoints = new ArrayList<Point>() ;
    ArrayList <Revetement> listeRevetements = new ArrayList<Revetement>() ;

    Planfond(int id) {
        this.idPlanfond = id ;
    }
    
    void afficher() {
        System.out.println("Piece : idSol : "+this.idPlanfond) ;
    }
/*  Méthodes :
    toString()
    surface()
*/
}
