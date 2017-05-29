/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlprogramacion;

import java.awt.HeadlessException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Delio
 */
public class SqlProgramacion {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static int seleccion = -1;

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.crearBase(JOptionPane.showInputDialog("Nombre de la base que desea crear:"));
        while (seleccion != 0) {
            try {
                System.out.println("Elige opción:\n1.- Crer la Base"
                        + "\n2.- Inicializar la base de datos \n"
                        + "3.- Crea la tabla Cartas\n"
                        + "4.- Inserta las cartas que quieras\n"
                        + "5.- Visualizalas por pantalla\n"
                        + "6.- Borrar cartas de la Tabla\n"
                        + "0.- Salir");

                seleccion = Integer.parseInt(scanner.nextLine());

                switch (seleccion) {
                    case 1:
                        metodos.crearBase(JOptionPane.showInputDialog("Nombre de la base que desea crear:"));
                        break;
                    case 2:
                        metodos.IniciarBase();

                        break;
                    case 3:
                        metodos.Creartabla();
                        break;
                    case 4:
                        metodos.insertar(new Carta(JOptionPane.showInputDialog("ID:"), JOptionPane.showInputDialog("Nombre:"), JOptionPane.showInputDialog("Vida:"), JOptionPane.showInputDialog("Ataque:"), JOptionPane.showInputDialog("Coste:")));
                        break;
                    case 5:
                        metodos.Seleccionar();
                        break;
                    case 6:
                        metodos.borrar(JOptionPane.showInputDialog("Seleccione el de la carta ID:"));
                        break;
                    case 0:
                        metodos.cerrar();
                        System.out.println("Cerrando la base");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }

            } catch (HeadlessException | ClassNotFoundException | NumberFormatException e) {
                System.out.println("Error!");
            }
        }

    }

}
