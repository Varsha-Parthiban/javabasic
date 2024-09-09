import java.sql.*;
public class Getstudnt {
	
	public void sdget()throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/gv";
		String username ="root";
		String password = "samu@1975";
		String query = "select * from profile";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement abc =con.createStatement();
		ResultSet xy =abc.executeQuery(query);
		while (xy.next()) {
			System.out.println("id"+xy.getInt(1));
			System.out.println("name"+xy.getString(2));
		}
		con.close();
	}
   public static void main (String[]args) throws Exception {
	Getstudnt obj = new Getstudnt();
	obj.sdget();
	
	
}
}
