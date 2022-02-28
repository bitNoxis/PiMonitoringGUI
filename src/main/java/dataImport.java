import java.sql.*;

import static java.lang.Thread.sleep;

public class dataImport{

    public dataImport() throws InterruptedException {
        String url = "jdbc:mysql://34.159.157.247/monitoringDatenbank";
        String user = "root";
        String pass = "OA6I2K76r7BzEIGC";
        String cpuFrequenz1 = "";
        String cpuTemperatur1 = "";
        while (true == true) {
            sleep (10);
            try {
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM entries ORDER BY entryID DESC LIMIT 1;");

                while (rs.next()) {
                    //  System.out.println(rs.getString(1) + " " +
                    //        rs.getString(2) + " " +
                    //          rs.getString(3));
                    cpuTemperatur1 = rs.getString(1);
                    cpuFrequenz1 = rs.getString(2);
                }
                doWrite(cpuTemperatur1, cpuFrequenz1);
            }

         catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    }
    private void doWrite(String cpuTemp, String cpuFrequenz){

        System.out.println(cpuTemp);
        System.out.println(cpuFrequenz);

    }
}
