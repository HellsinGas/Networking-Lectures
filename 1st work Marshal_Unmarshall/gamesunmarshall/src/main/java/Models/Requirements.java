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
 *Class containing minimum
 * recommended and maximum requirements
 * XML objects
 * 
 * @author arnol
 * since 1.0
 * Version 1.0
 */
@XmlRootElement(name = "requirements")
@XmlAccessorType(XmlAccessType.FIELD)
class Requirements {
    MinimumReq minimum;
    RecommendedReq recommended;
    MaximumReq maximum;
    //ArrayList<RecommendedReq> recommended = new ArrayList<RecommendedReq>();
    //ArrayList<MaximumReq> maximum = new ArrayList<MaximumReq>();

    @Override
    public String toString() {
        return "\nRequirements{" + "\n\t minimum=" + minimum + ", recommended=" + recommended + ", maximum=" + maximum + '}';
    }

    public MinimumReq getMinimum() {
        return minimum;
    }

    public void setMinimum(MinimumReq minimum) {
        this.minimum = minimum;
    }

    public RecommendedReq getRecommended() {
        return recommended;
    }

    public void setRecommended(RecommendedReq recommended) {
        this.recommended = recommended;
    }

    public MaximumReq getMaximum() {
        return maximum;
    }

    public void setMaximum(MaximumReq maximum) {
        this.maximum = maximum;
    }

   

   

 

    

    
}
