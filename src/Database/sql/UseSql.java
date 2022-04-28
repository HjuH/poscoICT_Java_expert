package Database.sql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class UseSql {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String url = "jdbc:mysql://localhost:3306/web";
      String id = "root";
      String password = "hjh00707**";
      Connection conn = null;
      Statement stmt = null;
      int rs = 0;
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url, id, password);
         String sql = "insert into books (title, author, year, price) values ('자료구조', '이한빛', '2022', '50000')";
         stmt = conn.createStatement();
         rs = stmt.executeUpdate(sql);
      } catch (Exception e) {
    	  e.printStackTrace();
      }
   }

}