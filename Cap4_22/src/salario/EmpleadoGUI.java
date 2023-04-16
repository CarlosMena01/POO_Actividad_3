package salario;

import javax.swing.*;

public class EmpleadoGUI {
    private JFrame frame;
    private JTextField nombreField;
    private JTextField salarioPorHoraField;
    private JTextField horasTrabajadasField;
    private JButton calcularButton;

    public EmpleadoGUI() {
        initComponents();
    }

    private void initComponents() {
        // Configurar el JFrame
        frame = new JFrame("Empleado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);

        // Configurar los componentes de la GUI
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);

        JLabel salarioPorHoraLabel = new JLabel("Salario por hora:");
        salarioPorHoraField = new JTextField(20);

        JLabel horasTrabajadasLabel = new JLabel("Horas trabajadas:");
        horasTrabajadasField = new JTextField(20);

        calcularButton = new JButton("Calcular");

        // Agregar los componentes al JFrame
        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(salarioPorHoraLabel);
        panel.add(salarioPorHoraField);
        panel.add(horasTrabajadasLabel);
        panel.add(horasTrabajadasField);
        panel.add(calcularButton);
        frame.add(panel);

        // Agregar el ActionListener al botón "Calcular"
        calcularButton.addActionListener(e -> {
            // Obtener los datos de los campos de texto
            String nombre = nombreField.getText();
            double salarioPorHora = Double.parseDouble(salarioPorHoraField.getText());
            double horasTrabajadas = Double.parseDouble(horasTrabajadasField.getText());

            // Crear el objeto Empleado
            Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);

            // Mostrar el resultado del método imprimir en una ventana emergente
            JOptionPane.showMessageDialog(frame, empleado.imprimir());
        });
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EmpleadoGUI gui = new EmpleadoGUI();
        gui.show();
    }
}
