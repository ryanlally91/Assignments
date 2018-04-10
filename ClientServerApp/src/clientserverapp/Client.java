package clientserverapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{

	public static void main(String[] args) throws IOException {

		Socket s = new Socket("localhost", 8888);

		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();

		
		Scanner in = new Scanner(instream);		
		PrintWriter out = new PrintWriter(outstream);
		
		while(true){
			System.out.print("Please enter a token....");
			Scanner input = new Scanner(System.in);
			String request = input.nextLine();
			out.println(request);
			out.flush();

			String response = in.next();
			System.out.println("Receiving: " + response);
			if(request.equals("QUIT")){
				break;
				//Continue to expect, print request and flush the stream after
				//As long as user input is not 'QUIT'
			}
		}
		System.out.println("BROKE" );

		instream.close();
		outstream.close();

		in.close();
		s.close();
		//Close all streams and scanners
	}
}