//Java program to replace a character in a string.

import java.util.*;

class RepStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String word;
		
		System.out.println("Enter the word:");
		word=sc.nextLine();
		
		char s,r;
		System.out.println("Enter the character to be replaced:");
		s=sc.next().charAt(0);
	  
	  System.out.println("Enter the character with which to be replaced:");
		r=sc.next().charAt(0);
		
		name=name.replace(s,r);
		System.out.println("Replaced string:"+name);
		
	}
}
