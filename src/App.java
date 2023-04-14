import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcularQuantidadeAzulejo calcularQuantidadeAzulejo = new CalcularQuantidadeAzulejo(scanner);
        CalcularDesconto calcularDesconto = new CalcularDesconto(scanner);
        CalcularVelocidadeMedia calcularVelocidadeMedia = new CalcularVelocidadeMedia(scanner);
        Dialog dialog = new Dialog();
        CompararNumeros compararNumeros = new CompararNumeros(scanner);
        JogoAlgebra jogoAlgebra = new JogoAlgebra(scanner);
        JogoCalculo jogoCalculo = new JogoCalculo(scanner);
        JogoAcertarNumero jogoAcertarNumero = new JogoAcertarNumero(scanner);
        ListaConvidados listaConvidados = new ListaConvidados(scanner);
        ListaConvidadosPlus listaConvidadosPlus = new ListaConvidadosPlus(scanner);
        ListaConvidadosPlusPlus listaConvidadosPlusPlus = new ListaConvidadosPlusPlus(scanner);
        SomaMais18Anos somaMais18Anos = new SomaMais18Anos(scanner);
        OlaMundo olaMundo = new OlaMundo();

        System.out.println("\nBem vindo(a)!");
        String opcao = "";

        while (!opcao.equals("exit")) {
            System.out.println(
                    "Escolha umas das opções abaixo para rodar o programa em questão, ou digite \"exit\" para sair.");
            System.out.println(" 1 - Calcular quantidade de azulejos");
            System.out.println(" 2 - Calcular desconto");
            System.out.println(" 3 - Calcular velocidade média");
            System.out.println(" 4 - Caixas de diálogo");
            System.out.println(" 5 - Comparar números");
            System.out.println(" 6 - Jogo de álgebra");
            System.out.println(" 7 - Jogo de cálculo");
            System.out.println(" 8 - Jogo de acertar o número");
            System.out.println(" 9 - Lista de convidados");
            System.out.println(" 10 - Lista de convidados PLUS");
            System.out.println(" 11 - Lista de convidados PLUS+");
            System.out.println(" 12 - Somar idades acima de 18 anos");
            System.out.println(" 13 - Olá, mundo");

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
                    case 4:
                        dialog.run();
                        break;
                    case 5:
                        compararNumeros.run();
                        break;
                    case 6:
                        jogoAlgebra.run();
                        break;
                    case 7:
                        jogoCalculo.run();
                        break;
                    case 8:
                        jogoAcertarNumero.run();
                        break;
                    case 9:
                        listaConvidados.run();
                        break;
                    case 10:
                        listaConvidadosPlus.run();
                        break;
                    case 11:
                        listaConvidadosPlusPlus.run();
                        break;
                    case 12:
                        somaMais18Anos.run();
                        break;
                    case 13:
                        olaMundo.run();
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

            if (!opcao.equals("exit")) {
                System.out.println(">>> Pressione \"Enter\" para continuar.");
                scanner.nextLine();
            }
        }

        System.out.println("\nBye! Espero te ter aqui novamente :)\n");
        scanner.close();
    }
}
