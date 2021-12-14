//7.Java program to print Fibonacci series.

import java.util.*;

class Fibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    int first=0,second=1,third,n;
    System.out.println("Enter the number:");
    n=sc.nextInt();
    
    System.out.print("Fibonacci series"+first+" "+second);
    
    for(int i=2;i<=n;i++)
    {
      third=first+second;
      System.out.print(" "+third+" ");
      first=second;
      second=third;
    }
	}
}
    
