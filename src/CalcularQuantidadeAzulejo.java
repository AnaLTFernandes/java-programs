import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcularQuantidadeAzulejo implements IProgram {
    private Scanner scan;
    private DecimalFormat formatar = new DecimalFormat("0.0");

    CalcularQuantidadeAzulejo(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Calcular quantidade de azulejos";
    }

    public void run() {
        System.out.println("CALCULAR QUANTIDADE DE AZULEJOS\n");

        System.out.print("> Informe a altura da parede (m): ");
        double alturaParede = scan.nextDouble();
        scan.nextLine();

        System.out.print("> Informe a largura da parede (m): ");
        double larguraParede = scan.nextDouble();
        scan.nextLine();

        System.out.print("> Informe a altura do azulejo (m): ");
        double alturaAzulejo = scan.nextDouble();
        scan.nextLine();

        System.out.print("> Informe a largura do azulejo (m): ");
        double larguraAzulejo = scan.nextDouble();
        scan.nextLine();

        double quantidadeAzulejo = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);

        System.out.println("\n>> A quantidade de azulejos necessária para preencher a parede é: "
                + formatar.format(quantidadeAzulejo) + ".");
    }
}