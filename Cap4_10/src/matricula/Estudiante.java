package matricula;

public class Estudiante {
    // Atributos de la clase Estudiante
    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;
    
    // Constructor de la clase Estudiante
    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }
    
    // Método que calcula el valor de la matrícula
    public double calcularMatricula() {
        double matricula = 50000;
        if (patrimonio > 2000000 && estratoSocial > 3) {
            matricula += patrimonio * 0.03;
        }
        return matricula;
    }
    
    // Métodos getter y setter para acceder y modificar los atributos privados
    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }
    
    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public double getPatrimonio() {
        return patrimonio;
    }
    
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }
    
    public int getEstratoSocial() {
        return estratoSocial;
    }
    
    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }
    
    // Método que muestra los datos relevantes del estudiante y su matrícula
    public void mostrarDatos() {
        System.out.println("Número de inscripción: " + numeroInscripcion);
        System.out.println("Nombres: " + nombres);
        System.out.println("Patrimonio: $" + patrimonio);
        System.out.println("Estrato social: " + estratoSocial);
        System.out.println("Valor de la matrícula: $" + calcularMatricula());
    }
}

