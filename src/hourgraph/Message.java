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
    
    // @TODO Why don't we do something like: 
    // private User sender;
    // private User recipient
    private String senderName;
    private String recipientName;
    private Date timestamp;
    // To determine recipient's visibility of other recipients
    // @TODO Verify this field's data type
    private String visibility; 

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
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
   
}
