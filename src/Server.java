import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	public static void main(String[] args) {
		try(				
			ServerSocket server = new ServerSocket(4004);   
			Socket clientSocket = server.accept();      
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));         
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			    
			){			 
				
			     System.out.println("Server run");   
			     String word = "", exit = "exit";
			     while (!exit.equals(word)) {
			    	 word = in.readLine();
		             System.out.println(word);				        
				         
				     out.write(word + "\n");
				     out.flush();
				         
			     } 
			     
			}catch(IOException e) {
				 System.err.println(e);
			}

	}
}
