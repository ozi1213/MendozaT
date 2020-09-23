import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class OzielSerie extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OzielSerie frame = new OzielSerie();
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
	public OzielSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Crear serie Fibo");
		btnNewButton.setBounds(141, 110, 153, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor1=0;
				int valor2=1;
				int i = 0;
				
				System.out.println("Num: " + valor1);
				System.out.println("Num: " + valor2);
				
				do {
					
					int valor3=valor1+valor2;
					
					JOptionPane.showMessageDialog(contentPane, "Num: " + valor3);
					
					valor1=valor2;
					valor2=valor3;
					i= i + 1;
					
				}while(i <= 10);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
	}
}
