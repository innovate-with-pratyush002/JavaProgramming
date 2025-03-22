//print a reverce string of given string 
import java.util.Scanner;
public class F_recursion {
    public static void reverce(String st,int n){
      if(n<0){
        return;
      }
      System.out.print(st.charAt(n));
       reverce(st,n-1);
      

    }
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("write a string here:");
       String st= sc.nextLine();
        int n= st.length();
        reverce(st,n-1);
    
   } 
}
