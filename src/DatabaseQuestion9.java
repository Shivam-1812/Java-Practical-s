import java.sql.*;
public class DatabaseQuestion9 {
    public static void main(String args[]) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE", "root", "root");
        System.out.println("Connection is Done successfully");


        Statement s1 = con.createStatement();
        s1.execute("create table Emp (Emp_id int(10), Emp_Name varchar(50))");
        System.out.println("Table created Successfully");

        Statement s2 = con.createStatement();
        s2.executeUpdate("insert into  Emp values (2303139, 'Shivam' )");
        s2.executeUpdate("insert into  Emp values (2303143, 'Jack' )");
        s2.executeUpdate("insert into  Emp values (2203136, 'Yash')");
        s2.executeUpdate("insert into  Emp values (2203137, 'Rishi')");
        System.out.println("Rows Inserted");

        Statement s3 = con.createStatement();
        ResultSet rs = s3.executeQuery("select * from Emp");
        while(rs.next()) {
            System.out.println("Emp_id =" + rs.getInt(1) + "|"  +
                    "Emp_Name ="  +rs.getString(2)+ "|"   );
        }
        Statement s4 = con.createStatement();
        s4.executeUpdate("update Emp set Emp_Name = 'John' where Emp_Name = 'Jack'");
        System.out.println("Row Updated");

        Statement s5 = con.createStatement();
        s5.executeUpdate("Delete from Emp where Emp_Name = 'Rishi'");
        System.out.println("Row Deleted");


        ResultSet rs1 = s5.executeQuery("select * from Emp");
        while(rs1.next()) {
            System.out.println("Emp_id =" + rs1.getInt(1) + "|"  +
                    "Emp_Name ="  +rs1.getString(2)+ "|"   );
        }

    }
}