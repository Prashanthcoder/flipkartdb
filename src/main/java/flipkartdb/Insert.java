package flipkartdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartDb", "root", "root");
		Scanner sc = new Scanner(System.in);
		PreparedStatement p1 = conn.prepareStatement("insert into FlipkartProducts values(?, ?, ?)");
		System.out.println("enter the id : ");
		int id1 = sc.nextInt();
		p1.setInt(1, id1);
		System.out.println("enter the name of the customer");
		String name1 = sc.next();
		p1.setString(2, name1);
		System.out.println("enter the product name");
		String product1 = sc.next();
		p1.setString(3, product1);
		p1.execute();
		System.out.println("values updated to the table 👍😎📸");
	}

}
