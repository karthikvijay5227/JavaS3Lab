import java.util.*;

class Mensuration
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  Mensuration m=new Mensuration();
  
  int l,b,s,r;
  float h;
  
  System.out.println("Enter the length:");
  l=sc.nextInt();
  
  System.out.println("Enter the breadth:");
  b=sc.nextInt();
  
  System.out.println("Enter the base:");
  s=sc.nextInt();
  
  System.out.println("Enter the height:");
  h=sc.nextFloat();

  System.out.println("Enter the radius:");
  r=sc.nextInt();
  
  m.Area(l,b);
  m.Area(s,h);
  m.Area(r);
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

 void Area(int r)
 {
  float ar;
  ar=(float)(3.14*r*r);
  
  System.out.println("Area of Circle is:"+ar);
 }
}

