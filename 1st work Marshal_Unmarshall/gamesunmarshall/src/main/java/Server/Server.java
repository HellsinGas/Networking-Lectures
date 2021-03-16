/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Models.Games;
import Repository.Repository;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.xml.bind.JAXBException;

/**
 *Class for server connection
 * Contains a method for unmarshalling XML
 * From file , connection socket open and close.
 * Marshaling method to console output after has
 * connected
 * 
 * @author HellsinGas
 * Version 1.0
 * Since 1.0
 */
public class Server {
 
    public static void main(String args[]) throws IOException, JAXBException
    {
        Games games = Repository.uMarshaler("Games.xml");
        ServerSocket ss = new ServerSocket(4650);
        System.out.println("Waiting for client connection");
        Socket s = ss.accept(); //While loopas tol kol clientas neprisijungs
        System.out.println("client Connected");


        Repository.marshaler(games, s.getOutputStream());

        ss.close();
        s.close();
    }
}
