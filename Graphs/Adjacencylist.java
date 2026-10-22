package Graphs;

import java.util.ArrayList;
import java.util.Scanner;


public class Adjacencylist{
    
    private ArrayList<ArrayList<Integer>> list;
    private int vertices;

    public Adjacencylist(int n) {
        vertices=n;
        list=new ArrayList<>(n+1);

        for(int i=0;i<=vertices;i++){
            list.add(new ArrayList<>());
        }
      
    }

    public void getList() {
        for(int i=1;i<=vertices;i++){
           System.out.println(i+"--->"+this.list.get(i));
        }
    }




    

    public void addEdge(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public static void main(String[] args) {

        
        Adjacencylist adj=new Adjacencylist(4);

        
       // Scanner sc=new Scanner(System.in);

        // int node1;
        // int node2;
        // System.out.println("Enter node 1");
        // node1=sc.nextInt();

        // System.out.println("Enter node 2");
        // node2=sc.nextInt();


        adj.addEdge( 1 ,2);
        adj.addEdge( 2,3);
        adj.addEdge( 3, 1);
        adj.addEdge(4, 1);

        adj.getList();
        

    }

}
 

