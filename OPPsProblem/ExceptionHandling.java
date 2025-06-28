import java.util.Scanner;
public class ExceptionHandling{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.print("enter numerator:");
int nu= sc.nextInt();
System.out.print("enter denominator:");
int de=sc.nextInt();

try{
int result = nu/de;
System.out.println("result is:"+result);
}catch(ArithmeticException e){
System.out.println("Arithmetic Error, dont't take Zero in denominator");
}catch(NumberFormatException e){
 System.out.println("this is numberFormat Error");
}
}
}