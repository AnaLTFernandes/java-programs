import java.util.Scanner;

public class Tabuada implements IProgram {
	private Scanner scan;

	Tabuada(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return "Tabuada";
	}

	private boolean ehRespostaValida(String resposta) {
		return resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n");
	}

	public void run() {
		System.out.println("TABUADA");

		while (true) {
			System.out.print("\n> Indique o número que deseja a tabuada: [1-10] ");
			int numero = scan.nextInt();
			scan.nextLine();

			System.out.println("\nTabuada do " + numero + ":");

			for (int i = 1; i <= 10; i++) {
				int resultado = numero * i;
				System.out.println(numero + " * " + i + " = " + resultado);
			}

			String verMaisTabuada;

			do {
				System.out.print("\n> Deseja ver mais alguma tabuada? [S/n] ");
				verMaisTabuada = scan.nextLine();
			} while (!ehRespostaValida(verMaisTabuada));

			if (verMaisTabuada.equalsIgnoreCase("n")) {
				break;
			}
		}
	}
}
