import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


// add comment
public class Client {
	
	public static void main(String[] args) {
		try(
			Socket clientSocket = new Socket("localhost", 4004);       
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));         
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));         
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
		    
			){			 
	
	         System.out.println("Введите текст");       
	         String word = reader.readLine(); 
	         
	         out.write(word + "\n");
	         out.flush();
	         String serverWord = in.readLine();
	         System.out.println(serverWord);
		}catch(IOException e) {
			 System.err.println(e);
		}

	}

}
