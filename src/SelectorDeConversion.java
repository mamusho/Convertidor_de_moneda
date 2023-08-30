import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.convertidor.gui.Conversor;
import com.convertidor.gui.ConversorTemperatura;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectorDeConversion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectorDeConversion frame = new SelectorDeConversion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectorDeConversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 203, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMoneda = new JButton("MONEDA");
		btnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conversor conversor = new Conversor();
				conversor.setVisible(true);
				conversor.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnMoneda.setBounds(23, 36, 142, 52);
		contentPane.add(btnMoneda);
		
		JButton btnTemperatura = new JButton("TEMPERATURA");
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//TODO 
				ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
				conversorTemperatura.setVisible(true);
				conversorTemperatura.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnTemperatura.setBounds(23, 99, 142, 52);
		contentPane.add(btnTemperatura);
		
		JLabel lblNewLabel = new JLabel("Seleccione el conversor ");
		lblNewLabel.setBounds(23, 11, 142, 21);
		contentPane.add(lblNewLabel);
	}
}
