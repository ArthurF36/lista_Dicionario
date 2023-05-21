package modulo;

class Node<T extends Comparable<T>> {
    private T info;
    private Node<T> next;

    public Node(T nvLivro) {
        this.info = nvLivro;
    }

    public T getInfo() {
        return this.info;
    }

    public Node<T> getProx() {
        return this.next;
    }

    public void setInfo(T nvInfo) {
        this.info = nvInfo;
    }

    public void setProx(Node<T> newNext) {
        this.next = newNext;
    }
}

