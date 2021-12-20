import java.util.*;

class Mensuration
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  Mensuration m=new Mensuration();
  
  int l,b,s;
  float h;
  
  System.out.println("Enter the length:");
  l=sc.nextInt();
  
  System.out.println("Enter the breadth:");
  b=sc.nextInt();
  
  System.out.println("Enter the base:");
  s=sc.nextInt();
  
  System.out.println("Enter the height:");
  h=sc.nextFloat();
  
  m.Area(l,b);
  m.Area(s,h);
 }
 
 void Area(int l,int b)
 {
  int ar=l*b;
  System.out.println("Area of rectangle is:"+ar);
 }
 
 void Area(int s,float h)
 {
  float ar;
  ar=(float)(0.5*s*h);
  
  System.out.println("Area of Triangle is:"+ar);
 }
}
