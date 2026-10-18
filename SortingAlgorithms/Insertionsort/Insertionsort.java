package SortingAlgorithms.Insertionsort;

import java.util.Arrays;

public class Insertionsort {

    public static void swap(int []nums,int first,int second){
        int temp=nums[second];
        nums[second]=nums[first];
        nums[first]=temp;
    }

    public static int[] insertionsort(int []arr){

        for(int i=0;i<arr.length-1;i++){
            //here we have to use backward looping
            for(int j=i+1;j>0;j--){
                
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

                else{
                    break;
                }
            }
        }


         return arr;
    }


    public static void main(String [] args){
      int [] nums={23,13,45,34,9};
      int [] nums2={20,10,35,10,25};
    //   System.out.println(Arrays.toString(nums));
    //   System.out.println(Arrays.toString(selectionsort(nums)));
      
      System.out.println(Arrays.toString(nums2));
      System.out.println(Arrays.toString(insertionsort(nums2)));
      


       }

}
