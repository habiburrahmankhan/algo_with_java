package graph;

import java.util.PriorityQueue;

public class graphClient {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A" , "B" ,2);
        graph.addEdge("A" , "D" ,4);
        graph.addEdge("C" , "D" ,8);
        graph.addEdge("D" , "E" ,5);
        graph.addEdge("B" , "C" ,6);
        graph.addEdge("F" , "E" ,10);
        graph.addEdge("E" , "G" ,9);
        graph.addEdge("F" , "G" ,7);
        graph.display();
        graph.bft();
        System.out.println("------------------------------------");
        graph.dft();
//
//        System.out.println(graph.numVertex());
//        System.out.println(graph.numEdge());
//        System.out.println(graph.containVertex("A"));
//        System.out.println(graph.containVertex("H"));
//        System.out.println(graph.containEdge("A", "B"));
//        System.out.println(graph.containEdge("A", "C"));
//       graph.removeEdge("E" ,"F");
//        System.out.println();
//       graph.display();
//        graph.removeVertex("F");
//        System.out.println();
//        graph.display();
//        graph.addVertex("F");
//        System.out.println();
//        graph.display();
//        System.out.println(graph.hasPath("A" ,"X"));
//        System.out.println(graph.bfs("A" ,"F"));
//        System.out.println(graph.bfs("A" ,"X"));
//        System.out.println(graph.dfs("B" ,"F"));
//        System.out.println(graph.dfs("A" ,"X"));
        System.out.println("------------------------------------");
        System.out.println(graph.isCyclic());
        System.out.println("------------------------------------");
        System.out.println(graph.isConnected());
        System.out.println("------------------------------------");
        System.out.println(graph.isTree());
        System.out.println("------------------------------------");
        graph.getConnectedComponent();
        graph.Prismtree().display();
    }
}
