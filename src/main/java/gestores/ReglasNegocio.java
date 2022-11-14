/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import javax.swing.JOptionPane;

/**
 *
 * @author mauriciounate
 */
public class ReglasNegocio {
    
    String opcion;
    
        public void MostrarOpciones() {

        opcion = JOptionPane.showInputDialog("""
                                             Seleccione una opci\u00f3n
                                             
                                             1. Crear persona
                                             2. Actualizar persona
                                             3. Eliminar persona
                                             4. Buscar persona
                                             12. Salir
                                             
                                             """);
    }
    
    public void  menu ()
    {
        do {
            switch (opcion) {
                case "1":
                    MostrarOpciones();
                    menu();
                    break;
                case "2":
                    MostrarOpciones();
                    menu();
                    break;
                case "3":
                    MostrarOpciones();
                    menu();
                    break;
                case "4":
                    MostrarOpciones();
                    menu();
                    break;
                case "12":
                    JOptionPane.showMessageDialog(null, "Cerrar menú");
                    opcion = "12";
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    MostrarOpciones();
                    menu();
                    break;
            }

        } while (!"12".equals(opcion));

    }
    
}
