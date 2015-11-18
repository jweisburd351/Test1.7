package GUI;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by jmweisburd on 11/14/15.
 */
public class HandBar extends FlowPane
{
  Stage primaryStage;

  public HandBar(Stage stage, GUI gui)
  {
    primaryStage = stage;

    Text tempText = new Text("Hand Bar");

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("handbar");

    this.getChildren().add(tempText);
  }
}