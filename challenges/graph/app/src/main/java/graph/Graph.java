package graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph <T>{
    public Node<T> addVertex(T value ){

        Node vertex = new Node( value);
        map.put(vertex,new ArrayList<>());
        return vertex;

    }
    Map<Node <T>,
            ArrayList<Node<T>>> map = new HashMap<>();
    public void addEdge(Node node1 , Node node2){
        map.get(node1).add(node2);
        map.get(node2).add(node1);
    }

    public ArrayList<Node> getNodes(){

        if (map.isEmpty()){
            return null;
        }

        ArrayList<Node> list = new ArrayList<>();
        list.addAll(map.keySet());
        return list;

    }

    public  ArrayList<Node<T>> getNeighbors(Node node){
        return map.get(node);
    }

    public int getSize(){
        return map.size();
    }

    public Node<T> addNode(String a) {
        return null;












    }
}