package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Class que abstrai uma Conta bancária
 * @author Brenno Calado
 * @version 1.0
 */
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * Número da Conta bancária
	 */
	private int numero;
	/**
	 * Número da agência bancária
	 */
	private int agencia;
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	public Conta(){
		
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.depositar(saldo);
		
		String output = String.format("Conta criada com sucesso! Número: %s, Agência: %s, Saldo: %s", this.getNumero(), this.getAgencia(), this.getSaldo());
		System.out.println(output);
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setAgencia(int agencia){
		this.agencia = agencia;
	}
	
	/**
	* Realiza um depósito na conta corrente
	* @param valor O valor que será depositado
	* @return O número do protocolo de confirmação
	*/
	public double depositar(double valor){
		return this.saldo += valor;
	}

	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor){
		this.saldo -= valor;
	}
	
	/**
	 * @return Retorna o número da conta bancária
	 */
	public int getNumero(){
		return this.numero;
	}
	
	/**
	 * 
	 * @return Retorna o número da agência bancária
	 */
	public int getAgencia() {
		return this.agencia;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Saldo da conta
	 */
	public double getSaldo(){
		return saldo;
	}
}