package comparador;

public class MayorValor {
    
    private double[] datos; // Array para almacenar los datos ingresados
    
    public MayorValor() {
        datos = new double[0]; // Inicializamos el array vacío
    }
    
    // Método para agregar un valor al array
    public void agregarValor(double valor) {
        double[] nuevosDatos = new double[datos.length + 1]; // Creamos un nuevo array con un espacio adicional
        for (int i = 0; i < datos.length; i++) {
            nuevosDatos[i] = datos[i]; // Copiamos los datos anteriores en el nuevo array
        }
        nuevosDatos[datos.length] = valor; // Agregamos el nuevo valor al final del nuevo array
        datos = nuevosDatos; // Reemplazamos el array anterior con el nuevo array
    }
    
    // Método para encontrar el valor mayor
    public double encontrarMayor() {
        if (datos.length == 0) {
            return 0;
        }
        double mayor = datos[0]; // Inicializamos el valor mayor con el primer elemento del array
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i]; // Si encontramos un valor mayor, lo actualizamos
            }
        }
        return mayor;
    }
    
    // Método para obtener el resultado como un String
    public String obtenerResultado() {
        double mayor = encontrarMayor();
        return "El mayor valor es: " + mayor;
    }
}

