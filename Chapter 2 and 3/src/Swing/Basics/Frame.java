package Swing.Basics;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("New Frame");
        jFrame.setSize(500,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
