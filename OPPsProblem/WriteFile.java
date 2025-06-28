import java.io.*;
public class WriteFile{
public static void main(String[] args) throws IOException{
        FileReader fr= new FileReader("E:\\gitHub\\JavaCodes\\JavaProgramming\\OPPsProblem\\input.txt.txt");
        FileWriter fw= new FileWriter("E:\\gitHub\\JavaCodes\\JavaProgramming\\OPPsProblem\\output.txt.txt");

int ch;
while((ch=fr.read())!=-1){
   fw.write(ch);
}
fr.close();
fw.close();
System.out.print("File is copied");
}
}