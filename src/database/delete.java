package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class delete {
	static final String database = "jdbc:mysql://localhost:3306/java?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String kull = "root";
    static final String sif = "";
	public static void main(String[] args) {
		Connection conn = null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			System.out.println("Veritabanina baglaniliyor");
            
			conn = DriverManager.getConnection(database, kull, sif);
            
			System.out.println("Baglanti basarili");
           
			String sql = "DELETE FROM kullanýcýlar WHERE ad=?";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Mehmet");
			
			stmt.executeUpdate();
			
			System.out.println("Kayit silme baþarýlý");
			}catch(Exception e){
        System.err.println(e); 
    }
  }

}
