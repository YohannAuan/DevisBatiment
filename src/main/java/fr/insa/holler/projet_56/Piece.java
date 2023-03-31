/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;
import java.util.ArrayList ;
/**
 *
 * @author anato
 */
public class Piece {
    int idPiece ;
    int sol ;
    int planfond ;
    ArrayList <Mur> listeMurs = new ArrayList<Mur>();
    Mur m1, m2, m3, m4 ;
    
    Piece (int id, int s, int pl) {
        this.idPiece = id ;
        this.sol = s ;
        this.planfond = pl ;
    }
    void afficher() {
        System.out.println("Piece : idPiece : "+this.idPiece+" Sol : "+this.sol+" planfond : "+this.planfond) ;
    }
    
    double Surface() {
        if(this.)
        return() ;
    }
/*  Méthodes :
    afficher()
    toString()
    surface()
*/
}
