package GUI;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by jmweisburd on 11/14/15.
 */
public class DraftStatus extends VBox
{
  Stage primaryStage;

  public DraftStatus(Stage stage)
  {
    primaryStage = stage;

    Text tempText = new Text("Draft Status");

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("draftstatus");

    this.getChildren().add(tempText);
  }


}