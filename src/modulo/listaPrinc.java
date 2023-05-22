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
            this.fist.setFormer(this.last);
            this.last.setNext(this.fist);
        }
        else if (this.fist.getInfo().compareTo(newLetter.getInfo()) > 0) {
            System.out.println("olá 10");
            newLetter.setNext(this.fist);
            this.fist.setFormer(newLetter);
            this.fist = newLetter;
            this.fist.setFormer(this.last);
        }
        else if (this.last.getInfo().compareTo(newLetter.getInfo()) < 0) {
            newLetter.setFormer(this.last);
            this.last.setNext(newLetter);
            this.last = newLetter;
            this.last.setNext(this.fist);
        }
        else {
            NodePrinc aux = this.fist;
            NodePrinc anter;
            int compare;
            do {
                anter = aux.getFormer();
                compare = aux.getInfo().compareTo(newLetter.getInfo());
                if (compare == 0) {
                    System.out.println("Hello");
                    this.qnt++;
                    aux.getInfo().getList().inserirSecun(word);
                    return;
                }
                else if (compare > 0) {
                    anter.setNext(newLetter);
                    newLetter.setFormer(anter);
                    aux.setFormer(newLetter);
                    newLetter.setNext(aux);
                    break;
                }
                aux = aux.getNext();
            } while (aux != this.fist);
        }
        this.qnt++;
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
            do {
                exibe = aux.getInfo();
                System.out.println(exibe);
                exibe.getList().exibirSecun();
                aux = aux.getNext();
                System.out.println(aux.getInfo().toString());
            } while (aux != this.fist);
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
