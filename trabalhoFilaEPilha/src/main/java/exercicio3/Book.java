
package exercicio3;


public class Book {
    String ttl;
    String atr;

    public Book(String ttl, String atr) {
        this.ttl = ttl;
        this.atr = atr;
    }

    @Override
    public String toString() {
        return "Título: " + ttl + ", Autor: " + atr;
    }
}
