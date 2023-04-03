/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;
// Bonjour c'est Totole

import java.util.ArrayList;
import java.io.*;

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
    ArrayList <Revetement> listeRevetements;
    listeRevetements = new ArrayList <Revetement> ();
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
    /* System.out.println("Quelle est la hauteur ? ");
    h=Lire.d(); */
        
    return longueur()*2.7-(this.NbreFenetres*1.8)-(this.NbrePortes*3);  /* h=2.7 */
        
    }
}
