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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Class containing PegiInfo
 * content descriptors
 * @author arnol
 * since 1.0
 * Version 1.0
 */
@XmlRootElement(name = "conentdescriptors")
@XmlAccessorType(XmlAccessType.FIELD)
class PegiDescriptors {
    @XmlElement(name = "descriptor")
    List<String> description = new ArrayList<String>();

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n\tPegiDescriptors{" + "\n\t\tdescription=" + description.toString().replace("]", " ").replace("[", " ") + '}';
    }

    

   

}
