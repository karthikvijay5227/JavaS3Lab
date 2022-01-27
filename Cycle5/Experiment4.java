import java.io.*;
import java.util.*;
class Experiment4
{
 public static void main(String args[])throws Exception
 {
  FileInputStream fin=new FileInputStream("Exp4.txt");
  String a;
  int i,s=0;
  while((i=fin.read())!=-1)
  {
   System.out.print((char)i);
   a=Character.toString((char)i);
   StringTokenizer st=new StringTokenizer(a);
   while(st.hasMoreTokens())
   {
    a=st.nextToken();
    int b=Integer.parseInt(a);
    s+=b;
   }
  }
  System.out.format("The sum of numbers in file is:%d",s);
  
 }
}
