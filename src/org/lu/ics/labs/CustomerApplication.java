package org.lu.ics.labs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class CustomerApplication {

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_CNbr;
	private JTextField textField_CardType;
	private JTextField textField_CardNbr;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private Controller controller; //Koppling till klassen Controller
	private CustomerRegister customerRegister;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerApplication window = new CustomerApplication();
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
	public CustomerApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(34, 353, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(34, 391, 97, 25);
		frame.getContentPane().add(btnFind);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(34, 429, 97, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewName = new JButton("New Name");
		btnNewName.setBounds(249, 353, 97, 25);
		frame.getContentPane().add(btnNewName);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(139, 49, 116, 22);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_CNbr = new JTextField();
		textField_CNbr.setColumns(10);
		textField_CNbr.setBounds(139, 84, 116, 22);
		frame.getContentPane().add(textField_CNbr);
		
		textField_CardType = new JTextField();
		textField_CardType.setColumns(10);
		textField_CardType.setBounds(139, 209, 116, 22);
		frame.getContentPane().add(textField_CardType);
		
		textField_CardNbr = new JTextField();
		textField_CardNbr.setColumns(10);
		textField_CardNbr.setBounds(139, 244, 116, 22);
		frame.getContentPane().add(textField_CardNbr);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(61, 50, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(12, 249, 126, 16);
		frame.getContentPane().add(lblCardNumber);
		
		JLabel lblCustomerNumber = new JLabel("Customer Number:");
		lblCustomerNumber.setBounds(12, 87, 133, 16);
		frame.getContentPane().add(lblCustomerNumber);
		
		JLabel lblCardType = new JLabel("Card Type:");
		lblCardType.setBounds(12, 212, 106, 16);
		frame.getContentPane().add(lblCardType);
		
		JRadioButton rdbtnHasCard = new JRadioButton("Has Card");
		buttonGroup.add(rdbtnHasCard);
		rdbtnHasCard.setBounds(149, 115, 127, 25);
		frame.getContentPane().add(rdbtnHasCard);
		
		JRadioButton rdbtnNoCard = new JRadioButton("No Card");
		buttonGroup.add(rdbtnNoCard);
		rdbtnNoCard.setBounds(149, 152, 127, 25);
		frame.getContentPane().add(rdbtnNoCard);
		
		JLabel lblResponse = new JLabel("Response:");
		lblResponse.setBounds(12, 282, 459, 16);
		frame.getContentPane().add(lblResponse);
	}
}
