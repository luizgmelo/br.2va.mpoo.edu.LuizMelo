package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class AdocaoView extends JFrame {
	
	JLabel titleLabel;
	JPanel formPanel;
	JLabel nomeLabel;
	JTextField nomeField;
	JLabel cpfLabel;
	JFormattedTextField cpfField;
	JLabel emailLabel;
	JTextField emailField;
	JLabel foneLabel;
	JFormattedTextField foneField;	
	JButton adotarButton;
	public AdocaoView() {
		setSize(450, 250);
		setTitle("MPOOAmigodoPet");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		titleLabel = new JLabel("Dados Adoção");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		formPanel = new JPanel();
		SpringLayout layout = new SpringLayout();
		formPanel.setLayout(layout);
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField(10);
		
		emailLabel = new JLabel("E-mail");
		emailField = new JTextField(10);		
		
		cpfLabel = new JLabel("CPF: ");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
		} catch (ParseException e) {}
		
		foneLabel = new JLabel("Fone: ");
		try {
			foneField = new JFormattedTextField(new MaskFormatter("+##(##)#####-####"));
			foneField.setColumns(10);
		} catch (ParseException e) {}
		
		
		adotarButton = new JButton("Adotar");
		
		formPanel.add(nomeLabel);
		formPanel.add(nomeField);
		formPanel.add(cpfLabel);
		formPanel.add(cpfField);
		formPanel.add(emailLabel);
		formPanel.add(emailField);
		formPanel.add(foneLabel);
		formPanel.add(foneField);
		
		add(titleLabel, BorderLayout.NORTH);
		add(formPanel, BorderLayout.CENTER);
		add(adotarButton, BorderLayout.EAST);
		
		layout.putConstraint(SpringLayout.WEST, nomeLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, nomeLabel, 20, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, nomeField, 20, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, nomeField, 20, SpringLayout.EAST, this);
	    
	    layout.putConstraint(SpringLayout.WEST, cpfLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, cpfLabel, 50, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, cpfField, 50, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, cpfField, 20, SpringLayout.EAST, this);

	    layout.putConstraint(SpringLayout.WEST, emailLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, emailLabel, 80, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, emailField, 80, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, emailField, 20, SpringLayout.EAST, this);

	    layout.putConstraint(SpringLayout.WEST, foneLabel, 10, SpringLayout.WEST, this);
	    layout.putConstraint(SpringLayout.NORTH, foneLabel, 110, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.NORTH, foneField, 110, SpringLayout.NORTH, this);
	    layout.putConstraint(SpringLayout.WEST, foneField, 20, SpringLayout.EAST, this);


		setVisible(false);
		
	}	
}
