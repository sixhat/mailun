/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Olá David! Optei por criar estes três Interfaces para podermos ter uma ideia
 * do que é que queremos fazer, antes de estarmos a decidir os campos que vamos
 * usar.
 * 
 * As classes Message e User são recriações das que já tinhas criado antes
 * mas apenas com os campos de que tínhamos falado, pois acho que a coisa
 * mudou um pouco em relação ao que tinhas previsto nas tuas classes iniciais.
 * 
 * Insere nestas classes e interfaces tudo o que queiras aproveitar das outras.
 * 
 * Se quiseres criar já as classes que implementam as interfaces estás à vontade!
 * 
 * :) Bom trabalho!
 */

package hourgraph;
import java.io.File;

/**
 *
 * @author andre
 */
public interface LogFileParser {

    // Break text file into several using prefix + integer from 0 to 23 as criteria for breaking
    void breakUsingPrefix(String prefix, File log, String destinationPath, String destinationPrefix);
   
    void processAll(String destinationPath);
}
