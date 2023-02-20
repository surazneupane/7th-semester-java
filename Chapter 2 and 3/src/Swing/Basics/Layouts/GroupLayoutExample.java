package Swing.Basics.Layouts;

import javax.swing.*;

import static javax.swing.GroupLayout.Alignment.*;

public class GroupLayoutExample {


    public static void main(String args[]) {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        frame.getContentPane().setLayout(groupLayout);

        JButton b1 = new JButton("Button One");
        JButton b2 = new JButton("Button Two");
        JButton b3 = new JButton("Button Three");

//        SequentialGroup positions its child sequentially one after another
//        whereas ParallelGroup aligns its child on top of each other.
        groupLayout.
                setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup().addComponent(b1).addComponent(b3))
                .addGroup(groupLayout.createParallelGroup().addComponent(b2)));

        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup
                        (groupLayout.createParallelGroup().addComponent(b1).addComponent(b2))
                .addGroup(groupLayout.createParallelGroup().addComponent(b3)));

        frame.pack();
        frame.setVisible(true);
    }
}