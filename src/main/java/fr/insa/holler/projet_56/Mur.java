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
    String revet;
    
    
    
    Mur(int id,Point p1,Point p2,int p,int f, String r){
    this.idMur=id;
    this.debut=p1;
    this.fin=p2;
    this.NbrePortes=p;
    this.NbreFenetres=f;
    this.revet=r;
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

    public int getIdMur() {
        return idMur;
    }

    public void setIdMur(int idMur) {
        this.idMur = idMur;
    }

    public int getNbrePortes() {
        return NbrePortes;
    }

    public void setNbrePortes(int NbrePortes) {
        this.NbrePortes = NbrePortes;
    }

    public int getNbreFenetres() {
        return NbreFenetres;
    }

    public void setNbreFenetres(int NbreFenetres) {
        this.NbreFenetres = NbreFenetres;
    }

    public Point getFin() {
        return fin;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }

    public Point getDebut() {
        return debut;
    }

    public void setDebut(Point debut) {
        this.debut = debut;
    }

    public String getRevet() {
        return revet;
    }

    public void setRevet(String revet) {
        this.revet = revet;
    }
    
    
}
