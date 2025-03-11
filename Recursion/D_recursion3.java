//print fibonacci sequence till n;
import java.util.*;
public class D_recursion3 {
    public static void fibonacci(int a,int b,int n){
        if(n==2){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);  
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("enter a number:");
       int n= sc.nextInt();
       int a=0,b=1;
       System.out.println(a);
        System.out.println(b);
       fibonacci(a,b,n);
    }
}
