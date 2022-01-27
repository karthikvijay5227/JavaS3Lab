import java.io.*;
class Experiment2
{
 public static void main(String args[])
 {
  try
  {
   FileInputStream fin=new FileInputStream("Exp2.txt");
   int i,c=0,l=0,w=0;
   while((i=fin.read())!=-1)
   {
    c++;
    if(i =='\n')
    {
     l++;
    }
    if(i == ' '|| i =='\n')
    {
     w++;
    }
   }
   System.out.format("The file contains %d characters,%d lines and %d words",c,l,w);
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
