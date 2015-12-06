package com.myfarmchat.farmchat;

/**
 *
 * @author sothria
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Index extends JFrame implements ActionListener {
    
    JButton registerButton, loginButton;
    JLabel titleLabel;
    
    Index()
    {
        setTitle("Main page in Windows Form");
        //setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        titleLabel = new JLabel("Farmchat");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        registerButton = new JButton("Register Here");
        loginButton = new JButton("Login Here");
        
        titleLabel.setBounds(100, 30, 400, 30);
        registerButton.setBounds(200, 100, 100, 30);
        registerButton.setBounds(200, 150, 100, 80);
        
        add(titleLabel);
        add(registerButton);
        add(loginButton);
        registerButton.addActionListener(this);
        registerButton.setActionCommand("register");
        loginButton.addActionListener(this);
        loginButton.setActionCommand("login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        switch (action) {
            case "register":
                this.dispose();
                JFrame registerfrm = new Register();
                registerfrm.setVisible(true);
                break;
            case "login":
                //this.dispose();
                //JFrame loginfrm = new Login();
                //loginfrm.setVisible(true);
                break;
        }
    }
    
}
