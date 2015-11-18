package Driver;

import common.EnumRegion;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Dayloki on 11/15/2015.
 */
public class RegionChooser extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    primaryStage.setTitle("Choose a Region");
    GridPane gridPane=new GridPane();
    gridPane.setPrefSize(1000,200);
    gridPane.setAlignment(Pos.CENTER);
    Scene scene=new Scene(gridPane);
    int offset=120;
    RegionPane california=new RegionPane(primaryStage, EnumRegion.CALIFORNIA);
    gridPane.add(california,0+offset,0);
    RegionPane heartLand=new RegionPane(primaryStage,EnumRegion.HEARTLAND);
    gridPane.add(heartLand,1+offset,0);
    RegionPane middleAmerica=new RegionPane(primaryStage,EnumRegion.MIDDLE_AMERICA);
    gridPane.add(middleAmerica,2+offset,0);
    RegionPane northernCrescent=new RegionPane(primaryStage,EnumRegion.NORTHERN_CRESCENT);
    gridPane.add(northernCrescent,3+offset,0);
    RegionPane mountain=new RegionPane(primaryStage,EnumRegion.MOUNTAIN);
    gridPane.add(mountain,4+offset,0);
    RegionPane northerPlains=new RegionPane(primaryStage,EnumRegion.NORTHERN_PLAINS);
    gridPane.add(northerPlains,5+offset,0);
    RegionPane southeast=new RegionPane(primaryStage,EnumRegion.SOUTHEAST);
    gridPane.add(southeast,6+offset,0);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
