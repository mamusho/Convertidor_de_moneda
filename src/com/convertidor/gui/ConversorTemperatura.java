package com.convertidor.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.convertidor.logica.Convertir;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class ConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField txtEntrada;
	Convertir convertir = new Convertir();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperatura frame = new ConversorTemperatura();
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
	public ConversorTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 221, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor C° y F°");
		lblNewLabel.setBounds(10, 11, 108, 14);
		contentPane.add(lblNewLabel);
		

		txtEntrada = new JTextField();
		txtEntrada.setBounds(10, 36, 138, 20);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JComboBox cmbDe = new JComboBox();
		cmbDe.setModel(new DefaultComboBoxModel(new String[] {"C° -> F°", "F° -> C°"}));
		cmbDe.setBounds(10, 67, 86, 22);
		contentPane.add(cmbDe);
		
		JLabel lblCantidadConvertida = new JLabel("New label");
		lblCantidadConvertida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidadConvertida.setBounds(68, 149, 74, 14);
		contentPane.add(lblCantidadConvertida);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//TODO
				
				String inputCantidad = txtEntrada.getText();
				Double numeroCantidad = Double.parseDouble(inputCantidad);
				String convertido;
				
				
				/*
				 * Formateamos los decimales para obtener solo el formato con 2 decimales
				 */
				DecimalFormat formatear = new DecimalFormat("0");
				
				
				
				/*
				 * Obtenemos en que index de la lista se seleccionó
				 */
				int seleccionadoDe = cmbDe.getSelectedIndex();
				convertido = convertir.cambiarTemperatura(seleccionadoDe, numeroCantidad);
				
				/*
				 * Mostramos resultado en pantalla
				 */
				
				lblCantidadConvertida.setText(convertido);
				
				
			}
		});
		btnConvertir.setBounds(58, 110, 89, 23);
		contentPane.add(btnConvertir);
		
	}
}
