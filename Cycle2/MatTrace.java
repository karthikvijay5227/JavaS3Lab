//Java program to find trace of matrix.

import java.util.*;

class MatTrace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,sum=0;
		
		System.out.println("Enter the size of matrix:");
		m=sc.nextInt();
		
		int A[][]=new int[m][m];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if((i+j)%m==0)
				{
					sum+=A[i][j];
				}
			}
		}
		
		System.out.println("The trace is:"+sum);
	}
}
