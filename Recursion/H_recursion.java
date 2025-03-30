// Check if an array is sorted(strictely increasing)
import java.util.Scanner;
public class H_recursion {
    public static void checkarr(int arr[],int a){
       if(a==arr.length-1){ 
      System.out.println("true");
      return;
       }
       if(arr[a]<arr[a+1]){
         checkarr(arr,a+1);
       }
       else{
       System.out.println("false");
       }   
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of indexes:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
             System.out.print("enter aaray element:");
             arr[i]=sc.nextInt();
        }
        checkarr(arr,0);
       
    }
}
