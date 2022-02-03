import java.io.*;
public class Exp1c 
{
    public static void main(String[] args)throws IOException {
        
        try
        {
           FileInputStream fin=new FileInputStream("D://hello.txt");
           int i;
           while((i=fin.read())!=-1)
           {
               System.out.println((char)i);
           }
           fin.close();
        }
        catch(FileNotFoundException f)
        {
            System.out.println(f);
        }
    }
}
