package common;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/**
 * Created by jmweisburd on 11/15/15.
 */
public class ImageGetter
{

  private static Image fruit64;
  private static Image grains64;
  private static Image aslash;
  private Image leftLeg;
  private Image rightLeg;
  private String leftArm;
  private String rightArm;
  private String head;

  public ImageGetter()
  {
    fruit64 = new Image("farmProductIcons/FarmProduct_Fruit_64x64.png",64,64,false, false);
    grains64 = new Image("farmProductIcons/FarmProduct_Grains_64x64.png",64,64,false, false);
    aslash = new Image("farmProductIcons/aslash.png",64,64,false, false);

    //fruit64 = new Image(getClass().getResourceAsStream("/../assets/farmProductIcons/FarmProduct_Fruit_64x64.png"));
    //grains64 = new Image(getClass().getResourceAsStream("/../assets/farmProductIcons/FarmProduct_Fruit_64x64.png"));
    //aslash = new Image(getClass().getResourceAsStream("/../assets/farmProductIcons/FarmProduct_Fruit_64x64.png"));


    leftArm = "cardImages/left.jpg";
    rightArm = "cardImages/right.jpg";
    head = "cardImages/head.png";
  }
  /*
  public ImageView getImageForFoodType(EnumFood type)
  {
    if (type.toString().equalsIgnoreCase(EnumFood.FRUIT.toString()))
    {
      return fruit64;
      //return new ImageView(fruit64);
    }
    else if (type.toString().equalsIgnoreCase(EnumFood.GRAIN.toString()))
    {
      return grains64;
    }
    else
    {
      return aslash;
    }
  }*/



  public Image getImageForFoodType(EnumFood type)
  {
    if (type.toString().equalsIgnoreCase(EnumFood.FRUIT.toString()))
    {
      return fruit64;
    }
    else if (type.toString().equalsIgnoreCase(EnumFood.GRAIN.toString()))
    {
      return grains64;
    }
    else
    {
      return aslash;
    }
  }

  public ImageView getImageForCard(EnumPolicy policy)
  {
    switch(policy)
    {
      case Clean_River_Incentive:
        return new ImageView(new Image(head, Constant.INIT_CARD_WIDTH*8, Constant.INIT_CARD_HEIGHT*8, false,false));
      case Fertilizer_Subsidy:
        return new ImageView(new Image(leftArm, Constant.INIT_CARD_WIDTH*8, Constant.INIT_CARD_HEIGHT*8, false, false));
      case Educate_the_Woman_Campaign:
        return new ImageView(new Image(rightArm, Constant.INIT_CARD_WIDTH*8, Constant.INIT_CARD_HEIGHT*8, false, false));
    }
    return null;
  }

}
