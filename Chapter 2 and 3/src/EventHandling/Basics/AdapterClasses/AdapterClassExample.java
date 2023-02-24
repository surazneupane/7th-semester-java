package EventHandling.Basics.AdapterClasses;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterClassExample extends JFrame {
    private JPanel jPanel;

    private  JButton jButton;
    private JButton jButton1;

    private JTextArea jTextArea;

    AdapterClassExample(){
 // creating a panel
        jPanel = new JPanel();
//        creating two buttons
        jButton = new JButton("OK");
        jButton1 = new JButton("SOORY");
        jButton.addMouseListener(new CustomMouseEvent());
        jButton1.addMouseListener(new CustomMouseEvent());

//        create text area
        jTextArea = new JTextArea(2,10);
        jTextArea.addKeyListener(new CustomKeyEvent());

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jTextArea);

        setTitle("Adapter Eaxmple");
        add(jPanel);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new AdapterClassExample();
    }

    private class CustomKeyEvent extends KeyAdapter
    {
        public void keyTyped(KeyEvent e) {
            System.out.println("Key Typed And Key Char is:"+e.getKeyChar());
        }
    }

    private class CustomMouseEvent extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource().equals(jButton)) {
                jTextArea.setText("Mouse Entered On OK Button");
            } else if (e.getSource().equals(jButton1)) {
                jTextArea.setText("Mouse Entered On SOORY Button");
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            jTextArea.setText("Mouse Leaved From Button");
        }
    }
}
