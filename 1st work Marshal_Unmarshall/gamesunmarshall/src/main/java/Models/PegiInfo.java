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
 *Class holding XML object PegiInfo
 * @author arnol
 * since 1.0
 * Version 1.0
 */

@XmlRootElement(name = "PEGIrating")
@XmlAccessorType(XmlAccessType.FIELD)
public class PegiInfo {
    Integer age;
    PegiDescriptors contentdescriptors; 

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PegiDescriptors getContentdescriptors() {
        return contentdescriptors;
    }

    public void setContentdescriptors(PegiDescriptors contentdescriptors) {
        this.contentdescriptors = contentdescriptors;
    }

    @Override
    public String toString() {
        return "\n\tPegiInfo{" + "\n\t\tage=" + age + ", \n\t\tcontentdescriptors=" + contentdescriptors + '}';
    }
    


   
}
