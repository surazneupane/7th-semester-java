package Swing.AdvanceComponents;

import javax.swing.*;
import java.awt.*;

public class InternalFrameExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Internal Frame Example");

//        creating internal frame
        JInternalFrame jInternalFrame = new JInternalFrame("Frame 1",true,true,true,true);
        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("Button 1"));
        jPanel.add(new JButton("Button 2"));
//        jInternalFrame.setFrameIcon(new ImageIcon("pp.jpg"));
        jInternalFrame.setVisible(true);
        jInternalFrame.add(jPanel);

//        creating another internal frame

        JInternalFrame jInternalFrame1 = new JInternalFrame("Frame 2");
        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JButton("Button 3"));
        jPanel1.add(new JButton("Button 4"));
        jInternalFrame1.add(jPanel1);
        jInternalFrame1.setVisible(true);



        jFrame.setLayout(new FlowLayout());
        jFrame.add(jInternalFrame1);
        jFrame.add(jInternalFrame);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
