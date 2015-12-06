package com.myfarmchat.farmchat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

/**
 *
 * @author JohnyWalker
 */
public class UserProfile extends JFrame implements ActionListener
{
    AppUser user = new AppUser();
    JLabel titleLabel, nameLabel, emailLabel;
    JButton editProfileButton;
    
    UserProfile()
    {
        setTitle("Main page in Windows Form");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        titleLabel = new JLabel(user.getFirstName() + "'s profile");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        nameLabel = new JLabel(user.getFirstName());
        emailLabel = new JLabel(user.getEmail());
        editProfileButton = new JButton("Edit profile");
        
        titleLabel.setBounds(100, 30, 400, 30);
        nameLabel.setBounds(80, 70, 200, 30);
        emailLabel.setBounds(80, 110, 200, 30);
        editProfileButton.setBounds(150, 160, 100, 30);
        
        add(titleLabel);
        add(nameLabel);
        add(emailLabel);
        add(editProfileButton);
        editProfileButton.addActionListener(this);
    }
    
    @Override
        public void actionPerformed(ActionEvent e)
    {
        showData();
    }
        
        public void showData()
        {
            JFrame f1 = new JFrame();
        }
}
