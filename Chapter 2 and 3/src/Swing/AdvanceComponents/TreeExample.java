package Swing.AdvanceComponents;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Tree Example");

//        college
        DefaultMutableTreeNode college = new DefaultMutableTreeNode("KCT");

//        semester
        DefaultMutableTreeNode semester1 = new DefaultMutableTreeNode("Semester 1");
        DefaultMutableTreeNode semester2 = new DefaultMutableTreeNode("Semester 2");
        DefaultMutableTreeNode semester3 = new DefaultMutableTreeNode("Semester 3");

//        adding semester in college
        college.add(semester1); college.add(semester2); college.add(semester3);

//        adding courses
        DefaultMutableTreeNode sem1Course = new DefaultMutableTreeNode("C Programming");
        DefaultMutableTreeNode sem1Course1 = new DefaultMutableTreeNode("Digital Logic");
        semester1.add(sem1Course);semester1.add(sem1Course1);

        DefaultMutableTreeNode sem2Course = new DefaultMutableTreeNode("Mathmatics");
        DefaultMutableTreeNode sem2Course1 = new DefaultMutableTreeNode("DSA");
        semester2.add(sem2Course); semester2.add(sem2Course1);

        DefaultMutableTreeNode sem3Course = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode sem3Course1 = new DefaultMutableTreeNode("Python");
        semester3.add(sem3Course);semester3.add(sem3Course1);

        JTree jTree = new JTree(college);
        jFrame.add(jTree);
        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
