/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_19;

public class triangulo {
    
    public static double calcularperimetro(double lado){
        double perimetro = 3 * lado;
        return perimetro;
    }

    public static double calcularaltura(double lado){
        double altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado / 2, 2));
        return altura;
    }
    
    public static double calculararea(double lado){
        double area = (lado * calcularaltura(lado)) / 2;
        return area;
    }
}
