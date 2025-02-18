import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n =sc.nextInt();
        int rev =0;
        int ori =n;
        for(int i=1;n!=0;i++){
            rev = rev*10 + n%10;
            n=n/10;
        }
        if(ori == rev){
            System.out.print(rev+" "+"is a palindrome number");
        }
        else{
            System.out.print("number is not palindrome");
        }
    }
}
