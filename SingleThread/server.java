package SingleThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public void run() throws IOException{
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) { 
          try {
           System.out.println("server is listening on port" + port);
           Socket acceptedConnection = socket.accept();
           System.out.println("Connection accepted from client" + acceptedConnection.getRemoteSocketAddress() );
           PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
           BufferedReader fromClient = new BufferedReader(
            new InputStreamReader(acceptedConnection.getInputStream())  
           );
           toClient.print("Hello from server");
           toClient.close();
           fromClient.close();
           acceptedConnection.close();
   
          } catch (IOException e) {
           e.printStackTrace();
          }
        }
   
       }
       public static void main(String[] args) {
           server server = new server();
           try {
               server.run();
           } catch (Exception e) {
               e.printStackTrace();
           }
           
       }
}
