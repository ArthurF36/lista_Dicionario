package modulo;

class Node<T extends Comparable<T>> {
    private T info;
    private Node<T> next;
    private Node<T> former;


    public Node(T nvLivro) {
        this.info = nvLivro;
    }

    public T getInfo() {
        return this.info;
    }

    public Node<T> getProx() {
        return this.next;
    }

    public Node<T> getFormer() {
        return former;
    }

    public void setInfo(T nvInfo) {
        this.info = nvInfo;
    }

    public void setProx(Node<T> newNext) {
        this.next = newNext;
    }

    public void setFormer(Node<T> prior) {
        this.former = prior;
    }
}

