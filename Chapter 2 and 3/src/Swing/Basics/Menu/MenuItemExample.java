package Swing.Basics.Menu;

import javax.swing.*;

public class MenuItemExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Menu Item Example");

//        creating a menu bar
        JMenuBar jMenuBar = new JMenuBar();

//        creating a menu
        JMenu menu1 = new JMenu("Menu 1");

//        creating menu items for menu 1
        JMenuItem item1 = new JMenuItem("Menu 1.1");
        JMenuItem item2 = new JMenuItem("Menu 1.2");
        JMenuItem item3 = new JMenuItem("Menu 1.3");
        JMenuItem item4 = new JMenuItem("Menu 1.4");
//        adding items to menu1

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        JMenu menu2 = new JMenu("Menu 2");


//        creating items for menu 2
        JMenuItem item5 = new JMenuItem("Menu 2.1");
        JMenuItem item6 = new JMenuItem("Menu 2.2");

//        adding items to menu2
        menu2.add(item5);
        menu2.add(item6);


//        adding menu to menu bar
        jMenuBar.add(menu1);
        jMenuBar.add(menu2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
