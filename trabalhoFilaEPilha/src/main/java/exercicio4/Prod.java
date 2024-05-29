
package exercicio4;


public class Prod {
    int cod;
    String desc;
    String dtEnt;
    String ufOri;
    String ufDest;

    public Prod(int cod, String desc, String dtEnt, String ufOri, String ufDest) {
        this.cod = cod;
        this.desc = desc;
        this.dtEnt = dtEnt;
        this.ufOri = ufOri;
        this.ufDest = ufDest;
    }

    @Override
    public String toString() {
        return "Código: " + cod + ", Descrição: " + desc + ", Data de Entrada: " + dtEnt +
                ", UF Origem: " + ufOri + ", UF Destino: " + ufDest;
    }
}
