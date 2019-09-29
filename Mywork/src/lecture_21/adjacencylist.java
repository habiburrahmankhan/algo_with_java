package lecture_21;

import java.util.*;

public class adjacencylist<T> {

    private LinkedList<vertex> vertices ;

    public adjacencylist() {
        this.vertices = new LinkedList<>() ;
    }
    public void addvertex(T value)
    {
        vertices.add(new vertex(value)) ;
    }

    public class vertex
    {
        private  T value ;
        private LinkedList<vertex> neighbours ;

        public vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }

    public void addedge(T first , T second)
    {
        vertex f= get(first);
        vertex s= get(second);
        if (f!=null &&  s!=null)
        {
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }
    public vertex get(T value)
    {
        for (vertex vertex :vertices) {
            if (vertex.value.equals(value))
            {
                return vertex ;
            }
        }
        return null ;
    }
    public void display()
    {
        for (vertex vertex:vertices) {
            System.out.print(vertex.value + "  =>  ");
            for (vertex parosi:vertex.neighbours) {
                System.out.print(parosi.value + "    ");
            }
            System.out.println();
        }
    }
    public void bfs()
    {
        Set<vertex> set = new HashSet<>();
        Queue<vertex> q = new LinkedList();
        vertex v = vertices.get(0);
        set.add(v);
        q.add(v);
        while (!q.isEmpty())
        {
            vertex front = q.remove();
            System.out.println(front.value);
            for (vertex parosi:front.neighbours) {
                if (!set.contains(parosi))
                {
                    set.add(parosi);
                    q.add(parosi);
                }
            }

        }
    }
    public boolean bfssearch( T value)
    {
        Set<vertex> set = new HashSet<>();
        Queue<vertex> q = new LinkedList();
        vertex v = vertices.get(0);
        set.add(v);
        q.add(v);
        while (!q.isEmpty())
        {
            vertex front = q.remove();
            if(front.value.equals(value))
            {
               return true;
            }
            for (vertex parosi:front.neighbours) {
                if (!set.contains(parosi))
                {
                    set.add(parosi);
                    q.add(parosi);
                }
            }

        }
        return false ;
    }

    public void level()
    {
        Set<vertex> set = new HashSet<>();
        Queue<vertex> q = new LinkedList();

        vertex v = vertices.get(0);
        set.add(v);
        q.add(v);
        q.add(null);
        int level = 0 ;
        while (!q.isEmpty())
        {
            vertex front = q.remove();
            if(front==null)
            {
                q.add(null);
                level++;
                continue;
            }
                System.out.println(front.value + "  level " + level);

            for (vertex parosi:front.neighbours) {
                if (!set.contains(parosi))
                {
                    set.add(parosi);
                    q.add(parosi);
                }
            }

        }
    }
    public boolean bipartite()
    {
        Set<vertex> set = new HashSet<>();
        Queue<vertex> q = new LinkedList();
        Set<vertex> red = new HashSet<>();
        Set<vertex> green = new HashSet<>();
        vertex v = vertices.get(0);
        set.add(v);
        q.add(v);
        red.add(v);
        while (!q.isEmpty())
        {
            vertex front = q.remove();
            if (red.contains(front))
            {
                for (vertex parosi:front.neighbours) {
                    if (!set.contains(parosi))
                    {
                        set.add(parosi);
                        q.add(parosi);
                        green.add(front);
                    }
                    else
                    {
                        if (red.contains(parosi))
                        {
                            return false;
                        }
                    }
                }
            }
            if (green.contains(front))
            {
                for (vertex parosi:front.neighbours) {
                    if (!set.contains(parosi))
                    {
                        set.add(parosi);
                        q.add(parosi);
                        red.add(front);
                    }
                    if (green.contains(parosi))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void dfs()
    {
        Set<vertex> set = new HashSet<>();
        Stack<vertex> st = new Stack<>();
        vertex v = vertices.get(0);
        set.add(v);
        st.push(v);
        while (!st.isEmpty())
        {
            vertex front = st.pop();
            System.out.println(front.value);
            for (vertex parosi:front.neighbours) {
                if (!set.contains(parosi))
                {
                    set.add(parosi);
                    st.add(parosi);
                }
            }

        }
    }

}
