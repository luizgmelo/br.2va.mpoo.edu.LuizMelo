package app;

import controller.IndexController;
import model.BaseDados;
import view.AdocaoView;
import view.IndexView;

public class App {
	public static void main(String[] args) {
		try {
			BaseDados.createBase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		IndexView indexView = new IndexView();
		AdocaoView adocaoView = new AdocaoView();
		
		IndexController indexController = new IndexController(indexView, adocaoView);
		
		
		
		
	}
}
