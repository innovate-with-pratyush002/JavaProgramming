import java.io.*;
public class ReadFile{
public static void main(String[] args) throws IOException{
FileReader fr= new FileReader("E:\\gitHub\\JavaCodes\\JavaProgramming\\OPPsProblem\\input.txt.txt");
int ch;
while((ch=fr.read())!= -1){
System.out.print((char) ch);
}
fr.close();
}
}