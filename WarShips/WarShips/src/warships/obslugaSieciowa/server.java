package warships.obslugaSieciowa;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class server extends obiektSieciowy {
    private ServerSocket socketServer;
    public Socket socket;
    
    public server(int port){
        try {
            socketServer = new ServerSocket(port);
            socketServer.setSoTimeout(15000);
        } catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            if (socketServer != null){
                socket = socketServer.accept();
                System.out.println("POLACZONO");
            }
        } catch (Exception e){
        System.out.println(e.toString());
        }
    }
    
    public boolean tryCloseConnection(){
        try {
            if (socketServer != null){
                socketServer.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }   
        return false;
    }

    @Override
    void Send(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String Receive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
