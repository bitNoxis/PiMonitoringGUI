import java.sql.*;

public class dataImport{

    public dataImport(){
        String url = "jdbc:mysql://34.159.157.247/datenbank";
        String user = "root";
        String pass = "OA6I2K76r7BzEIGC";
String cpuFrequenz1 ="";
String cpuTemperatur1 = "";
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
