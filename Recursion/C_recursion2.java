//factorial of a number
import java.util.*;
public class C_recursion2 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int result= n*factorial(n-1);
        return result;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        System.out.println("the factorial is:"+factorial(n));

    }
}
