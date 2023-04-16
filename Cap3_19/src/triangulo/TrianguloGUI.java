package triangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrianguloGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
	private JLabel lblLado;
    private JTextField txtLado;
    private JButton btnCrear, btnPerimetro, btnAltura, btnArea;
    private TrianguloEquilatero t;

    public TrianguloGUI() {
        super("Triángulo Equilátero");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        add(panelPrincipal);

        JPanel panelLado = new JPanel(new FlowLayout());
        panelPrincipal.add(panelLado);

        lblLado = new JLabel("Lado:");
        txtLado = new JTextField(20);
        txtLado.setFont(new Font("Arial", Font.PLAIN, 14));
        panelLado.add(lblLado);
        panelLado.add(txtLado);

        JPanel panelBotones = new JPanel(new GridLayout(2, 2, 5, 5));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelPrincipal.add(panelBotones);

        btnCrear = new JButton("Crear");
        btnPerimetro = new JButton("Perímetro");
        btnAltura = new JButton("Altura");
        btnArea = new JButton("Área");
        btnPerimetro.setEnabled(false);
        btnAltura.setEnabled(false);
        btnArea.setEnabled(false);
        btnCrear.setPreferredSize(new Dimension(80, 30));
        btnPerimetro.setPreferredSize(new Dimension(80, 30));
        btnAltura.setPreferredSize(new Dimension(80, 30));
        btnArea.setPreferredSize(new Dimension(80, 30));

        panelBotones.add(btnCrear);
        panelBotones.add(btnPerimetro);
        panelBotones.add(btnAltura);
        panelBotones.add(btnArea);

        btnCrear.addActionListener(this);
        btnPerimetro.addActionListener(this);
        btnAltura.addActionListener(this);
        btnArea.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCrear) {
            try {
                double lado = Double.parseDouble(txtLado.getText());
                if (lado <= 0) {
                    JOptionPane.showMessageDialog(this, "El valor del lado debe ser mayor que cero.");
                    return;
                }
                t = new TrianguloEquilatero(lado);
                btnPerimetro.setEnabled(true);
                btnAltura.setEnabled(true);
                btnArea.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Triángulo creado correctamente.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El valor del lado debe ser un número válido.");
            }
        } else if (t == null) {
            JOptionPane.showMessageDialog(this, "Primero debe crear el triángulo.");
        } else if (e.getSource() == btnPerimetro) {
            JOptionPane.showMessageDialog(this, "El perímetro del triángulo es: " + t.getPerimetro());
        } else if (e.getSource() == btnAltura) {
            JOptionPane.showMessageDialog(this, "La altura del triángulo es: " + t.getAltura());
        } else if (e.getSource() == btnArea) {
            JOptionPane.showMessageDialog(this, "El área del triángulo es: " + t.getArea());
        }
    }

    public static void main(String[] args) {
        new TrianguloGUI();
    }}


