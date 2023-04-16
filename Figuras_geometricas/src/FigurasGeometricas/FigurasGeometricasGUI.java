package FigurasGeometricas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class FigurasGeometricasGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	private JTextField circuloField;
    private JLabel circuloLabel;
    private JTextField rectanguloBField;
    private JLabel rectanguloBLabel;
    private JTextField rectanguloHField;
    private JLabel rectanguloHLabel;
    private JTextField cuadradoLadoField;
    private JLabel cuadradoLadoLabel;
    private JTextField trianguloBField;
    private JLabel trianguloBLabel;
    private JTextField trianguloHField;
    private JLabel trianguloHLabel;
    private JButton calcularButton;

    public FigurasGeometricasGUI() {
        // Configurar ventana
        setTitle("Encontrar perimetro y área");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null); // Ventana en el centro
        setLayout(new GridLayout(8, 2, 20, 5));
        getRootPane().setBorder(new EmptyBorder(10,10,10,10));

        // Crear etiquetas y campos de texto
        circuloLabel = new JLabel("Ingrese el radio del circulo:");
        circuloField = new JTextField();
        rectanguloBLabel = new JLabel("Ingrese la base del rectangulo:");
        rectanguloBField = new JTextField();
        rectanguloHLabel = new JLabel("Ingrese la altura del rectangulo:");
        rectanguloHField = new JTextField();
        cuadradoLadoLabel = new JLabel("Ingrese el lado del cuadrado:");
        cuadradoLadoField = new JTextField();
        trianguloBLabel = new JLabel("Ingrese la base del triángulo:");
        trianguloBField = new JTextField();
        trianguloHLabel = new JLabel("Ingrese la altura del triángulo:");
        trianguloHField = new JTextField();

        // Crear boton de calcular
        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        // Agregar etiquetas y campos de texto a la ventana
        add(circuloLabel);
        add(circuloField);
        add(rectanguloBLabel);
        add(rectanguloBField);
        add(rectanguloHLabel);
        add(rectanguloHField);
        add(cuadradoLadoLabel);
        add(cuadradoLadoField);
        add(trianguloBLabel);
        add(trianguloBField);
        add(trianguloHLabel);
        add(trianguloHField);
        add(calcularButton);

        // Mostrar ventana
        setVisible(true);
    }

    // Metodo para manejar el evento de clic en el boton
    public void actionPerformed(ActionEvent e) {
        // Obtener datos del formulario
        double radio = Double.parseDouble(circuloField.getText());
        double rectanguloB = Double.parseDouble(rectanguloBField.getText());
        double rectanguloH = Double.parseDouble(rectanguloHField.getText());
        double cuadradoLado = Double.parseDouble(cuadradoLadoField.getText());
        double trianguloH = Double.parseDouble(trianguloHField.getText());
        double trianguloB = Double.parseDouble(trianguloBField.getText());

        // Crear objeto para comparar
        Circulo circulo = new Circulo(radio);
        Rectangulo rectangulo = new Rectangulo(rectanguloB, rectanguloH);
        Cuadrado cuadrado = new Cuadrado(cuadradoLado);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(trianguloB, trianguloH);

        // Mostrar mensaje en cuadro de dialogo

        JOptionPane.showMessageDialog(this,
                "El área del círculo es = " + circulo.calcularArea() + "\n" +
                "El perímetro del círculo es = " + circulo.calcularPerimetro() + "\n" +
                        "\n" +
                "El área del rectángulo es =" + rectangulo.calcularArea() + "\n" +
                "El perímetro del rectángulo es = "+ rectangulo.calcularPerimetro() + "\n" +
                        "\n" +
                "El área del cuadrado es = "+ cuadrado.calcularArea() + "\n" +
                "El perímetro del cuadrado es = " + cuadrado.calcularPerimetro() +"\n" +
                        "\n" +
                "El área del triángulo es = "+ triangulo.calcularArea() + "\n" +
                "El perímetro del triángulo es = " + triangulo.calcularPerimetro() + "\n" +
                "Es un triángulo " + triangulo.determinarTipo());
    }

    public static void main(String[] args) {
        new FigurasGeometricasGUI();
    }
}

