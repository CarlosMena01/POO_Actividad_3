package comparador;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparadorGUI extends JFrame {
    private static final long serialVersionUID = 1L;
	private JLabel labelA;
    private JLabel labelB;
    private JTextField fieldA;
    private JTextField fieldB;
    private JButton buttonComparar;
    private JLabel labelResultado;

    public ComparadorGUI() {
        // configuración del JFrame
        setTitle("Comparador de números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creación de los componentes
        labelA = new JLabel("Número A:");
        labelB = new JLabel("Número B:");
        fieldA = new JTextField(10);
        fieldB = new JTextField(10);
        buttonComparar = new JButton("Comparar");
        labelResultado = new JLabel("");

        // configuración del borde redondeado para los campos de texto
        Border roundedBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        );
        fieldA.setBorder(roundedBorder);
        fieldB.setBorder(roundedBorder);

        // configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        add(labelA, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(fieldA, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(labelB, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(fieldB, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(buttonComparar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(labelResultado, gbc);

        // configuración del listener para el botón Comparar
        buttonComparar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // obtener los valores de los campos de texto
                int A = Integer.parseInt(fieldA.getText());
                int B = Integer.parseInt(fieldB.getText());

                // crear un objeto de la clase Comparador
                Comparador comparador = new Comparador(A, B);

                // obtener el resultado de la comparación
                String resultado = comparador.compararNumeros();

                // mostrar el resultado en el label correspondiente
                labelResultado.setText(resultado);
            }
        });
    }

    public static void main(String[] args) {
        ComparadorGUI comparadorGUI = new ComparadorGUI();
        comparadorGUI.setVisible(true);
    }
}
