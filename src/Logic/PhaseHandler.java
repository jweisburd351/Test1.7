package Logic;

import Networking.Message;
import Networking.Messenger;
import common.EnumRegion;
import common.PolicyCard;

import java.io.InterruptedIOException;
import java.lang.String;import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by arirappaport on 11/15/15.
 */
public class PhaseHandler implements Runnable
{
  private DraftingPhase draftingPhase;
  private VotingPhase votingPhase;
  private Messenger messenger;
  private Phase currentPhase;
  private Player player;

  /**
   * PhaseHandler is a class that does book keeping
   * for the current phase of the game.
   * @param clientSide The client's end of the socket.
   */
  public PhaseHandler(Socket clientSide)
  {
    messenger = new Messenger(clientSide);
    currentPhase = new ConfigPhase(player, messenger);
    draftingPhase = new DraftingPhase(player, messenger);
    votingPhase = new VotingPhase(player, messenger);
  }

  public void run()
  {
    try
    {
      for(;;)
      {
        parseServerMessages();
      }
    }
    catch (InterruptedException ex)
    {
      ex.printStackTrace();
    }

  }

  private void parseServerMessages() throws InterruptedException
  {
    try
    {
      messenger.receive();
    }
    catch (InterruptedIOException ex)
    {
      ex.printStackTrace();
    }
  }
}
