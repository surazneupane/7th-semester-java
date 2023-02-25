package EventHandling.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdditionSubtractionExample extends JFrame {

    private JLabel input1Label;
    private JLabel input2Label;
    private JTextField input1;
    private JTextField input2;
    private  JButton addButton;
    private JButton subButton;
    private JLabel outputLabel;
    AdditionSubtractionExample(){
//        panel to hold label and input fields
        JPanel jPanel = new JPanel(new GridLayout(0,2));
//        label1
        input1Label = new JLabel("Enter a number:");
        jPanel.add(input1Label);
//        input1
        input1 = new JTextField();
        jPanel.add(input1);

//        label2
        input2Label = new JLabel("Enter another number:");
        jPanel.add(input2Label);

        //        input 2
        input2 = new JTextField();
        jPanel.add(input2);

//        panel for buttons
        JPanel jPanel1 = new JPanel(new GridLayout(0,2));
        addButton = new JButton("Add +");
        subButton = new JButton("Sub -");
        outputLabel = new JLabel("");
        jPanel1.add(addButton);
        jPanel1.add(subButton);

//        register events
        addButton.addMouseListener(new CustomClickEvent());
        subButton.addMouseListener(new CustomClickEvent());

        jPanel1.add(outputLabel);

//        adding to frame
        add(jPanel,BorderLayout.CENTER);
        add(jPanel1,BorderLayout.SOUTH);
        setTitle("Addition Subtraction");
        setVisible(true);
        setSize(400,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AdditionSubtractionExample();
    }

    private class CustomClickEvent extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
                try {
                    Integer input1Value = Integer.parseInt(input1.getText());
                    Integer input2Value = Integer.parseInt(input2.getText());

                    if (e.getSource().equals(addButton)) {
                        Integer addition = input1Value + input2Value;
                        outputLabel.setText("The result is: " + addition);
                    } else if (e.getSource().equals(subButton)) {
                        Integer subtraction = input1Value - input2Value;
                        outputLabel.setText("The result is: " + subtraction);
                    }
                }
                catch (Exception exception)
                {
                    outputLabel.setText("Enter valid numbers.");
                }
                }
    }

}
