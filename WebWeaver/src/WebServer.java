import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
	int portNumber = 4321;

	public WebServer() throws IOException{ 
	    ServerSocket serverSocket = new ServerSocket(portNumber);
	    Socket clientSocket = serverSocket.accept();
	    PrintWriter out =
	        new PrintWriter(clientSocket.getOutputStream(), true);
	    BufferedReader in = new BufferedReader(
	        new InputStreamReader(clientSocket.getInputStream()));
	    
	    while(true){
	        String line = "Tangled in my web";
	  //Send data back to client
	          out.println(line);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try {
			WebServer ws=new WebServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finish");
	}

}
