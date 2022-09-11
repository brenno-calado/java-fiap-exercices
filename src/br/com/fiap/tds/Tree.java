package br.com.fiap.tds;

import java.util.Scanner;

public class Tree {
	// year
	int age = 0;
	// centimeters
	short height = 321;
	boolean isBlossoming = false;
	GenusEnum genus;
	HealthStatusEnum healthStatus = HealthStatusEnum.healthy;

	Tree() {
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.isBlossoming);
		System.out.println(this.genus);
		System.out.println(this.healthStatus);
	}

//	  abstract void toFlourish();
//	  
//	  abstract void toAge();
//	  
//	  abstract void toFruitify()

	public static void main(String[] args) {
		Tree coconut = new Tree();
		double heightInMeters = (double) coconut.height/ 100;
		System.out.println(heightInMeters);

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a idade desejada: ");
		int age = scan.nextInt();

		System.out.print("idade Digitada: " + age);

		scan.close();
	}

}
