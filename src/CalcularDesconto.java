import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CalcularDesconto implements IProgram {
    private Scanner scan;
    private Locale localidade = new Locale("pt", "BR");
    private NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(localidade);

    CalcularDesconto(Scanner scan) {
        this.scan = scan;
    }

    public void run() {
        System.out.println("CALCULAR DESCONTO");
        System.out.println(" Insira qualquer letra ou símbolo para finalizar.\n");

        double valorTotal = 0.0;
        boolean temMaisProduto = true;

        while (temMaisProduto) {
            System.out.print("> Informe o valor do produto: ");
            boolean temValorDouble = scan.hasNextDouble();

            if (temValorDouble) {
                valorTotal += scan.nextDouble();
                scan.nextLine();
                continue;
            }

            temMaisProduto = false;
            scan.nextLine();
        }

        int porcentagemDesconto = 0;

        if (valorTotal <= 0) {
            porcentagemDesconto = 0;
        } else if (valorTotal > 1000) {
            porcentagemDesconto = 30;
        } else if (valorTotal >= 800) {
            porcentagemDesconto = 20;
        } else if (valorTotal >= 500) {
            porcentagemDesconto = 15;
        } else {
            porcentagemDesconto = 10;
        }

        double valorDesconto = valorTotal * porcentagemDesconto / 100;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("\n>> O valor total da compra é " + formatadorMoeda.format(valorTotal) + ".");
        System.out.println(">> Sua porcentagem de desconto é: " + porcentagemDesconto + "%.");
        System.out.println(">> O valor do desconto é " + formatadorMoeda.format(valorDesconto) + ".");
        System.out.println(">> Com isso, o valor a ser pago é " + formatadorMoeda.format(valorFinal) + ".");
    }
}