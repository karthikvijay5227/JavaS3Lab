//8.Java program to print factorial of first n numbers.

import java.util.*;

class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,fact=1;
		
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		
		System.out.println("The factorial is:"+fact);
		
	}
}
