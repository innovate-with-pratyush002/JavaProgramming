import java.util.*;
public class binarySearch{
   public static int binary(int arr[],int num){
    int start=0;
    int end= arr.length-1;
    while(start<=end){
         int mid= (start+end)/2;
           if(num==arr[mid]){
            return mid;
           }
           if(num<arr[mid]){
               end=mid-1;
           }
           else{
            start=mid+1;
           }
            
    }
    return -1;
   }  
    public static void main(String[] args){
        //for binary search we can take only sorted array
        int arr[]={11,12,13,14,15,16,17};
    int ind=binary(arr,13);
    if(ind==-1){
        System.out.println("The number does not exist");
    }
    else{
        System.out.println("The index is:"+ ind);
    }
    }
}