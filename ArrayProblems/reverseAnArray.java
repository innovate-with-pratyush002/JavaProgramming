import java.util.*;
public class reverseAnArray{
   public static void reverse(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
        }
        System.out.print("The reverse array is:");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of array element:");
        int n= sc.nextInt();
        int arr[]= new int[n];
                System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
    }
}