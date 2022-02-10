import java.util.*;
class ThreadingEg extends Thread
{
 static int a;
 public void run()
 {
  try
  {
   for(int i=1;i<=a;i++)
   {
    System.out.println(i);
    Thread.sleep(110);
   }
  }catch(Exception e)
  {
   System.out.println(e);
  }
 }
   
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  a=sc.nextInt();
  ThreadingEg e1=new ThreadingEg();
  ThreadingEg e2=new ThreadingEg();
  ThreadingEg e3=new ThreadingEg();
  e1.start();
  e2.start();
  e3.start();
 }
}
