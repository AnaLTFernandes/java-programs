import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Programs {
    private Map<Integer, IProgram> programas;

    Programs(Scanner scanner) {
        programas = new HashMap<>();

        programas.put(1, new CalcularDesconto(scanner));
        programas.put(2, new CalcularQuantidadeAzulejo(scanner));
        programas.put(3, new CalcularVelocidadeMedia(scanner));
        programas.put(4, new ClassificarIdade(scanner));
        programas.put(5, new CompararNumeros(scanner));
        programas.put(6, new CriarRecibo(scanner));
        programas.put(7, new Dialog());
        programas.put(8, new JogoAcertarNumero(scanner));
        programas.put(9, new JogoAlgebra(scanner));
        programas.put(10, new JogoCalculo(scanner));
        programas.put(11, new ListaConvidados(scanner));
        programas.put(12, new ListaConvidadosPlus(scanner));
        programas.put(13, new ListaConvidadosPlusPlus(scanner));
        programas.put(14, new OlaMundo());
        programas.put(15, new SomaIdades(scanner));
        programas.put(16, new SomaMais18Anos(scanner));
        programas.put(17, new SomaTotalCompra(scanner));
        programas.put(18, new Tabuada(scanner));
        programas.put(19, new TrianguloI());
        programas.put(20, new TrianguloII());
        programas.put(21, new TrianguloIII());
        programas.put(22, new TrianguloIV());
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
