import java.util.*;
public class pairsInAnArray{
    public static void pairsOfArray(int arr[]){
        System.out.println("the pairs of the arrays:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of array element:");
        int n= sc.nextInt();
        int arr[]= new int[n];
                System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pairsOfArray(arr);
    }
}