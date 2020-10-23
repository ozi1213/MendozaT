import java.awt.BorderLayout;
import java.util.*;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {
	
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	String Nombre = "";
	String Resultado = "";
	String Password = "";
	public List<String> varLista = new ArrayList<String>();
	public List<String> varLista1 = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(25, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Constrase\u00F1a");
		lblNewLabel_1.setBounds(25, 76, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(110, 38, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(110, 73, 86, 20);
		contentPane.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		JButton btnEntrar = new JButton("Accesar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				varLista.add("Oziel");
				varLista.add("Monse");
				varLista.add("Daniela");
				varLista1.add("papas");
				varLista1.add("frijoles");
				varLista1.add("mantequilla");
												 
				 boolean varResult;
				 boolean varResult1;
				 
				Nombre = txtUsuario.getText();
				Password = txtContraseña.getText();
				
				varResult = varLista.contains(Nombre);
				varResult1 = varLista1.contains(Password);
				
				if(varResult == true && varResult1 == true) {
					Resultado = "Correcto";
				}
				else {
					Resultado = "Incorrecto";
				}
				JOptionPane.showMessageDialog(null, Resultado);
			}
		});
		btnEntrar.setBounds(206, 53, 89, 23);
		contentPane.add(btnEntrar);
	}
}
