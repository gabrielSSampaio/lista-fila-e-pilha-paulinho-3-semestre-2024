

package exercicio1;


import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;

public class exercicio1 {

    private static Queue<String> fila = new LinkedList<>();
    private static final int LIMITE = 20;

    public static void main(String[] args) {
        int opcao = -1;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                        + "1 - Adicionar paciente\n"
                        + "2 - Chamar próximo paciente\n"
                        + "0 - Sair"));

                switch (opcao) {
                    case 1:
                        addPac();
                        break;
                    case 2:
                        chamProxPac();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número.");
            }
        } while (opcao != 0);
    }

    public static void addPac() {
        if (fila.size() < LIMITE) {
            String nome = JOptionPane.showInputDialog("Digite o nome do paciente:");
            if (nome != null && !nome.trim().isEmpty()) {
                fila.add(nome);
                JOptionPane.showMessageDialog(null, "Paciente " + nome + " adicionado à fila.");
            } else {
                JOptionPane.showMessageDialog(null, "Nome inválido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A fila está cheia! Não é possível adicionar mais pacientes hoje.");
        }
    }

    public static void chamProxPac() {
        if (!fila.isEmpty()) {
            String proximoPaciente = fila.poll();
            JOptionPane.showMessageDialog(null, "Próximo paciente: " + proximoPaciente);
        } else {
            JOptionPane.showMessageDialog(null, "Não há pacientes na fila.");
        }
    }
}
