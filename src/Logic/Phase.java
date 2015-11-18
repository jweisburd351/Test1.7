package Logic;

import Networking.Message;
import Networking.Messenger;

import java.util.ArrayList;

/**
 * Created by arirappaport on 11/16/15.
 */
public class Phase
{
  public Player player;
  public Messenger messenger;

  public Phase(Player player, Messenger messenger)
  {
    this.messenger = messenger;
    this.player = player;
  }

  /**
   *
   * @param userAction The action the user wishes to take.
   * @return If this is a valid action.
   */
  public void reportMove(String userAction)
  {
    messenger.send(new Message(userAction));
  }

  /**
   *
   * @param statisticsWanted The statistics that are being
   *                         queried by the user in String form.
   * @return The desired statistics.
   */
  public void requestStatistics(String statisticsWanted)
  {
    messenger.send(new Message(statisticsWanted));
  }
}
