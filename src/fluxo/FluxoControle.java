package fluxo;

public class FluxoControle {
	public static void main(String[] args) {
		int idade = 15;
		if (idade < 0) System.out.println("Idade inválida");

		if (idade > 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70) {
			if (idade >= 100) {
				System.out.println("Centenária");
			}
			System.out.println("Terceira idade");
		} else {
			System.out.println("Menor idade");
		}
	}
}
