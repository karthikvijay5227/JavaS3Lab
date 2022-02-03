public class Experiment3 
{
    String name;
    public static void main(String[] args) 
    {
        Experiment3 e=new Experiment3();
        e.name="Karthik";
        e=null;
        System.gc();
    }
    public void finalize()
    {
        System.out.println("Onject is garbage collected");
    }
}
