import java.util.Scanner;

public class ListaConvidadosPlus implements IProgram {
	private Scanner scan;

	ListaConvidadosPlus(Scanner scan) {
		this.scan = scan;
	}

	private boolean ehQuantidadeConvidadosInvalida(int quantidadeConvidados) {
		return quantidadeConvidados > 100 || quantidadeConvidados <= 0;
	}

	public void run() {
		String[] convidados = new String[100];
		int quantidadeConvidados = 0;

		System.out.println("LISTA DE CONVIDADOS PLUS\n");

		do {
			System.out.print("> Informe a quantidade de nomes (máximo de 100): ");
			quantidadeConvidados = scan.nextInt();
			scan.nextLine();

			if (quantidadeConvidados > 100) {
				System.out.println(">> Número de convidados acima do limite!");
			}

			if (quantidadeConvidados <= 0) {
				System.out.println(">> Número de convidados inválido!");
			}
		} while (ehQuantidadeConvidadosInvalida(quantidadeConvidados));

		System.out.println("");

		for (int i = 0; i < quantidadeConvidados; i++) {
			System.out.print("> Informe o nome do " + (i + 1) + "° convidado: ");
			convidados[i] = scan.nextLine();
		}

		System.out.println("\nConvidados");

		for (int i = 0; i < quantidadeConvidados; i++) {
			System.out.println(" - Convidado " + (i + 1) + ": " + convidados[i]);
		}
	}
}
