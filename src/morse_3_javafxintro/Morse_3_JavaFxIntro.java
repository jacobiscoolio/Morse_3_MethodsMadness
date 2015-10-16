/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse_3_javafxintro;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Morse_3_JavaFxIntro extends Application {
   
    public static void main(String[] args) {
        launch(args);
}
    @Override
     public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFxIntro");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawRectangle(gc);
        drawSomething(gc);
        radiant(gc);
        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



  
      private void drawSomething(GraphicsContext gc) {
         for(int i = 1; i < 12; i++){
         Random generator1 = new Random();
         Random generator2 = new Random();
         int r = generator1.nextInt(650);
         int rr = generator2.nextInt(450);
         gc.setStroke(Color.web("white", 0.4));
         
          
        gc.strokeRect(r, rr, 300, 400);
        }
      }  
private void drawRectangle(GraphicsContext gc) {
         gc.setStroke(Color.web("black", 1));
         gc.fillRect(0, 0, 1000, 1000);
         
         
          
        
        }
private void radiant(GraphicsContext gc) {
    gc.setFill(Color.web("red",.25));
    
    gc.fillRect(0, 0, 200, 800);
    
    gc.setFill(Color.web("green",.25));
    
    gc.fillRect(200, 0, 200, 800);
    
    gc.setFill(Color.web("blue",.25));
    
    gc.fillRect(400, 0, 200, 800);
         
    gc.setFill(Color.web("indigo",.25));
    
    gc.fillRect(600, 0, 200, 800);
    
    gc.setFill(Color.web("violet",.25));
    
    gc.fillRect(800, 0, 200, 800);
          
        
        }


      }

     
     
     














 //   private void drawShapes(GraphicsContext gc) {
   //     gc.setFill(Color.LIME);
     //   gc.setStroke(Color.BLUE);
       // gc.setLineWidth(5);
        //gc.strokeLine(40, 10, 10, 40);
//        gc.fillOval(10, 60, 30, 30);
//        gc.strokeOval(60, 60, 30, 30);
//        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
//        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
//        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
//        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
//        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
//        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        //gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        //gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        //gc.fillPolygon(new double[]{10, 40, 10, 40},
          //             new double[]{210, 210, 240, 240}, 4);
        //gc.strokePolygon(new double[]{60, 90, 60, 90},
         //                new double[]{210, 210, 240, 240}, 4);
        //gc.strokePolyline(new double[]{110, 140, 110, 140},
      //                    new double[]{210, 210, 240, 240}, 4);
    //}
