package flipkartdb;
import java.sql.*;
//import java.sql.DriverManager;
import java.util.Scanner;
public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartDb", "root", "root");
		PreparedStatement p2 = conn.prepareStatement("update FlipkartProducts set cname=?, product=? where cid=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name2 = sc.next();
		p2.setString(1, name2);
		
		System.out.println("enter the product name");
		String product2 = sc.next();
		p2.setString(2, product2);
		
		System.out.println("enter the id where you want to update these values to?");
		int id2 = sc.nextInt();
		p2.setInt(3, id2);
		p2.execute();
		System.out.println("updated successfully!!!");
		

	}

}
