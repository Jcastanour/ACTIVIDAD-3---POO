
package ejercicio_22;

import java.text.DecimalFormat;

public class SALARIO {
    
        public static String calcularsalario(String nombre, double costo, double horas){
        DecimalFormat df = new DecimalFormat("#.00");
        
        double salarioMensual =costo*horas;
        
       
        if (salarioMensual>450000) {
            return ("Nombre: "+nombre+"\nSalario: "+ df.format(salarioMensual));              
        }
        else {
            return ("Nombre: "+nombre);
        }    
        
        }

}
