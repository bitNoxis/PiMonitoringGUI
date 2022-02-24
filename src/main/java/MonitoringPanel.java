import javax.swing.*;
import java.awt.*;

public class MonitoringPanel extends JFrame {
private String CpuTemp1 = "10" ;
private String CpuGhz1 ="1.2";

    public MonitoringPanel() throws HeadlessException {
        MainFrameErzeugen();

    }


    private JPanel generateAreaPIOneFrame(){
        JPanel panel1 = new JPanel();
        Label labelTitle = new Label("Rasperry Pi 1 ");

        Label labelCPUTemp = new Label("CPU");
        labelCPUTemp.setBounds(20,10,20,10);
        TextField textFieldCPUTemp1 = new TextField();
        textFieldCPUTemp1.setText(CpuTemp1);
        textFieldCPUTemp1.setBounds(60,10,20,10);

        Label labelCPUGHz = new Label("GHz");
        labelCPUGHz.setBounds(20,30,20,10);
        TextField textFieldCPUGHz = new TextField();
        textFieldCPUGHz.setText(CpuGhz1);
        textFieldCPUGHz.setBounds(60,30,20,10);


        panel1.setSize(150,300);
        panel1.add(labelTitle);
        //panel1.setLayout(new SpringLayout());
        panel1.add(labelCPUTemp);
        panel1.add(textFieldCPUTemp1);
        panel1.add(labelCPUGHz);
        panel1.add(textFieldCPUGHz);

        panel1.setVisible(true);
        return panel1;

    }

    private JFrame MainFrameErzeugen(){
        JFrame frame = new JFrame();
        JPanel panel1 = generateAreaPIOneFrame();
        panel1.setBounds(20,20,150,300);
        frame.setSize(500,500);
        frame.setTitle("Monitoring :) ");
        frame.setVisible(true);
        frame.add(panel1);
        return frame;
    }
}
