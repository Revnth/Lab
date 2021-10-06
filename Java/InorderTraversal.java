
import java.io.*;
import java.util.*;

class Node {
  int data;
  Node lchild;
  Node rchild;

  public Node(int d) {
    data = d;
    lchild = rchild = null;
  }

  public void displayNode() {
    System.out.println(data);
  }
}

class Tree {
  public Node root;

  public Tree() {
    root = null;
  }

  // insert
  public void insert(int d) {
    Node newNode = new Node(d);
    if (root == null) {
      root = newNode;
    } else {
      Node cur = root;
      Node parent;
      while (true) {
        parent = cur;
        if (d < cur.data) {
          cur = cur.lchild;
          if (cur == null) {
            parent.lchild = newNode;
            return;
          }
        } else {
          cur = cur.rchild;
          if (cur == null) {
            parent.rchild = newNode;// equal values in right side
            return;
          }
        }
      }

    }

  }

  // search
  public void search(int key) {
    Node current = root;
    while (current.data != key) {
      if (key < current.data)
        current = current.lchild;
      else
        current = current.rchild;
    }
    if (current == null)
      System.out.println("ELEMENT NOT FOUND!!");
    else
      current.displayNode();

  }

  // recursive traversal
  public void traversal() {
    System.out.println("INORDER TRAVERSAL");
    inOrder(root);
    System.out.println("PREORDER TRAVERSAL");
    preOrder(root);
    System.out.println("POSTORDER TRAVERSAL");
    postOrder(root);
  }

  // Inorder(LDR)
  public void inOrder(Node localRoot) {

    if (localRoot != null) {
      inOrder(localRoot.lchild);
      localRoot.displayNode();
      inOrder(localRoot.rchild);
    }
  }

  // preorder(DLR)
  public void preOrder(Node localRoot) {
    if (localRoot != null) {
      localRoot.displayNode();
      preOrder(localRoot.lchild);
      preOrder(localRoot.rchild);

    }
  }

  // postorder(LRD)
  public void postOrder(Node localRoot) {
    if (localRoot != null) {
      postOrder(localRoot.lchild);
      postOrder(localRoot.rchild);
      localRoot.displayNode();
    }
  }
}

class traversal {

  public static void main(String[] args) {
    int x, data;
    Tree obj = new Tree();
    Scanner sc = new Scanner(System.in);
    System.out.println("TREE");

    do {
      System.out.println("1.INSERT");
      System.out.println("2.TREE TRAVERSAL");
      System.out.println("3.SEARCH");

      x = sc.nextInt();
      switch (x)

      {
        case 1:
          System.out.println("Enter element to be inserted");
          data = sc.nextInt();
          obj.insert(data);
          break;
        case 2:
          obj.traversal();
          break;
        case 3:
          System.out.println("Enter element to be searched");

          data = sc.nextInt();
          obj.search(data);

        default:
          System.out.println("Invalid Input");
      }

    } while (x == 1 || x == 2);
  }

}
