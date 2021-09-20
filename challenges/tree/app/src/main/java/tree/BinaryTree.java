package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    List list = new ArrayList();
//    Node root ;
    public void preOrder(Node root){
        if (root!=null) {
            list.add(root.value);
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
//            System.out.println(list);
        }
    }

    public void inOrder(Node root){
        if (root!=null) {
            inOrder(root.left);
            list.add(root.value);
            System.out.println(root.value);
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if (root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            list.add(root.value);
            System.out.println(root.value);
        }
    }
}
