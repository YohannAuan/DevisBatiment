/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;

/**
 *
 * @author yohan
 */
public class Point {
    
    // coucou oui oui Augustin
    //Attributs
    double px,py;
    int idCoin;
    //Constructeur
    Point(int id, double x,double y)
    {
        this.px=x;
        this.py=y;
    }
    //Autres méthodes
    void afficher(){
      System.out.println("Point : Abcisse = "+ this.px+"   Ordonnée ="+this.py);
    }
   
        
    }       

