import java.util.Scanner;

public class SomaIdades implements IProgram {
	private Scanner scan;

	SomaIdades(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return "Somar idades";
	}

	public void run() {
		System.out.println("SOMAR IDADES");
		System.out.println(" Programa que soma a idade de cinco pessoas\n");

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("> Informe a idade da " + i + "° pessoa: ");
			int idade = scan.nextInt();
			scan.nextLine();

			total += idade;
		}

		System.out.println("\n>> A soma de todas as idades é: " + total);
	}
}
