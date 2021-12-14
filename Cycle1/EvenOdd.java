//3.Java program to check whether a number is even or odd.

import java.util.*;

class EvenOdd
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    int a;
    System.out.println("Enter the number:"):
    a=sc.nextInt();
    
    if(a%2==0)
    {
      System.out.println(a+" is even");
    }
    else
    {
      System.out.println(a+" is odd");
    }
  }
}
