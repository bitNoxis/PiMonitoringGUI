import java.sql.*;

import static java.lang.Thread.sleep;

public class DataImport {
    MonitoringPanel test = new MonitoringPanel();

    public DataImport() throws InterruptedException {
        dataImport1();
    }

    private void dataImport1() throws InterruptedException {
        String url = "jdbc:mysql://34.159.157.247/monitoringDatenbank";
        String user = "root";
        String pass = "OA6I2K76r7BzEIGC";
        String cpuFrequenz1 = "";
        String cpuTemperatur1 = "";
        String cpuFrequenz2 = "";
        String cpuTemperatur2 = "";

        while (true == true) {
            sleep(10);
            try {
                Connection con = DriverManager.getConnection(url, user, pass);

                Statement stm1 = con.createStatement();
                ResultSet rs1 = stm1.executeQuery("SELECT * FROM entries ORDER BY entryID DESC LIMIT 1;");

                Statement stm2 = con.createStatement();
                ResultSet rs2 = stm2.executeQuery("SELECT * FROM entries2 ORDER BY entryID DESC LIMIT 1;");

                while (rs1.next() && rs2.next()) {

                    cpuTemperatur1 = rs1.getString(1);
                    cpuFrequenz1 = rs1.getString(2);

                    cpuTemperatur2 = rs2.getString(2);
                    cpuFrequenz2 = rs2.getString(1);

                }
                doWrite(cpuTemperatur1, cpuFrequenz1, cpuTemperatur2, cpuFrequenz2);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void doWrite(String cpuTemp1, String cpuFrequenz1, String cpuTemp2, String cpuFrequenz2) {

        test.doFill(cpuTemp1, cpuFrequenz1, cpuTemp2, cpuFrequenz2);

        System.out.println("TEmp1" + cpuTemp1);
        System.out.println("GHZ1" + cpuFrequenz1);
        System.out.println("TEmp2" + cpuTemp2);
        System.out.println("Ghz2" + cpuFrequenz2);


    }
}
