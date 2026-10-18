package SortingAlgorithms.Bubblesort;

import java.util.Arrays;

public class Bubblesort {
    
    public static int[] bubblesort(int[]arr){
     
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;

            //why j is from 0 to <arr.length-i-1 beacuse we comapare element with next element so when we reach at last level 
            // we dont have element remain to compare so it wil give me index out of bound error


            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            //it is used if our array is sorted in first pass  so we can break out

            if(!swapped){
                break;
            }


        }

        return arr;
    }


   public static void main(String [] args){
      int [] nums={23,13,45,34,9};
      System.out.println(Arrays.toString(nums));
      System.out.println(Arrays.toString(bubblesort(nums)));
      


       }
}
