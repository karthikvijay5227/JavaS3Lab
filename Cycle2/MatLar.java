//Java program to find the largest element in an N*N matrix.

import java.util.*;

class MatLar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	  int m;
		System.out.println("Enter the size:");
		m=sc.nextInt();
		
		int A[][]=new int[m][m];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				A[i][j]=sc.nextint();
			}
		}
		
		int large=A[0][0];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(A[i][j]>large)
				{
					large=A[i][j];
				}
			}
		}
		
		System.out.println("The largest element is:"+large);
		
	}
}
