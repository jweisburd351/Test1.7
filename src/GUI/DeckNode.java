package GUI;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class DeckNode extends StackPane
{
  Text tempText;
  Stage primaryStage;

  public DeckNode(Stage stage)
  {
    primaryStage = stage;

    tempText = new Text("DECK NODE");

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("decknode");

    this.getChildren().add(tempText);
  }

}