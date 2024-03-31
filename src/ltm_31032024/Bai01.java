package ltm_31032024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai01 extends JFrame {
    public Bai01(){
        this.init();

        this.setTitle("Xin chao");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void init(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); // qui dinh bo cuc

        JButton J_Up = new JButton("Phia tren");
        JButton J_Down = new JButton("Phia duoi");
        JButton J_Left = new JButton("Phia trai");
        JButton J_Right = new JButton("Phia phai");
        JButton J_Center = new JButton("Đào Hoàng Nhi");

        J_Up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ban vua nhan nut: " + e.getActionCommand());
            }
        });

        J_Down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ban vua nhan nut: " + e.getActionCommand());
            }
        });

        J_Left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ban vua nhan nut: " + e.getActionCommand());
            }
        });

        J_Right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ban vua nhan nut: " + e.getActionCommand());
            }
        });

        J_Center.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = e.getActionCommand();
                JOptionPane.showMessageDialog(null, "Ban vua nhan nut: " + e.getActionCommand());
            }
        });

        mainPanel.add(J_Up, BorderLayout.NORTH);
        mainPanel.add(J_Down, BorderLayout.SOUTH);
        mainPanel.add(J_Left, BorderLayout.WEST);
        mainPanel.add(J_Right, BorderLayout.EAST);
        mainPanel.add(J_Center, BorderLayout.CENTER);

        this.add(mainPanel);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new Bai01();

    }
}
