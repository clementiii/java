package JAVAGUI.PracticeExercise1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Creating LoginFrame class
public class JavaFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");

    JavaFrame(){
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    
    public void setLayoutManager(){
        container.setLayout(null);
    }

    public void setLocationAndSize(){
        userLabel.setBounds(50, 50, 100, 30);
        passwordLabel.setBounds(50, 120, 100, 30);
        userTextField.setBounds(150, 50, 150, 30);
        passwordField.setBounds(150, 120, 150, 30);
        showPassword.setBounds(150, 150, 150, 30);
        loginButton.setBounds(50, 200, 100, 30);
        resetButton.setBounds(200, 200, 100, 30);
    }

    public void addComponentsToContainer(){
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent(){
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //Coding part of LOGIN button
        if(e.getSource() == loginButton){
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if(userText.equalsIgnoreCase("x") && pwdText.equalsIgnoreCase("1")){
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
        //Coding Part of RESET button
        if(e.getSource() == resetButton){
            userTextField.setText("");
            passwordField.setText("");
        }
        //Coding Part of showPassword JCheckBox
        if(e.getSource() == showPassword){
            passwordField.setEchoChar((char)0);
        }else {
            passwordField.setEchoChar('*');
        }
    }
}

