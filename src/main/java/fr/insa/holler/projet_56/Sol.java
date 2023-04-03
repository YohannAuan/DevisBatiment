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
    ArrayList <Point> listePoints = new ArrayList<Point>() ;
    ArrayList <Revetement> listeRevetements = new ArrayList<Revetement>() ;
    
    Sol(int id) {
        this.idSol = id ;
    }
    void afficher() {
        System.out.println("Piece : idSol : "+this.idSol) ;
    }
    
    
/*  Méthodes :
    afficher()
    toString()
    surface()
*/
}
