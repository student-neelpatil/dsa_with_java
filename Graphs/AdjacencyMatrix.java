package Graphs;



public class AdjacencyMatrix {
    private int[][] matrix;
    private int vertices;

    public AdjacencyMatrix(int n) {
        vertices=n;
        matrix= new int[n][];

        for(int i=0;i<vertices;i++){
            matrix[i]=new int[n];
        }
     }

    public void getList() {
        for(int i=0;i<vertices;i++){
            System.out.print(i+1+"th row : ");
            for(int j=0;j<vertices;j++){
                 System.out.print(" "+this.matrix[i][j]+",");
            }

            System.out.println("");
            System.out.println("-----------------------------");

        }
    }




    

    public void addEdge(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
    }

    public static void main(String[] args) {

        
        AdjacencyMatrix adj=new AdjacencyMatrix(4);

       


        adj.addEdge( 1 ,2);
        adj.addEdge( 2,3);
        adj.addEdge( 3, 1);
        

        adj.getList();
        

    }
}
