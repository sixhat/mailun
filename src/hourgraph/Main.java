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
public class Main {
    String ficheiroLog;
    Date timeStart;
    Date timeEnd;
    ArrayList<Mensagem> mensagens;

    public Main() {
        ficheiroLog="teste.log";
        MailParser parser = new MailParser(ficheiroLog, timeStart, timeEnd, mensagens);
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    // TODO code application logic here
    }
}
