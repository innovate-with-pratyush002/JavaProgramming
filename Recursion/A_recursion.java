import java.util.Scanner;
public class A_recursion{
    public static void recursion(int n){
        if(n>0){
            System.out.println(n);
            recursion(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        recursion(n);
    }
}