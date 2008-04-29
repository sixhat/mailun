/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hourgraph;
import java.io.File;
/**
 *
 * @author andre
 */
public interface HourFileParser {

    void parse(File hourLog);
    
    void processLine(String line);
    
    String getQueueId(String line);
    
    String getRecipient(String line);
    
    String getSender(String line);            
}
