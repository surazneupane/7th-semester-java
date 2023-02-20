package Swing.Basics.ControlFields;

import javax.swing.*;

public class ControlFields {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
//        adding label
        JLabel jLabel = new JLabel("Label 1");
        jLabel.setBounds(20,50,100,50);
//        Adding Text Field
        JTextField jTextField = new JTextField("Text Field 1");
        jTextField.setBounds(100,50,100,40);
//        jTextField.setEditable(false);


//        Password Field
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(200,50,100,40);

//        check boxes
        JCheckBox jCheckBox1 = new JCheckBox("Checkbox1");
        JCheckBox jCheckBox2 = new JCheckBox("Checkbox2");

        jCheckBox1.setBounds(300,30,100,40);
        jCheckBox2.setBounds(300,80,100,40);

//        adding radio button
        JRadioButton jRadioButton = new JRadioButton("Radio Button 1");
        jRadioButton.setBounds(400,30,200,40);

        JRadioButton jRadioButton1 = new JRadioButton("Radio Button 2");
        jRadioButton1.setBounds(400,80,200,40);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);

//        adding j combo box
        Integer jComboValues[] = {1,2,3};
        JComboBox jComboBox = new JComboBox(jComboValues);
        jComboBox.setBounds(20,100,100,40);

        jFrame.add(jComboBox);
        jFrame.add(jRadioButton);
        jFrame.add(jRadioButton1);
        jFrame.add(jCheckBox1);
        jFrame.add(jCheckBox2);
        jFrame.add(jPasswordField);
        jFrame.add(jTextField);
        jFrame.add(jLabel);
        jFrame.setSize(800,800);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
