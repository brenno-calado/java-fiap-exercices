package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 8408862900414326349L;
	private String nome;
	
	public String getNome() {
		System.out.println("validando se pode ser obtido o nome.......");
		return this.nome;
	}
	
	public void setNome(String nome) {
		System.out.println("Validando se pode ser alterado o nome.......");
		this.nome = nome;
	}
}
