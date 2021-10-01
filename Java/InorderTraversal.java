/**
 * Inoder traversal of binary tree prints the data as 
 * Left subtree, root , right subtree
 */
public class InorderTraversal {

    static class Node {
        int data;
        Node left, right;
    
        public Node(int data) {
          this.data = data;
          left = null;
          right = null;
        }
    }

    public static void main(String args[]){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left= new Node(4);
        node.left.right= new Node(5);
        node.right.left= new Node(6);
        node.right.right= new Node(7);
        printInorder(node);
    }

    static void printInorder(Node node){
        if(node == null)
        return;
        printInorder(node.left);
        System.out.print(node.data+",");
        printInorder(node.right);
    }

    
}
/*
Input  -      1
            /   \
           2     3
          / \   / \
         4   5  6  7
Output: 4,2,5,1,6,3,7,
*/