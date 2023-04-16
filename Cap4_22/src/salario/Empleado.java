package salario;

public class Empleado {
    private String nombre;
    private double salarioPorHora;
    private double horasTrabajadas;
    private double salarioMensual;

    public Empleado(String nombre, double salarioPorHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioMensual = calcularSalarioMensual();
    }

    private double calcularSalarioMensual() {
        return (salarioPorHora * horasTrabajadas);

    }

    public String imprimir() {
        if (salarioMensual > 450000) {
            return (nombre + " tiene un salario mensual de $" + salarioMensual);
        } else {
            return (nombre);
        }
    }
}

