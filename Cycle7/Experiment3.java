public class EvenOddThread
{
    public static void main(String[] args)
    {
       even r2 = new even();
       r2.start();
       odd r1 = new odd();
       r1.start();
       try
       {
           r1.join();
       }
      catch(Exception e)
       {
          System.out.println(e);
       }
       try
       {
       	r2.join();
       }
       catch(Exception e)
       {
       	System.out.println(e);
       }
   }
}

class even extends Thread
{
    int i;
    public void run()
    {
       System.out.println("Even numbers from 0 to 100");
       for(i=0;i<=100;i++)
       {
              if(i%2==0)        	  
                System.out.println(i);
       }
    }

}

class odd extends Thread
{
    int i;
    public void run()
    {
        System.out.println("Odd numbers from 0 to 100");
        for(i=0;i<100;i++)
        {
        	if(i%2!=0)
        	   System.out.println(i);
        }
    }
} 
