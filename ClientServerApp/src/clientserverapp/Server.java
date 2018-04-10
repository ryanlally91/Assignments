package clientserverapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.TreeSet;

public class Server implements Runnable  {
	Socket s;
	Scanner in;
	PrintWriter out;
	static TreeSet<String> tokenList=new TreeSet<String>(); 
	//Tree automatically sorts by lexicographical order and doesn't allow duplicates

	public Server(Socket s2) {
		this.s=s2;
	}

	public static void main(String[] args) throws IOException {

		int portNumber = 8888;
		ServerSocket server = new ServerSocket(portNumber);
		System.out.println("Waiting for client to connect....");

		while(true){
			Socket s=server.accept(); //client socket on server side
			System.out.println("Client connected");
			Thread thread = new Thread(new Server(s)); //
			thread.start();
		}
	}

	public void run() {
		try {
			try {
				in = new Scanner(s.getInputStream());
				out = new PrintWriter(s.getOutputStream());
				doService(); // the actual service
			} finally {
				s.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void doService() throws IOException {
		while(true) {
			if(!in.hasNext())
				return;
			String request = in.nextLine();
			System.out.println("Request received: " + request);
			// (...) test for type of request here (not implemented)
			tokenizeRequest(request);
		}
	}

	public void tokenizeRequest(String request) {
		//This method processes the user's request; adding/removing to the tree set
		System.out.println("Received from client: ");

		if(request.startsWith("SUBMIT")) {
			request = request.substring(6, request.length());// Splitting the user input to remove 'SUBMIT'
			if(tokenList.size()<=9) { //Limits tree set size to 10
				tokenList.add(request);
				System.out.println(tokenList);
				System.out.println("Server: OK ");
				out.println("OK");
				out.println(tokenList);// Print the entire tree set 
				if(!(tokenList.size()<=9)) {
					System.out.println("Error: Submission max reached");
					out.println("Error: Submission max reached");
				}
			}
		} else if(request.startsWith("REMOVE")) {
			request = request.substring(6, request.length());// Splitting the user input to remove 'REMOVE'
			tokenList.remove(request);
			System.out.println(tokenList);
			System.out.println("Server: OK ");
		} 
		else if (request.equals("QUIT")){
			System.out.println("QUIT");
			out.println("QUIT");
		}
		out.flush(); 
	}
}

