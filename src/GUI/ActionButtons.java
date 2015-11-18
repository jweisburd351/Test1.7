package GUI;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ActionButtons extends VBox
{
  Text tempText;
  Stage primaryStage;

  public ActionButtons(Stage stage)
  {
    primaryStage = stage;

    tempText = new Text("ACTION BUTTONS");
    tempText.setFill(Color.BLUE);
    Image undoImage = new Image(getClass().getResourceAsStream("resources/undoResized.png"));

    //Image undoImage = new Image(getClass().getResourceAsStream("undo-41179_640.png"));
    Button undo=new Button("",new ImageView(undoImage));


    undo.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent event)
      {


      }
    });
    Button endTurn=new Button();
    endTurn.setText("End Turn");
    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("actionbuttons");

    this.getChildren().add(tempText);
    this.getChildren().add(undo);
    this.getChildren().add(endTurn);
  }

}
