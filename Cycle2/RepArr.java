//Java program to replace an element in an array.

import java.util.*;

class RepArr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,ele,ch;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		
		int A[]=new int[n];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be replaced:");
		ele=sc.nextInt();
		
		System.out.println("Enter the element with which to be replaced:");
		ch=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(A[i]==ele)
			{
				A[i]=ch;
			}
		}
		
		System.out.println("Replaced array is:");
		for(int i=0;i<n;i++)
		{
			Sytem.out.print(A[i]+" ");
		}
		
	}
}
