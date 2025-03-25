//find the first and last occurance of an element in string
import java.util.Scanner;
public class G_recursion {
    public static int first=-1;
    public static int last=-1;
    public static void findthe(String st,int n,char str){
        if(n==st.length()){
            System.out.println("the first index is:"+first);
            System.out.print("the last index is:"+last);
            return;
        }
        if(st.charAt(n)==str){
            if(first==-1){
                first=n;
            }
        }
        if(st.charAt(n)==str){
            last=n;
        }
        findthe(st,n+1,str);

    }    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("write a string:");
        String st= sc.nextLine();
        System.out.print("enter element:");
        char str=sc.next().charAt(0);
        findthe(st,0,str);
    }
}
