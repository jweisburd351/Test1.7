package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VisNode extends StackPane
{
  Stage primaryStage;

  public VisNode(Stage stage)
  {
    primaryStage = stage;

    Text tempText = new Text("VISUALIZATION NODE");

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("visnode");


    this.getChildren().add(tempText);
  }

}