//Java program to find transpose of a matrix.

import java.util.*;

class MatTrans
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter no of rows of matrix:");
		m=sc.nextint();
		
		System.out.println("Enter no of columns of matrix:");
		n=sc.nextInt();
		
		int A[][]=new int[m][n];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		int C[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				C[i][j]=A[j][i];
			}
		}
		System.out.println("Transposed matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
		
