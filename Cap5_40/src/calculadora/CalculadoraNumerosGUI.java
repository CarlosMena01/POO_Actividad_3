package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraNumerosGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	private JButton btnAgregar;
    private JTextField txtNumero;
    private JTextArea txtAreaCalculos;
    private CalculadoraNumeros calc;
    
    public CalculadoraNumerosGUI() {
        super("Calculadora de números");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear componentes
        JLabel lblNumero = new JLabel("Número:");
        txtNumero = new JTextField(20);
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        txtAreaCalculos = new JTextArea(20, 20);
        txtAreaCalculos.setEditable(false);
        
        // Crear panel para los componentes
        JPanel pnlMain = new JPanel(new BorderLayout(5, 5));
        JPanel pnlNumero = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        pnlNumero.add(lblNumero);
        pnlNumero.add(txtNumero);
        pnlMain.add(pnlNumero, BorderLayout.NORTH);
        pnlMain.add(btnAgregar, BorderLayout.WEST);
        pnlMain.add(new JScrollPane(txtAreaCalculos), BorderLayout.CENTER);
        
        // Agregar panel al frame
        setContentPane(pnlMain);
        
        // Crear instancia de la CalculadoraNumeros
        calc = new CalculadoraNumeros();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            try {
                int numero = Integer.parseInt(txtNumero.getText());
                calc.agregarNumero(numero);
                txtAreaCalculos.setText(calc.calcular());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El número ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            txtNumero.setText("");
        }
    }
    
    public static void main(String[] args) {
        CalculadoraNumerosGUI gui = new CalculadoraNumerosGUI();
        gui.setVisible(true);
    }
}
