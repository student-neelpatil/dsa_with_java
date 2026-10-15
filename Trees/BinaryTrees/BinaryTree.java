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

  // inserting in tree;

  public void BuildTree(Scanner sc){
    System.out.println("Enter the root node");
    int value=sc.nextInt();
    root=new Node(value);
    BuildTree(sc,root);
    
  }

  private void BuildTree(Scanner sc,Node node){
    System.out.println("Do you want to enter the left node "+node.data);
    boolean left=sc.nextBoolean();

    if(left){
      System.out.println("Enter the value of left node "+node.data);
      int val=sc.nextInt();
      node.leftchild=new Node(val);
      BuildTree(sc,node.leftchild);
    }
  

    System.out.println("Do you want to enter the right node "+node.data);
    boolean right=sc.nextBoolean();

    if(right){
      System.out.println("Enter the value of right node "+node.data);
      int val=sc.nextInt();
      node.rightchild=new Node(val);
      BuildTree(sc,node.rightchild);
    }
  } 

  public void display(){

    display(root);
  }

  //because root is our private field so we cant use it outside the class so pass it to function so we dont need to create root and pass to the function

   private void display(Node node){
   System.out.println(node.data + "-->");
   display(node.leftchild);
   display(node.rightchild);
  }

}
