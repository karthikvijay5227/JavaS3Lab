//Java program to multiply two matrices.

import java.util.*;

class MatMul
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
		
	int m,n,p,q;
	System.out.println("Enter no of rows of Matrix1:");
	m=sc.nextInt();
		
	System.out.println("Enter no of columns of Matrix1:");
	n=sc.nextInt();
		
    	System.out.println("Enter no of rows of Matrix2;");
	p=sc.nextInt();
		
	System.out.println("Enter no of columns of Matrix2:");
	q=sc.nextInt();
		
	if(n==p)
	{
	    int A[][]=new int[m][n];
	    int B[][]=new int[p][q];
			
			
            System.out.println("Enter Matrix1:");
	    for(int I=0;I<m;I++)
	    {
		for(int j=0;j<n;j++)
		{
			A[I][j]=sc.nextInt();
		}
	    }
			
	    System.out.println("Enter Matrix2:");
	    for(int I=0;I<p;I++)
	    {
		for(int j=0;j<q;j++)
		{
		    B[I][j]=sc.nextInt();
		}
            }
			
			
           int pt[][]=new int[m][q];	
	   for(int I=0;I<m;I++)
	   {
		for(int j=0;j<q;j++)
		{
			pt[I][j]=0;
			for(int k=0;k<q;k++)
			{
				pt[I][j]+=A[I][k]*B[k][j];
			}
		}
	   }
	   System.out.println("Product Matrix:");
	   for(int I=0;I<m;I++)
	   {
	       for(int j=0;j<q;j++)
		{
		   System.out.print(pt[I][j]+" ");
		}
		System.out.println();
	    }
	}
   	else
	{
	   System.out.println("Multiplication not possible");
	}			
   }
} 
