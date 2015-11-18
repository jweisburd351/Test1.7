package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by jmweisburd on 11/14/15.
 */
public class GraphNode extends StackPane
{
  Text tempText;
  Stage primaryStage;

  public GraphNode(Stage stage)
  {
    primaryStage = stage;

    tempText = new Text("GRAPH NODE");

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("graphnode");

    this.getChildren().add(tempText);
  }

}
