import java.util.Scanner;
import java.util.Random;

public class JogoAlgebra implements IProgram {
    private Scanner scan;
    private Random gerarNumerosAleatorios = new Random();

    JogoAlgebra(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Jogo de álgebra";
    }

    public void run() {
        int vitorias = 0;
        int derrotas = 0;
        int numeroQuestao = 1;

        System.out.println("JOGO DE ÁLGEBRA");
        System.out.println(" Descubra o valor de X.");
        System.out.println(" Digite \"404\" para finalizar o jogo.\n");

        while (true) {
            int x = gerarNumerosAleatorios.nextInt(11);
            int y = gerarNumerosAleatorios.nextInt(11);
            int simboloMatematico = gerarNumerosAleatorios.nextInt(3);
            int multiplicadorDeX = gerarNumerosAleatorios.nextInt(5) + 1;

            if (simboloMatematico == 0) {
                int resultadoEquacao = multiplicadorDeX * x + y;
                System.out.println(
                        "\n" + numeroQuestao++ + ") " + multiplicadorDeX + "x + " + y + " = " + resultadoEquacao);
            }

            else if (simboloMatematico == 1) {
                int resultadoEquacao = multiplicadorDeX * x - y;
                System.out.println(
                        "\n" + numeroQuestao++ + ") " + multiplicadorDeX + "x - " + y + " = " + resultadoEquacao);
            }

            else {
                int resultadoEquacao = multiplicadorDeX * x * y;
                System.out.println(
                        "\n" + numeroQuestao++ + ") " + multiplicadorDeX + "x * " + y + " = " + resultadoEquacao);
            }

            System.out.print("> O valor de X é: ");
            int resposta = scan.nextInt();
            scan.nextLine();

            if (resposta == 404) {
                break;
            }

            if (resposta == x) {
                System.out.println("\n>> Parabéns, você acertou!");
                vitorias++;
            } else {
                System.out.println("\n>> Que pena, a resposta era: " + x);
                derrotas++;
            }
        }

        int totalPartidas = vitorias + derrotas;

        System.out.println("\n>> VITÓRIAS: " + vitorias);
        System.out.println(">> DERROTAS: " + derrotas);
        System.out.println(">> TOTAL DE PARTIDAS: " + totalPartidas);
    }
}