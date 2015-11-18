package Driver;

import GUI.GUI;
import common.EnumRegion;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.Style;

/**
 * Created by Dayloki on 11/15/2015.
 */
public class RegionPane extends StackPane
{
  public RegionPane(final Stage stage, EnumRegion region)
  {
    Text text=new Text(region.name());
    Button button=new Button();
    button.setText(region.name());
    switch (region)
    {
      case CALIFORNIA:
        break;
      case HEARTLAND:
        break;
      case MOUNTAIN:
        break;
      case NORTHERN_PLAINS:
        break;
      case NORTHERN_CRESCENT:
        break;
      case SOUTHEAST:
        break;
      case SOUTHERN_PLAINS:
        break;
      default:
        break;
    }
    button.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent event)
      {
        try
        {
           GUI gui=new GUI();
          Stage guiStage=new Stage();
          gui.start(guiStage);
          stage.close();
        } catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
    this.getChildren().add(text);
    this.getChildren().add(button);
  }
}
