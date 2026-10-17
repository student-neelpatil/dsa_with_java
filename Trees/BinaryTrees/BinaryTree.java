package Trees.BinaryTrees;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

public void insert(Scanner sc) {
    System.out.println("do u want to insert node");
    boolean isInsert = sc.nextBoolean();

    if (isInsert) {
        System.out.println("enter the value of node you want to insert in binary tree");
        int value = sc.nextInt();

        if (root == null) {
            root = new Node(value);
            return;
        }
        insert(sc, root, value);
    }

    return;
}

private void insert(Scanner sc, Node node, int value) {
    if (node == null) {
        return;
    }

    System.out.println("do u want to insert on left of node " + node.data);
    boolean left = sc.nextBoolean();

    if(node.leftchild!=null){
      System.out.println("oh sorry it is alredy full move to next node");
      insert(sc, node.leftchild, value);
      return;
    } 

    if (left && node.leftchild == null) {
        System.out.println("Inserting as left child of node " + node.data);
        node.leftchild = new Node(value);
        return;
    } 
        
    

    System.out.println("do you want to insert right node " + node.data);
    boolean right = sc.nextBoolean();

    if(node.rightchild!=null){
      System.out.println("oh sorry it is alredy full move to next node");
    } 

    if (right && node.rightchild == null) {
        System.out.println("inserting as right child of node " + node.data);
        node.rightchild = new Node(value);
        return;
    } else if (right && node.rightchild != null) {
        insert(sc, node.rightchild, value);
        return;
    }

    System.out.println("insertion cancelled"+ node.data);
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


 //---------------------------------------------------------------------------------------------------------------
 
 //BFS-breadth first traversal

 //return the list of all the nodes traverse using bfs

 public ArrayList<Integer> bfs(){
     return bfs(root);
 }

 public ArrayList<Integer>bfs(Node node){
  ArrayList<Integer>arr=new ArrayList<>();
  Queue<Node>queue=new LinkedList<>();

  if(root==null){
    return arr;
  }


  while(!queue.isEmpty()){
   
    queue.offer(node);
    int currentlevel=queue.size();

    for(int i=0;i<currentlevel;i++){
       node=queue.poll();
       arr.add(node.data);

       if(node.leftchild!=null){
          queue.offer(node.leftchild);
       }
       if(node.rightchild!=null){
        queue.offer(node.rightchild);

       }
    }
} 

  return arr;


 }

}
