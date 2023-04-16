package triangulo;

public class TrianguloEquilatero {
    // Creamos el atributo del lado
    private double lado;
    // Constructor de la clase
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }
    // Geter y seters
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    // Calcula el perimetro
    public double getPerimetro() {
        return 3 * lado;
    }
    // Calcula la altura
    public double getAltura() {
        return Math.sqrt(3) / 2 * lado;
    }
    // Calcula el area
    public double getArea() {
        return Math.sqrt(3) / 4 * lado * lado;
    }
}
