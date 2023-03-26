import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcularQuantidadeAzulejo calcularQuantidadeAzulejo = new CalcularQuantidadeAzulejo(scanner);
        CalcularDesconto calcularDesconto = new CalcularDesconto(scanner);
        CalcularVelocidadeMedia calcularVelocidadeMedia = new CalcularVelocidadeMedia(scanner);

        System.out.println("\nBem vindo(a)!");
        String opcao = "";

        while (!opcao.equals("exit")) {
            System.out.println(
                    "Escolha umas das opções abaixo para rodar o programa em questão, ou digite \"exit\" para sair.");
            System.out.println(" 1 - Calcular quantidade de azulejos");
            System.out.println(" 2 - Calcular desconto");
            System.out.println(" 3 - Calcular velocidade média");

            System.out.print("\n> ");
            opcao = scanner.nextLine();

            try {
                int opcaoNumero = Integer.parseInt(opcao);

                System.out.println("\n=====================");

                switch (opcaoNumero) {
                    case 1:
                        calcularQuantidadeAzulejo.run();
                        break;
                    case 2:
                        calcularDesconto.run();
                        break;
                    case 3:
                        calcularVelocidadeMedia.run();
                        break;
                    default:
                        System.out.println("Nenhum programa encontrado!");
                        break;
                }

                System.out.println("=====================\n");
            } catch (NumberFormatException e) {
                if (!opcao.equals("exit")) {
                    System.out.println("\n>> Carácter inválido! <<\n");
                }
            }

            System.out.println(">>> Pressione \"Enter\" para continuar.");
            scanner.nextLine();
        }

        System.out.println("\nBye! Espero te ter aqui novamente :)\n");
        scanner.close();
    }
}
