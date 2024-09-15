package view;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class CamposPanel extends JPanel {
	JPanel radiosPanel;
	JRadioButton cachorroRadioButton;
	JRadioButton gatoRadioButton;
	JRadioButton coelhoRadioButton;
	JRadioButton semPreferenciaRadioButton;
	ButtonGroup radiosGroup;
	
	public CamposPanel() {
		setSize(100, 100);
		setLayout(new SpringLayout());
		
		radiosGroup = new ButtonGroup();
		
		cachorroRadioButton = new JRadioButton("Cachorro");
		cachorroRadioButton.setActionCommand("Cachorro");
		gatoRadioButton = new JRadioButton("Gato");
		gatoRadioButton.setActionCommand("Gato");
		coelhoRadioButton = new JRadioButton("Coelho");
		coelhoRadioButton.setActionCommand("Coelho");
		semPreferenciaRadioButton = new JRadioButton("Sem preferência");
		semPreferenciaRadioButton.setActionCommand("Sem preferência");
		
		radiosGroup.add(cachorroRadioButton);
		radiosGroup.add(gatoRadioButton);	
		radiosGroup.add(coelhoRadioButton);
		radiosGroup.add(semPreferenciaRadioButton);
		
		add(cachorroRadioButton);
		add(gatoRadioButton);	
		add(coelhoRadioButton);
		add(semPreferenciaRadioButton);
		
		SpringUtilities.makeCompactGrid(this, 1, 4, 5, 0, 0, 0);

	}

	public JRadioButton getCachorroRadioButton() {
		return cachorroRadioButton;
	}

	public JRadioButton getGatoRadioButton() {
		return gatoRadioButton;
	}

	public JRadioButton getCoelhoRadioButton() {
		return coelhoRadioButton;
	}

	public JRadioButton getSemPreferenciaRadioButton() {
		return semPreferenciaRadioButton;
	}

	public ButtonGroup getRadiosGroup() {
		return radiosGroup;
	}
	
	
}
