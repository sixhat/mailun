/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hourgraph;
import java.sql.*;
import java.util.Map;
/**
 *
 * @author andre
 */
public interface DataManager {

     // Check whether specific queue Id exists
     boolean checkQueueId(String queueId);
    
     // Parse and insert message in database
     void insertMessage(Message m);
     
     // Serialize and insert network object in database with a network id that is the 
     // date that the network corresponds to (for hourly networks it would be yyyyMMddH24
     void insertNetwork(Object network, String networkId);
     
     // Get all messages where fieldName matches regex in the database and return them in a map using 
     // order in resultset as key
     Map<String,Message> getMessages(String fieldName, String regex);
     
     // Obtain specific network from database by network Id
     Object getNetwork(String networkId);
     
     
}
