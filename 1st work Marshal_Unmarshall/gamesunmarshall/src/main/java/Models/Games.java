/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Root class of an XML file
 * @author arnol
 * 
 * since 1.0
 * Version 1.0
 */
@XmlRootElement(name = "games")
@XmlAccessorType(XmlAccessType.FIELD)
public class Games {
    ArrayList<Game> game = new ArrayList<Game>();

    @Override
    public String toString() {
        
        return "Games{" + "game: \n" + game + '}';
    }

    public ArrayList<Game> getGame() {
        return game;
    }

    public void setGame(ArrayList<Game> game) {
        this.game = game;
    }
}
