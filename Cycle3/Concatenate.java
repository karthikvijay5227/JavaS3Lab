import java.util.*;

class Concatenate
{
 void Conc(String str1,String str2)
 {
  String str3=str1.concat(str2);
  System.out.println("Concatenated String is:"+str3);
 }
 
 void Conc(int a,int b)
 {
  System.out.println("Concatenated number is:"+a+b);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  int ch,m,n;
  do
  {
   System.out.println("\n1.String\n2.Number\n3.Exit");
   System.out.print("Enter your choice:");
   ch=sc.nextInt();
   Concatenate c=new Concatenate();
   switch(ch)
   {
    case 1:System.out.println("Enter 1st string:");
           String str1=sc.next();
           
           System.out.println("Enter 2nd string:");
           String str2=sc.next();
           
           c.Conc(str1,str2);
           break;
        
    case 2:System.out.println("Enter 1st number:");
           m=sc.nextInt();
           
           System.out.println("Enter 2nd number:");
           n=sc.nextInt();
           
           c.Conc(m,n);
           break;
           
    case 3:break;
    
    default:System.out.println("Wrong Option");
            break;
   }
  }while(ch!=3);
 }
}
