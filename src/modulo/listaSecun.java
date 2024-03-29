package modulo;

import controle.*;

import java.util.Scanner;

public class listaSecun {
    Scanner in = new Scanner(System.in);
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
            NodeSecun anter;
            int compare;
            do {
                anter = aux.getFormer();
                compare = aux.getInfo().compareTo(newWord.getInfo());
                if (compare == 0) {
                    System.out.println("Palavra já listada no dicionário.");
                    return;
                }
                else if (compare > 0) {
                    anter.setNext(newWord);
                    newWord.setFormer(anter);
                    aux.setFormer(newWord);
                    newWord.setNext(aux);
                    break;
                }
                aux = aux.getNext();
            } while (aux != this.fist);
        }
        this.fist.setFormer(this.last);
        this.last.setNext(this.fist);
        this.qnt++;
        System.out.println("Inseção efetuada.");
    }

    public boolean removerSecun(Termo word) {
        NodeSecun newLetter = new NodeSecun(word);
        NodeSecun aux, former, next;
        if (this.qnt == 1) {
            if (this.fist.getInfo().compareTo(newLetter.getInfo()) != 0) {
                System.out.println("Nome não cadastrado no dicionário.");
                return false;
            }
            this.fist = null;
            this.last = null;
        }
        else {
            aux = search(newLetter);
            if (aux == null) {
                System.out.println("Nome não cadastrado no dicionário.");
                return false;
            }
            else {
                System.out.println("Olá 4");
                former = aux.getFormer();
                next = aux.getNext();
                if (this.fist.getInfo().compareTo(aux.getInfo()) == 0) {
                    former.setNext(this.fist.getNext());
                    next.setFormer(this.last);
                    this.fist = this.fist.getNext();
                    System.out.println(fist.getInfo().toString());
                }
                else if (this.last.getInfo().compareTo(aux.getInfo()) == 0) {
                    former.setNext(this.fist);
                    next.setFormer(this.last.getFormer());
                    this.last = this.last.getFormer();
                }
                else {
                    former.setNext(next);
                    next.setFormer(former);
                }
            }
        }
        this.qnt--;
        System.out.println("Nome removido.");
        return true;
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

    public void exibirTermo(Termo word) {
        NodeSecun aux, searchW;
        searchW = new NodeSecun(word);
        aux = search(searchW);
        if (aux != null) {
            System.out.println(aux.getInfo().toString());
            return;
        }
        System.out.println("Palavra não cadastrada.");
    }

    public void editarSecun(Termo word) {
        NodeSecun aux, searchW;
        String newDesc;
        searchW = new NodeSecun(word);
        aux = search(searchW);
        if (aux != null) {
            System.out.print("Digite a sua nova descrição: ");
            newDesc = in.nextLine();
            aux.getInfo().setDesc(newDesc);
            System.out.println("Edição relizada.");
            return;
        }
        System.out.println("Palavra não cadastrada.");
    }

    private NodeSecun search(NodeSecun buscaW) {
        NodeSecun aux = this.fist;
        do {
            if (aux.getInfo().compareTo(buscaW.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getNext();
        } while (aux != this.fist);
        return null;
    }

    public boolean isEmpty() {
        if (this.fist == null && this.last == null && this.qnt == 0) {
            return true;
        }
        return false;
    }
}
