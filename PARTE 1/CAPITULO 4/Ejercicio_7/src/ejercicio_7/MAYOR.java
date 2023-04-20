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
