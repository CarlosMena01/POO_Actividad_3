package comparador;

public class Comparador {
    private int A; // atributo para el número A
    private int B; // atributo para el número B
    
    // constructor de la clase, para inicializar los atributos A y B
    public Comparador(int A, int B) {
        this.A = A;
        this.B = B;
    }
    
    // métodos geters y seters para los atributos A y B
    public int getA() {
        return A;
    }
    
    public void setA(int A) {
        this.A = A;
    }
    
    public int getB() {
        return B;
    }
    
    public void setB(int B) {
        this.B = B;
    }
    
    // método que compara los números A y B, y devuelve un texto indicando cuál es mayor
    public String compararNumeros() {
        if (A > B) {
            return "El número A es mayor que el número B";
        } else if (A < B) {
            return "El número B es mayor que el número A";
        } else {
            return "El número A y el número B son iguales";
        }
    }
}
