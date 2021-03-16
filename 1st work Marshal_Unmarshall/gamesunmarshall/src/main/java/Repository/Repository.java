/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Models.Games;
//import com.mycompany.gamesunmarshall.Games;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;


/**
 *Class containing
 * Marshaling and
 * Unmarshalling methods  
 * 
 * @author HellsinGas
 *  since 1.0
 * Version 1.0
 */
public class Repository {
    
    /**
     * Method which reads object tree
     * 
     * @param games Root class for marshaling
     * @param targeStream Output stream where u wish your output to go
     * @return
     * @throws PropertyException
     * @throws JAXBException 
     */
    public static Marshaller marshaler (Games games, OutputStream targeStream) throws PropertyException, JAXBException {
        
        JAXBContext context = JAXBContext.newInstance(Games.class);
        javax.xml.bind.Marshaller marshallerObj = context.createMarshaller();
        System.setProperty("javax.xml.accessExternalDTD", "all");
        marshallerObj.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.marshal(games, targeStream);        
        return marshallerObj;
}
    /**
     * Method 
     * @param xmlpath path of an XML file
     * @return
     * @throws PropertyException
     * @throws JAXBException 
     */
      public static Games uMarshaler (String xmlpath) throws PropertyException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Games.class);
        javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
        System.setProperty("javax.xml.accessExternalDTD", "all");
       // unmarshaller.setProperty(javax.xml.XMLConstants.ACCESS_EXTERNAL_DTD, Boolean.TRUE);
        Path path = Paths.get(xmlpath);
        return (Games)unmarshaller.unmarshal(new File(path.toString()));
}
    
}
