/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships.obslugaSieciowa;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author wolsk
 */
public class client extends obiektSieciowy {
    
    public Socket socket;
    
    public client (String ip,int port) throws IOException{
        
        System.out.print(ip + ":" + port);
        
        try {
            socket = new Socket(ip, port);
            System.out.println("POLACZONO");
        } catch (Exception e){
            System.out.print(e.toString());
        }
    }
    
    public boolean tryCloseConnection(){
        return true;
    }

    @Override
    public void Send(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Receive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ready() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Socket getSocket() {
        return socket;
    }
}
