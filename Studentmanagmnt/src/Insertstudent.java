import java.sql.*;
public class Insertstudent {
	
	public void StudentInsert()throws Exception {
		String url = "jdbc:mysql:// 127.0.0.1:3306/gv";
		String username ="root";
		String password = "samu@1975";
		String Query = "insert into profile values (?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 101);
		pst.setString(2, "test");
		pst.setString(3, "abc@gmail.com");
		pst.executeUpdate();
		con.close();
		
	}

	public static void main(String[]args) throws Exception  {
		Insertstudent obj = new Insertstudent();
		obj.StudentInsert();
		
		
		
	}
}
