/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Class holding XML
 *genre strings
 * 
 * @author arnol
 * 
 * since 1.0
 * Version 1.0
 */
@XmlRootElement(name = "genres")
@XmlAccessorType(XmlAccessType.FIELD)
public class Genres {
    List<String> genre = new ArrayList<String>();

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

   

   

    @Override
    public String toString() {
        return "\n Genres{" + "\n\tgenre= \n" + genre.toString().replace("[", " ").replace("]"," ")+ '}';
    }

 


}
