import java.util.*;
class BinarySearch
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.print("Enter the size:");
  n=sc.nextInt();
  int A[]=new int[n];
  System.out.println("Enter the elements:");
  for(int i=0;i<n;i++)
  {
   A[i]=sc.nextInt();
  }
  System.out.println("Enter the element to be searched:");
  int item=sc.nextInt();
  int beg=0,end=n-1,mid,loc=-1;
  while(beg<=end)
  {
   mid=(beg+end)/2;
   if(A[mid]==item)
   {
     loc=mid+1;
     break;
   }
   else if(item>A[mid])
     beg=mid+1;
   else
     end=mid-1;
  }
  if(loc!=-1)
    System.out.printf("The element %d is found at position %d",item,loc);
  else
    System.out.println("Element not in the list");
 }
}
  
  
