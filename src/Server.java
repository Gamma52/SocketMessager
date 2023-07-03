import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private static Socket clientSocket;
	private static ServerSocket server;
	private static BufferedReader in;
	private static BufferedWriter out; 

	public static void main(String[] args) {
		server = new ServerSocket(4004);
		

	}

}
