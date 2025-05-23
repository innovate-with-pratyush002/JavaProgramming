import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     System.out.print("enter n:"); 
     int n= sc.nextInt();
     
     for(int i=1;i<=n;i++){
      for(int j=1;j<=n+1-i;j++){
        System.out.print(" ");
      }
      for(int s=1;s<=i;s++){
        System.out.print(" *");
        
      }
      for(int d=1;d<=n+1-i;d++){
        System.out.print(" ");
      }
      System.out.println();
     }
           
      
       
    }
}
