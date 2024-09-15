package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import view.AdocaoView;
import view.IndexView;

public class IndexController {
	IndexView indexView;
	AdocaoView adocaoView;
	KeyHandler keyHandler;
	ButtonHandler buttonHandler;
	
	public IndexController(IndexView indexView, AdocaoView adocaoView) {
		this.indexView = indexView;
		this.adocaoView = adocaoView;
		keyHandler = new KeyHandler();
		buttonHandler = new ButtonHandler();
		control();
	}
	
	void control() {
		this.indexView.getAdotarButton().addKeyListener(keyHandler);
		this.indexView.getAdotarButton().addActionListener(buttonHandler);
	}
	
	void updateView() { 
		this.indexView.setVisible(false);
		this.adocaoView.setVisible(true);
	}
	
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == indexView.getAdotarButton()) {
				updateView();
			}
		}
		
	}
	
	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				updateView();
			}	
		}
	}

	
	
}
