/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Graph graph = new Graph();
        graph.addVertex("Ibrahim");
        graph.addVertex("Ali");
        graph.addVertex("Ahmad");
        graph.addVertex("Osama");
        graph.addVertex("Omar");

        graph.addEdge("Ibrahim" , "Ali", 15);
        graph.addEdge("Ibrahim" , "Omar", 60 );
        graph.addEdge("Osama" , "Ali", 14);
        graph.addEdge("Omar" , "Ahmad", 30);

        Vertex vertex = new Vertex("Ibrahim");
//        System.out.println(graph.depthFirst(vertex));

        graph.getSize();

        List list= new ArrayList();
        list.add("Ibrahim");
        list.add("Omar");
        list.add("Ahmad");

        System.out.println(graph.citiesTrip(graph, list));

//****************************************************** Depth first *************************************************

        Graph graph1 = new Graph();
        graph1.addVertex("A");
        graph1.addVertex("B");
        graph1.addVertex("C");
        graph1.addVertex("D");
        graph1.addVertex("E");
        graph1.addVertex("F");
        graph1.addVertex("G");
        graph1.addVertex("H");
        graph1.addVertex("R");

        graph1.addEdge("A" , "B", 30);
        graph1.addEdge("A" , "D", 30);
        graph1.addEdge("C" , "B", 30);
        graph1.addEdge("C" , "G", 30);
        graph1.addEdge("G" , "C", 30);
        graph1.addEdge("D" , "A", 30);
        graph1.addEdge("D" , "B", 30);
        graph1.addEdge("D" , "E", 30);
        graph1.addEdge("D" , "H", 30);
        graph1.addEdge("D" , "F", 30);


        Vertex vertex1= new Vertex("R");
        System.out.println(graph1.depthFirst(vertex1));


    }

}
