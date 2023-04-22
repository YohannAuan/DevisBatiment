/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56.gui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


/**
 *
 * @author augustinhocquet
 */
public class Dessin_Point extends Pane {
    
public void dessine(GraphicsContext context) {
        context.setFill(Color.WHITE);
        context.fillOval(50, 50, 10, 10);
    }
    
}
