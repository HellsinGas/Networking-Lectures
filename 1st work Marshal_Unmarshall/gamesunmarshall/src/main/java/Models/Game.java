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
 *
 * The main class holding 
 * all the information about a game.
 * 
 * @author arnol
 * since 1.0
 * Version 1.0
 * 
 */
@XmlRootElement(name = "game")
@XmlAccessorType(XmlAccessType.FIELD)
public class Game {
    private String title ;
    private String releasedate;
    private ArrayList<Genres> genres = new ArrayList<Genres>();
    private ArrayList<Requirements> requirements = new ArrayList<Requirements>();
    private ArrayList<PegiInfo> PEGIrating = new ArrayList<PegiInfo>();
    private ArrayList<ReleaseStudio> releasestudio = new ArrayList<ReleaseStudio>();

    @Override
    public String toString() {
        return String.format("Game{" + " \n \t title= " + title + ", \n \t releasedate=" + releasedate + ",\n genres=" + genres + ", requirements=" + requirements + ", PEGIrating=" + PEGIrating + ", releasestudio=" + releasestudio + '}');
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public ArrayList<Genres> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genres> genres) {
        this.genres = genres;
    }

    public ArrayList<Requirements> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<Requirements> requirements) {
        this.requirements = requirements;
    }

    public ArrayList<PegiInfo> getPEGIrating() {
        return PEGIrating;
    }

    public void setPEGIrating(ArrayList<PegiInfo> PEGIrating) {
        this.PEGIrating = PEGIrating;
    }

    public ArrayList<ReleaseStudio> getReleasestudio() {
        return releasestudio;
    }

    public void setReleasestudio(ArrayList<ReleaseStudio> releasestudio) {
        this.releasestudio = releasestudio;
    }


    
}
