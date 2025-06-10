interface Circleshape{
    double pi= 3.14;
   void perimeter();
   double area();
}

class circle implements Circleshape{
double radius;

circle(double r){
radius=r;
}
 
 public void perimeter(){
System.out.println("perimeter is:"+2*pi*radius);
}

public double area(){
return pi*radius*radius;
}

public static void main(String[] args){
circle c= new circle(3);
c.perimeter();

System.out.println("area is:"+c.area());
}
}
