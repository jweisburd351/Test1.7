package GUI;

import GUI.Popups.PopupManager;
import GUI.ProductBar.ProductBar;
import GUI.hand.Hand;
import GUI.map.Map;
import com.sun.tools.javac.comp.Flow;
import common.ImageGetter;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUI extends Application
{
  ArrayList<ColumnConstraints> colConstraintsList;
  ArrayList<RowConstraints> rowConstraintsList;

  Stage primaryStage;
  Rectangle2D screenBounds;
  double screenHeight;
  double screenWidth;

  VisNode visNode;
  GraphNode graphNode;
  ProductBar productBar;
  HandBar handBar;
  DeckNode deckNode;
  ActionButtons actionButtons;
  SummaryBar summaryBar;
  DraftStatus draftStatus;

  ImageGetter imageGetter;
  PopupManager popupManager;


  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    primaryStage.setTitle("Starvation Evasion");

    screenBounds = Screen.getPrimary().getVisualBounds();
    screenHeight = screenBounds.getHeight();
    screenWidth = screenBounds.getWidth();

    //popupManager = new PopupManager(primaryStage.getWidth(), primaryStage.getHeight());
    imageGetter = new ImageGetter();

    GridPane draftGrid = new GridPane();
    draftGrid.setPrefSize(screenWidth, screenHeight);

    initializeGridSizes();
    draftGrid.getColumnConstraints().addAll(colConstraintsList);
    draftGrid.getRowConstraints().addAll(rowConstraintsList);
    draftGrid.setGridLinesVisible(true);

    visNode = new VisNode(primaryStage);
    draftGrid.add(visNode, 0,0,1,3);

    graphNode = new GraphNode(primaryStage);
    draftGrid.add(graphNode, 0, 3, 1, 10);

    summaryBar = new SummaryBar(primaryStage);
    draftGrid.add(summaryBar, 1, 0, 12, 1);

    draftStatus = new DraftStatus(primaryStage);
    draftGrid.add(draftStatus, 11, 1, 2, 4);

    deckNode = new DeckNode(primaryStage);
    draftGrid.add(deckNode, 11,5,2,2);

    productBar = new ProductBar(this);
    draftGrid.add(productBar, 1, 9, 11, 1);

    //Node mapNode = new Map().mapNode;
    //draftGrid.add(mapNode, 1, 1, 10, 6);

    actionButtons = new ActionButtons(primaryStage);
    draftGrid.add(actionButtons, 11, 7, 2, 2);

    //handBar = new HandBar(primaryStage);
    //Hand handBar = new Hand(this, primaryStage);
    //draftGrid.add(handBar, 3, 7, 12, 8);


    primaryStage.setScene(new Scene(draftGrid));

    primaryStage.show();

    //handBar.setPrefSize(primaryStage.getWidth()*10/84, primaryStage.getHeight()*.2);
  }

  private void initializeGridSizes()
  {
    colConstraintsList = new ArrayList<>();
    colConstraintsList.add(new ColumnConstraints());
    colConstraintsList.get(0).setPercentWidth(16);

    for (int i = 1; i < 13; ++i)
    {
      colConstraintsList.add(new ColumnConstraints());
      colConstraintsList.get(i).setPercentWidth(7);
    }

    rowConstraintsList = new ArrayList<>();
    for (int i = 0; i < 10; ++i)
    {
      rowConstraintsList.add(new RowConstraints());
      rowConstraintsList.get(i).setPercentHeight(10);
    }
  }

  public Stage getPrimaryStage()
  {
    return primaryStage;
  }

  public PopupManager getPopupManager()
  {
    return popupManager;
  }

  public ImageGetter getImageGetter()
  {
    return imageGetter;
  }

  public double getScreenHeight()
  {
    return screenHeight;
  }

  public double getScreenWidth()
  {
    return screenWidth;
  }

  public Rectangle2D getScreenBounds()
  {
    return screenBounds;
  }

}
