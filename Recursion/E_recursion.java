//print x^n(stack height is n)
import java.util.Scanner;
public class E_recursion {
    public static int power(int x,int n){
       
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
         int pow= x * power(x,n-1);
         return pow;
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
