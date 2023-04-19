import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class SomaTotalCompra implements IProgram {
	private Scanner scan;
	private Locale localidade = new Locale("pt", "BR");
	private NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(localidade);

	SomaTotalCompra(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return "Somar total de uma compra";
	}

	public void run() {
		System.out.println("SOMAR TOTAL DE UMA COMPRA\n");

		double total = 0.0;
		int quantidadeProdutos = 0;

		do {
			System.out.print("> Informe a quantidade de produtos comprados: ");
			quantidadeProdutos = scan.nextInt();
			scan.nextLine();
		} while (quantidadeProdutos == 0);

		System.out.println();

		for (int i = 1; i <= quantidadeProdutos; i++) {
			System.out.print("> Informe o preço do " + i + "° produto: ");
			total += scan.nextFloat();
			scan.nextLine();
		}

		System.out.println("\n>> O total da compra é: " + formatadorMoeda.format(total));
	}
}
