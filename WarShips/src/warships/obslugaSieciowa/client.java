/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships.obslugaSieciowa;

import game.shipPart;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wolsk
 */
public class client extends obiektSieciowy {

    public Socket socket;

    public client(String ip, int port) throws IOException {

        System.out.print(ip + ":" + port);

        try {
            socket = new Socket(ip, port);
            System.out.println("POLACZONO");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public boolean tryCloseConnection() {
        return true;
    }

    @Override
    public void Send(String s) {
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println(s);
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String Receive() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            return scanner.next();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void ready() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Socket getSocket() {
        return socket;
    }
//
//    @Override
//    public void SendOwnBattlefield(shipPart[] battlefield) {
//        try {
//            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//            out.writeObject(battlefield);
//        } catch (IOException ex) {
//            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
