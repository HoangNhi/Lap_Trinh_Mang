package ltm_06042024;

import ltm_31032024.Bai01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.Scanner;

public class MyNSLookup extends JFrame {
    public MyNSLookup() {
        this.init();

        this.setTitle("Xin chao");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void init(){
        JPanel mainPanel = new JPanel();
        // Quy định về bố cục
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(3,1));
        JLabel tieude = new JLabel("PHẦN MỀM TRA CỨU ĐỊA CHỈ IP");
        tieude.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(tieude);

        JTextField domainname_input = new JTextField();
        domainname_input.setColumns(50);
        headerPanel.add(domainname_input);

        JButton tracuu = new JButton("Tra Cứu");

        headerPanel.add(tracuu);

        JTextArea jta_rs = new JTextArea();
        jta_rs.setColumns(50);
        jta_rs.setRows(20);
        jta_rs.setEditable(false);

        JPanel rsPanel = new JPanel();
        rsPanel.setLayout(new FlowLayout());
        rsPanel.add(jta_rs);

        mainPanel.add(headerPanel);
        mainPanel.add(rsPanel);
        this.add(mainPanel);


        tracuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // In thông tin
                try {
                    InetAddress ia = InetAddress.getByName(domainname_input.getText());
                    // in thông tin
                    String result = "";
                    result+=("IP: " +ia.getHostAddress()+"\n");
                    result+=("Domain: " +ia.getHostName()+"\n");
                    result+=("Reachable: " + ia.isReachable(120)+"\n");
                    result+=("MulticastAddress: " + ia.isMulticastAddress()+"\n");
                    result+=("SiteLocalAddress: " + ia.isMulticastAddress()+"\n");
                    jta_rs.setText(result);

                }catch (Exception e1){
                    //e.printStackTrace();
                    System.out.println("Gặp lỗi, vui lòng nhập địa chỉ khác!");
                }
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new MyNSLookup();

    }
}
