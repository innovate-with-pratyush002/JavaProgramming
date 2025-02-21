import java.util.Scanner;
public class linearsearch{
    public static void display(int arr[],int n){
        System.out.print("the array element:");
        for(int i=0;i<n;i++){
            System.out.print("\t"+arr[i]);
        }
    }
    public static int linearsearching(int arr[],int n,int element){
        for(int i=0;i<n;i++){
            if(arr[i]== element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("enter number of index:");
       int n= sc.nextInt();
       System.out.print("enter searching element:");
       int element= sc.nextInt();
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
        System.out.print("enter array element:");
        arr[i]=sc.nextInt();
       }
       display(arr,n);
       System.out.println();
       System.out.print("the searching element is in the index:"+linearsearching(arr,n,element));
    }
}
