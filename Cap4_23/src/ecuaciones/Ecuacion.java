package ecuaciones;

public class Ecuacion {
	private double a;
    private double b;
    private double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolver() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return ("Las soluciones son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return ("La solución doble es: " + x);
        } else {
        	double real = (-b)/(2 * a);
            double imag = (Math.sqrt(-discriminante)) / (2 * a);
            return ("Las soluciones son: " + real + " +/- " + imag + "i");
        }
    }
}
