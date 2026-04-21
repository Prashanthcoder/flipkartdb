package flipkartdb;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartDb", "root", "root");
		Scanner sc = new Scanner(System.in);
		PreparedStatement p3 = conn.prepareStatement("delete from FlipkartProducts where cid =?");
		System.out.println("enter the id to delete from? ");
		int id3 = sc.nextInt();
		p3.setInt(1, id3);
		p3.execute();
		System.out.println("deletion success");
	}

}
