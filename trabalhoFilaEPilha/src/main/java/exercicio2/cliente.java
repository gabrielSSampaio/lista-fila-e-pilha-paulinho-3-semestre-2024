
package exercicio2;




/**
 * 
 * Autor: jjoao
 */
public class cliente {
    int pwd;
    String nm;
    int anoNasc;

    public cliente(int pwd, String nm, int anoNasc) {
        this.pwd = pwd;
        this.nm = nm;
        this.anoNasc = anoNasc;
    }

    public int calcIdade(int anoAtual) {
        return anoAtual - this.anoNasc;
    }

    @Override
    public String toString() {
        return "Senha: " + pwd + ", Nome: " + nm + ", Ano de Nascimento: " + anoNasc;
    }
}
