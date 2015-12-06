/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfarmchat.farmchat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sothria
 */
public class Login extends JFrame implements ActionListener{
    
    JLabel titleLabel, usernameLabel, firstNameLabel, lastNameLabel,emailLabel, passwordLabel;
    JTextField usernameTextField, firstNameTextField, lastNameTextField, emailTextField;
    JPasswordField passwordField;
    JButton loginButton;
    String username, firstName, lastName, email;
    String password;
   
    /*
    * dhmiourgia formas
    */
    Login()
    {
        setTitle("Login to Farmchat");
        //setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        titleLabel = new JLabel("Login");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        loginButton = new JButton("Register");
        
        titleLabel.setBounds(100, 30, 400, 30);
        usernameLabel.setBounds(80, 70, 200, 30);
        usernameTextField.setBounds(120, 70, 240, 30);
        passwordLabel.setBounds(80, 230, 360, 30);
        passwordField.setBounds(120, 230, 360, 30);
        loginButton.setBounds(150, 270, 100, 30);
        
        add(titleLabel);
        add(usernameLabel);
        add(usernameTextField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}