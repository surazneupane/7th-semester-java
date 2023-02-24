package EventHandling.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GapsExample extends JFrame {
    private JComboBox verticalCombo;
    private JComboBox horizontalCombo;
    private static String[] gaps= {"0","5","10","15"};
    private JButton applyButton;

    private  JPanel buttonsGroup;

    private GridLayout buttonGroupLayout = new GridLayout(0,2);

    GapsExample(){
    //create a panel for buttons
        buttonsGroup = new JPanel(buttonGroupLayout);
        buttonsGroup.add(new JButton("Button 1"));
        buttonsGroup.add(new JButton("Button 2"));
        buttonsGroup.add(new JButton("Button 3"));
        buttonsGroup.add(new JButton("Button 4"));
        buttonsGroup.add(new JButton("Button 5"));

    //  create a panel for action components
        JPanel actionPanel = new JPanel(new GridLayout(2,3));
        actionPanel.add(new JLabel("Horizintal Gap:"));
        actionPanel.add(new JLabel("Vertical Gap:"));
        actionPanel.add(new JLabel(""));

//        initialize action components
        verticalCombo = new JComboBox(gaps);
        horizontalCombo = new JComboBox(gaps);
        applyButton = new JButton("Apply");

//        applyButton.addActionListener(new CustomCLickEvent());
        horizontalCombo.addItemListener(new CustomItemEvent());
        verticalCombo.addItemListener(new CustomItemEvent());

        actionPanel.add(horizontalCombo);
        actionPanel.add(verticalCombo);
        actionPanel.add(applyButton);


        add(buttonsGroup,BorderLayout.NORTH);
        add(actionPanel,BorderLayout.SOUTH);
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GapsExample();
    }

    private class CustomItemEvent implements ItemListener{
        public void itemStateChanged(ItemEvent actionEvent){

            String horComboValue =  horizontalCombo.getSelectedItem().toString();
           String verComboValue =  verticalCombo.getSelectedItem().toString();
           buttonGroupLayout.setHgap(Integer.parseInt(horComboValue));
           buttonGroupLayout.setVgap(Integer.parseInt(verComboValue));
           buttonGroupLayout.layoutContainer(buttonsGroup);
        }
    }

//    private class CustomCLickEvent implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//           String horComboValue =  horizontalCombo.getSelectedItem().toString();
//           String verComboValue =  verticalCombo.getSelectedItem().toString();
//
//           buttonGroupLayout.setHgap(Integer.parseInt(horComboValue));
//           buttonGroupLayout.setVgap(Integer.parseInt(verComboValue));
//
//           buttonGroupLayout.layoutContainer(buttonsGroup);
//        }
//    }

}
