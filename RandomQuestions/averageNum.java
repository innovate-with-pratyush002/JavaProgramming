import java.util.Scanner;
 public class averageNum{
    public static void average(float a,float b,float c){
        float ave= (a+b+c)/3;
        System.out.print("the average is:");
        System.out.print(ave);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        float a=sc.nextFloat();
        System.out.print("enter second num:");
        float b=sc.nextFloat();
        System.out.print("enter third num:");
        float c=sc.nextFloat();
        average(a,b,c);
    }
 }
