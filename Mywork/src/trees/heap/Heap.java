package trees.heap;

import java.util.ArrayList;

public class Heap {
      ArrayList<Integer> arr = new ArrayList<>();



      public void addNode(int val)
      {
          arr.add(val);
          upheap(arr.size()-1);
      }

      public void upheap(int index)
      {
          if (index==0)
          {
              return ;
          }
          int pi = (index -1 )/2 ;
          if (arr.get(pi) > arr.get(index))
          {
              swap(pi ,index);
          }
      }
      private void  swap(int i ,int j)
      {
          int temp = arr.get(i);
          int k = arr.get(j);
          arr.set(i,k);
          arr.set(j,temp);
      }
      public void display()
      {
          System.out.println(arr);
      }
     public int remove()
     {
         swap(0 ,arr.size()-1);
         int rev = arr.remove(arr.size() -1);
         downheap(0);
         return rev ;
     }

    private void downheap(int i) {
          int left = 2*i + 1 ;
          int right = 2*i + 2 ;
          int min = i;
          if(left < arr.size() && arr.get(min) > arr.get(left))
          {
              min = left ;
          }
        if(right < arr.size() && arr.get(min) > arr.get(right))
        {
            min = right ;
        }

        if (min!=i)
        {
            swap(min,i);
            downheap(min);
        }
    }
}
