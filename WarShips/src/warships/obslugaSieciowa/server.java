package warships.obslugaSieciowa;

import game.shipPart;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server extends obiektSieciowy {

    private ServerSocket socketServer;
    private Socket socket;

    public server(int port) {
        try {
            socketServer = new ServerSocket(port);
            socketServer.setSoTimeout(15000);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            if (socketServer != null) {
                socket = socketServer.accept();
                System.out.println("POLACZONO");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public boolean tryCloseConnection() {
        try {
            if (socketServer != null) {
                socketServer.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @Override
    public void Send(String s) {
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println(s);
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String Receive() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            return scanner.next();
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
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
