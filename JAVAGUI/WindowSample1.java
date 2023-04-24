package JAVAGUI;

import java.awt.Color;

import javax.swing.JFrame;

public class WindowSample1 {
    public static void main(String[] args) {
        
            JFrame f = new JFrame();
            // to set visibility (of the whole window)
            f.setVisible(true);
            //size width,height
            f.setSize(350, 300);
            // x button function
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //title setter
            f.setTitle("Window");
            //bg color
            f.getContentPane().setBackground(Color.RED);
    }
}
