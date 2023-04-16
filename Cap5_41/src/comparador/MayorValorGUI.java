package comparador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MayorValorGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField tfNumero;
    private JButton btnAgregar;
    private JButton btnMayor;
    private JLabel lblMayor;
    private MayorValor mayorValor;

    public MayorValorGUI() {
        super("Mayor valor");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Panel para los componentes de entrada
        JPanel panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Número:"));
        tfNumero = new JTextField(10);
        panelEntrada.add(tfNumero);
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        panelEntrada.add(btnAgregar);
        
        // Panel para el botón para encontrar el mayor valor
        JPanel panelBoton = new JPanel();
        btnMayor = new JButton("Encontrar mayor");
        btnMayor.addActionListener(this);
        panelBoton.add(btnMayor);
        
        // Panel para mostrar el resultado
        JPanel panelResultado = new JPanel();
        lblMayor = new JLabel();
        panelResultado.add(lblMayor);
        
        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelEntrada, BorderLayout.NORTH);
        panelPrincipal.add(panelBoton, BorderLayout.CENTER);
        panelPrincipal.add(panelResultado, BorderLayout.SOUTH);
        add(panelPrincipal);
        
        mayorValor = new MayorValor();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            String texto = tfNumero.getText();
            try {
                double numero = Double.parseDouble(texto);
                mayorValor.agregarValor(numero);
                tfNumero.setText("");
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido.");
            }
        } else if (e.getSource() == btnMayor) {
            try {
                double mayor = mayorValor.encontrarMayor();
                lblMayor.setText("El mayor valor es: " + mayor);
            } catch (IllegalArgumentException ex) {
                lblMayor.setText("El array está vacío.");
            }
        }
    }
    
    public static void main(String[] args) {
        MayorValorGUI gui = new MayorValorGUI();
        gui.setVisible(true);
    }

}
