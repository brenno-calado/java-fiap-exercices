package br.com.fiap.tds;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		float altura = sc.nextFloat();
		System.out.println("Digite seu peso: ");
		int peso = sc.nextInt();
		sc.close();

		float imc = peso / (altura * altura);
		if (imc > 25 || imc < 18.5) {
			System.out.println("fora do peso: " + imc);
		} else {
			System.out.println("Peso ideal: " + imc);
		}
		
	}
}
