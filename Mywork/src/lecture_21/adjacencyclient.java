package lecture_21;

public class adjacencyclient {
    public static void main(String[] args) {
        adjacencylist list = new adjacencylist();
        list.addvertex("A");
        list.addvertex("B");
        list.addvertex("C");
        list.addvertex("D");
       // list.display();
        list.addedge("A" ,"B");
        list.addedge("A" ,"C");
        list.addedge("D" ,"B");
        list.addedge("C" ,"B");
     //   list.display();
     //   list.bfs();
     //   System.out.println(list.bfssearch("S"));
      //  list.level();
        System.out.println(list.bipartite());
        list.dfs();
    }
}
