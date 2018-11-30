/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships.obslugaSieciowa;

import java.net.Socket;

/**
 *
 * @author wolsk
 */
public abstract class obiektSieciowy {
    
    
    
   public abstract void Send(String s);
   public abstract String Receive();
   public abstract void ready();
   public abstract Socket getSocket();
}
