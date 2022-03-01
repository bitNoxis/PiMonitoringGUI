import javax.swing.*;
import java.awt.*;

public class MonitoringPanel extends JFrame {
    private JLabel labelCPUTemp = new JLabel("CPU Temperatur:");
    private JLabel labelCPUFrequenz = new JLabel("CPU GHz:");
    private TextField textboxCPUTemp1 = new TextField();
    private TextField textboxCPUFrequenz1 = new TextField();
    private TextField textboxCPUTemp2 = new TextField();
    private TextField textboxCPUFrequenz2 = new TextField();


    public MonitoringPanel() throws HeadlessException {
        generateFrame();
    }
    private JFrame generateFrame(){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Monitoring :)");

        JPanel panel1 =  generateSubPanel1();
        frame.add(panel1);
        panel1.setBounds(0,50,150,400);

        return frame;
    }
    private JPanel generateSubPanel1(){
        JPanel panel1= new JPanel();

        textboxCPUTemp1.setEditable(false);
        textboxCPUTemp1.setBounds(60,50, 50,10);
        labelCPUTemp.setBounds(10,50,50,10);
        panel1.add(labelCPUTemp);
        panel1.add(textboxCPUTemp1);
        labelCPUFrequenz.setBounds(10,70,50,10);
        panel1.add(labelCPUFrequenz);

        return panel1;
    }
    private void doFill(String cpuTemp1, String cpuTemp2, String cpuFrequenz1, String cpuFrequenz2 ){
textboxCPUTemp1.setText(cpuTemp1);



    }
}