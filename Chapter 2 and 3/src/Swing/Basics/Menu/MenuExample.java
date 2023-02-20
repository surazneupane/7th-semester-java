package Swing.Basics.Menu;

import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Menu Example");

//        creating a menu bar
        JMenuBar jMenuBar = new JMenuBar();

//        creating menu
        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");
        JMenu menu3 = new JMenu("Menu 3");

//        adding menu to menu bar
        jMenuBar.add(menu1);
        jMenuBar.add(menu2);
//        disabling a menu (non clickable)
        menu3.disable();
        jMenuBar.add(menu3);


        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
