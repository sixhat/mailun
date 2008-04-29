/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Ol� David! Optei por criar estes tr�s Interfaces para podermos ter uma ideia
 * do que � que queremos fazer, antes de estarmos a decidir os campos que vamos
 * usar.
 * 
 * As classes Message e User s�o recria��es das que j� tinhas criado antes
 * mas apenas com os campos de que t�nhamos falado, pois acho que a coisa
 * mudou um pouco em rela��o ao que tinhas previsto nas tuas classes iniciais.
 * 
 * Insere nestas classes e interfaces tudo o que queiras aproveitar das outras.
 * 
 * Se quiseres criar j� as classes que implementam as interfaces est�s � vontade!
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
