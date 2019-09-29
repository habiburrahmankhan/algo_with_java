package hackerblock;
import java.util.*;
public class BinarytreeLevelOrder_ZigZag {



    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BinarytreeLevelOrder_ZigZag bt = new BinarytreeLevelOrder_ZigZag();
        bt.levelOrderZZ();
    }
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinarytreeLevelOrder_ZigZag() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }


        public void levelOrderZZ()
        {
          Stack<Node> stk1 = new Stack<>();
          Stack<Node> stk2 = new Stack<>();
          stk1.push(this.root);

          while(!stk1.isEmpty())
          {
              Node rv = stk1.pop();
              System.out.print(rv.data + " ");
              if (rv.left!=null)
              {
                  stk2.push(rv.left);
              }
              if (rv.right!=null)
              {
                  stk2.push(rv.right);
              }
              while(!stk2.isEmpty())
              {
                  rv = stk2.pop();
                  System.out.print(rv.data + " ");
                  if (rv.right!=null)
                  {
                      stk1.push(rv.right);
                  }
                  if (rv.left!=null)
                  {
                      stk1.push(rv.left);
                  }
              }
          }

        }
    }