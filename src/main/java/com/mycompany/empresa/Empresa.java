/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import gestores.ReglasNegocio;
import javax.swing.JOptionPane;

/**
 *
 * @author mauriciounate
 */
public class Empresa {

    public static void main(String[] args) {
       ReglasNegocio manejador = new ReglasNegocio();
       String entrada = "0";
        do {
            entrada = JOptionPane.showInputDialog("""
                                                  Seleccione una opci\u00f3n
                                                  
                                                  1. Administrador personas
                                                  2. Administrador Empleados 
                                                  4. Salir
                                                  """);
            switch (entrada) {
                case "1":
                    
                    manejador.MostrarOpciones();
                    manejador.menu();
                    break;
                case "2":
                    manejador.MostrarOpciones();
                    manejador.menu();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Menú inicial cerrado");
                    entrada = "0";
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    break;
            }
        } while (!"0".equals(entrada));
    }
}
