/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;
import java.util.Map ;
/**
 *
 * @author anato
 */
public class Planfond {
    int idPlanfond ;
    //List listeCoins ; 
    //List listeRevetements ;

    Planfond(int id) {
        this.idPlanfond = id ;
    }
    
    public void afficher() {
        System.out.println("Piece : idSol : "+this.idPlanfond) ;
    }
/*  Méthodes :
    toString()
    surface()
*/
}
