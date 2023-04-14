import javax.swing.JOptionPane;

public class Dialog implements IProgram {

    public String getName() {
        return "Caixas de diálogo";
    }

    public void run() {
        System.out.println("CAIXAS DE DIÁLOGO\n");
        System.out.println(">>> Caixas de diálogo deverão aparecer na sua tela em breve!");

        boolean confirmarMensagem = false;

        while (!confirmarMensagem) {
            String mensagem = JOptionPane.showInputDialog(null, "Insira uma mensagem:");

            while (mensagem == null || mensagem.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O que custa escrever uma mensagem? :(");
                mensagem = JOptionPane.showInputDialog(null, "Insira uma mensagem:");
            }

            int confirmacao = JOptionPane.showConfirmDialog(null,
                    "Você tem certeza que \"" + mensagem + "\" é a mensagem que deseja?",
                    "Confirmar mensagem", 0);

            if (confirmacao != 0) {
                confirmarMensagem = false;
                continue;
            }

            confirmarMensagem = true;
        }

        JOptionPane.showMessageDialog(null, "Muito obrigada! :)");
    }
}