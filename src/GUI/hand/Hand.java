package GUI.hand;

import GUI.GUI;
import GUI.ProductBar.ProductBarElement;
import Logic.ClientPolicyCard;
import common.EnumFood;
import common.EnumPolicy;
import common.EnumRegion;
import common.PolicyCard;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by arirappaport on 11/16/15.
 */
public class Hand extends HBox
{
  Stage primaryStage;
  GUI gui;

  ArrayList<ClientPolicyCard> elements;

  public Hand(GUI gui, Stage stage)
  {
    this.gui = gui;
    primaryStage = gui.getPrimaryStage();

    this.setPrefSize(stage.getWidth() * .8, stage.getHeight() * .1);
    //this.getChildren().add(tempText);
    elements = new ArrayList<>();
    elements.add(new ClientPolicyCard(EnumRegion.CALIFORNIA, EnumPolicy.Clean_River_Incentive, gui));
    elements.add(new ClientPolicyCard(EnumRegion.CALIFORNIA, EnumPolicy.Educate_the_Woman_Campaign, gui));
    elements.add(new ClientPolicyCard(EnumRegion.CALIFORNIA, EnumPolicy.Fertilizer_Subsidy, gui));
    getChildren().addAll(elements);
    /*
    for(ClientPolicyCard card : elements)
    {
      card.setOnMouseEntered(new EventHandler<javafx.scene.input.MouseEvent>()
      {
        @Override
        public void handle(javafx.scene.input.MouseEvent event)
        {
          card.view.setFitHeight(card.view.getFitHeight() * 2);
          card.view.setFitWidth(card.view.getFitWidth() * 2);
          card.setGraphic(card.view);
          toFront();
        }
      });
      card.setOnMouseExited(new EventHandler<javafx.scene.input.MouseEvent>()
      {
        @Override
        public void handle(javafx.scene.input.MouseEvent event)
        {
          card.view.setFitHeight(card.view.getFitHeight() / 2);
          card.view.setFitWidth(card.view.getFitWidth() / 2);
          card.setGraphic(card.view);
        }
      });
    }*/
    setSpacing(4.4);
  }
}
