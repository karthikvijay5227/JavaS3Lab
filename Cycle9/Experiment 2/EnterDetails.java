import java.util.*;
import java.sql.*;

public class EnterDetails {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "karthik", "karthik123");
            Statement st = con.createStatement();
            int n;
            System.out.println("Enter the no of details to enter:");
            n = sc.nextInt();
            int rno;
            String name;
            float CGPA;
            PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?)");
            for (int i = 1; i <= n; i++) {
                System.out.println("Entering details of student " + i);
                System.out.println("Enter the roll no:");
                rno = sc.nextInt();
                System.out.println("Enter the name:");
                name = sc.next();
                System.out.println("Enter the CGPA:");
                CGPA = sc.nextFloat();
                ps.setInt(1, rno);
                ps.setString(2, name);
                ps.setFloat(3, CGPA);
                ps.executeUpdate();
            }
            ResultSet rs=st.executeQuery("SELECT * FROM STUDENTS WHERE CGPA>7");
            System.out.println("Details of Students with CGPA greater than 7");
            while(rs.next())
            {
                System.out.printf("%d %s %.2f\n",rs.getInt(1),rs.getString(2),rs.getFloat(3));
            }
            st.executeUpdate("DELETE FROM STUDENTS");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
