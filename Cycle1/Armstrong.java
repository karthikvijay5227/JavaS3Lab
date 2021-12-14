//10.Java program to check whether a number is armstrong or not.

import java.util.*;
import java.lang.*;

class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num,digit=0,sum=0,last=0;
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		int a=num;
		while(a!=0)
		{
			a/=10;
			digit++;
		}
		a=num;
		while(a!=0)
		{
			last=a%10;
			sum+=Math.pow(last,digit);
			a/=10;
		}
		
		if(sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
