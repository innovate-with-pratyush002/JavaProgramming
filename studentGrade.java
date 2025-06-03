import java.util.Scanner;
public class studentGrade {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.print("enter 0 for stop and enter 1 to continue:");
   int n= sc.nextInt();
  if(n==1){
    System.out.print("enter marks:");
    int marks =sc.nextInt();
    if(marks>=90){
        System.out.println("This is Good");
    }
    else if(marks<=89 || marks>=60){
        System.out.println("This is also Good");
    }
    else if(marks<=59 || marks>=0){
        System.out.println("This is Good as well");
    }
  }
  if(n==0){
    System.out.println("Thanks");
  } 
}
}