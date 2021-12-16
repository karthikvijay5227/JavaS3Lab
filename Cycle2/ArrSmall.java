//Java program to find the smallest element in an array.

import java.util.*;

class ArrSmall
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		
		int A[]=new int[n];
		System.out.println("Enter the elements:");
		
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int small=A[0];
		for(int i=0;i<n;i++)
		{
			if(A[i]<small)
			{
				small=A[i];
			}
		}
		
		System.out.println("The smallest element is:"+small);
		
	}
}
