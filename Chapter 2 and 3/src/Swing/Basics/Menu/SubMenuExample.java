package Swing.Basics.Menu;

import javax.swing.*;

public class SubMenuExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Sub Menu Example");

//        creating a menu bar
        JMenuBar jMenuBar = new JMenuBar();

//        creating a menu
        JMenu jMenu = new JMenu("Menu");

//        creating menu items
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");

//        adding items to jmenu
        jMenu.add(item1);
        jMenu.add(item2);
        jMenu.add(item3);

//        creating a sub menu
        JMenu subMenu = new JMenu("Sub Menu");

//        creating items for submenu
        JMenuItem sub1 = new JMenuItem("Sub Menu 1");
        JMenuItem sub2 = new JMenuItem("Sub Menu 2");
        subMenu.add(sub1);
        subMenu.add(sub2);

        jMenu.add(subMenu);
        jMenuBar.add(jMenu);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
