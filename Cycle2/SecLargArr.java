//Java program to print second largest element in an array.

import java.util.*;

class SecLargArr
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
		
		int big,big2;
		if(A[0]<A[1])
		{
			big=A[0];
			big2=A[1];
		}
		else
		{
			big=A[1];
			big2=A[0];
		}
		
		for(int i=0;i<n;i++)
		{
			if(A[i]>big)
			{
				big2=big;
				big=A[i];
			}
			else if(A[i]>big2)
			{
				big2=A[i];
			}
		}
		
		System.out.println("The second largest element is:"+big2);
		
	}
}
