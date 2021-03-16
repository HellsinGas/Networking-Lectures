/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamesunmarshall;

import Models.Games;
import Repository.Repository;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.spec.GCMParameterSpec;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *Main method which has Marshaling from object trees
 * and umarshalling from XML file method calls.
 * @author arnol
 * Since 1.0
 * Version 1.0
 */
public class JAXBMain {
    public static void main(String[] args) throws JAXBException, IOException {
      
       Games games = Repository.uMarshaler("Games.xml");        
       System.out.print(games);
              
       Repository.marshaler(games, System.out);
         
     
             
        
                
}
}
