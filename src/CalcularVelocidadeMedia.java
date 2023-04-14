import java.util.Scanner;

public class CalcularVelocidadeMedia implements IProgram {
    private Scanner scan;

    CalcularVelocidadeMedia(Scanner scan) {
        this.scan = scan;
    }

    public String getName() {
        return "Calcular velocidade média";
    }

    public void run() {
        System.out.println("CALCULAR VELOCIDADE MÉDIA\n");

        System.out.print("> Insira a distância percorrida (Km): ");
        double distanciaPercorrida = scan.nextDouble();
        scan.nextLine();

        System.out.print("> Insira o tempo gasto (horas): ");
        double tempoGasto = scan.nextDouble();
        scan.nextLine();

        double velocidadeMedia = distanciaPercorrida / tempoGasto;

        System.out.println("\n>>> Para encontrar a velocidade média dividimos a distância (" + distanciaPercorrida
                + ") pelo tempo gasto no percurso (" + tempoGasto + ").");

        System.out.println("\n>> A velocidade média é de " + velocidadeMedia + " Km/h.");
    }
}