import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcularQuantidadeAzulejo calcularQuantidadeAzulejo = new CalcularQuantidadeAzulejo(scanner);

        System.out.println("\nBem vindo(a)!");
        String opcao = "";

        while (!opcao.equals("exit")) {
            System.out.println(
                    "Escolha umas das opções abaixo para rodar o programa em questão, ou digite \"exit\" para sair.");
            System.out.println(" 1 - Calcular quantidade de azulejos");

            System.out.print("\n> ");
            opcao = scanner.next();

            try {
                int opcaoNumero = Integer.parseInt(opcao);

                System.out.println("\n=====================");

                if (opcaoNumero == 1) {
                    calcularQuantidadeAzulejo.run();
                } else {
                    System.out.println("Nenhum programa encontrado!");
                }

                System.out.println("=====================\n");

            } catch (Exception e) {
            }
        }

        System.out.println("\nBye! Espero te ter aqui novamente :)\n");
        scanner.close();
    }
}
