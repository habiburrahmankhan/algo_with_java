package graph;

import trees.heap.Heap;

import java.util.*;

public class Graph {
    private class Vertex
    {
        HashMap<String , Integer>  neighb = new HashMap<>();
    }
    HashMap<String ,Vertex> vertices ;
    public Graph()
    {
        vertices = new HashMap<>();
    }



    public int numVertex()
    {
        return this.vertices.size() ;
    }
    public boolean containVertex(String vname)
    {
        return this.vertices.containsKey(vname);
    }
    public void addVertex(String vname)
    {
        Vertex neigh = new Vertex();
        this.vertices.put(vname ,neigh);
    }
    public void removeVertex(String vname)
    {
        Vertex vtx = vertices.get(vname);
                ArrayList<String>  key = new ArrayList<>(vtx.neighb.keySet());
        for (String neig :key) {
             Vertex vtx1 = vertices.get(neig);
             vtx1.neighb.remove(vname);
        }
        vertices.remove(vname);
    }

    public  int numEdge()
    {
        int count = 0;
        ArrayList<String>  key = new ArrayList<>(vertices.keySet());
        for (String Key:key) {
            Vertex vtx = vertices.get(Key);
            count+=vtx.neighb.size();
        }
        return count/2 ;
    }
    public  boolean containEdge(String vname1 , String vname2 )
    {
         Vertex vtx1 = vertices.get(vname1);
        Vertex vtx2 = vertices.get(vname2);
        if (vtx1 == null || vtx2 ==null || !vtx1.neighb.containsKey(vname2) )
        {
            return false ;
        }

        return  true ;
    }
    public  void addEdge(String vname1 , String vname2 , int cost)
    {
        Vertex vtx1 = vertices.get(vname1);
        Vertex vtx2 = vertices.get(vname2);
        if (vtx1 == null || vtx2 ==null || vtx1.neighb.containsKey(vname2)  )
        {
            return ;
        }
        vtx1.neighb.put(vname2 , cost);
        vtx2.neighb.put(vname1 , cost);
    }
    public  void removeEdge(String vname1 , String vname2 )
    {
        Vertex vtx1 = vertices.get(vname1);
        Vertex vtx2 = vertices.get(vname2);
        if (vtx1 == null || vtx2 ==null || !vtx1.neighb.containsKey(vname2) || !vtx2.neighb.containsKey(vname1) )
        {
            return ;
        }
        vtx1.neighb.remove(vname2 );
        vtx2.neighb.remove(vname1 );
    }
    public void display()
    {
        ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        for (String key:keys) {
            System.out.println(key + "  :  " + vertices.get(key).neighb);
        }
    }
    public boolean hasPath(String vname1 ,String  vname2)
    {
        HashMap<String ,Boolean> map = new HashMap<>();
        return hasPath(vname1,vname2,map);
    }
    private boolean hasPath(String vname1 ,String  vname2 ,HashMap<String,Boolean> map)
    {
        map.put(vname1 ,true);
      if (containEdge(vname1 ,vname2))
      {
          return true ;
      }

        Vertex vtx = vertices.get(vname1);
        ArrayList<String> nbeir = new ArrayList<>(vtx.neighb.keySet());
         for (String vnme:nbeir) {
            if (!map.containsKey(vnme) && hasPath(vnme , vname2 ,map))
            {
                return true ;
            }
        }

        return false;

    }
    private class Pair
    {
        String vname ;
        String psf ;
    }
    public boolean bfs(String source , String destination)
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();


        Vertex vtx = vertices.get(source);
        ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
        Queue<Pair>  queue = new LinkedList<>();
        Pair pair = new Pair();
        pair.vname = source;
        pair.psf  = source ;
        queue.add(pair);
        while(!queue.isEmpty())
        {
             Pair rmpair  = queue.remove();
            processed.put(rmpair.vname, true);
             if (!processed.containsKey(rmpair.vname))
             {
                 continue;
             }
            if (containEdge(rmpair.vname , destination))
            {
                System.out.println(rmpair.psf + destination);
                return true ;
            }
            Vertex vttx = vertices.get(rmpair.vname);
            ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
            for (String neigh : neibr) {
                  if (!processed.containsKey(neigh))
                  {
                      Pair pair1 = new Pair();
                      pair1.vname = neigh ;
                      pair1.psf  = rmpair.psf + neigh ;
                      queue.add(pair1);
                  }
            }

        }

        return false ;

    }

    public boolean dfs(String source , String destination)
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();


        Vertex vtx = vertices.get(source);
        ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
        Stack<Pair> stack = new Stack<>();
        Pair pair = new Pair();
        pair.vname = source;
        pair.psf  = source ;
        stack.push(pair);
        while(!stack.isEmpty())
        {
            Pair rmpair  = stack.pop();
            processed.put(rmpair.vname, true);
            if (!processed.containsKey(rmpair.vname))
            {
                continue;
            }
            if (containEdge(rmpair.vname , destination))
            {
                System.out.println(rmpair.psf + destination);
                return true ;
            }
            Vertex vttx = vertices.get(rmpair.vname);
            ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
            for (String neigh : neibr) {
                if (!processed.containsKey(neigh))
                {
                    Pair pair1 = new Pair();
                    pair1.vname = neigh ;
                    pair1.psf  = rmpair.psf + neigh ;
                    stack.add(pair1);
                }
            }

        }

        return false ;

    }



    public void  bft()
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();

         ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        for (String key : keys) {

            if (processed.containsKey(key))
            {
                continue;
            }


            Vertex vtx = vertices.get(key);
            ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
            Queue<Pair>  queue = new LinkedList<>();
            Pair pair = new Pair();
            pair.vname = key;
            pair.psf  = key ;
            queue.add(pair);


            while(!queue.isEmpty())
            {


                Pair rmpair  = queue.remove();
                if (processed.containsKey(rmpair.vname))
                {
                    continue;
                }
                processed.put(rmpair.vname, true);

                System.out.println(rmpair.vname  + " via "  + rmpair.psf);
                Vertex vttx = vertices.get(rmpair.vname);
                ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
                for (String neigh : neibr) {
                    if (!processed.containsKey(neigh))
                    {
                        Pair pair1 = new Pair();
                        pair1.vname = neigh ;
                        pair1.psf  = rmpair.psf + neigh ;
                        queue.add(pair1);
                    }
                }

            }



        }


    }

    public void dft()
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();


        ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        for (String key : keys) {

            if (processed.containsKey(key)) {
                continue;
            }

            Vertex vtx = vertices.get(key);
            ArrayList<String> nbeigh = new ArrayList<>(vtx.neighb.keySet());
            Stack<Pair> stack = new Stack<>();
            Pair pair = new Pair();
            pair.vname = key;
            pair.psf = key;
            stack.push(pair);
            while (!stack.isEmpty()) {
                Pair rmpair = stack.pop();
                if (processed.containsKey(rmpair.vname)) {
                    continue;
                }
                processed.put(rmpair.vname, true);
                System.out.println(rmpair.vname + " via " + rmpair.psf);

                Vertex vttx = vertices.get(rmpair.vname);
                ArrayList<String> neibr = new ArrayList<>(vttx.neighb.keySet());
                for (String neigh : neibr) {
                    if (!processed.containsKey(neigh)) {
                        Pair pair1 = new Pair();
                        pair1.vname = neigh;
                        pair1.psf = rmpair.psf + neigh;
                        stack.add(pair1);
                    }
                }

            }

        }

    }


    public boolean  isCyclic()
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();

        ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        for (String key : keys) {

            if (processed.containsKey(key))
            {
                continue;
            }


            Vertex vtx = vertices.get(key);
            ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
            Queue<Pair>  queue = new LinkedList<>();
            Pair pair = new Pair();
            pair.vname = key;
            pair.psf  = key ;
            queue.add(pair);


            while(!queue.isEmpty())
            {


                Pair rmpair  = queue.remove();
                if (processed.containsKey(rmpair.vname))
                {
                    return true;
                }
                processed.put(rmpair.vname, true);

                Vertex vttx = vertices.get(rmpair.vname);
                ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
                for (String neigh : neibr) {
                    if (!processed.containsKey(neigh))
                    {
                        Pair pair1 = new Pair();
                        pair1.vname = neigh ;
                        pair1.psf  = rmpair.psf + neigh ;
                        queue.add(pair1);
                    }
                }

            }



        }
         return false ;

    }





    public boolean  isConnected()
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();
         int flag =0;
        ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        for (String key : keys) {

            if (processed.containsKey(key))
            {
                continue;
            }
            flag++ ;

            Vertex vtx = vertices.get(key);
            ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
            Queue<Pair>  queue = new LinkedList<>();
            Pair pair = new Pair();
            pair.vname = key;
            pair.psf  = key ;
            queue.add(pair);


            while(!queue.isEmpty())
            {


                Pair rmpair  = queue.remove();
                if (processed.containsKey(rmpair.vname))
                {
                   continue;
                }
                processed.put(rmpair.vname, true);

                Vertex vttx = vertices.get(rmpair.vname);
                ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
                for (String neigh : neibr) {
                    if (!processed.containsKey(neigh))
                    {
                        Pair pair1 = new Pair();
                        pair1.vname = neigh ;
                        pair1.psf  = rmpair.psf + neigh ;
                        queue.add(pair1);
                    }
                }

            }



        }

        if (flag>=2)
        {
            return false ;
        }
        else
        {
            return true ;
        }


    }

    public boolean isTree()
    {
        return !isCyclic() && isConnected() ;
    }

    public void  getConnectedComponent()
    {
        HashMap<String ,Boolean> processed  =new HashMap<>();
        ArrayList<String > keys = new ArrayList<>(vertices.keySet());
        ArrayList<ArrayList> graphcomponent = new ArrayList<>();
        for (String key : keys) {

            if (processed.containsKey(key))
            {
                continue;
            }
            ArrayList<String > connectedelement = new ArrayList<>();
            graphcomponent.add(connectedelement);
            Vertex vtx = vertices.get(key);
            ArrayList<String> nbeigh  = new ArrayList<>(vtx.neighb.keySet());
            Queue<Pair>  queue = new LinkedList<>();
            Pair pair = new Pair();
            pair.vname = key;
            pair.psf  = key ;
            queue.add(pair);


            while(!queue.isEmpty())
            {


                Pair rmpair  = queue.remove();

                if (processed.containsKey(rmpair.vname))
                {
                    continue;
                }
                processed.put(rmpair.vname, true);
                connectedelement.add(rmpair.vname);
                Vertex vttx = vertices.get(rmpair.vname);
                ArrayList<String > neibr = new ArrayList<>(vttx.neighb.keySet());
                for (String neigh : neibr) {
                    if (!processed.containsKey(neigh))
                    {
                        Pair pair1 = new Pair();
                        pair1.vname = neigh ;
                        pair1.psf  = rmpair.psf + neigh ;
                        queue.add(pair1);
                    }
                }

            }



        }
        System.out.println(graphcomponent);




    }


    private class PrismPair implements Comparable<PrismPair>
    {
        String vname ;
        String stc ;
        int cost;
        public int compareTo(PrismPair pp)
        {
            return  pp.cost  - this.cost ;
        }
    }

    public  Graph Prismtree()
    {
        Graph mst  =new Graph();
        PriorityQueue<PrismPair> heap = new PriorityQueue<>();
        HashMap<String , PrismPair> processed  = new HashMap<>();
        for (String key :vertices.keySet()) {
            PrismPair  nn  =new PrismPair();
            nn.vname= key ;
            nn.stc = null ;
            nn.cost =Integer.MAX_VALUE ;
            heap.add(nn);
            processed.put(key ,nn);
        }
        while(!heap.isEmpty())
        {
            PrismPair pp = heap.remove();
            processed.remove(pp.vname);
            if (pp.stc==null)
            {
                mst.addVertex(pp.vname);
            }
            else
            {
                mst.addVertex(pp.vname);
                mst.addEdge(pp.vname ,pp.stc ,pp.cost);
            }

                Vertex vtx = vertices.get(pp.vname);
            for (String key :vtx.neighb.keySet()) {

                if (processed.containsKey(pp.vname))
            {
                   int oc = processed.get(key).cost ;

                if (oc  > vtx.neighb.get(key))
                {
                    PrismPair onchange = processed.get(key);
                    onchange.cost = vtx.neighb.get(key) ;
                    onchange.stc = pp.vname;
                    heap.comparator();
                }


            }

            }



        }

       return mst ;
    }





   }


