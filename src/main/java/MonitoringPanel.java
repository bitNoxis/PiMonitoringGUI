import javax.swing.*;
import java.awt.*;

public class MonitoringPanel extends JFrame {
    private JLabel labelPI1 = new JLabel("PI 1");
    private JLabel labelPI2 = new JLabel("PI 2 ");
    private JLabel labelCPUTemp1 = new JLabel("CPU Temperatur:");
    private JLabel labelCPUFrequenz1 = new JLabel("CPU GHz:");
    private JLabel labelCPUTemp2 = new JLabel("CPU Temperatur:");
    private JLabel labelCPUFrequenz2 = new JLabel("CPU GHz:");

    private TextField textboxCPUTemp1 = new TextField();
    private TextField textboxCPUFrequenz1 = new TextField();
    private TextField textboxCPUTemp2 = new TextField();
    private TextField textboxCPUFrequenz2 = new TextField();
    private JLabel labelTEst= new JLabel("");


    public MonitoringPanel() throws HeadlessException {
        generateFrame();
    }

    private JFrame generateFrame() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Monitoring :)");

        labelCPUTemp1.setBounds(10, 150, 100, 20);

        textboxCPUTemp1.setEditable(false);
        textboxCPUTemp1.setBounds(120, 150, 50, 20);


        labelCPUFrequenz1.setBounds(10, 180, 100, 20);

        textboxCPUFrequenz1.setEditable(false);
        textboxCPUFrequenz1.setBounds(120, 180, 50, 20);

        labelPI1.setFont(new Font("Dialog", Font.BOLD, 20));
        labelPI1.setBounds(100, 70, 100, 30);

        labelCPUTemp2.setBounds(300,150,100,20);

        textboxCPUTemp2.setEditable(false);
        textboxCPUTemp2.setBounds(410,150,50,20);

        labelCPUFrequenz2.setBounds(300,180,100,20);

        labelPI2.setFont(new Font("Dialog", Font.BOLD, 20));
        labelPI2.setBounds(390,70,100,20);

        textboxCPUFrequenz2.setEditable(false);
        textboxCPUFrequenz2.setBounds(410,180,50,20);

        frame.add(textboxCPUFrequenz1);
        frame.add(labelCPUFrequenz1);
        frame.add(textboxCPUTemp1);
        frame.add(labelCPUTemp1);
        frame.add(labelPI1);
        frame.add(labelCPUFrequenz2);
        frame.add(textboxCPUFrequenz2);
        frame.add(textboxCPUTemp2);
        frame.add(labelCPUTemp2);
        frame.add(labelPI2);
        frame.add(labelTEst);

        return frame;
    }

    public void doFill(String cpuTemp1, String cpuFrequenz1, String cpuTemp2, String cpuFrequenz2) {
        textboxCPUTemp1.setText(cpuTemp1);
        textboxCPUFrequenz1.setText(cpuFrequenz1);
        textboxCPUTemp2.setText(cpuTemp2);
        textboxCPUFrequenz2.setText(cpuFrequenz2);


    }
}