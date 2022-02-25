/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlGUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author Diego Rangel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas lienzo;
    
    //pincel
    GraphicsContext g;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
        
    //

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        g = lienzo.getGraphicsContext2D();
        
        double w = lienzo.getWidth();
        double h = lienzo.getHeight();
        
        g.setStroke(Color.RED);
        g.setLineWidth(12);
        
        //pintando rectangulo
        g.strokeRect(0, 0, w, h);
        
    }    
    
}
