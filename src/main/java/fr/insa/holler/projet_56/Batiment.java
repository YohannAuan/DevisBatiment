/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56;

/**
 *
 * @author yohan
 */
public class Batiment {
    //Attributs
    int idBatiment;
    //List Listeniveau;
    
    //Méthodes à implémenter
    //afficher()
    //sauvegarder()
    //lireBatiment()
    //devisBatiment()
    
    
     Batiment (int id){
    this.idBatiment=id;
    }
    
    void afficher (){
        System.out.println("-_-_-_-_Batiment-_-_-_-_-_");
        System.out.println("-_-_-_-_  " + this.idBatiment + "  _-_-_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }
    
}
