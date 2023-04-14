import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class JogoAcertarNumero implements IProgram {
    private Scanner scan;
    private Random random = new Random();

    JogoAcertarNumero(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Jogo de acertar o número";
    }

    private boolean ehRespostaValida(String resposta) {
        return resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n");
    }

    public void run() {
        System.out.println("JOGO DE ACERTAR O NÚMERO");
        System.out.println(" Tente acertar o número de 0 até 9 gerado aleatoriamente.");
        System.out.println(" ATENÇÃO: Você terá somente 3 chances.\n");

        boolean jogar = true;

        while (jogar) {
            int numeroAleatorio = random.nextInt(10);
            int chances = 3;
            int numero = 0;

            while (chances > 0) {
                chances--;

                System.out.print("\n> Digite um número: ");
                numero = scan.nextInt();
                scan.nextLine();

                boolean respostaErrada = numero != numeroAleatorio;

                if (chances > 0 && respostaErrada) {
                    System.out.println("\n>> Errou T-T, tente novamente.");
                    System.out.println(">> Atenção: você só tem " + chances + " chances.");

                    if (numero > numeroAleatorio) {
                        System.out.println(">> Dica: o número digitado é maior que o número a ser adivinhado ;)\n");
                    } else {
                        System.out.println(">> Dica: o número digitado é menor que o número a ser adivinhado ;)\n");
                    }
                }
            }

            if (numero == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "ACERTOU :D\nO número era " + numeroAleatorio + "!!");
            } else if (chances == 0) {
                JOptionPane.showMessageDialog(null,
                        "Que pena, suas chances acabaram :(\nO número era " + numeroAleatorio + "...");
            }

            String resposta;

            do {
                System.out.print("\n> Deseja continuar? (s/n) ");
                resposta = scan.nextLine();
            } while (!ehRespostaValida(resposta));

            if (resposta.equalsIgnoreCase("n")) {
                jogar = false;
            }
        }
    }
}