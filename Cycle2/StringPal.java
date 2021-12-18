//Java program to check whether a string is palindrome or not.

import java.util.*;

class StringPal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String name,rev="";
		System.out.println("Enter the word:");
		name=sc.nextLine();
		
		int n=name.length();
		for(int i=0;i<n;i++)
		{
			rev+=name.charAt(n-1-i);
		}
		if(name.equals(rev))
		{
			System.out.println(name+" is a palindrome");
		}
		else
		{
			System.out.println(name+" is not palindrome");
		}
		
	}
}
