package figuras_geometricas;

public class Triangulo_Rectangulo {

    int baset, alturat;

    public Triangulo_Rectangulo(int baset, int alturat) {
        this.baset = baset;
        this.alturat = alturat;
    }

    double calcularHipotenusa() {
        return Math.pow((baset * baset) + (alturat * alturat), 0.5);
    }

    double calcularArea() {
        return ((alturat*baset)/ 2.0);
    }

    double calcularPerimetro() {
        return (baset + alturat + calcularHipotenusa());
    }

    String determinarTipoTriangulo() {
        if ((baset == alturat) && (baset == calcularHipotenusa()) && (alturat == calcularHipotenusa())) {
            return "Es un triangulo equilatero";
        } else if ((baset != alturat) && (baset != calcularHipotenusa()) && (alturat != calcularHipotenusa())) {
            return "Es un triangulo escaleno";
        } else {
            return "Es un triangulo isosceles";

        }
    }
}
