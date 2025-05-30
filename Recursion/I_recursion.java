////print x^n(stack height is logn)
import java.util.Scanner;
public class I_recursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            int m= power(x,n/2)* power(x,n/2);
            return m;
        }
        //if n is odd
        else{
            int m= power(x,n/2)* power(x,n/2)*x;
            return m;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter x:");
        int x=sc.nextInt();
        System.out.print("enter n:");
        int n= sc.nextInt();
       System.out.print(power(x,n));
    }
}
