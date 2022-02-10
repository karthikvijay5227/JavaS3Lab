import java.util.*;

class Exp2
{
 static int a;
 static void Exceptions(int a)
 {
  try
  {
   if(a>=500)
   {
    System.out.format("Balance is %d\n",a);
   }
   else
   {
    throw new lowBalException();
   }
  }
  catch(lowBalException l)
  {
   System.out.println(l);
  }
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the account balance:");
  a=sc.nextInt();
  Exceptions(a);
 }
}

class lowBalException extends Exception
{
 lowBalException()
 {
  System.out.println("Low Balance");
 }
}
