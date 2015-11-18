package Networking;

import java.io.Serializable;

/**
 * Created by arirappaport on 11/15/15.
 */
public class Message implements Serializable
{
  public Message(String userAction)
  {
    this(userAction, -1, -1);
  }

  public Message(String userAction, int amountA)
  {
    this(userAction, amountA, -1);
  }

  public Message(String userAction, int amountA, int amountX)
  {
    //Dependant on Server API
  }
}
