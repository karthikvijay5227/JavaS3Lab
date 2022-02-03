public class Exp1b 
{
    public static void main(String[] args) {
        try{
            int A[]={1,2,3,4,5};
            System.out.println(A[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
