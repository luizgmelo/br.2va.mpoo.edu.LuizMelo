package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IndexView extends JFrame {
	JLabel textLabel;
	JLabel logoLabel;
	ImageIcon logoImage;
	JButton adotarButton;
	
	public IndexView() {
		setSize(300, 205);
		setTitle("MPOOAmigodoPet");
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		logoImage = new ImageIcon("img/logo.png");
		logoLabel = new JLabel(logoImage);
		
		textLabel = new JLabel("Participe você também, adote um amigo pet!");
		adotarButton = new JButton("Adotar");
		
		
		add(logoLabel);
		add(textLabel);
		add(adotarButton);
		
		
		setVisible(true);
	}

	public JButton getAdotarButton() {
		return adotarButton;
	}
}

