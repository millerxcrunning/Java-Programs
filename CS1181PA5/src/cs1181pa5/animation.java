/*
 * This is lab 5 for CS 1181. This lab works with animations and pathTransitions.
 */
package cs1181pa5;



import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.animation.Transition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

/**
 * @author Michael Miller
 * CS1181L
 * Instructor: R. Volkers
 */
public class animation extends Application{

    /**
     *This generates the path the stick figure will travel.
     * @return path
     */
    public Path generatePath()
    {
      final Line path = new Path(0, 400, 800, 400);
      //path.getElements().add(new MoveTo(600,600));
      return path;
    }
    
    /**
     * This generates the back and forth nature of the path.
     * @param shape
     * @param path
     * @return pathTransition
     */
    public PathTransition generatePathTransition(final Shape shape, final Path path)
    {
      final PathTransition pathTransition = new PathTransition();
      pathTransition.setDuration(Duration.millis(4000));
      pathTransition.setPath(path);
      pathTransition.setNode(shape);
      pathTransition.setCycleCount(Timeline.INDEFINITE);
      pathTransition.setAutoReverse(true);
      return pathTransition;
    }
    
    /**
     * This generates the back and forth nature of the path, constructs the stick
     * figure and adds it to the pane.
     * @param group 
     */
    public void startAnimation(Group group)
    {
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
    c1.setFill(Color.WHITE);
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
    Path path = generatePath();
    group.getChildren().add(path);
    group.getChildren().add(c1);
    group.getChildren().add(smile);
    group.getChildren().add(eye);
    group.getChildren().add(body);
    group.getChildren().add(leftLeg);
    group.getChildren().add(rightLeg);
    group.getChildren().add(leftArm);
    group.getChildren().add(rightArm);
    PathTransition transition = generatePathTransition(c1, path);
    transition.play(); 
    }

    /**
     * This sets the pane in the scene and starts the animation
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception
    {
      Group group = new Group();
      Scene scene = new Scene(group, 800, 800);
      stage.setScene(scene);
      stage.setTitle("Walking stick figure");
      stage.show();
      startAnimation(group);
    }
    
    /*@Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        PathTransition pathTransition = new PathTransition();
    
    
    /*pane.getChildren().add(c1);
    pane.getChildren().add(smile);
    pane.getChildren().add(eye);
    pane.getChildren().add(body);
    pane.getChildren().add(leftLeg);
    pane.getChildren().add(rightLeg);
    pane.getChildren().add(leftArm);
    pane.getChildren().add(rightArm);
    path.getElements().add (new MoveTo (600.0, 600.0));
    
    pathTransition.setNode(c1);
    pathTransition.setPath(path);
    pathTransition.setCycleCount(4);
    pathTransition.setAutoReverse(true);
    pathTransition.play();
    
    Scene scene = new Scene(pane, 800, 800);
    primaryStage.setTitle("Walking stick figure"); // Set the stage title        
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    }*/
    
    
    /*public animation(Duration duration, Shape path, Node n)
    {
        
    }*/

public static void main(String[] args) {
        Application.launch(args);
    }

}



