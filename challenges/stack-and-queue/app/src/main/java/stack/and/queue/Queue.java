package stack.and.queue;
// first input .. first output
public class Queue<T> {
//    This object should be aware of a default empty value assigned to front when the queue is created.
//    adds a new node with that value to the back of the queue
    Node<T> front;
    Node<T> rear;
//add value rear
    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (front == null) {
            front = node;


        } else {
            rear.next = node;
        }
        rear = node;

    }

//Returns: the value from node from the front of the queue
//Removes the node from the front of the queue
    public T dequeue() {
        T info = null;
        if (front == null) {
            System.out.println("Empty");


        } else {
            info = front.value;
            front = front.next;

        }

        return info;
    }
//Returns: Value of the node located at the front of the queue
    public T peek() {
        try {
            return front.value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
//    Returns: Boolean indicating whether or not the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        if (front == null) return "null";
        Node<T> newValue = front;
        String output = "";
        while (newValue != null) {
            output += newValue.value;
            newValue = newValue.next;

        }
        output += "null";
        return output;
    }
}
