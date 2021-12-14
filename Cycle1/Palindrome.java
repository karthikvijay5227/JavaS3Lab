//9.Java program to check whether a number is palindrome or not.

import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int num,digit,rev=0;
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		int a=num;
		while(a!=0)
		{
			digit=a%10;
			rev=(rev*10)+digit;
			a/=10;
		}
		
		if(rev==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
