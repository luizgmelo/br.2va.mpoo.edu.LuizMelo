package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import model.AdocaoException;
import model.AnimalException;
import model.BaseDados;
import model.CPFException;
import model.MensagemModel;
import model.Proprietario;
import view.AdocaoView;
import view.MensagemView;

public class AdocaoController implements ActionListener {
	AdocaoView adocaoView;
	WindowHandler windowHandler;

	public AdocaoController(AdocaoView adocaoView) {
		this.adocaoView = adocaoView;
		windowHandler = new WindowHandler();
		control();
	}
	
	void control() {
		this.adocaoView.addWindowListener(windowHandler);
		this.adocaoView.getAdotarButton().addActionListener(this);
	}
	
	private class WindowHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			int option = MensagemView.exibirMensagemEncerrarSistema();
			if (option == 0) { 
				System.exit(0);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == adocaoView.getAdotarButton()) {
			try {
				BaseDados.addAdocao(new Proprietario(null, adocaoView.getCpfField().getText(), null, null), adocaoView.getCamposPanel().getRadiosGroup().getSelection().getActionCommand());
				MensagemView.exibirMensagem("Cadastro realizado com sucesso! Em breve você estará com seu amigo pet!");
			} catch (AnimalException e1) {
				MensagemView.exibirMensagem(e1.getMessage());
				e1.printStackTrace();
			} catch (AdocaoException e1) {
				MensagemView.exibirMensagem(e1.getMessage());
				e1.printStackTrace();
			} catch (CPFException e1) {
				MensagemView.exibirMensagemFalhaSistema(e1.getMessage());
			}
		}
		
	}
	
	
}
