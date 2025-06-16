class Cylinder{
  double radius;
  double height;

 Cylinder(){
  radius=height=0;
}
Cylinder(double r, double h){
    radius=r;
   height =h;
}
Cylinder(double s){
   radius=height=s;
}
double display(){
 return 3.14* radius*radius*height;
}

public static void main(String[] args){
  Cylinder c= new Cylinder(2,3);
  System.out.print("the volume is:"+  c.display());
      
}
}