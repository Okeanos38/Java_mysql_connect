package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {

	public static void main(String[] args) {
		try {

			Connection conn= DriverManager.getConnection ("jdbc:mysql://localhost:3306/java?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			
            String query="Select * From kullan�c�lar";
            
            Statement stmt=conn.createStatement();
            
            ResultSet rs=stmt.executeQuery(query);
            
            while(rs.next())
            {
            System.out.println("tc:"+rs.getString("tc")+"  -  "+"ADI:"+rs.getString("ad")+"  -  "+"Soyad�:"+rs.getString("soyad")+"  -  "+"Numara:"+rs.getString("numara"));
            }
           
			}catch(Exception e){
        System.err.println(e);
    }
  }
}
