/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserProfile;

import Users.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author JohnyWalker
 */
public class ProfileConfiguration extends javax.swing.JFrame implements ActionListener
{
    JLabel titleLabel, nameLabel, lastNameLabel, usernameLabel, emailLabel, oldPassLabel, newPassLabel,newRepeatPassLabel;
    JTextField nameText, lastNameText, usernameText, emailText;
    JPasswordField oldPassText, newPassText, newRepeatPassText;
    JButton nameButton, lastNameButton, usernameButton, emailButton, newRepeatPassButton, refreshPageButton;
    
    public ProfileConfiguration(MockUser user)
    {
        setTitle("Edit" + user.getUsername() + "'s profile");
        setVisible(true);
        setSize(1400, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Form title settings
        titleLabel = new JLabel(user.getUsername() + "'s profile");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        //Creating labels
        nameLabel = new JLabel("Name");
        lastNameLabel = new JLabel("Last name");
        usernameLabel = new JLabel("Username");
        emailLabel = new JLabel("E-mail");
        oldPassLabel = new JLabel("Old password");
        newPassLabel = new JLabel("New password");
        newRepeatPassLabel = new JLabel("Repeat new password");
        
        //Creating text fields
        nameText = new JTextField(user.getName());
        lastNameText = new JTextField(user.getLastName());
        usernameText = new JTextField(user.getUsername());
        emailText = new JTextField(user.getEmail());
        oldPassText = new JPasswordField();
        newPassText = new JPasswordField();
        newRepeatPassText = new JPasswordField();
        
        //Creating buttons
        nameButton = new JButton("Update name");
        lastNameButton = new JButton("Update last name");
        usernameButton = new JButton("Update username");
        emailButton = new JButton("Update email");
        newRepeatPassButton = new JButton("Update password");
        refreshPageButton = new JButton("Refresh");
        
        //Initialize label settings
        titleLabel.setBounds(100, 20, 400, 30);
        nameLabel.setBounds(100, 100, 200, 30);
        lastNameLabel.setBounds(100, 150, 200, 30);
        usernameLabel.setBounds(100, 200, 200, 30);
        emailLabel.setBounds(100, 250, 200, 30);
        oldPassLabel.setBounds(100, 300, 200, 30);
        newPassLabel.setBounds(100, 350, 200, 30);
        newRepeatPassLabel.setBounds(100, 400, 200, 30);
        
        //Initialize text field settings
        nameText.setBounds(300, 100, 200, 30);
        lastNameText.setBounds(300, 150, 200, 30);
        usernameText.setBounds(300, 200, 200, 30);
        emailText.setBounds(300, 250, 200, 30);
        oldPassText.setBounds(300, 300, 200, 30);
        newPassText.setBounds(300, 350, 200, 30);
        newRepeatPassText.setBounds(300, 400, 200, 30);
        
        //Initialize button settings
        nameButton.setBounds(550, 100, 200, 30);
        lastNameButton.setBounds(550, 150, 200, 30);
        usernameButton.setBounds(550, 200, 200, 30);
        emailButton.setBounds(550, 250, 200, 30);
        newRepeatPassButton.setBounds(550, 400, 200, 30);
        refreshPageButton.setBounds(550, 450, 200, 30);
        
        //Adding labels
        add(titleLabel);
        add(nameLabel);
        add(lastNameLabel);
        add(usernameLabel);
        add(emailLabel);
        add(oldPassLabel);
        add(newPassLabel);
        add(newRepeatPassLabel);
        
        //Adding text fields
        add(nameText);
        add(lastNameText);
        add(usernameText);
        add(emailText);
        add(oldPassText);
        add(newPassText);
        add(newRepeatPassText);
        
        //Adding buttons and coding their function
        add(nameButton);
        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    user.setName(nameText.getText());
                    JOptionPane.showMessageDialog(null, "Your name has been updated");
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        add(lastNameButton);
        lastNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    user.setLastName(lastNameText.getText());
                    JOptionPane.showMessageDialog(null, "Your last name has been updated");
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        add(usernameButton);
        usernameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    user.setUsername(usernameText.getText());
                    JOptionPane.showMessageDialog(null, "Your username has been updated");
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        add(emailButton);
        emailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    user.setEmail(emailText.getText());
                    JOptionPane.showMessageDialog(null, "Your email has been updated");
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        add(newRepeatPassButton);
        newRepeatPassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    if(oldPassText.getText().equals(user.getPassword()))
                    {
                        if(newPassText.getText().equals(newRepeatPassText.getText()))
                        {
                            user.setPassword(newRepeatPassText.getText());
                            JOptionPane.showMessageDialog(null, "Your password has been updated");
                        }else
                        {
                            JOptionPane.showMessageDialog(null, "New password does not match with repeat new password. Please try again");
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect password. Please try again");
                    }
                    
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        
        add(refreshPageButton);
        refreshPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    nameText.setText(user.getName());
                    lastNameText.setText(user.getLastName());
                    usernameText.setText(user.getUsername());
                    emailText.setText(user.getEmail());
                    oldPassText.setText("");
                    newPassText.setText("");
                    newRepeatPassText.setText("");
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
     
    //Creating showData
    public void showData()
    {
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(800, 800);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Running Profile Configuration
    public static void main(String arr[])
    {
        MockUser user = new MockUser();
        new ProfileConfiguration(user);
    }
}
