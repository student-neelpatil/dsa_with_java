package Trees.BinaryTrees;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        BinaryTree bt=new BinaryTree();
        Scanner scanner=new Scanner(System.in);

        bt.BuildTree(scanner);
        bt.display();
        bt.insert(scanner);
        bt.display();
        System.out.println(bt.bfs());


       

    }
}
