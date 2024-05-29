
package exercicio3;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Livraria {

    private static Stack<Book> pilhaDeLivros = new Stack<>();

    public static void main(String[] args) {
        int opcao = -1;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
                        + "1 - Adicionar livro\n"
                        + "2 - Listar livros\n"
                        + "3 - Retirar livro\n"
                        + "0 - Sair"));

                switch (opcao) {
                    case 1:
                        adicionarLivro();
                        break;
                    case 2:
                        listarLivros();
                        break;
                    case 3:
                        retirarLivro();
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

    public static void adicionarLivro() {
        String ttl = JOptionPane.showInputDialog("Digite o título do livro:");
        String atr = JOptionPane.showInputDialog("Digite o autor do livro:");

        if (ttl != null && !ttl.trim().isEmpty() && atr != null && !atr.trim().isEmpty()) {
            Book livro = new Book(ttl, atr);
            pilhaDeLivros.push(livro);
            JOptionPane.showMessageDialog(null, "Livro adicionado à pilha.");
        } else {
            JOptionPane.showMessageDialog(null, "Título ou autor inválido!");
        }
    }

    public static void listarLivros() {
        if (pilhaDeLivros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A pilha de livros está vazia.");
        } else {
            StringBuilder listaDeLivros = new StringBuilder("Livros na pilha:\n");
            for (Book livro : pilhaDeLivros) {
                listaDeLivros.append(livro).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaDeLivros.toString());
        }
    }

    public static void retirarLivro() {
        if (pilhaDeLivros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A pilha de livros está vazia.");
        } else {
            Book livro = pilhaDeLivros.pop();
            JOptionPane.showMessageDialog(null, "Livro removido da pilha: " + livro);
        }
    }
}
