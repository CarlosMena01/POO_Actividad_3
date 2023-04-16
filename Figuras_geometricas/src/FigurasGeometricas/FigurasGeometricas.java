package FigurasGeometricas;

class Circulo {
    private double radio; // Atributo para almacenar el radio del círculo
    // Constructor de la clase, recibe como parámetro el radio
    public Circulo(double radio) {
        this.radio = radio;
    }
    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio; // Área = π * radio^2
    }
    // Método para calcular el perímetro del círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Perímetro = 2 * π * radio
    }
    // Método para obtener el valor del radio del círculo
    public double getRadio() {
        return radio;
    }
    // Método para establecer un valor para el radio del círculo
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
class Rectangulo{
	private double base; // Atributo base
	private double altura; // Atributo altura
	// Constructor de la clase Rectangulo
	public Rectangulo(double base, double altura) {
	    this.base = base;
	    this.altura = altura;
	}
	// Método para calcular el área del rectangulo
	public double calcularArea() {
	    return base * altura;
	}
	// Método para calcular el perímetro del rectangulo
	public double calcularPerimetro() {
	    return 2 * (base + altura);
	}
	// Método para obtener la base del rectangulo
	public double getBase() {
	    return base;
	}
	// Método para definir la base del rectangulo
	public void setBase(double base) {
	    this.base = base;
	}
	// Método para obtener la altura del rectangulo
	public double getAltura() {
	    return altura;
	}
	// Método para definir la altura del rectangulo
	public void setAltura(double altura) {
	    this.altura = altura;
	}

}

class Cuadrado {
    private double lado; // atributo privado que representa el lado del cuadrado
    // Constructor de la clase que recibe como parámetro el lado del cuadrado
    public Cuadrado(double lado) {
        this.lado = lado; // asignamos el valor del parámetro al atributo lado
    }
    // Método para calcular el área del cuadrado
    public double calcularArea() {
        return lado * lado; // fórmula para calcular el área del cuadrado
    }
    // Método para calcular el perímetro del cuadrado
    public double calcularPerimetro() {
        return 4 * lado; // fórmula para calcular el perímetro del cuadrado
    }
    // Método para obtener el valor del lado del cuadrado
    public double getLado() {
        return lado; // retornamos el valor del atributo lado
    }

    // Método para cambiar el valor del lado del cuadrado
    public void setLado(double lado) {
        this.lado = lado; // asignamos el valor del parámetro al atributo lado
    }
}

class TrianguloRectangulo {
    private double base;
    private double altura;
    // Constructor de la clase 
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    // Método para calcular el área del triángulo
    public double calcularArea() {
        return base * altura / 2;
    }
    // Método para calcular el perímetro del triángulo
    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }
    // Método para calcular la hipotenusa del triángulo
    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }
    // Método para determinar el tipo de triángulo (Equilátero, Isósceles, Escaleno)
    public String determinarTipo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    // Método para obtener la base del triángulo
    public double getBase() {
        return base;
    }
    // Método para definir la base del triángulo
    public void setBase(double base) {
        this.base = base;
    }
    // Método para obtener la altura del triángulo
    public double getAltura() {
        return altura;
    }
    // Método para definir la altura del triángulo
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
