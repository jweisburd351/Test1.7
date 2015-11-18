package Logic;

import GUI.GUI;
import common.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by arirappaport on 11/15/15.
 */
public class ClientPolicyCard extends Button
{
  private boolean isActive, isBeingVotedOn;

  private PolicyCard thisCard;
  public ImageView view;

  public ClientPolicyCard(EnumRegion owner, EnumPolicy policy, GUI gui)
  {
    thisCard = new PolicyCard(owner, policy);
    view= gui.getImageGetter().getImageForCard(policy);
    view.setFitHeight(Constant.INIT_CARD_HEIGHT);
    view.setFitWidth(Constant.INIT_CARD_WIDTH);
    this.setGraphic(view);
    this.setPrefSize(gui.getPrimaryStage().getWidth() * (1 / 24), gui.getPrimaryStage().getHeight() * (1 / 16));
  }


  public boolean isActive()
  {
    return isActive;
  }

  public boolean isBeingVotedOn()
  {
    return isBeingVotedOn;
  }

  public void setIsActive(boolean isActive)
  {
    this.isActive = isActive;
  }

  public void setIsBeingVotedOn(boolean isBeingVotedOn)
  {
    this.isBeingVotedOn = isBeingVotedOn;
  }
}
