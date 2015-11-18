  package Driver;

import GUI.GUI;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;

/**
 * Created by Dayloki on 11/14/2015.
 */
public class LandingPage extends Application
{
  private int width=300;
  private int height=250;

  @Override
  public void start(final Stage stage) throws Exception
  {
    stage.setTitle("Starvation Evasion");
    Button singlePlayer=new Button();
    Button multiPlayer=new Button();
    singlePlayer.setText("Single Player");
    multiPlayer.setText("MultiPlayer");
    singlePlayer.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent actionEvent)
      {
        try
        {
         // Application gui=new GUI();
          Application regionChooser=new RegionChooser();
          Stage guiStage=new Stage();
          regionChooser.start(guiStage);
          //gui.start(guiStage);
          stage.close();
        } catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
    multiPlayer.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent actionEvent)
      {

      }
    });
    GridPane root=new GridPane();
    root.setAlignment(Pos.CENTER);
    root.setHgap(10);
    root.setVgap(10);
    root.add(singlePlayer,0,1);
    root.add(multiPlayer,0,5);
    stage.setScene(new Scene(root, width, height));
    stage.show();
  }
}