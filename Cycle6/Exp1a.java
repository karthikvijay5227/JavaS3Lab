
class Exp1a
{
    public static void main(String[] args) {
        try
        {
            int d=5/0;
            System.out.println(d);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}