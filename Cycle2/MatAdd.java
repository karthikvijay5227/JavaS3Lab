//Java program to add two matrices.

import java.util.*;

class MatAdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	  int m,n,p,q;
		
		System.out.println("Enter the no of rows of Matrix1:");
		m=sc.nextInt();
		
		System.out.println("Enter the no of columns of Matrix1:");
		n=sc.nextInt();
		
		System.out.println("Enter the no of rows of Matrix2:");
		p=sc.nextInt();
		
		System.out.println("Enter the no of columns of Matrix2:");
		q=sc.nextInt();
		
		if(m==p && n==q)
		{
			int A[][]=new int[m][n];
			int B[][]=new int[p][q];
			
			System.out.println("Enter Matrix1:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					A[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter Matrix2:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					B[i][j]=sc.nextInt();
				}
			}
			
			int C[][]=new int[m][n];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					C[i][j]=A[i][j]+B[i][j];
				}
			}
			System.out.println("Added Matrix:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(C[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Addition not possible");
		}
		
	}
}
