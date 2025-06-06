import java.util.Scanner;
public class greater {
    public static void greaterNum(int a,int b){
        if(a>b){
            System.out.print("greater number is:"+a);
        }
        else{
            System.out.println("greater number is:"+b);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number:");
        int a= sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        greaterNum(a,b);
    }
}
