import java.util.Scanner;

public class CriarRecibo implements IProgram {
	private Scanner scan;

	CriarRecibo(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return "Criar recibo";
	}

	private boolean ehRespostaValida(String resposta) {
		return resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n");
	}

	public void run() {
		String[] produtos = new String[1000];
		double[] precos = new double[1000];
		int[] quantidades = new int[1000];

		double total = 0;
		String adicionarMaisProdutos;

		System.out.println("CRIAR RECIBO");

		for (int i = 0; i < produtos.length; i++) {
			System.out.print("\n> Informe o nome do produto: ");
			produtos[i] = scan.nextLine();

			System.out.print("> Informe a quantidade de " + produtos[i] + ": ");
			quantidades[i] = scan.nextInt();
			scan.nextLine();

			System.out.print("> Informe o preço unitário do produto: ");
			precos[i] = scan.nextDouble();
			scan.nextLine();

			total += precos[i] * quantidades[i];

			do {
				System.out.print("\n> Deseja adicionar mais itens? [S/n] ");
				adicionarMaisProdutos = scan.nextLine();
			} while (!ehRespostaValida(adicionarMaisProdutos));

			if (adicionarMaisProdutos.equalsIgnoreCase("n")) {
				break;
			}
		}

		System.out.println("\n--- RECIBO ---");
		System.out.println("N°   -   PRODUTO   -   QUANT.   -   PREÇO");

		for (int i = 0; produtos[i] != null; i++) {
			System.out
					.println((i + 1) + "   -   " + produtos[i] + "   -   " + quantidades[i] + "   -   R$ " + precos[i]);
		}

		System.out.println("TOTAL   -   R$ " + total);
	}
}
