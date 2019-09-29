package lecture_18;

public class genericbinarysearchtree <T extends Comparable<T>> {
    public Node root;

    private class Node {
        T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    public Node populate(T value) {
        return this.root = populate(root, value);
    }

    public Node populate(Node node, T value) {
        System.out.println("Enter the value of node");
        if (node == null) {
            return new Node(value);
        } else if (node.value.compareTo(value) > 0) {
            node.left = populate(node.left, value);
        } else {
            node.right = populate(node.right, value);
        }

        return node;
    }

    public void display() {
        display(root, "", "root");

    }

    private void display(Node node, String s, String root1) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + s + root1);
        display(node.left, s + "\t", "left");
        display(node.right, s + "\t", "right");
    }

    public boolean find(T value) {
        return find(root, value);
    }
//    private boolean find(Node node ,int value)
//    {
//        if (node==null)
//        {
//            return false ;
//        }
//        return (node.value==value|| find(node.left ,value) || find(node.right , value));
//
//    }

    private boolean find(Node node, T value) {
        if (node == null) {
            return false;
        } else if (node.value.compareTo(value) == 0) {
            return true;
        } else if (node.value.compareTo(value) < 0) {
            return find(node.left, value);
        } else if (node.value.compareTo(value) > 0) {
            return find(node.right, value);
        }

        return false;

    }

    public Node findNode(T value) {
        return findNode(root, value);
    }


    private Node findNode(Node node, T value) {
        if (node == null) {
            return null;
        } else if (node.value.compareTo(value) == 0) {
            return node;
        } else if (node.value.compareTo(value) < 0) {
            return findNode(node.left, value);
        } else if (node.value.compareTo(value) > 0) {
            return findNode(node.right, value);
        }
        return node;

    }
}


