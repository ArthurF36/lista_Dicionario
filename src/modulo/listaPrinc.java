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
            this.qnt++;
        }
        else if (this.fist.getInfo().compareTo(newLetter.getInfo()) > 0) {
            newLetter.setNext(this.fist);
            this.fist.setFormer(newLetter);
            this.fist = newLetter;
            this.qnt++;
        }
        else if (this.last.getInfo().compareTo(newLetter.getInfo()) < 0) {
            newLetter.setFormer(this.last);
            this.last.setNext(newLetter);
            this.last = newLetter;
            this.qnt++;
        }
        else {
            NodePrinc aux = this.fist;
            while (aux != null) {
                if (aux.getInfo().compareTo(newLetter.getInfo()) == 0) {
                    System.out.println("Hello");
                    break;
                }
                else if (aux.getInfo().compareTo(newLetter.getInfo()) > 0) {
                    aux.getFormer().setNext(newLetter);
                    newLetter.setFormer(aux.getFormer());
                    aux.setFormer(newLetter);
                    newLetter.setNext(aux);
                    this.qnt++;
                }
                aux = aux.getNext();
            }
        }
        newLetter.getInfo().getList().inserirSecun(word);
    }

    public void exibirPrinc() {
        NodePrinc aux;
        Letra exibe;
        if (this.isEmpty()) {
            System.out.println("Dicionário vazio.");
        }
        else {
            aux = this.fist;
            while (aux != null) {
                exibe = aux.getInfo();
                System.out.println(exibe);
                exibe.getList().exibirSecun();
                aux = aux.getNext();
            }
        }
    }

    private NodePrinc search(NodePrinc buscaW) {
        NodePrinc aux = this.fist;
        do {
            if (aux.getInfo().compareTo(buscaW.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getNext();
        } while (aux != this.fist);
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
