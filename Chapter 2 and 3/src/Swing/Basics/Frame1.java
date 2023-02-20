package Swing.Basics;

import javax.swing.*;

public class Frame1 extends JFrame {
    public Frame1(){
        super("New Frame");
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1();
    }

}
