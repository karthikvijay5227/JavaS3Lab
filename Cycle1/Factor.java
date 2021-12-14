//6.Java program to print factor of given number.

import java.util.*;

class factor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
