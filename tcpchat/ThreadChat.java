/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpchat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class ThreadChat implements Runnable {

    private Scanner in = null;
    private Socket socket = null;
    public frmClient chat  = null;
    ServerSocket server = null;

    public ThreadChat() {
        try {
            server = new ServerSocket(1234);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(this).start();
    }
    
    public void run(){
        try {
            while(true){
                while((socket = server.accept()) != null){
                    this.in = new Scanner(this.socket.getInputStream());
                    String chuoi = in.nextLine().trim();
                    
                }
            }
        } catch (Exception e) {
        }
    }

}
