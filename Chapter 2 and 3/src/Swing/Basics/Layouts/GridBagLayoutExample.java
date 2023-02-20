package Swing.Basics.Layouts;

import javax.swing.*;
import java.awt.*;
public class GridBagLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayoutDemo");

        GridBagLayout gridBagLayout = new GridBagLayout();
        frame.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();

        JButton button1 = new JButton("Button 1");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(button1,constraints);

        JButton button2 = new JButton("Button 2");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 1;
        constraints.gridy = 0;
        frame.add(button2,constraints);

        JButton button3 = new JButton("Button 3");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 2;
        constraints.gridy = 0;
        frame.add(button3,constraints);

        JButton button4 = new JButton("Long-Named Button 4");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 3; // 3 columns wide
        frame.add(button4, constraints);

        JButton button5 = new JButton("Button 5");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END; //bottom of space
        constraints.insets = new Insets(10,0,0,0);  //top margin
        constraints.gridx = 1;       //aligned with button 2
        constraints.gridy = 2;       //third row
        constraints.gridwidth = 2;   //2 columns wide
        frame.add(button5, constraints);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}