package com.myfarmchat.farmchat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

//import org.hibernate.HibernateException; 
import org.hibernate.Query;
import org.hibernate.Session; 
//import org.hibernate.Transaction;

/**
 *
 * @author sothria
 */
public class Register extends JFrame implements ActionListener {
    //AppUser user = new AppUser();
    JLabel titleLabel, usernameLabel, firstNameLabel, lastNameLabel,emailLabel, passwordLabel;
    JTextField usernameTextField, firstNameTextField, lastNameTextField, emailTextField;
    JPasswordField passwordField;
    JButton registerButton;
    String username, firstName, lastName, email;
    String password;
   
    /*
    * dhmiourgia formas
    */
    Register()
    {
        setTitle("Register to Farmchat");
        //setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        titleLabel = new JLabel("Register");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        
        usernameLabel = new JLabel("Username: ");
        firstNameLabel = new JLabel("First Name: ");
        lastNameLabel = new JLabel("Last Name: ");
        emailLabel = new JLabel("E-mail: ");
        passwordLabel = new JLabel("Password: ");
        registerButton = new JButton("Register");
        
        titleLabel.setBounds(100, 30, 400, 30);
        usernameLabel.setBounds(80, 70, 200, 30);
        usernameTextField.setBounds(120, 70, 240, 30);
        firstNameLabel.setBounds(80, 110, 240, 30);
        firstNameTextField.setBounds(120, 110, 240, 30);
        lastNameLabel.setBounds(80, 150, 280, 30);
        lastNameTextField.setBounds(120, 150, 280, 30);
        emailLabel.setBounds(80, 190, 320, 30);
        emailTextField.setBounds(120, 190, 320, 30);
        passwordLabel.setBounds(80, 230, 360, 30);
        passwordField.setBounds(120, 230, 360, 30);
        registerButton.setBounds(150, 270, 100, 30);
        
        add(titleLabel);
        add(usernameLabel);
        add(usernameTextField);
        add(firstNameLabel);
        add(firstNameTextField);
        add(lastNameLabel);
        add(lastNameTextField);
        add(emailLabel);
        add(emailTextField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        registerButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DBAddUser();
    }
    
    
    /*
    * dhmiourgei ton user kai kanei eisagwgh sth bash
    */
    private void DBAddUser() {
        
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();      //
        session.getTransaction().begin();                                       //arxizei h epikoinwnia me th bash
        
        username = usernameTextField.getText();
        firstName = firstNameTextField.getText();
        lastName = lastNameTextField.getText();
        email = emailTextField.getText();
        password = passwordField.getText();
        
        AppUser user = new AppUser(username, firstName, lastName, email, password); 
        
        Query query = session.createQuery("insert into users(name, email, username, password)");
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        session.getTransaction().commit();
        session.close();
        
        this.dispose();
        Login loginfrm = new Login(); 
        loginfrm.setVisible(true);
        
    }
}
