/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56.gui;
import fr.insa.holler.projet_56.gui.MainPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

/**
 *
 * @author augustinhocquet
 */
public class DessinCanvas extends Pane {
    
    private MainPane main;
    private Canvas realCanvas;
    
    public DessinCanvas(MainPane main) {
        this.main = main;
        this.realCanvas = new Canvas(this.getWidth(), this.getHeight());
        this.getChildren().add(this.realCanvas);

        this.realCanvas.heightProperty().bind(this.heightProperty());
        this.realCanvas.heightProperty().addListener((o) -> {
            this.redrawAll(Color.MEDIUMSPRINGGREEN);
        });
        
        this.realCanvas.widthProperty().bind(this.widthProperty());
        this.realCanvas.widthProperty().addListener((o) -> {
            this.redrawAll(Color.BLUE);
        });
        
    }
    /* public DessinCanvas(double w, double h) {
        super(w, h);
        GraphicsContext context= this.getGraphicsContext2D();
        context.setFill(Color.DARKGREEN);
        context.fillRect(0, 0, this.getWidth(), this.getHeight());
        this.redrawAll();
    }*/
    public void redrawAll(Color couleur) {
    
    GraphicsContext context = this.realCanvas.getGraphicsContext2D();
    context.setFill(couleur);
    context.fillRect(0, 0, this.getWidth(), this.getHeight());
    
    
    }
}
