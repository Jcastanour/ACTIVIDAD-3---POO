/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_10;

public class MATRICULA {
        String ni, nombre;
        double patrimonio;
        int estrato;

        

        public static String calcular(String ni, String nombre, double patrimonio, int estrato) {
           
           double pagmat = 50000;
           if ((patrimonio > 2000000) && (estrato > 3)) {
            pagmat = pagmat + 0.03 * patrimonio;
            } 
           
           return "El estudiante "+ nombre + "\n" + "con numero de identificacion " + ni + "\n" + "debe pagar $" + pagmat;
           
        }
        
}
