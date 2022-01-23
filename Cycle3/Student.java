import java.util.*;

class Student
{

 void Read()
 {
  Scanner sc=new Scanner(System.in);
  int rno;
  String name;
  int marks[]=new int[5];
  
  System.out.println("Enter the name:");
  name=sc.nextLine();
  
  System.out.println("Enter rno:");
  rno=sc.nextInt();
  
  for(int i=0;i<5;i++)
  {
   System.out.println("Enter marks of Sub"+(i+1));
   marks[i]=sc.nextInt();
  }
  Display(name,rno,marks);
 }
 
 void Display(String name,int rno,int marks[])
 {
  System.out.println("Name is:"+name);
  System.out.println("Rollno is:"+rno);
  
  for(int i=0;i<5;i++)
  {
   System.out.println("Marks of Sub"+(i+1)+" is "+marks[i]);
  }
 }
   
 public static void main(String args[])
 {
  Student s1=new Student();
  
  s1.Read();
 }
}
  
