package com.client;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ChatClient
{   
	public static void main(String[] args) throws IOException {
		
		
	System.out.println("Enter the hostname to use: ");
	Scanner scan = new Scanner(System.in);
	String host = scan.next();
    
	String hostName = host;
    
	
	System.out.println("Enter the port to use: ");
	
	String port = scan.next();
    
	
	int portNumber = Integer.parseInt(port);

    try (
        Socket echoSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
    ) {
        String userInput;
        
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("echo: " + in.readLine());
        }
    } catch (UnknownHostException e) {
        System.err.println("Don't know about host " + hostName);
        System.exit(1);
    } catch (IOException e) {
        System.err.println("Couldn't get I/O for the connection to " +
            hostName);
        System.exit(1);
    } 
 }
}