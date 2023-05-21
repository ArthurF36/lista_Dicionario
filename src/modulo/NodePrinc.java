package modulo;

import controle.*;

public class NodePrinc {
    private Letra info;
    private NodePrinc next;
    private NodePrinc former;


    public NodePrinc(Letra newLetter) {
        this.info = newLetter;
    }

    public Letra getInfo() {
        return this.info;
    }

    public NodePrinc getNext() {
        return this.next;
    }

    public NodePrinc getFormer() {
        return former;
    }

    public void setInfo(Letra newInfo) {
        this.info = newInfo;
    }

    public void setNext(NodePrinc newNext) {
        this.next = newNext;
    }

    public void setFormer(NodePrinc prior) {
        this.former = prior;
    }
}

