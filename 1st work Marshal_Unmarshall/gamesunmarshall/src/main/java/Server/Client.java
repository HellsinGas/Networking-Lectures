/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *Client side Class
 * Opens socket for client.
 * Creates inputstreamreader to accept information
 * from server bytes to string.
 * 
 * Creates Buffered reader to format
 * that string from server.
 * 
 * StringBuilder to build that string
 * While loop to go trough entire stream line
 * by line
 * 
 * @author HellsinGas
 * Since 1.0
 * Version 1.0
 */
public class Client
{
    
    public static void main(String args[])  throws IOException
    {
        Socket s = new Socket("localhost", 4650);

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        StringBuilder everything = new StringBuilder();
        String line;
        while( (line = bf.readLine()) != null) {
            everything.append(line);
            everything.append("\n");
        }


        System.out.println(everything.toString());
    }
}