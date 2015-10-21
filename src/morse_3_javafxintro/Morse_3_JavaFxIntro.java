/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse_3_javafxintro;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.Random;
import java.util.Scanner;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Morse_3_JavaFxIntro extends Application {
   
    public static void main(String[] args) {
        launch(args);
}
    @Override
     public void start(Stage primaryStage) {
        primaryStage.setTitle("Methods Madness");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
       drawRectangle(gc);
    Image image = new Image("Gradient.png");
    ImageView iv1 = new ImageView();
        iv1.setImage(image);
        
        drawSomething(gc);
       drawSomeCircle(gc);

      
 
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
  
     }



  
      private void drawSomething(GraphicsContext gc) {
         System.out.println("How many squares?");
          Scanner scan = new Scanner(System.in);
         int s = scan.nextInt();
          for(int i = 0; i < s; i++){
         Random generator1 = new Random();
         Random generator2 = new Random();
         int r = generator1.nextInt(650);
         int rr = generator2.nextInt(450);
         gc.setStroke(Color.web("white", 0.4));
         
          
        gc.strokeRect(r, rr, 300, 400);
        }
      }
      private void drawSomeCircle(GraphicsContext gc) {
         System.out.println("How many circles?");
          Scanner scan = new Scanner(System.in);
         int s = scan.nextInt();
          for(int i = 0; i < s; i++){
         Random generator1 = new Random();
         Random generator2 = new Random();
         int r = generator1.nextInt(650);
         int rr = generator2.nextInt(450);
         gc.setStroke(Color.web("white", 0.4));
         
          
        gc.strokeOval(r, rr, 30, 30);
        }      }
private void drawRectangle(GraphicsContext gc) {
         gc.setStroke(Color.web("black", 1));
         gc.fillRect(0, 0, 1000, 1000);
          
        
        }
private void drawGradient() {
         
    Image image = new Image("flower.png");
    ImageView iv1 = new ImageView();
         iv1.setImage(image);
    
   
        
        }
}