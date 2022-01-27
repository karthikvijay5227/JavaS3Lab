import java.io.*;
class Experiment1
{
 public static void main(String args[])throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("Exp1.txt");
   int i,l=0;
   while((i=fin.read())!=-1)
   {
    System.out.print((char)i);
    if((char)i=='\n')
    {
     System.out.println(++l);
    }
   }
   fin.close();
  }
  catch(Exception e){System.out.println(e);}
 }
}
   
