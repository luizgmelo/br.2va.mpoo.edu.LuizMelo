package model;

public class Animal implements AlimentacaoPetInterface {
	private String id;
	private String tipo;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	
	public Animal(String id, String tipo, String nome, String raca, int idade, double peso) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	@Override
	public String informacaoAlimentacao() {
		String info="Alimentação do seu Pet (peso:" + this.peso + "):  \t";
		int opcao=0;
		if ((int)this.getPeso()>=1 && (int)this.getPeso()<3)
			opcao=1;
		else if ((int)this.getPeso()>=3 && (int)this.getPeso()<5)
			opcao=2;
		else if ((int)this.getPeso()>=5 && (int)this.getPeso()<8)
			opcao=3;
		else if ((int)this.getPeso()>=8 && (int)this.getPeso()<10)
			opcao=4;
		else if ((int)this.getPeso()>=10 && (int)this.getPeso()<15)
			opcao=5;
		else if ((int)this.getPeso()>=15 && (int)this.getPeso()<25)
			opcao=6;
		else if ((int)this.getPeso()>=25 && (int)this.getPeso()<45)
			opcao=7;
		else if ((int)this.getPeso()>=45 && (int)this.getPeso()<70)
			opcao=8;
			
		switch (opcao) {
		case 1:
			info+="35h - 70g de ração/dia";
			break;
		case 2:
			info+="70h - 100g de ração/dia";
			break;
		case 3:
			info+="100g - 140g de ração/dia";
			break;
		case 4:
			info+="140g - 160g de ração/dia";
			break;
		case 5:
			info+="160g - 210g de ração/dia";
			break;
		case 6:
			info+="210g - 300g de ração/dia";
			break;
		case 7:
			info+="300g - 450g de ração/dia";
			break;
		case 8:
			info+="450g - 600g de ração/dia";
			break;
		}
		return info;
	}

	public double getPeso() {
		return peso;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
	
	

}
