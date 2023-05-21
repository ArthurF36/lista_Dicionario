package modulo;

import controle.*;

public class listaPrinc<T extends Comparable<T>> {
    private Node<T> fist;
    private Node<T> last;
    private int qnt;

    public void inserirPrinc(T letter, Termo word) {
        Node<T> newLetter = new Node<>(letter);
        if (this.isEmpty()) {
            this.fist = newLetter;
            this.last = newLetter;
            this.qnt++;
        }
        else if (this.fist.getInfo().compareTo(newLetter.getInfo()) > 0) {
            newLetter.setProx(this.fist);
            this.fist.setFormer(newLetter);
            this.fist = newLetter;
            this.qnt++;
        }
        else if (this.last.getInfo().compareTo(newLetter.getInfo()) < 0) {
            newLetter.setFormer(this.last);
            this.last.setProx(newLetter);
            this.last = newLetter;
            this.qnt++;
        }
        else {
            if (search(newLetter) != null) {

            }
        }
    }

    private Node<T> search(Node<T> buscaW) {
        Node<T> aux = this.fist;
        while (aux != null) {
            if (aux.getInfo().compareTo(buscaW.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    private boolean isEmpty() {
        if (this.fist == null && this.last == null && this.qnt == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
