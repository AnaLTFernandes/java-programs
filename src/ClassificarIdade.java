import java.time.Year;
import java.util.Scanner;

public class ClassificarIdade implements IProgram {
	private Scanner scan;
	private int anoAtual;

	ClassificarIdade(Scanner scan) {
		this.anoAtual = Year.now().getValue();
		this.scan = scan;
	}

	public String getName() {
		return "Classificar idade";
	}

	private boolean ehIdoso(int idade) {
		int idadeMinima = 60;
		return idade >= idadeMinima;
	}

	private boolean ehCrianca(int idade) {
		int idadeMaxima = 13;
		return idade <= idadeMaxima;
	}

	private boolean ehAdulto(int idade) {
		int idadeMinima = 18;
		int idadeMaxima = 60;
		return idade >= idadeMinima && idade < idadeMaxima;
	}

	private boolean ehAdolescente(int idade) {
		int idadeMinima = 13;
		int idadeMaxima = 18;
		return idade > idadeMinima && idade < idadeMaxima;
	}

	private boolean ehDebutante(int idade) {
		int idadeDebutante = 15;
		return idade == idadeDebutante;
	}

	private boolean ehEleitor(int idade) {
		int idadeMinima = 16;
		return idade >= idadeMinima;
	}

	public void run() {
		System.out.println("CLASSIFICAR IDADE\n");

		System.out.print("> Por favor, informe seu ano de nascimento: [4 dígitos] ");
		int anoNascimento = scan.nextInt();
		scan.nextLine();

		int idadeAproximada = anoAtual - anoNascimento;

		System.out.println("\n>> Sua idade aproximada é: " + idadeAproximada);

		System.out.println("\n>> É idoso: " + this.ehIdoso(idadeAproximada));
		System.out.println(">> É criança: " + this.ehCrianca(idadeAproximada));
		System.out.println(">> É adulto: " + this.ehAdulto(idadeAproximada));
		System.out.println(">> É adolescente: " + this.ehAdolescente(idadeAproximada));
		System.out.println(">> É debutante: " + this.ehDebutante(idadeAproximada));
		System.out.println(">> É eleitor: " + this.ehEleitor(idadeAproximada));
	}
}
