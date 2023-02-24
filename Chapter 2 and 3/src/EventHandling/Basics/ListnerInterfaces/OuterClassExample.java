package EventHandling.Basics.ListnerInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuterClassExample extends JFrame {
    private JPanel jPanel;

    private  JButton jButton;

    private JButton jButton1;

    private JTextArea jTextArea;

    OuterClassExample(){
        //       creating a panel
        jPanel = new JPanel();
//        creating two buttons
        jButton = new JButton("OK");
        jButton1 = new JButton("SOORY");

        jButton.addActionListener(new CustomActionListner());
        jButton1.addActionListener(new CustomActionListner());

//        create text area
        jTextArea = new JTextArea(2,10);
        jTextArea.addMouseListener(new CustomMouseListner());

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jTextArea);

        setTitle("Listner Interface Using Outer Class");
        add(jPanel);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new OuterClassExample();
    }

    private  class CustomActionListner implements ActionListener {
       public void actionPerformed(ActionEvent actionEvent){
           String buttonName = actionEvent.getActionCommand();
           if(buttonName == "OK")
           {
               jTextArea.setText("You Pressed ok button");
           } else if (buttonName == "SOORY") {
               jTextArea.setText("You pressed soory button");
           }
        }

    }

    private class  CustomMouseListner implements MouseListener{
       public void mouseClicked(MouseEvent var1){
           jTextArea.setText("Mouse Clicked");
        }

       public void mousePressed(MouseEvent var1){
           jTextArea.setText("Mouse Pressed");
        }

        public  void mouseReleased(MouseEvent var1){
            jTextArea.setText("Mouse Released");
        }

        public void mouseEntered(MouseEvent var1){
            jTextArea.setText("Mouse Entered");
        }

        public void mouseExited(MouseEvent var1){
            jTextArea.setText("Mouse Exited");
        }
    }
}
