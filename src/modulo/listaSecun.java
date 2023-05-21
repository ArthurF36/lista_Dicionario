package modulo;

import controle.*;

public class listaSecun {
    private NodeSecun fist;
    private NodeSecun last;
    private int qnt;

    public void inserirSecun(Termo word) {
        NodeSecun newWord = new NodeSecun(word);
        if (this.isEmpty()) {
            this.fist = newWord;
            this.last = newWord;
        }
        else if (this.fist.getInfo().compareTo(newWord.getInfo()) > 0) {
            newWord.setNext(this.fist);
            this.fist.setFormer(newWord);
            this.fist = newWord;
        }
        else if (this.last.getInfo().compareTo(newWord.getInfo()) < 0) {
            newWord.setFormer(this.last);
            this.last.setNext(newWord);
            this.last = newWord;
        }
        else {
            NodeSecun aux = this.fist;
            while (aux != null) {
                if (aux.getInfo().compareTo(newWord.getInfo()) == 0) {
                    System.out.println("Palavra já listada no dicionário");
                }
                else if (aux.getInfo().compareTo(newWord.getInfo()) > 0) {
                    aux.getFormer().setNext(newWord);
                    newWord.setFormer(aux.getFormer());
                    aux.setFormer(newWord);
                    newWord.setNext(aux);
                }
                aux = aux.getNext();
            }
        }
        this.qnt++;
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
