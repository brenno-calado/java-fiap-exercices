package br.com.fiap.banco;

public class Teste {
	public static void main(String[] args) {
		Conta cc = new Conta();
		
		cc.depositar(1000.32);
		cc.setAgencia(0001);
		cc.setNumero(32522252);
		cc.depositar(111);
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(111,222,1000);
		poupanca.retirar(50);

		System.out.println(poupanca.getSaldo());
	}
}
