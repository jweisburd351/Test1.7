package GUI;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by jmweisburd on 11/14/15.
 */
public class SummaryBar extends HBox
{
  Stage primaryStage;

  public SummaryBar(Stage stage)
  {
    primaryStage = stage;

    Text tempText = new Text("Summary Bar");
    this.setPrefSize(200,200);

    this.getStylesheets().add("/GUI/style.css");
    this.getStyleClass().add("summarybar");

    this.getChildren().add(tempText);
  }


}
