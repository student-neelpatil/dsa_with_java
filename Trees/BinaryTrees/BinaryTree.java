package Trees.BinaryTrees;

import java.util.Scanner;

public class BinaryTree {

  // creating root node
  private Node root;

  private static class Node {
    int data;
    Node leftchild;
    Node rightchild;

    Node(int data) {
      this.data = data;
      this.leftchild = null;
      this.rightchild = null;
    }
  }

  //--------------------------------------------------------------------------------------------------------------

  // inserting in tree;

  public void BuildTree(Scanner sc) {
    System.out.println("Enter the root node");
    int value = sc.nextInt();
    root = new Node(value);
    BuildTree(sc, root);

  }

  private void BuildTree(Scanner sc, Node node) {
    System.out.println("Do you want to enter the left node " + node.data);
    boolean left = sc.nextBoolean();

    if (left) {
      System.out.println("Enter the value of left node " + node.data);
      int val = sc.nextInt();
      node.leftchild = new Node(val);
      BuildTree(sc, node.leftchild);
    }

    System.out.println("Do you want to enter the right node " + node.data);
    boolean right = sc.nextBoolean();

    if (right) {
      System.out.println("Enter the value of right node " + node.data);
      int val = sc.nextInt();
      node.rightchild = new Node(val);
      BuildTree(sc, node.rightchild);
    }
  }
//----------------------------------------------------------------------------------------------------------------

//insert new node in binary tree using recursion based approach

public void insert(Scanner sc){
  System.out.println("enter the value of node  want to insert  in binary tree");
  int value=sc.nextInt();
  root=new Node(value);
  insert(sc,root);

}

private void insert(Scanner sc,Node node){
   if(node==null){
     root=node;
     return;
   }

   System.out.println("do you want to insert on left of node"+ node.data);
   boolean left=sc.nextBoolean();

   if(left && node.leftchild==null){
      System.out.println("enter the value of left node"+node.data);
      int val=sc.nextInt();
      node.leftchild=new Node(val);
      return;
     
      
   }
   else if(left && node.leftchild!=null){
     insert(sc,node.leftchild);
   }

   System.out.println("Do you want to insert right node"+node.data);
   boolean right=sc.nextBoolean();

  if(right && node.rightchild==null){
      System.out.println("enter the value of right node"+node.data);
      int val=sc.nextInt();
      node.rightchild=new Node(val);
      return;
     
      
   }
   else if(right && node.rightchild!=null){
     insert(sc,node.rightchild);
   }


}



















//--------------------------------------------------------------------------------------------------------------  
  public void display() {

    display(root);
  }



  // because root is our private field so we cant use it outside the class so pass
  // it to function so we dont need to create root and pass to the function

  private void display(Node node) {
    if(node==null){
      return;
    }
    System.out.print(node.data + "-->");
    display(node.leftchild);
    display(node.rightchild);
  }

}
