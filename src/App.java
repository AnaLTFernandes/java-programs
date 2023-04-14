import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programs programas = new Programs(scanner);

        System.out.println("\nBem vindo(a)!");
        String opcao = "";

        while (!opcao.equals("exit")) {
            System.out.println(
                    "Escolha umas das opções abaixo para rodar o programa em questão, ou digite \"exit\" para sair.");
            programas.getOptions();

            System.out.print("\n> ");
            opcao = scanner.nextLine();

            try {
                int opcaoNumero = Integer.parseInt(opcao);

                System.out.println("\n=====================");

                programas.run(opcaoNumero);

                System.out.println("=====================\n");
            } catch (NumberFormatException e) {
                if (!opcao.equals("exit")) {
                    System.out.println("\n>> Carácter inválido! <<\n");
                }
            }

            if (!opcao.equals("exit")) {
                System.out.println(">>> Pressione \"Enter\" para continuar.");
                scanner.nextLine();
            }
        }

        System.out.println("\nBye! Espero te ter aqui novamente :)\n");
        scanner.close();
    }
}
