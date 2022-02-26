import java.util.*;
public class QuickSort
{
  static void qsort(int a[], int l, int r )
  { 
  	int x;
  	if(l<r)
  	{
	 	x = partition(a,l,r);
	 	qsort(a,l,x-1);
	 	qsort(a,x+1,r);
  	}
   } 

  static int partition(int a[],int l, int r)
  {
	  int key = a[l];
	  int i=l+1,j=r;
	  do
	  {
	 	while(a[i]<=key && i<r)
		   	i++;
		 while(a[j]>key && j>l)
		   	j--;
	  	if(i<j)
		  {
		  	int temp=a[i];
		  	a[i]=a[j];
		  	a[j]=temp;
		  }
	  }while(i<j);
	  int temp1=a[l];
	  a[l]=a[j];
	  a[j]=temp1;
	  return j;
  }   
static void print(int a[], int n)
{
	System.out.print("The Sorted Array is:");
	for(int i=0;i<n;i++)
		System.out.printf("%d ",a[i]);
	System.out.print("\n");
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the size:");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter the elements:");
	for(int I=0;I<n;I++)
         a[I]=sc.nextInt();
	qsort(a,0,n-1);
	print(a,n);		
	}
}
