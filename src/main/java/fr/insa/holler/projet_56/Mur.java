/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;

/**
 *
 * @author yohan
 */
public class Mur {
    //Attributs
    int idMur;
    Point fin,debut;
    
    Mur(int id,Point p1,Point p2){
    this.idMur=id;
    this.debut=p1;
    this.fin=p2;}
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    
    double longueur(){
        return Math.sqrt((this.fin.px-this.debut.px)*(this.fin.px-this.debut.px)+(this.fin.py-this.debut.py)*(this.fin.py-this.debut.py));
    }
    double surface(){
        double h;
        System.out.println("Quelle est la hauteur ? ");
        h=Lire.d();
        return longueur()*h;
    }
}
