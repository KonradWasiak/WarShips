/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships.obslugaSieciowa;

import game.shipPart;
import java.net.Socket;

/**
 *
 * @author wolsk
 */
public abstract class obiektSieciowy {

    public static boolean czySerwer;

    public abstract void Send(String s);

//    public abstract void SendOwnBattlefield(shipPart[] battlefield);
//
//    public abstract shipPart[] ReceiveEnemyBattlefield();

    public abstract String Receive();

    public abstract void ready();

    public abstract Socket getSocket();
}
