package ecuaciones;

import java.awt.event.*;
import javax.swing.*;

public class EcuacionGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	private JLabel labelA, labelB, labelC;
    private JTextField fieldA, fieldB, fieldC;
    private JButton botonResolver;

    public EcuacionGUI() {
        setTitle("Ecuación de segundo grado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        labelA = new JLabel("A:");
        labelA.setBounds(20, 20, 120, 20);
        add(labelA);

        fieldA = new JTextField();
        fieldA.setBounds(150, 20, 120, 20);
        add(fieldA);

        labelB = new JLabel("B:");
        labelB.setBounds(20, 50, 120, 20);
        add(labelB);

        fieldB = new JTextField();
        fieldB.setBounds(150, 50, 120, 20);
        add(fieldB);

        labelC = new JLabel("C:");
        labelC.setBounds(20, 80, 120, 20);
        add(labelC);

        fieldC = new JTextField();
        fieldC.setBounds(150, 80, 120, 20);
        add(fieldC);

        botonResolver = new JButton("Resolver");
        botonResolver.setBounds(100, 120, 100, 30);
        botonResolver.addActionListener(this);
        add(botonResolver);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonResolver) {
            resolverEcuacion();
        }
    }

    private void resolverEcuacion() {
        try {
            double a = Double.parseDouble(fieldA.getText());
            double b = Double.parseDouble(fieldB.getText());
            double c = Double.parseDouble(fieldC.getText());

            Ecuacion ecuacion = new Ecuacion(a, b, c);
            JOptionPane.showMessageDialog(this, ecuacion.resolver());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        EcuacionGUI gui = new EcuacionGUI();
        gui.setVisible(true);
    }
}

