package Logic;

import Networking.Message;
import Networking.Messenger;
import common.EnumRegion;

/**
 * Created by arirappaport on 11/16/15.
 */
public class ConfigPhase extends Phase
{
  public ConfigPhase(Player player, Messenger messenger)
  {
    super(player, messenger);
  }

  /**
   * Sends request to server to become region,
   * there is a race condition for getting a
   * requested region.
   */
  public void selectRegion(EnumRegion regionSelected)
  {
    messenger.send(new Message(regionSelected.toString()));
  }


}
