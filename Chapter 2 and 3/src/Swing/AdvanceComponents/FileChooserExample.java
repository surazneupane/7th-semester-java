package Swing.AdvanceComponents;

import javax.swing.*;

public class FileChooserExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showSaveDialog(jFrame);
    }
}
