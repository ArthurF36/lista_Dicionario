package controle;

import modulo.*;

public class Letra {
    private final char letter;
    private final listaSecun list;

    public Letra(char newLet) {
        this.letter = newLet;
        this.list = new listaSecun();
    }

    public char getLetter() {
        return letter;
    }

    public listaSecun getList() {
        return list;
    }

    public int compareTo(Letra compara) {
        return this.letter - compara.letter;
    }

    public String toString() {
        return "Letra: " + this.letter + ".";
    }
}
