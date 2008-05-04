/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hourgraph;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author andre
 */
public class User {
    private String name;
    private Map details = new LinkedHashMap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getDetails() {
        return details;
    }

    public void setDetails(Map details) {
        this.details = details;
    }
    
/**
 * We Will have to put several elements in the details MAP I'll List them here:
 * 
 * email
 * age
 * sex
 * placeOfBirth
 * firstSeen
 * lastSeen
 * totalNumberOfEmailsSent
 * totalNumberOfEmailsReceived
 * positionAtIscte
 * department
 * academicDegree
 * course
 * year
 * yearsAtIscte
 * erasmos
 */    
}
