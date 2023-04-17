/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_7;

public class MAYOR {
    
    double A, B;
    
    public static String mayor(double A, double B){
        if (A > B) {
            return "El valor " + A + " ES MAYOR QUE " + B;
        } 
        else {
            return "El valor " + B + " ES MAYOR QUE " + A;
        }
    }

}
