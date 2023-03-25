import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcularQuantidadeAzulejo {
    private Scanner scan;

    CalcularQuantidadeAzulejo(Scanner scan) {
        this.scan = scan;
    }

    void run() {
        DecimalFormat formatar = new DecimalFormat("0.0");

        System.out.println("CALCULAR QUANTIDADE DE AZULEJOS\n");

        System.out.print("> Informe a altura da parede (m): ");
        double alturaParede = scan.nextDouble();

        System.out.print("> Informe a largura da parede (m): ");
        double larguraParede = scan.nextDouble();

        System.out.print("> Informe a altura do azulejo (m): ");
        double alturaAzulejo = scan.nextDouble();

        System.out.print("> Informe a largura do azulejo (m): ");
        double larguraAzulejo = scan.nextDouble();

        double quantidadeAzulejo = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);

        System.out.println("\n>> A quantidade de azulejos necessária para preencher a parede é: "
                + formatar.format(quantidadeAzulejo) + ".");
    }
}