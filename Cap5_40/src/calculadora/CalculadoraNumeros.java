package calculadora;

public class CalculadoraNumeros {
    private int[] numeros;
    
    public CalculadoraNumeros() {
        numeros = new int[0];
    }
    
    public void agregarNumero(int numero) {
        int[] temp = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            temp[i] = numeros[i];
        }
        temp[numeros.length] = numero;
        numeros = temp;
    }
    
    public String calcular() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            int raizCuadrada = (int) Math.sqrt(numeros[i]);
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * numeros[i] * numeros[i];
            sb.append("Número " + (i + 1) + ": " + numeros[i] + "\n");
            sb.append("Raíz cuadrada: " + raizCuadrada + "\n");
            sb.append("Cuadrado: " + cuadrado + "\n");
            sb.append("Cubo: " + cubo + "\n\n");
        }
        return sb.toString();
    }
}

