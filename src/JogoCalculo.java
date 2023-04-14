import java.util.Scanner;
import java.util.Random;

public class JogoCalculo implements IProgram {
    private Scanner scan;
    private Random random = new Random();

    JogoCalculo(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Jogo de cálculo";
    }

    private boolean ehNivelValido(int nivel) {
        return nivel >= 1 && nivel <= 5;
    }

    private boolean ehRespostaValida(String resposta) {
        return resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n");
    }

    private int gerarNumero(int maximo) {
        int numero = 0;

        do {
            numero = random.nextInt(maximo);
        } while (numero == 0);

        return numero;
    }

    private int pegarPontos(int nivel) {
        if (nivel == 1 || nivel == 2)
            return 200;

        return 500;
    }

    public void run() {
        System.out.println("\nJOGO DE CÁLCULO");
        System.out.println(" Resolva os cálculos que surgirem, mas Atenção: você possui somente 3 chances.");
        System.out.println(" Insira '404' a qualquer momento para trocar de nível/sair.\n");

        int vitorias = 0;
        int derrotas = 0;
        int pontuacao = 0;
        int nivel = 0;
        int vida = 3;
        boolean jogar = true;

        while (jogar) {
            boolean pararJogo = false;

            do {
                System.out.println(">> Em qual nível deseja jogar?");
                System.out.println(" 1) Nível 1 (soma)");
                System.out.println(" 2) Nível 2 (subtração)");
                System.out.println(" 3) Nível 3 (multiplicação)");
                System.out.println(" 4) Nível 4 (divisão [apenas parte inteira])");
                System.out.println(" 5) Finalizar o jogo");

                System.out.print("\n> ");
                nivel = scan.nextInt();
                scan.nextLine();
            } while (!ehNivelValido(nivel));

            if (nivel == 5) {
                jogar = false;
                continue;
            }

            for (int questao = 1; !pararJogo && vida > 0; questao++) {
                int resultadoEsperado = 0;
                int resposta = 1;

                if (nivel == 1) {
                    int numero1 = gerarNumero(101);
                    int numero2 = gerarNumero(101);

                    resultadoEsperado = numero1 + numero2;

                    System.out.print("\n " + questao + ") " + numero1 + " + " + numero2 + " = ");
                    resposta = scan.nextInt();
                    scan.nextLine();
                }

                if (nivel == 2) {
                    int numero1 = gerarNumero(101);
                    int numero2 = gerarNumero(101);

                    resultadoEsperado = numero1 - numero2;

                    System.out.print("\n " + questao + ") " + numero1 + " - " + numero2 + " = ");
                    resposta = scan.nextInt();
                    scan.nextLine();
                }

                if (nivel == 3) {
                    int numero1 = gerarNumero(11);
                    int numero2 = gerarNumero(11);

                    resultadoEsperado = numero1 * numero2;

                    System.out.print("\n " + questao + ") " + numero1 + " * " + numero2 + " = ");
                    resposta = scan.nextInt();
                    scan.nextLine();
                }

                if (nivel == 4) {
                    int numero1 = gerarNumero(11);
                    int numero2 = gerarNumero(11);

                    resultadoEsperado = numero1 / numero2;

                    System.out.print("\n " + questao + ") " + numero1 + " / " + numero2 + " = ");
                    resposta = scan.nextInt();
                    scan.nextLine();
                }

                if (resposta == 404 && resultadoEsperado != 404) {
                    pararJogo = true;
                    continue;
                }

                if (resposta == resultadoEsperado) {
                    System.out.println("\n>> Parabéns, você acertou!");
                    pontuacao += pegarPontos(nivel);
                    vitorias++;
                } else {
                    vida--;
                    derrotas++;
                    System.out.println("\n>> Que pena, a resposta era: " + resultadoEsperado);

                    if (vida > 0) {
                        System.out.println(">> VIDAS: " + vida);
                    }
                }
            }

            if (vida <= 0) {
                System.out.print("\n>> Suas chances acabaram :(");
            }

            String resposta;

            do {
                System.out.print("\n>> Deseja continuar jogando? (s/n) ");
                resposta = scan.nextLine();
            } while (!ehRespostaValida(resposta));

            if (resposta.equalsIgnoreCase("n")) {
                jogar = false;
            } else if (vida <= 0) {
                vida = 3;
            }
        }

        int partidas = vitorias + derrotas;

        System.out.println("\n>> Partidas: " + partidas);
        System.out.println(">> Vitórias: " + vitorias);
        System.out.println(">> Derrotas: " + derrotas);
        System.out.println("\n>> PONTUAÇÃO: " + pontuacao);
    }
}
