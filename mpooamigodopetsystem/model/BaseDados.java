package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Proprietario> proprietarios;
	private static ArrayList<Animal> animaisDisponiveis;
	
	public static void createBase() throws CPFException, AnimalException, AdocaoException {
		proprietarios = new ArrayList<Proprietario>();
		animaisDisponiveis = new ArrayList<Animal>();
		inicializarBase();
	}
	
	private static void inicializarBase() throws CPFException, AnimalException, AdocaoException {	
		
		
		addProprietario(new Proprietario("Godofredo  Alves", "358.251.830-27", "godofredo@gmail.com", "(81)99999-0000"));
		animaisDisponiveis.add(new Animal("co003", "coelho", "pompom", "leão", 1, 1.5));
		
		addAdocao(new Proprietario("Godofredo  Alves", "358.251.830-27", "godofredo@gmail.com", "(81)99999-0000"), "coelho");
	}
	
	public static Proprietario buscarProprietario(String cpf) {
		for (Proprietario proprietarioCurrent : proprietarios) {
			if (proprietarioCurrent.getCpf().equals(cpf)) {
				return proprietarioCurrent;
			}
		}
		return null;
	}
	
	public static boolean addProprietario(Proprietario proprietario) throws CPFException {
		if (proprietario.validarCPF(proprietario.getCpf())) {
			if (!proprietarios.contains(proprietario.getCpf()))
				return proprietarios.add(proprietario);
			else
				return false;
		} else {
			throw new CPFException(ValidadorCPFInterface.CPF_INVALIDO);
		}
	}
	
	public static Animal buscarAnimal(String tipo) {
		for (Animal animalCurrent : animaisDisponiveis) {
			if (animalCurrent.getTipo().equalsIgnoreCase(tipo)) {
				return animalCurrent;
			}
		}
		return null;
	}
	
	public static boolean addAdocao(Proprietario proprietario, String tipoAnimal) throws AnimalException, AdocaoException, CPFException {
		if (proprietario == null || tipoAnimal == null) {
			throw new AdocaoException("Erro ao realizar adoção! Entre em contato com (87) 99999-9999");
		}
		
		if (proprietario.validarCPF(proprietario.getCpf())) {
			if (animaisDisponiveis.contains(buscarAnimal(tipoAnimal))) {
				return proprietario.animais.add(buscarAnimal(tipoAnimal));
			} else {
				throw new AnimalException("Não existe um " + tipoAnimal + " dísponivel. Adote outro tipo de Animal!");
			}
		} else {
			throw new CPFException(ValidadorCPFInterface.CPF_INVALIDO);
		}
	}
	
	
}
