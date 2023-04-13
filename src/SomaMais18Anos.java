import java.util.Scanner;

public class SomaMais18Anos implements IProgram {
	private Scanner scan;

	SomaMais18Anos(Scanner scan) {
		this.scan = scan;
	}

	public void run() {
		System.out.println("SOMA MAIS 18 ANOS");
		System.out.println(" Programa que soma as idades informadas acima de 18 anos\n");

		int total = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("> Informe a idade da " + i + "° pessoa: ");
			int idade = scan.nextInt();
			scan.nextLine();

			if (idade > 18) {
				total += idade;
			}
		}

		System.out.println("\n>> A soma das idades maiores de 18 anos é: " + total);
	}
}
