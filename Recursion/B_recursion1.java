//add first n natural number
import java.util.Scanner;
public class B_recursion1{
    public static int addrec(int n){
        
        if(n==0){
            return 0;
        }
        int sumof=n+ addrec(n-1);
        return sumof;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
       System.out.print("the total sum:"+addrec(n));
    }
}