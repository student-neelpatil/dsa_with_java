package SortingAlgorithms.Selectionsort;

import java.util.Arrays;

public class Selectionsort {
    public static int [] selectionsort(int[] arr){
        int swappedindex;
       
        for(int i=0;i<arr.length-1;i++){
             swappedindex=0;
            for(int j=1;j<arr.length-i-1;j++){ 
                if(arr[j]>arr[swappedindex]){
                 swappedindex=j;
                 System.out.println(swappedindex);
               }
              
               //swapped greatest element with last index
            }

              //swapped greatest element with last index
               int temp=arr[arr.length-1-i];
               arr[arr.length-1-i]=arr[swappedindex];
               arr[swappedindex]=temp;


        }

        return arr;
    }

     public static void main(String [] args){
      int [] nums={23,13,45,34,9};
      int [] nums2={20,10,35,10,25};
    //   System.out.println(Arrays.toString(nums));
    //   System.out.println(Arrays.toString(selectionsort(nums)));
      
      System.out.println(Arrays.toString(nums2));
      System.out.println(Arrays.toString(selectionsort(nums2)));
      


       }

}
