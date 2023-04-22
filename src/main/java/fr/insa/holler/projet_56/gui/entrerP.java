/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.holler.projet_56.gui;


import fr.insa.holler.projet_56.Point;
import java.util.Optional;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 * Creation d'un Dialog pour permettre à l'utilisateur d'entrer les coordonnées
 * et la couleur d'un Point. Classe structurée en s'inspirant de l'exemple 5 de
 * :
 * https://examples.javacodegeeks.com/desktop-java/javafx/dialog-javafx/javafx-dialog-example/
 *
 * @author francois
 */
// la classe Dialog est une classe générique : le paramètre de type (ici Point)
// indique quel est le type de l'objet éventuellement créé/retourné par le Dialog
public class entrerP extends Dialog<Point> {

    private TextField tfPx;
    private TextField tfPy;
    private ColorPicker cpCouleur;

    public void EnterPointDialog() {
        this.setTitle("entrez les coordonnées du Point :");
        this.setResizable(true);
        Label lPx = new Label("px :");
        Label lPy = new Label("py :");
        Label lC = new Label("couleur :");
        this.tfPx = new TextField("0.0");
        this.tfPy = new TextField("0.0");
        this.cpCouleur = new ColorPicker(Color.BLACK);

        GridPane grid = new GridPane();
        grid.add(lPx, 0, 0);
        grid.add(this.tfPx, 1, 0);
        grid.add(lPy, 0, 1);
        grid.add(this.tfPy, 1, 1);
        grid.add(lC, 0, 2);
        grid.add(this.cpCouleur, 1, 2);
        this.getDialogPane().setContent(grid);

        ButtonType bOK = new ButtonType("OK", ButtonData.OK_DONE);
        ButtonType bCancel = new ButtonType("Annuler", ButtonData.CANCEL_CLOSE);
        this.getDialogPane().getButtonTypes().add(bOK);
        this.getDialogPane().getButtonTypes().add(bCancel);

       

    }

    public static Optional<Point> demandePoint() {
        entrerP dialog = new entrerP();
        return dialog.showAndWait();
    }

}
