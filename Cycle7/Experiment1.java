import java.util.*;
import java.lang.*;
class Square extends Thread
{
	int n;	
	Square(int n)
	{
		this.n=n;
	}	
    public void run()
  	{
  	     int a=(int)Math.pow(this.n,2);	
	     System.out.println("Square is:"+a);
  	} 
}
class Cube extends Thread
{
	int n;
	Cube(int n)
	{
		this.n=n;
	}
	public void run()
	{
	     int b=(int)Math.pow(this.n,3);
	     System.out.println("Cube is:"+b);
	}
}

class Calc extends Thread
{
	public void run()
	{
	  Scanner sc=new Scanner(System.in);
	  int n;
	  System.out.print("Enter no of times to do:"); 
	  n=sc.nextInt();

	  System.out.print("Enter the range of random numbers:");
	  int range=sc.nextInt();

	  Random r=new Random();
	  for(int I=0;I<n;I++)
	  {
   	   int x=r.nextInt(range);
   	   System.out.println();
 	   System.out.println("The random number is:"+x);
   	   if(x%2==0)
  	   {
		Square s=new Square(x);
	 	s.start();
  	   }
 	   else
           {
    	        Cube cu=new Cube(x);
    	        cu.start();
           }
           try
           {
                Thread.sleep(1000);
           }
           catch(Exception e)
           {
                System.out.println(e);
           }
         }     
       }
}	
 public class Experiment1
 {
	public static void main(String[] args)throws Exception 
	{
		Calc c=new Calc();
		c.start();
	}
}
