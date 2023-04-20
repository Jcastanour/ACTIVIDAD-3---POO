package ejercicio_18;

public class SALARIO {
    String empID, nombre;
    double horas, valorHora, impuesto, resta, salarioBruto, salarioNeto;
    
    public static String calcularsalario(String empID,String nombre,double horas,double valorHora,double impuesto){
        double salarioBruto = horas * valorHora;
        double resta = salarioBruto * (impuesto / 100);
        double salarioNeto = salarioBruto - resta;
        
        return "ID: " + empID + ".  " + nombre + "\n" + "Salario bruto: " + salarioBruto + "." + "\n" + "Salario neto: " + salarioNeto;
    
    }
   

}
