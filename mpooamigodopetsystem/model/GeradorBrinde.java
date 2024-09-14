package model;

import java.util.Random;

public class GeradorBrinde extends Thread {

	private static final long GERAR_BRINDE = 300000;
	
	private int gerarBrinde() {
		return new Random().nextInt(101);
	}
	
	@Override
	public void run() {
		
	}

}
