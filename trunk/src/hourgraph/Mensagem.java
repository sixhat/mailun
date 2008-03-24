/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hourgraph;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class Mensagem {
    private String MensagemID;
    private ArrayList<Utilizador> from;
    private ArrayList<Utilizador> to;
    private Date horaEnvio;
    public Mensagem() {

    }

    public void setFrom(ArrayList from) {
        this.from = from;
    }

    public ArrayList getFrom() {
        return from;
    }

    public void setTo(ArrayList to) {
        this.to = to;
    }

    public ArrayList getTo() {
        return to;
    }

    public void addTo(Utilizador util) {
        if (!this.to.contains(util)) {
            this.to.add(util);
        }
    }
}
