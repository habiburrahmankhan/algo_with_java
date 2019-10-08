package tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {

          private class Node
          {
              char data ;
              HashMap<Character ,Node > Children  ;
              boolean isTerminal ;
              public Node(char data , boolean isTerminal)
              {
                 this.data = data;
                 this.isTerminal = isTerminal ;
                 this.Children = new HashMap<>();
              }
          }

         private Node root ;
          private  int numOfWord;
          Tries()
          {
              root = new Node('\0', false);
              numOfWord = 0 ;
          }
          public int getNumOfWord()
          {
              return this.numOfWord;
          }

          public  void addWord( String str)
          {
              addWord( this.root,  str);
          }

    private void addWord(Node parent, String str) {
                if (str.length()==0)
                {
                    if (!parent.isTerminal)
                    {
                        parent.isTerminal = true;
                        this.numOfWord++ ;
                    }
                    return;
                }
              char cc  = str.charAt(0);
                String ros = str.substring(1);
                Node child = parent.Children.get(cc) ;
                if (child==null)
                {
                     child= new Node(cc , false);
                    parent.Children.put(cc , child);
                }
                addWord(child ,ros);

    }


    public void display()
    {
        display(this.root , "");
    }

    private void display(Node node,String osf) {
               if (node.isTerminal)
               {
                   String todisplay = osf.substring(1) + node.data ;
                   System.out.println(todisplay);
               }
        Set<Map.Entry<Character , Node >> entries=  node.Children.entrySet();
        for (Map.Entry<Character , Node > entry : entries) {
          this.display(entry.getValue() , osf+node.data);
        }
    }
    public boolean search(String word)
    {
        return search(this.root , word);
    }

    private boolean search(Node node,String word ) {
        if (word.length()==0)
        {
           if (node.isTerminal)
           {
               return true;
           }
           else
           {
               return false ;
           }

        }
              char cc =word.charAt(0);
              String ros =word.substring(1);
              Node child = node.Children.get(cc);
              if (child==null)
              {
                  return false ;
              }
              else
              {
                return   search(child , ros);
              }


    }

}
