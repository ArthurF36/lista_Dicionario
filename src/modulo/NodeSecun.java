package modulo;

import controle.*;

public class NodeSecun {

    private Termo info;
    private NodeSecun next;
    private NodeSecun former;


    public NodeSecun(Termo newWord) {
        this.info = newWord;
    }

    public Termo getInfo() {
        return this.info;
    }

    public NodeSecun getNext() {
        return this.next;
    }

    public NodeSecun getFormer() {
        return former;
    }

    public void setInfo(Termo newInfo) {
        this.info = newInfo;
    }

    public void setNext(NodeSecun newNext) {
        this.next = newNext;
    }

    public void setFormer(NodeSecun prior) {
        this.former = prior;
    }
}
