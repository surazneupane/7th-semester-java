package Swing.Basics.Layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
//        create frame
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Grid Layout Example");

        //       create buttons
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");

//        set Layout
        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(3);
        gridLayout.setColumns(3);
        gridLayout.setHgap(10);
        gridLayout.setVgap(5);
        jFrame.setLayout(gridLayout);


        // adding buttons to frame
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jButton5);
        jFrame.add(jButton6);
        jFrame.add(jButton7);
        jFrame.add(jButton8);
        jFrame.add(jButton9);


        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
