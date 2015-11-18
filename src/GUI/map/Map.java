package GUI.map;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

/**
 * Class containing the USA map Node
 */
public class Map
{

  /**
   * Publically accessible Node of the United States. This is instantiated upon class construction
   */
  public Node mapNode;

  /**
   * Creates an instance of Map and instantiates the USA Node
   */
  public Map()
  {
    try
    {
      mapNode = new FXMLLoader().load(getClass().getResource("US_Map.fxml"));
      mapNode.setScaleX(0.75);
      mapNode.setScaleY(0.75);
      mapNode.setScaleZ(0.75);
      //mapNode.setTranslateX(-20);
    }
    catch (IOException e) {mapNode = null;}
  }
}

