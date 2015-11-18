package Logic;

import Networking.Messenger;

/**
 * Created by arirappaport on 11/16/15.
 */
public class DraftingPhase extends Phase
{
  private int numCardsDiscarded;
  private int numCardsDrafted;

  public DraftingPhase(Player player, Messenger messenger)
  {
    super(player, messenger);
    numCardsDiscarded = 0;
    numCardsDrafted = 0;
  }

}
