/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlprogramacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Delio
 */
public class SqlProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        try {
            //metodos.crearBase("CartasBase.db");
            metodos.IniciarBase();
            metodos.Creartabla();
            metodos.Seleccionar();
//            metodos.insertar(new Carta("Dragon",10,6,6,1));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlProgramacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
