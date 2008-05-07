/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hourgraph;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Message {

    private String queueId;
    
    private User sender;
    private User recipient;
    private Date timestamp;
    // To determine recipient's visibility of other recipients
    // @TODO Verify this field's data type
    // Probably should be a list of values: ONE_TO_ONE, ONE_TO_MANY_FULL, ONE_TO_MANY_BLIND, ONE_TO_MANY_LIST
    // So if it is a message one to one, visibility is full
    // if it is a message one to many it can either be full or none (blind)
    // we can also distinguish a message that is directed to a list so that visibility is special because
    // we may consider that a member of a list knows who other members are
    private String visibility; 

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
   
}
