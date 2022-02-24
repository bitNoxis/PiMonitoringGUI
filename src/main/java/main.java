import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class main {
        public static void main(String[] args){
new MonitoringPanel();

            String url = "jdbc:mysql://34.159.157.247/datenbank";
            String user = "root";
            String pass = "OA6I2K76r7BzEIGC";

            try {
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from entries;");


                while(rs.next()){
                    System.out.println(rs.getString(1) + " " +
                            rs.getString(2) + " " +
                            rs.getString(3));
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }


}
