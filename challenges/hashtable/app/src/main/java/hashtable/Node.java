package hashtable;

public class Node <T> {

    T value ;
    T key;
    Node<T> next;

    public Node(T key, T value) {
        this.value = value;
        this.key = key;
    }

    public Node() {
    }
}
