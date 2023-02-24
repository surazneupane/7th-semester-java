package EventHandling.Basics.ListnerInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ImplementationExample extends JFrame implements ActionListener, KeyListener {
    private JPanel jPanel;

    private  JButton jButton;

    private JButton jButton1;

    private JTextArea jTextArea;
    ImplementationExample(){
//       creating a panel
        jPanel = new JPanel();
//        creating two buttons
        jButton = new JButton("OK");
        jButton1 = new JButton("SOORY");

        jButton.addActionListener(this);
        jButton1.addActionListener(this);

//        create text area
        jTextArea = new JTextArea(2,10);
        jTextArea.addKeyListener(this);

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jTextArea);

        setTitle("Listner Interface");
        add(jPanel);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImplementationExample();
    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        String buttonName = actionEvent.getActionCommand();
        if(buttonName == "OK")
        {
            jTextArea.setText("You Pressed ok button");
        } else if (buttonName == "SOORY") {
            jTextArea.setText("You pressed soory button");
        }
    }

   public void keyTyped(KeyEvent keyEvent){
       System.out.println("Key Typed: And Key is:"+
               keyEvent.getKeyChar());
    }

    public  void keyPressed(KeyEvent keyEvent){
        System.out.println("Key Pressed: And Key Code id:"+
                keyEvent.getKeyCode());
    }

    public  void keyReleased(KeyEvent keyEvent){
        System.out.println("Key is Released : And Key location is :"+
                keyEvent.getKeyLocation());
    }
}
