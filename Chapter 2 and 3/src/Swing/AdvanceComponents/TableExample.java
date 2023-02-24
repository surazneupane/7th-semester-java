package Swing.AdvanceComponents;

import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Table example");

        String[] column = {
                "ID","NAME","LAST NAME"
        };

        String[][] data = {
                {"101","Milan","Basnet"},
                {"102","Ashish","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},
                {"103","Anup","Shrestha"},

        };

        JTable jTable = new JTable(data,column);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

//        making table scrollable
        JScrollPane jScrollPane = new JScrollPane(jTable);

        jFrame.add(jScrollPane);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
