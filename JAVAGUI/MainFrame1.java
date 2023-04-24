package JAVAGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        JLabel sample= new JLabel("This is a sample label");
        frame.getContentPane().setLayout(null);
        frame.setSize(400, 300);
        frame.getContentPane().add(sample);
        sample.setBounds(50,100,200,20);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        }
        
