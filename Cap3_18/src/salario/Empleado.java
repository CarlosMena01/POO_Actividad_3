package salario;

public class Empleado {
	// Escribimos todos los atributos del empleado
    private int codigoEmpleado;
    private String nombre;
    private int numHorasTrabajadas;
    private double valorHoraTrabajada;
    private double porcentajeRetencionFuente;
    
    // Creamos el constructor
    public Empleado(int codigoEmpleado, String nombre, int numHorasTrabajadas, double valorHoraTrabajada, double porcentajeRetencionFuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.porcentajeRetencionFuente = porcentajeRetencionFuente;
    }
    
    // Implementamos geters y seters
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }

    public void setNumHorasTrabajadas(int numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public double getPorcentajeRetencionFuente() {
        return porcentajeRetencionFuente;
    }

    public void setPorcentajeRetencionFuente(double porcentajeRetencionFuente) {
        this.porcentajeRetencionFuente = porcentajeRetencionFuente;
    }
    
    // Metodo para obtener el salario Bruto
    public double calcularSalarioBruto() {
        return numHorasTrabajadas * valorHoraTrabajada;
    }
    // Metodo para obtener el salario Neto
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double retencion = salarioBruto * porcentajeRetencionFuente / 100;
        return salarioBruto - retencion;
    }
}

