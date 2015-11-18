package Networking;

import java.io.*;
import java.io.IOException;import java.io.ObjectInputStream;import java.io.ObjectOutputStream;import java.lang.ClassNotFoundException;import java.lang.System;import java.net.Socket;

/**
 * Created by arirappaport on 11/13/15.
 */
public class Messenger
{
  private Socket clientSide;
  private ObjectOutputStream messageSender;
  private  ObjectInputStream messageReceiver;

  //Instantiated from PhaseHandler
  public Messenger(Socket clientSide)
  {
    this.clientSide = clientSide;
    try
    {
      messageSender = new ObjectOutputStream(clientSide.getOutputStream());
      messageReceiver = new ObjectInputStream(clientSide.getInputStream());
    }
    catch (IOException io)
    {
      io.printStackTrace();
    }
  }

  //Should only be called from PhaseHandler
  public void send(Message userAction)
  {
    try
    {
      messageSender.writeObject(userAction);
      messageSender.flush();
    }
    catch (IOException io)
    {
      io.printStackTrace();
    }
  }

  //Should only be called from PhaseHandler
  public Message receive() throws InterruptedIOException
  {
    try
    {
      return (Message) messageReceiver.readObject();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
      e.printStackTrace();
    }
    return null;
  }
}
