package GUI.ProductBar;

import GUI.GUI;
import GUI.Popups.PopupManager;
import common.EnumFood;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ProductBarElement extends StackPane
{
  EnumFood type;
  ImageView foodImg;
  final GUI gui;
  Button foodButton;
  final int buttonID;
  PopupManager popM;

  public ProductBarElement(EnumFood foodtype, GUI gui, double width, double height, int id)
  {
    this.type = foodtype;
    this.gui = gui;
    Rectangle r = new Rectangle(64, 64);
    r.setFill(Color.BLACK);
    //this.foodImg = new ImageView(gui.getImageGetter().getImageForFoodType(type));
    //this.setPrefSize(64, 64);
    this.buttonID = id;
    //this.popM = gui.getPopupManager();

    //foodButton = new Button("", foodImg);
    foodButton =  new Button("Button");

    /*
    foodButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent event)
      {
        popM.clickProductBar(type, buttonID);
      }
    });*/

    getChildren().add(r);
    //setAlignment(foodButton, Pos.CENTER);
    //getChildren().add(foodButton);
  }





}
