package model;

import java.util.ArrayList;

public class Proprietario extends Pessoa {
	public ArrayList<Animal> animais;
	private int brinde;
	
	public Proprietario(String nome, String cpf, String email, String fone) throws CPFException {
		super(nome, cpf, email, fone);
		this.animais = new ArrayList<Animal>();
	}
		
}
