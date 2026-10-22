package Recursion;

public class FunctionalRecursion {
    //sum of first three numbers
    //parametrised recursion - here we use parameter in recursion call 
    public static void fun1(int i ,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }

        fun1(i-1,sum+i);

        

    }

    //functional rec

    public static int fun2(int n){
        int sum=0;
        if(n==0){
            return 0;
        }

       sum= n +fun2(n-1);
       //1+0=1
       //2+1=3
       //3+3=6
       //4+6=10
       //5+10=15 here  it is our final answer
       return sum;



    }

    public static void main(String[] args) {
     
        fun1(5,0);
        System.out.println(fun2(5));
       
    }
}
