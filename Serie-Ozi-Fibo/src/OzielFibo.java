import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OzielFibo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtPrimer;
	private JTextField txtTamArreglo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OzielFibo frame = new OzielFibo();
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
	public OzielFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimer = new JTextField();
		txtPrimer.setBounds(187, 40, 86, 20);
		contentPane.add(txtPrimer);
		txtPrimer.setColumns(10);
		
		JTextField txtSegundo = new JTextField();
		txtSegundo.setBounds(187, 71, 86, 20);
		contentPane.add(txtSegundo);
		txtSegundo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Primer Numero");
		lblNewLabel.setBounds(58, 43, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo numero");
		lblNewLabel_1.setBounds(58, 74, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tama\u00F1o de la serie");
		lblNewLabel_2.setBounds(58, 109, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JList list_2 = new JList();
		list_2.setBounds(302, 42, 98, 184);
		contentPane.add(list_2);
		DefaultListModel Lista = new DefaultListModel();
		Lista.clear();
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lista.removeAllElements();
				
                int i = 0;
				int valor1;
				int valor2;
				int valor3;
				int Tam;
			
				System.out.println("Num: " + txtPrimer);
				System.out.println("Num: " + txtSegundo);
				
				 valor1 = Integer.parseInt(txtPrimer.getText());
				 valor2 = Integer.parseInt(txtSegundo.getText());
				 Tam = Integer.parseInt(txtTamArreglo.getText());
				 
				 
				 
				
				do {
					
					valor3 = valor1 + valor2;
					
					Lista.addElement(valor1 + " " + valor2 + " " + valor3);
					
					valor1=valor2;
					valor2= valor3;
					i= i + 1;
					
					list_2.setModel(Lista);
					
				}while(i <= Tam);
			}
		});
		btnAgregar.setBounds(132, 151, 89, 23);
		contentPane.add(btnAgregar);
		
		txtTamArreglo = new JTextField();
		txtTamArreglo.setBounds(187, 106, 86, 20);
		contentPane.add(txtTamArreglo);
		txtTamArreglo.setColumns(10);
	}
		}
