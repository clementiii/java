package JAVAGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame {
    public static void main(String[] args) {
        
            // Window (with name)
            JFrame frame = new JFrame("Test Frame");
            //label object
            JLabel sample = new JLabel("This is a sample label");
            frame.setSize(400,300);
            //put text(label)
            frame.getContentPane().add(sample);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
