package Swing.AdvanceComponents;

import javax.swing.*;

public class DialogsExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        JOptionPane.showMessageDialog(jFrame,
                "Enter Your Name ON Next Dialog",
                "Alert",JOptionPane.WARNING_MESSAGE);


       String input =  JOptionPane.showInputDialog("Enter YOur Name");

       System.out.println(input);

    }
}
