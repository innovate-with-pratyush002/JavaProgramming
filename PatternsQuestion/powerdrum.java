import java.util.Scanner;
public class powerdrum{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
 System.out.print("enter n:");
 int n= sc.nextInt();
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(" *");
    }
    for(int k=1;k<2*(n+1-i);k++){
    System.out.print("  ");
    }
    for(int l=1;l<=i;l++){
        System.out.print("* ");
    }
    System.out.println();
  }
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n+1-i;j++){
        System.out.print(" *");
    }
    for(int k=1;k<2*(i);k++){
    System.out.print("  ");
    }
    for(int l=1;l<=n+1-i;l++){
        System.out.print("* ");
    }
    System.out.println();
  }


}



}