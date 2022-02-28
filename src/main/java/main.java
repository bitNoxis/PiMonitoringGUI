import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class main {
        public static void main(String[] args) throws InterruptedException {
           // new MonitoringPanel();
            String url = "jdbc:mysql://34.159.157.247/datenbank";
            String user = "root";
            String pass = "OA6I2K76r7BzEIGC";
            new dataImport();

        }
}
