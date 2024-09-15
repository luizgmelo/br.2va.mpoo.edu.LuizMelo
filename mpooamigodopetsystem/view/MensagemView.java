package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MensagemView {
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOAmigodopet", JOptionPane.OK_OPTION, new ImageIcon("img/icone.png"));
	}
	
	public static void exibirMensagemFalhaSistema(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOAmigodopet", JOptionPane.ERROR_MESSAGE);
	}
	
	public static int exibirMensagemEncerrarSistema() {
		return JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "MPOOAmigodoPet", JOptionPane.YES_NO_OPTION);
	}
}
