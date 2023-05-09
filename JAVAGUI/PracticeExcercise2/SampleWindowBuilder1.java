package JAVAGUI.PracticeExcercise2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleWindowBuilder1{
	private JFrame frame;
	private JTextField txtName;
	private JButton btnClose;
	private JButton btnReset;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					SampleWindowBuilder1 window = new SampleWindowBuilder1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public SampleWindowBuilder1() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Sample WindowBuilder #1");
		frame.setBounds(100,100,426,263);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter name here");
		lblNewLabel.setFont(new Font("Tahoma",Font.PLAIN,18));
		lblNewLabel.setBounds(123,38,184,30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome to WindowBuilder " + txtName.getText());
			}
		});
		btnSubmit.setFont(new Font("Tahoma",Font.PLAIN,18));
		btnSubmit.setBounds(51,123,111,36);
		frame.getContentPane().add(btnSubmit);
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma",Font.PLAIN,18));
		txtName.setBounds(133,79,111,33);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma",Font.PLAIN,18));
		btnClose.setBounds(172,123,89,36);
		frame.getContentPane().add(btnClose);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnReset.setFont(new Font("Tahoma",Font.PLAIN,18));
		btnReset.setBounds(272,123,89,36);
		frame.getContentPane().add(btnReset);
	}
}
