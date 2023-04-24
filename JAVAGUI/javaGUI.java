package JAVAGUI;

import javax.swing.*;
import java.awt.*;


public class javaGUI {

	public static void main(String[] args) {
		
        //WiNDOW TEXT
		JFrame frame = new JFrame("This is a demo");
        //SIZE WIDTH,HEIGHT
		frame.setSize(new Dimension(500,400));
        // X BUTTON ON WINDOW
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // IF ALLOWED TO BE RESIZED
		frame.setResizable(false);
        // IF ALLOWED TO BE VISIBLE (THE WHOLE WINDOW)
		frame.setVisible(true);
        
	}

}
