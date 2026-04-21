package flipkartdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Fetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartDb", "root", "root");
		PreparedStatement p4 = conn.prepareStatement("select * from FlipkartProducts where cid=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to fetch");
		int id4 = sc.nextInt();
		p4.setInt(1, id4);
		ResultSet r = p4.executeQuery();
		r.next();
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
	}

}
