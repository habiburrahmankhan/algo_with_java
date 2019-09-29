package lecture_20;

import java.util.ArrayList;

public class heap<T extends Comparable<T> > {
    private ArrayList<T> list;
    public heap()
    {
        this.list = new ArrayList<>();
    }
    public int parent(int index)
    {
        return (index -1)/2;
    }
    public int right(int index)
    {
        return (2*index)+2;
    }
    public int left(int index)
    {
        return ((2*index) +1);
    }
    public void insert(T value)
    {

        list.add(value);
        upheap(list.size()-1);
    }
    public T remove()
    {
        T temp = list.get(0);
        list.set(0,list.remove(list.size()-1)) ;
        downheap(0);
        return temp;
    }
    public void upheap(int index)
    {
        if (index==0)
        {
            return;
        }
        int p=parent(index);
        if (list.get(p).compareTo(list.get(index))> 0)
        {
            swap(p,index);
        }
        upheap(p);
    }
    public void display()
    {
        System.out.println(list);
    }
    public void downheap(int index)
    {
       int  min=index ;
        int left =left(index);
        int right  =right(index);

        if ( (left < list.size() && list.get(min).compareTo(list.get(left)) >0 ))
        {
            min=left;
        }
        if ( (right < list.size() &&  (list.get(min).compareTo(list.get(right)) )  >0) )
        {
            min=right;
        }
        if (min!=index)
        {
            swap( min,index);
            downheap(min);
        }



    }
    public void swap(int p, int index)
    {
        T temp=list.get(p);
        list.set(p , list.get(index)) ;
        list.set(index , temp);
    }



}
