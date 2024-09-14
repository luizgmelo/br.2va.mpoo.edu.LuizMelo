package model;

public interface ValidadorCPFInterface {
	public final String CPF_INVALIDO = "CPF informado é inválido";
	
	public boolean validarCPF(String cpf) throws CPFException;
}
