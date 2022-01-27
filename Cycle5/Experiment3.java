import java.io.*;
import java.util.*;
class Experiment3
{
 public static void main(String args[])throws Exception
 {
  Scanner sc=new Scanner(System.in);
  FileWriter f=new FileWriter("Exp3.txt");
  String name,addr;
  System.out.println("Enter your name:");
  name=sc.nextLine();
  System.out.println("Enter your address:");
  addr=sc.nextLine();
  f.write(name);
  f.write("\n"+addr);
  f.close();
  
  FileReader r=new FileReader("Exp3.txt");
  int i;
  while((i=r.read())!=-1)
  {
   System.out.print((char)i);
  }
  r.close();
 }
}
  
