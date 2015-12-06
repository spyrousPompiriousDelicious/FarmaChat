package UserProfile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Users.*;
/**
 *
 * @author JohnyWalker
 */
public class UserProfile extends JFrame implements ActionListener
{
    MockUser user = new MockUser();
    JLabel titleLabel, usernameLabel, emailLabel;
    JButton editProfileButton;
    
    
    
    UserProfile()
    {
        setTitle(user.getUsername() + "'s profile");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creating labels
        titleLabel = new JLabel(user.getUsername() + "'s profile");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        usernameLabel = new JLabel(user.getUsername());
        emailLabel = new JLabel(user.getEmail());
        editProfileButton = new JButton("Edit profile");
        
        //Modifying label properties
        titleLabel.setBounds(100, 30, 400, 30);
        usernameLabel.setBounds(80, 70, 200, 30);
        emailLabel.setBounds(80, 110, 200, 30);
        editProfileButton.setBounds(150, 160, 100, 30);
        
        //Adding label to the form
        add(titleLabel);
        add(usernameLabel);
        add(emailLabel);
        add(editProfileButton);
        editProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    ProfileConfiguration pc = new ProfileConfiguration(user);
                    pc.setVisible(true);
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
    } 
    
    public void actionPerformed(ActionEvent e)
    {
        showData();
    }
        
    public void showData()
    {
        JFrame f1 = new JFrame();
    }
    
    public static void main(String arr[])
    {
        new UserProfile();
    }
}
