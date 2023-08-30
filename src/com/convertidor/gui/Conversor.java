package com.convertidor.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.convertidor.logica.Convertir;
import com.convertidor.persistencias.Monedas;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField txtEntrada;
	
	/*
	 * Se crea instancia fuera del metodo para que no se cree cada que se haga click en el btn
	 */
	Convertir convertir = new Convertir();
	
	Monedas monedas = new Monedas();
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Conversor frame = new Conversor();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblError = new JLabel("");
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblError.setForeground(Color.RED);
		lblError.setBounds(133, 86, 89, 14);
		contentPane.add(lblError);
		lblError.setVisible(false);
		
		JLabel cantidadConvertida = new JLabel("$0");
		cantidadConvertida.setBackground(new Color(255, 255, 255));
		cantidadConvertida.setForeground(Color.DARK_GRAY);
		cantidadConvertida.setFont(new Font("Tahoma", Font.BOLD, 24));
		cantidadConvertida.setBounds(24, 272, 156, 29);
		contentPane.add(cantidadConvertida);
		
		JComboBox cmbDe = new JComboBox();
		cmbDe.setModel(new DefaultComboBoxModel(new String[] {"MXN", "USD", "EURO", "LIBRA ESTERLINA", "YEN", "WON"}));
		cmbDe.setToolTipText("");
		cmbDe.setBackground(Color.WHITE);
		cmbDe.setBounds(10, 166, 116, 23);
		contentPane.add(cmbDe);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERSOR DE MONEDA");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 11, 227, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Introducir la cantidad que desea convertir");
		lblNewLabel_2.setForeground(new Color(51, 51, 51));
		lblNewLabel_2.setBounds(10, 63, 248, 20);
		contentPane.add(lblNewLabel_2);
		
		txtEntrada = new JTextField();
		txtEntrada.setToolTipText("");
		txtEntrada.setColumns(10);
		txtEntrada.setBounds(11, 83, 115, 20);
		contentPane.add(txtEntrada);
		
		JComboBox cmbA = new JComboBox();
		cmbA.setModel(new DefaultComboBoxModel(new String[] {"MXN", "USD", "EURO", "LIBRA ESTERLINA", "YEN", "WON"}));
		cmbA.setToolTipText("");
		cmbA.setBackground(Color.WHITE);
		cmbA.setBounds(10, 220, 116, 23);
		contentPane.add(cmbA);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				
				try {
					
					/*
					 * Obtenemos el dato de la cantidad que el usuario introdujo
					 */
					String inputCantidad = txtEntrada.getText();
					Double numeroCantidad = Double.parseDouble(inputCantidad);
					Double convertido;
					
					
					/*
					 * Formateamos los decimales para obtener solo el formato con 2 decimales
					 */
					DecimalFormat formatear = new DecimalFormat("0.00");
					
					
					
					/*
					 * Obtenemos en que index de la lista se seleccionó
					 */
					int seleccionadoDe = cmbDe.getSelectedIndex();
					int seleccionadoA = cmbA.getSelectedIndex();
					
					
					/*
					 * se inicializa la variable de los valores de moneda
					 */
					double deCambio = 0.00;
					double aCambio = 0.00;
					
					
					/*
					 * Lee el input de cual moneda se va a convertir
					 */				
					switch(seleccionadoDe) {
					case 0: deCambio = monedas.getMxn(); break;
					case 1: deCambio = monedas.getDolar();break;
					case 2: deCambio = monedas.getEuro();break;
					case 3: deCambio = monedas.getLibrasEsterlinas();break;
					case 4: deCambio = monedas.getYen();break;
					case 5: deCambio = monedas.getWon();break;
					}
					
					
					/*
					 * Lee el Input hacia el cual se va a convertir la moneda
					 */
					switch(seleccionadoA) {
					case 0: aCambio = monedas.getMxn();break;
					case 1: aCambio = monedas.getDolar();break;
					case 2: aCambio = monedas.getEuro();break;
					case 3: aCambio = monedas.getLibrasEsterlinas();break;
					case 4: aCambio = monedas.getYen();break;
					case 5: aCambio = monedas.getWon();break;
					}
					
					
					convertido = convertir.convierte(deCambio, aCambio, numeroCantidad);
					cantidadConvertida.setText("$" + formatear.format(convertido));

					/*
					 * prueba en consola para ver el resultado
					 */
//					System.out.println(("$" + formatear.format(convertido)));
				
					
					/*
					 * Mensaje de error oculto en false
					 */
					lblError.setVisible(false);
					
				} catch (Exception e2) {
					
					/**
					 * Se escribio un texto de error para cuando el usuario introdujera una letra, apareciera un mensaje en la aplicación, asi como el texto se resetea en blanco al mismo tiempo
					 */
					
					txtEntrada.setText("");
					cantidadConvertida.setText("$0");
					lblError.setText("Solo numeros");
					lblError.setVisible(true);
					
				}
				
			    
				
			}
		});
		btnConvertir.setBounds(11, 112, 89, 23);
		contentPane.add(btnConvertir);
		
		JLabel lblNewLabel_2_1 = new JLabel("De");
		lblNewLabel_2_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_2_1.setBounds(11, 146, 102, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A");
		lblNewLabel_2_1_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_2_1_1.setBounds(11, 200, 102, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 50, 227, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(11, 261, 226, 72);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\YinoskI Pc Custom\\eclipse-workspace\\Conversor.de.moneda\\images\\background2.jpg"));
		lblNewLabel.setBounds(0, 0, 247, 344);
		contentPane.add(lblNewLabel);
	}
}
