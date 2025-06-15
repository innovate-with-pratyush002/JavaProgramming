class MyException extends Exception{
MyException(String msg){
super(msg);
}
}
public class CustomError{
public static void main(String[] args){

try{
throw new MyException("this is a custom error");
}catch(MyException e){
System.out.println(e.getMessage());
}
}
} 