/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingstickfigure;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Line;

public class stickFigure extends Application {

    @Override
    public void start(final Stage stage) throws Exception {
        final Group group = new Group();
        final Scene scene = new Scene(group, 800, 800, Color.WHITE);
        stage.setScene(scene);
        stage.setTitle("Walking Stick Figure");
        stage.show();

        
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        
    Circle c1 = new Circle(100, 300, 45);
    c1.setStroke(Color.BLACK);
    c1.setStrokeWidth(3);
    c1.setFill(Color.WHITE);
    Circle eye = new Circle(125, 290, 5);
    Arc smile = new Arc();
    smile.setCenterX(124.0);
    smile.setCenterY(300.0);
    smile.setRadiusX(25.0);
    smile.setRadiusY(25.0);
    smile.setStartAngle(260.0);
    smile.setLength(45.0);
    smile.setType(ArcType.OPEN);
    smile.setStroke(Color.BLACK);
    smile.setStrokeWidth(3);
    Line body = new Line(100, 345, 100, 515);
    body.setStroke(Color.BLACK);
    body.setStrokeWidth(3);
    Line leftLeg = new Line(100, 515, 20, 645);
    leftLeg.setStroke(Color.BLACK);
    leftLeg.setStrokeWidth(3);
    Line rightLeg = new Line(100, 515, 180, 645);
    rightLeg.setStroke(Color.BLACK);
    rightLeg.setStrokeWidth(3);
    Line leftArm = new Line(100, 415, 50, 445);
    leftArm.setStroke(Color.BLACK);
    leftArm.setStrokeWidth(3);
    Line rightArm = new Line(100, 415, 150, 445);
    rightArm.setStroke(Color.BLACK);
    rightArm.setStrokeWidth(3);
    group.getChildren().add(c1);
    group.getChildren().add(eye);
    group.getChildren().add(smile);
    group.getChildren().add(body);
    group.getChildren().add(leftArm);
    group.getChildren().add(rightArm);
    group.getChildren().add(leftLeg);
    group.getChildren().add(rightLeg);
    }

    public static void main(final String[] arguments) {
        Application.launch(arguments);
    }
}
