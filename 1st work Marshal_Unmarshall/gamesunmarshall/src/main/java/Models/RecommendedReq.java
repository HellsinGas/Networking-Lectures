/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Class holding recommended
 * requirements XML object
 * @author arnol
 * since 1.0
 * Version 1.0
 */
@XmlRootElement(name = "recommended")
@XmlAccessorType(XmlAccessType.FIELD)
class RecommendedReq {
    String os;
    String processor;
    String Video;
    String directx;
    String memory;
    String hardDrive;
    String internet;
    String multiplayer;

    @Override
    public String toString() {
        return "\n\t\tRecommendedReq{" + "\n\t\t\tos=" + os + ",\n\t\t\t processor=" + processor + ",\n\t\t\t Video=" + Video + ",\n\t\t\t directx=" + directx + ",\n\t\t\t memory=" + memory + ",\n\t\t\t hardDrive=" + hardDrive + ",\n\t\t\t internet=" + internet + ",\n\t\t\t multiplayer=" + multiplayer + '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideo() {
        return Video;
    }

    public void setVideo(String Video) {
        this.Video = Video;
    }

    public String getDirectx() {
        return directx;
    }

    public void setDirectx(String directx) {
        this.directx = directx;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(String multiplayer) {
        this.multiplayer = multiplayer;
    }
    
}
