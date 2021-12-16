//Java program to find the sum of elements in an array.

import java.util.*;

class SumArr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		
		int A[]=new int[n];
		System.out.println("Enter the elements:");
		
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
	
		for(int i=0;i<n;i++)
		{
			sum+=A[i];
		}
		
		System.out.println("The sum is:"+sum);
		
	}
}
