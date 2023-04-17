/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_23;

public class ECUACIONES {
    
    public static String calcularsolucion(double A,double B,double C){
        //Discrimnante (si es <0 no tienee soluciones en los reales
        double discri = Math.pow(B, 2) - (4 * A * C);

        if (discri < 0) {
            return("No hay solucion en los reales ");
        } else {
            double S1 = (-(B) + Math.sqrt(discri)) / (2 * A);
            double S2 = (-(B) - Math.sqrt(discri)) / (2 * A);
            return ("Las posibles soluciones de dicha ecuación son: " + S1 + " Y " + S2);
        }
        
        }

}
