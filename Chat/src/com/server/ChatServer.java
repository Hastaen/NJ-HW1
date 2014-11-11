package com.server;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ChatServer
{   
	
	
	public static void main(String[] args) throws IOException {
    
		
		System.out.println("Enter the port to use: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		
    int portNumber = Integer.parseInt(s);
    
    try (
        ServerSocket serverSocket = new ServerSocket(portNumber);
        Socket clientSocket = serverSocket.accept();     
    		
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);                   
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    ) {
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	System.out.println("From client: "+inputLine);
            out.println(inputLine);
        }
    } catch (IOException e) {
        System.out.println("Exception caught when trying to listen on port "
            + portNumber + " or listening for a connection");
        System.out.println(e.getMessage());
    }
}
}