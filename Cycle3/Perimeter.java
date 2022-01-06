import java.util.*;

class Perimeter
{

 Perimeter(int l,int b)
 {
  int per=2*(l+b);
  System.out.println("Perimeter is:"+per);
 }
 Perimeter(int r)
 {
  float per=(float)(3.14*2*r);
  System.out.println("Perimeter is:"+per);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int r,l,b,ch;
  do
  {
   System.out.println("\n1.Circle\n2.Rectangle\n3.Exit\n");
   System.out.println("Enter the choice:");
   ch=sc.nextInt();
   
   switch(ch)
   {
    case 1:System.out.println("Enter the radius:");
           r=sc.nextInt();
           Perimeter p=new Perimeter(r);
           break;
           
    case 2:System.out.println("Enter the length:");
           l=sc.nextInt();
           System.out.println("Enter the breadth:");
           b=sc.nextInt();
           p=new Perimeter(l,b);
           break;
          
   case 3:break;
   
   default:System.out.println("Wrong Option");
           break;
   }
  }while(ch!=3);
 }
}
 
