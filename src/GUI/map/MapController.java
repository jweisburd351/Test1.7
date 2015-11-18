package GUI.map;

import Logic.geography.MapConstants;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.effect.Effect;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * Controller for handling interactivity with the US Region Map
 */
public class MapController implements MapConstants
{
  private final double SELECT_RADIUS = 500;

  private final double UNSELECT_RADIUS = 10;

  /**
   * Defines the behavior of the map when a region is entered by the user's mouse
   * @param event Mouse event that triggered the entering of the region
   */
  public void handleMouseEntered(MouseEvent event) {
    Group region = (Group) event.getSource();
    double scaleFactor = 1.0;
    String id = region.getId();
    if (id.equals(CALIFORNIA)) scaleFactor = 1.3;
    else if (id.equals(HEARTLAND) || id.equals(SOUTHERN_PLAINS)) scaleFactor = 1.2;
    else if (id.equals(NORTHERN_CRESCENT) || id.equals(NORTHERN_PLAINS) || id.equals(SOUTHEAST)) scaleFactor = 1.1;
    else if (id.equals(MOUNTAIN)) scaleFactor = 1.075;
    region.setScaleX(scaleFactor);
    region.setScaleY(scaleFactor);
    region.setScaleZ(scaleFactor);
    region.toFront();
  }

  /**
   * Defines the behavior of the map when a region is exited by the user's mouse
   * @param event Mouse even that was triggered upon exiting a region
   */
  public void handleMouseExited(MouseEvent event)
  {
    Group region = (Group) event.getSource();
    region.setScaleX(1.0);
    region.setScaleY(1.0);
    region.setScaleZ(1.0);
  }

  public void handleMouseMoved(MouseEvent event)
  {

  }

  /**
   * Defines the behavior of the map whena region is click on by the user's mouse
   * @param event Mouse event that was triggered upon clicking a region
   */
  public void handleMouseClicked(MouseEvent event)
  {
    Group region = (Group) event.getSource();
    region.setScaleX(1.0);
    region.setScaleY(1.0);
    region.setScaleZ(1.0);
    Effect selectEffect = new InnerShadow(SELECT_RADIUS, Color.BLACK);
    Effect unselectEffect = new InnerShadow(UNSELECT_RADIUS, Color.BLACK);
    if (region.getEffect() instanceof InnerShadow)
    {
      InnerShadow currentEffect = (InnerShadow) region.getEffect();
      if (currentEffect.getRadius() == SELECT_RADIUS) region.setEffect(unselectEffect);
      else region.setEffect(selectEffect);
    }
    else region.setEffect(selectEffect);
    for (Node child : region.getParent().getChildrenUnmodifiable())
    {
      if (!child.getId().equals(region.getId())) child.setEffect(unselectEffect);
    }
  }
}
