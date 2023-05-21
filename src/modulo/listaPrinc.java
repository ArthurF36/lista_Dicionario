package modulo;

import controle.*;

public class listaPrinc {
    private NodePrinc fist;
    private NodePrinc last;
    private int qnt;

    public void inserirPrinc(Letra letter, Termo word) {
        NodePrinc newLetter = new NodePrinc(letter);
        if (this.isEmpty()) {
            this.fist = newLetter;
            this.last = newLetter;
        }
        else if (this.fist.getInfo().compareTo(newLetter.getInfo()) > 0) {
            newLetter.setNext(this.fist);
            this.fist.setFormer(newLetter);
            this.fist = newLetter;
        }
        else if (this.last.getInfo().compareTo(newLetter.getInfo()) < 0) {
            newLetter.setFormer(this.last);
            this.last.setNext(newLetter);
            this.last = newLetter;
        }
        else {
            NodePrinc aux = this.fist;
            while (aux != null) {
                if (aux.getInfo().compareTo(newLetter.getInfo()) == 0) {
                    break;
                }
                else if (aux.getInfo().compareTo(newLetter.getInfo()) > 0) {
                    aux.getFormer().setNext(newLetter);
                    newLetter.setFormer(aux.getFormer());
                    aux.setFormer(newLetter);
                    newLetter.setNext(aux);
                }
                aux = aux.getNext();
            }
        }
        this.qnt++;
        newLetter.getInfo().getList().inserirSecun(word);
    }

    private NodePrinc search(NodePrinc buscaW) {
        NodePrinc aux = this.fist;
        while (aux != null) {
            if (aux.getInfo().compareTo(buscaW.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getNext();
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
