import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) 
        {
            System.out.println(a);
            if (a<=2*n)
                System.out.println(",");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
