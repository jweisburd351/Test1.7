package Logic;

import Networking.Messenger;
import common.EnumPolicy;
import common.EnumRegion;
import common.PolicyCard;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

/**
 * Created by arirappaport on 11/15/15.
 */
public class Player
{
  public final int NUM_CARDS_PER_DECK = 60;
  public Random rand;
  public ArrayList<ClientPolicyCard> hand;
  public Stack<ClientPolicyCard> discardPile, deck;

  public Player(EnumRegion region)
  {
    discardPile = new Stack<>();
    rand = new Random();
    deck = new Stack<>();
    buildDeck(region);
  }

  public void discard(ClientPolicyCard cardToDiscard)
  {
    if (hand.contains(cardToDiscard))
    {
      hand.remove(cardToDiscard);
      discardPile.push(cardToDiscard);
    }
  }

  public void drawCard()
  {
    hand.add(deck.pop());
  }

  public void playCard(ClientPolicyCard cardToPlay)
  {
    if(hand.contains(cardToPlay))
    {
      hand.remove(cardToPlay);
    }
  }

  //TODO: Add region specific cards
  private void buildDeck(EnumRegion region)
  {
    for (int i = 0; i < NUM_CARDS_PER_DECK; i++)
    {
      //deck.add(new ClientPolicyCard(region, EnumPolicy.values()[rand.nextInt()]));
    }
  }

}
