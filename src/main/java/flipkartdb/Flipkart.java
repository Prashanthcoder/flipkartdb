package flipkartdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Flipkart {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartDb", "root", "root");
		Statement s = conn.createStatement();
//		s.execute("create database flipkartDb");
//		System.out.println("database created successfully!");
		s.execute("create table FlipkartProducts(cid int primary key, cname varchar(40) not null, product varchar(40))");
		System.out.println("table created successfully");
	}

}
