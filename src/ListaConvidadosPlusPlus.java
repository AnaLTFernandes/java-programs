import java.util.Scanner;

public class ListaConvidadosPlusPlus implements IProgram {
	private Scanner scan;

	ListaConvidadosPlusPlus(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return "Lista de convidados PLUS+";
	}

	private boolean ehRespostaValida(String resposta) {
		return resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n");
	}

	public void run() {
		String[] convidados = new String[100];
		String adicionarMaisNomes;

		System.out.println("LISTA DE CONVIDADOS PLUS+");
		System.out.println(" Insira o nome de seus convidados.");

		for (int i = 0; i < 100; i++) {
			System.out.print("\n> Insira o nome do " + (i + 1) + "° convidado: ");
			convidados[i] = scan.nextLine();

			do {
				System.out.print("\n> Deseja adicionar mais nomes? [S/n] ");
				adicionarMaisNomes = scan.nextLine();
			} while (!ehRespostaValida(adicionarMaisNomes));

			if (adicionarMaisNomes.equalsIgnoreCase("n")) {
				break;
			}
		}

		System.out.println("\n--- Lista de convidados ---\n");

		for (int i = 0; convidados[i] != null; i++) {
			System.out.println(" - Convidado " + (i + 1) + ": " + convidados[i]);
		}
	}
}
