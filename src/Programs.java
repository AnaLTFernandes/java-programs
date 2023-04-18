import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Programs {
    private Map<Integer, IProgram> programas;

    Programs(Scanner scanner) {
        programas = new HashMap<>();

        programas.put(1, new CalcularQuantidadeAzulejo(scanner));
        programas.put(2, new CalcularDesconto(scanner));
        programas.put(3, new CalcularVelocidadeMedia(scanner));
        programas.put(4, new Dialog());
        programas.put(5, new CompararNumeros(scanner));
        programas.put(6, new JogoAlgebra(scanner));
        programas.put(7, new JogoCalculo(scanner));
        programas.put(8, new JogoAcertarNumero(scanner));
        programas.put(9, new ListaConvidados(scanner));
        programas.put(10, new ListaConvidadosPlus(scanner));
        programas.put(11, new ListaConvidadosPlusPlus(scanner));
        programas.put(12, new SomaMais18Anos(scanner));
        programas.put(13, new SomaIdades(scanner));
        programas.put(14, new OlaMundo());
        programas.put(15, new CriarRecibo(scanner));
    }

    public void run(int id) {
        try {
            programas.get(id).run();
        } catch (Exception e) {
            System.out.println("Nenhum programa encontrado!");
        }
    }

    public void getOptions() {
        Set<Entry<Integer, IProgram>> programasEntries = programas.entrySet();

        for (Entry<Integer, IProgram> programa : programasEntries) {
            System.out.println(" " + programa.getKey() + " - " + programa.getValue().getName());
        }
    }
}
