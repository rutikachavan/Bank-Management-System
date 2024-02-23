import java.sql.*;
import java.util.Scanner;

class BankDb{

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/shr";
		String user = "root";
		String pass = "root";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from students");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e) {
			con.close();
			System.out.println(e);
		}
	}
}
