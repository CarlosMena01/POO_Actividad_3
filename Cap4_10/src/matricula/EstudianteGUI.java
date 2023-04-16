package matricula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EstudianteGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	// Componentes de la GUI
    private JLabel labelNumInscripcion;
    private JTextField fieldNumInscripcion;
    private JLabel labelNombres;
    private JTextField fieldNombres;
    private JLabel labelPatrimonio;
    private JTextField fieldPatrimonio;
    private JLabel labelEstratoSocial;
    private JTextField fieldEstratoSocial;
    private JButton buttonCalcularMatricula;
    
    public EstudianteGUI() {
        // Configuración de la ventana
        setTitle("Calculadora de matrícula");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Creación de los componentes
        labelNumInscripcion = new JLabel("Número de inscripción:");
        fieldNumInscripcion = new JTextField();
        labelNombres = new JLabel("Nombres:");
        fieldNombres = new JTextField();
        labelPatrimonio = new JLabel("Patrimonio:");
        fieldPatrimonio = new JTextField();
        labelEstratoSocial = new JLabel("Estrato social:");
        fieldEstratoSocial = new JTextField();
        buttonCalcularMatricula = new JButton("Calcular matrícula");
        
        // Configuración del layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // Configuración de las posiciones de los componentes
        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelNumInscripcion)
                .addComponent(labelNombres)
                .addComponent(labelPatrimonio)
                .addComponent(labelEstratoSocial))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(fieldNumInscripcion)
                .addComponent(fieldNombres)
                .addComponent(fieldPatrimonio)
                .addComponent(fieldEstratoSocial)
                .addComponent(buttonCalcularMatricula)));
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNumInscripcion)
                .addComponent(fieldNumInscripcion))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNombres)
                .addComponent(fieldNombres))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelPatrimonio)
                .addComponent(fieldPatrimonio))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelEstratoSocial)
                .addComponent(fieldEstratoSocial))
            .addComponent(buttonCalcularMatricula));
        
        // Añadimos funcionalidad al botón
        buttonCalcularMatricula.addActionListener(this);
        
    }
    public static void main(String[] args) {
    	EstudianteGUI estudianteGUI = new EstudianteGUI();
    	estudianteGUI.setVisible(true);
       
}

	public void actionPerformed(ActionEvent e) {
		// Crear una instancia de la clase Estudiante con los datos de la GUI
        int numInscripcion = Integer.parseInt(fieldNumInscripcion.getText());
        String nombres = fieldNombres.getText();
        double patrimonio = Double.parseDouble(fieldPatrimonio.getText());
        int estratoSocial = Integer.parseInt(fieldEstratoSocial.getText());
        Estudiante estudiante = new Estudiante(numInscripcion, nombres, patrimonio, estratoSocial);
        
        // Mostrar el valor de la matrícula en una ventana emergente
        JOptionPane.showMessageDialog(this, "Valor de la matrícula: $" + estudiante.calcularMatricula());		
	}}