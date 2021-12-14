//5.Java program to print the sum of first n natural numbers.

import java.util.*;

class NaturalSum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    int n,sum=0;
    System.out.println("Enter the number:");
    n=sc.nextInt();
    
    for(int i=1;i<=n;i++)
    {
      sum+=i;
    }
		
    System.out.println("The sum of first "+n+" natural numbers is:"+sum);
    
  }
}
