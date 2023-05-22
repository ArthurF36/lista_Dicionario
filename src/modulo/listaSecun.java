package modulo;

import controle.*;

public class listaSecun {
    private NodeSecun fist;
    private NodeSecun last;
    private int qnt;

    public void inserirSecun(Termo word) {
        NodeSecun newWord = new NodeSecun(word);
        if (this.isEmpty()) {
            System.out.println("Olá");
            this.fist = newWord;
            this.last = newWord;
            this.fist.setFormer(this.last);
            this.last.setNext(this.fist);
        }
        else if (this.fist.getInfo().compareTo(newWord.getInfo()) > 0) {
            System.out.println("Olá 1");
            newWord.setNext(this.fist);
            this.fist.setFormer(newWord);
            this.fist = newWord;
            this.fist.setFormer(this.last);
        }
        else if (this.last.getInfo().compareTo(newWord.getInfo()) < 0) {
            System.out.println("Olá 2");
            newWord.setFormer(this.last);
            this.last.setNext(newWord);
            this.last = newWord;
            this.last.setNext(this.fist);
        }
        else {
            NodeSecun aux = this.fist;
            NodeSecun anter;
            int compare;
            do {
                anter = aux.getFormer();
                compare = aux.getInfo().compareTo(newWord.getInfo());
                if (compare == 0) {
                    System.out.println("Palavra já listada no dicionário");
                    return;
                }
                else if (compare > 0) {
                    System.out.println("Olá 3");
                    anter.setNext(newWord);
                    newWord.setFormer(anter);
                    aux.setFormer(newWord);
                    newWord.setNext(aux);
                    break;
                }
                aux = aux.getNext();
            } while (aux != this.fist);
        }
        this.qnt++;
        System.out.println("Inseção efetuada.");
    }

    public void exibirSecun() {
        NodeSecun aux;
        aux = this.fist;
        do {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        } while (aux != this.fist);
        System.out.println();
    }

    private boolean isEmpty() {
        if (this.fist == null && this.last == null && this.qnt == 0) {
            return true;
        }
        return false;
    }
}
