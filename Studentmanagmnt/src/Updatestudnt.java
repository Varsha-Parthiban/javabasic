import java.sql.*;
public class Updatestudnt {
	
	public void studentupdate()throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/gv";
		String username ="root";
		String password = "samu@1975";
		String query = "update profile set name = 'camp' where id =101";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
		
	}

	public static void main(String[]args) throws Exception  {
		Updatestudnt obj = new Updatestudnt();
		obj.studentupdate();
		
		
		
	}
}
