package com.convertidor.gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Conversor {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 418, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setBounds(11, 99, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERSOR DE MONEDA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 11, 323, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(11, 74, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Introducir la cantidad que desea convertir");
		lblNewLabel_2.setForeground(new Color(51, 51, 51));
		lblNewLabel_2.setBounds(11, 52, 248, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MXN", "USD"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBounds(10, 166, 103, 23);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("De");
		lblNewLabel_2_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_2_1.setBounds(11, 146, 102, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A");
		lblNewLabel_2_1_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_2_1_1.setBounds(136, 146, 102, 20);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("$0");
		lblNewLabel_3.setForeground(new Color(51, 102, 51));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(11, 212, 89, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"USD", "MXN"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(135, 166, 103, 23);
		frame.getContentPane().add(comboBox_1);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\YinoskI Pc Custom\\eclipse-workspace\\Conversor.de.moneda\\images\\background2.jpg"));
		lblNewLabel.setBounds(0, 0, 402, 430);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}
}
