package stack.and.queue;
// T general type
//first input .. last output
public class Stack<T> {
    //adds a new node with that value to the top of the stack
    Node<T> top;
    public void push(T value){
        Node<T> newNode = new Node<T>(value);

        if (top != null){
            newNode.next = top;
        }
        top = newNode;
    }

    //   Removes the node from the top of the stack
    public T pop(){
        T info = null ;
        if(top==null){
            System.out.println("Empty");


        }else {
            info=top.value;
            top = top.next;

        }

        return info;

    }
    //    Value of the node located at the top of the stack
    public T peek(){
        try {
            return top.value;
        }  catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //Boolean indicating whether or not the stack is empty.
    public boolean isEmpty(){

        return top==null;
    }

    @Override
    public String toString(){
        if (top == null) return "null";
        Node<T> newValue = top;
        String output= "";
        while (newValue!=null){
            output+=newValue.value+" ";
            newValue=newValue.next;
        }
        output+= "null";
        return output;
    }
}
