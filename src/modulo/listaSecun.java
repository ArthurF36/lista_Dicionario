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
            System.out.println(this.fist.getInfo().toString());
        }
        else if (this.fist.getInfo().compareTo(newWord.getInfo()) > 0) {
            System.out.println("Olá 1");
            newWord.setNext(this.fist);
            this.fist.setFormer(newWord);
            this.fist = newWord;
        }
        else if (this.last.getInfo().compareTo(newWord.getInfo()) < 0) {
            System.out.println("Olá 2");
            newWord.setFormer(this.last);
            this.last.setNext(newWord);
            this.last = newWord;
        }
        else {
            NodeSecun aux = this.fist;
            while (aux != null) {
                if (aux.getInfo().compareTo(newWord.getInfo()) == 0) {
                    System.out.println("Palavra já listada no dicionário");
                    return;
                }
                else if (aux.getInfo().compareTo(newWord.getInfo()) > 0) {
                    System.out.println("Olá 3");
                    aux.getFormer().setNext(newWord);
                    newWord.setFormer(aux.getFormer());
                    aux.setFormer(newWord);
                    newWord.setNext(aux);
                }
                aux = aux.getNext();
            }
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
