package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import view.AdocaoView;
import view.IndexView;

public class IndexController {
	IndexView indexView;
	AdocaoView adocaoView;
	KeyHandler keyHandler;
	
	public IndexController(IndexView indexView, AdocaoView adocaoView) {
		this.indexView = indexView;
		this.adocaoView = adocaoView;
		keyHandler = new KeyHandler();
		control();
	}
	
	void control() {
		this.indexView.getAdotarButton().addKeyListener(keyHandler);
	}
	
	void updateView() { 
		this.indexView.setVisible(false);
		this.adocaoView.setVisible(true);
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
