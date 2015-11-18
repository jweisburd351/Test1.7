package GUI.ProductBar;

import GUI.GUI;
import common.EnumFood;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ProductBar extends HBox
{
  Stage primaryStage;
  ArrayList<Button> buttonList;
  EnumFood selection;
  GUI gui;

  ArrayList<EnumFood> productList;
  ArrayList<ProductBarElement> elements;

  public ProductBar(GUI gui)
  {
    this.gui = gui;
    int productListSize;
    primaryStage = gui.getPrimaryStage();

    //double elementHeight = gui.getScreenHeight()*.10;
   // double elementWidth = gui.getScreenWidth()*.07;

    productList = new ArrayList<>();
    initializeProductList();

    productListSize = productList.size();
    elements = new ArrayList<>();

    for (int i = 0; i < productListSize; ++i)
    {
      EnumFood food = productList.get(i);
      elements.add(new ProductBarElement(food, gui, 1, 1, i));
    }

    setAlignment(Pos.CENTER);
    getChildren().addAll(elements);
  }

  public void initializeProductList()
  {
    productList = new ArrayList<>();
    productList.add(EnumFood.CITRUS);
    productList.add(EnumFood.FRUIT);
    productList.add(EnumFood.NUT);
    productList.add(EnumFood.GRAIN);
    productList.add(EnumFood.OIL);
    productList.add(EnumFood.VEGGIES);
    productList.add(EnumFood.SPECIAL);
    productList.add(EnumFood.FEED);
    productList.add(EnumFood.FISH);
    productList.add(EnumFood.MEAT);
    productList.add(EnumFood.POULTRY);
    productList.add(EnumFood.DAIRY);
  }


}