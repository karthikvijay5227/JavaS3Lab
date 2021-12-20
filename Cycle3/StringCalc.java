import java.util.*;

class StringCalc
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  String name;
  System.out.println("Enter the word:");
  name=sc.nextLine();
  
  char s;
  System.out.println("Enter the char to be counted:");
  s=sc.next().charAt(0);
  
  StringCalc c=new StringCalc();
  
  c.Freq(name,s);
  c.Rev(name);
 }
 
 void Freq(String name,char s)
 {
  int sum=0;
  
  for(int i=0;i<name.length();i++)
  {
   if(name.charAt(i)==s)
   {
    sum++;
   }
  }
  
  System.out.println("Frequency of "+s+" is:"+sum);
 }
 
 void Rev(String name)
 {
  int n=name.length();
  String rev="";
  
  for(int i=0;i<n;i++)
  {
   rev+=name.charAt(n-1-i);
  }
  
  System.out.println("Reversed string is:"+rev);
 }
}
