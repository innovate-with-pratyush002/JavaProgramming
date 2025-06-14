import java.util.Scanner;

class Complex{
   int real;
   int img;
  
 Complex(int r,int i){
     real=r;
     img=i;
}
 Complex add(Complex c){
   return new Complex(this.real+c.real, this.img+c.img);
}

 Complex subtract(Complex c){
   return new Complex(this.real-c.real, this.img-c.img);
}

 Complex multiply(Complex c){
   return new Complex(this.real*c.real - this.img*c.img, this.real*c.img+c.real*this.img);
}

 void display(){
  System.out.println(real+"+"+img+"i");  
}


public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

System.out.print("enter first real and img numbers:");
Complex c1= new Complex(sc.nextInt(),sc.nextInt());

System.out.print("enter second real and img numbers:");
Complex c2= new Complex(sc.nextInt(),sc.nextInt());

Complex sum= c1.add(c2);
Complex sub= c1.subtract(c2);
Complex mul= c1.multiply(c2);

System.out.println("the sum is:");
sum.display();
System.out.println("the subtract is:");
sub.display();
System.out.println("the multiply is:");
mul.display();

}
}