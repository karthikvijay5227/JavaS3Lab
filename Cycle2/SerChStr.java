//Java program to search a particular character in a string.

import java.util.*;

class SerChStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String word;
		int flag=0,i;
		
		System.out.println("Enter the word:");
		word=sc.nextLine();
		
		int n=name.length();
		char s;
		System.out.println("Enter the item to be searched:");
		s=sc.next().charAt(0);
		
		for(i=0;i<n;i++)
		{
			if(word.charAt(i)==s)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Item not in the string");
		}
		else
		{
			System.out.println(s+" is found in "+word+" at position:"+(i+1));
		}
		
	}
}
		
