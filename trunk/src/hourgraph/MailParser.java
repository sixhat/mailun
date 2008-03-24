/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hourgraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class MailParser {

    String ficheiroLog;
    Date timeStart;
    Date timeEnd;
    ArrayList<Mensagem> mensagens;
    private File logFile;
    private int numLinha;

    public MailParser(String ficheiroLog, Date timeStart, Date timeEnd, ArrayList<Mensagem> mensagens) {

        this.ficheiroLog = ficheiroLog;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.mensagens = mensagens;

        logFile = new File(ficheiroLog);
        this.numLinha = 0;

        try {
            processLinebyLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void processLine(String nextLine) {
        try {
            
//        System.out.println(nextLine);
            String dataString = nextLine.substring(0, 15);
//        System.out.println(dataString);
//        System.out.println(this.numLinha);
            SimpleDateFormat df = new SimpleDateFormat("MMM dd H:mm:ss");

            Date dataLinha = df.parse(dataString);
           
            System.out.println(dataLinha);
        } catch (ParseException ex) {
            Logger.getLogger(MailParser.class.getName()).log(Level.SEVERE, null, ex);
        }
           

        
    }

    private void processLinebyLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(logFile);
        try {
            while (scanner.hasNextLine()) {
                processLine(scanner.nextLine());
                ++this.numLinha;
                if (this.numLinha>100) break;
            }
        } finally {
            scanner.close();
        }

    }
}
