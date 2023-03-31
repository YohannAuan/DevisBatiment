/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;
// Bonjour c'est Totole
/**
 *
 * @author yohan
 */
public class Mur {
    //Attributs
    int idMur,NbrePortes,NbreFenetres;
    Point fin,debut;
    
    
    Mur(int id,Point p1,Point p2,int p,int f){
    this.idMur=id;
    this.debut=p1;
    this.fin=p2;
    this.NbrePortes=p;
    this.NbreFenetres=f;
    }
    
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
        if (this.NbrePortes==0 && this.NbreFenetres==0){ 
        return longueur()*h;
        }
        return h;
    }
}
