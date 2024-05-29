/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX2;

/**
 *
 * @author jjoao
 */
public class Cliente {
    int senha;
    String nome;
    int anoNascimento;

    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getIdade(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }

    @Override
    public String toString() {
        return "Senha: " + senha + ", Nome: " + nome + ", Ano de Nascimento: " + anoNascimento;
    }
}
