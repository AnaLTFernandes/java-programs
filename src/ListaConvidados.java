import java.util.Scanner;

public class ListaConvidados implements IProgram {
	private Scanner scan;

	ListaConvidados(Scanner scan) {
		this.scan = scan;
	}

	public void run() {
		String[] convidados = new String[5];

		System.out.println("LISTA DE CONVIDADOS");
		System.out.println(" Adicione 5 convidados à sua lista\n");

		System.out.print("> Informe o primeiro convidado: ");
		convidados[0] = scan.nextLine();

		System.out.print("> Informe o segundo convidado: ");
		convidados[1] = scan.nextLine();

		System.out.print("> Informe o terceiro convidado: ");
		convidados[2] = scan.nextLine();

		System.out.print("> Informe o quarto convidado: ");
		convidados[3] = scan.nextLine();

		System.out.print("> Informe o quinto convidado: ");
		convidados[4] = scan.nextLine();

		System.out.println("\nConvidados");
		System.out.println(" 1: " + convidados[0]);
		System.out.println(" 2: " + convidados[1]);
		System.out.println(" 3: " + convidados[2]);
		System.out.println(" 4: " + convidados[3]);
		System.out.println(" 5: " + convidados[4]);
	}
}
