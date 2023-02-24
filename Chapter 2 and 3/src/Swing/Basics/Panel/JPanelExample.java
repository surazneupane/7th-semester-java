package Swing.Basics.Panel;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JPanel Example");

        String[] JComboxItems = {"Item 1", "Item 2","Item 3"};


//        creating a 1st panel
        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("Button 1"));
        jPanel.add(new JButton("Button 2"));
        jPanel.add(new JComboBox<>(JComboxItems));
        jPanel.setBackground(Color.GREEN);

//        creating another panel
        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JButton("Button 3"));
        jPanel1.add(new JButton("Button 4"));
        jPanel1.add(new JComboBox<>(JComboxItems));
        jPanel1.setBackground(Color.RED);
//        creating another panel
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JButton("Button 5"));
        jPanel2.setBackground(Color.BLUE);
//        creating another panel
        JPanel jPanel3 = new JPanel();
        jPanel3.add(new JButton("Button 6"));
        jPanel3.setBackground(Color.GRAY);

//        creating another panel
        JPanel jPanel4 = new JPanel();
        jPanel4.add(new JButton("Button 7"));
        jPanel4.add(new JButton("Button 8"));
        jPanel4.setBackground(Color.YELLOW);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(jPanel,BorderLayout.NORTH);
        jFrame.add(jPanel1,BorderLayout.SOUTH);
        jFrame.add(jPanel2,BorderLayout.EAST);
        jFrame.add(jPanel3,BorderLayout.WEST);
        jFrame.add(jPanel4,BorderLayout.CENTER);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
