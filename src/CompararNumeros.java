import java.util.Scanner;

public class CompararNumeros implements IProgram {
    Scanner scan;

    CompararNumeros(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Comparar números";
    }

    public void run() {
        System.out.println("COMPARAR NÚMEROS\n");

        int quantidadeNumeros;
        int menorNumero = 0;
        int maiorNumero = 0;

        do {
            System.out.print("> Insira a quantidade de números a serem comparados: ");
            quantidadeNumeros = scan.nextInt();
        } while (quantidadeNumeros == 0);

        System.out.println();

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("> Insira o " + i + "° número inteiro: ");
            int numero = scan.nextInt();

            if (i == 1) {
                maiorNumero = numero;
                menorNumero = numero;
            } else {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }

                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }

            scan.nextLine();
        }

        System.out.println("\n>> O menor número é: " + menorNumero);
        System.out.println(">> O maior número é: " + maiorNumero);
    }
}