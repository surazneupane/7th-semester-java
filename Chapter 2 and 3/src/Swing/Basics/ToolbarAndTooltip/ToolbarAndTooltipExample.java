package Swing.Basics.ToolbarAndTooltip;

import javax.swing.*;
import java.awt.*;

public class ToolbarAndTooltipExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Toolbar And ToolTip");

        String[] jComboBoxItems =
                {"Item 1","Item 2","Item 3"};

//        crating a panel
        JPanel jPanel = new JPanel();
        JButton button1 = new  JButton("Button 1");
//        adding tooltip text
        button1.setToolTipText("This is button 1");
        jPanel.add(button1);
        jPanel.add(new JButton("Button 2"));
        jPanel.add(new JComboBox<>(jComboBoxItems));

//        creating a toolbar
        JToolBar jToolBar = new JToolBar("JToolbar");
        jToolBar.add(jPanel);

//        creating another jpanel
        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JButton("Button 3"));
        jPanel1.add(new JButton("Button 4"));
        jPanel1.add(new JButton("Button 5"));

        //        creating another toolbar
        JToolBar jToolBar1 = new JToolBar("JToolbar 1");
        jToolBar1.add(jPanel1);

//        adding toolbar to frame
        jFrame.setLayout(new BorderLayout());
        jFrame.add(jToolBar,BorderLayout.NORTH);
        jFrame.add(jToolBar1,BorderLayout.SOUTH);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
