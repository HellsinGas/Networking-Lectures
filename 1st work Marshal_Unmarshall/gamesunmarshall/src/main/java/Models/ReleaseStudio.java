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
 *
 * @author arnol
 */
@XmlRootElement(name = "releasestudio")
@XmlAccessorType(XmlAccessType.FIELD)
class ReleaseStudio {
    
    String name;
    String homepage;

    @Override
    public String toString() {
        return "\n\t\tReleaseStudio{" + "\n\t\tname=" + name + ",\n\t\thomepage=" + homepage + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}
