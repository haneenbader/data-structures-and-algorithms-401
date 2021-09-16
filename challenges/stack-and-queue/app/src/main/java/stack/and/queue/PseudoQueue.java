package stack.and.queue;

public class PseudoQueue<T> {
    Stack<T> stackOne = new Stack<T>();
    Stack<T> stackTow = new Stack<T>();
//Inserts value into the PseudoQueue, using a first-in, first-out approach.
    public void enqueue(T value) {

        stackOne.push(value);
    }
//Extracts a value from the PseudoQueue, using a first-in, first-out approach.h
    public T dequeue() {
        T value = null;

        if (!stackOne.isEmpty()) {
            while (!stackTow.isEmpty()) {
                stackOne.push((T) stackTow.pop());
            }
            value = stackOne.top.value;
            stackOne.pop();
            while (!stackOne.isEmpty()) {
//                    stackTow.push(stackOne.pop());
            }
        }
        return value;
    }
}