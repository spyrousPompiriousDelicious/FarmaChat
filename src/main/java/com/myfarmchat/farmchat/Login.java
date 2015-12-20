/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//include page="${pageContext.request.contextPath}/header.jsp"
package com.myfarmchat.farmchat;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.hibernate.Session;
/**
 *
 * @author Tony-Driver
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
        
        try {
            addUser();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void addUser() throws ClassNotFoundException, SQLException {
        JFrame f1 = new JFrame();
        JLabel l, l0;
 
        String str1 = usernameTextField.getText();
        char[] p = passwordField.getPassword();
        String str2 = new String(p);
            Session session = HibernateUtil.getSessionFactory().openSession();
            Integer userID = null;
            User user = (User) new UserProfile();
            session.getTransaction().begin();  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");
            PreparedStatement ps = con.prepareStatement("select name from reg where email=? and pass=?");
            ps.setString(1, str1);
            ps.setString(2, str2);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                f1.setVisible(true);
                f1.setSize(600, 600);
                f1.setLayout(null);
                l = new JLabel();
                l0 = new JLabel("you are succefully logged in..");
                l0.setForeground(Color.blue);
                l0.setFont(new Font("Serif", Font.BOLD, 30));
                l.setBounds(60, 50, 400, 30);
                l0.setBounds(60, 100, 400, 40);
 
                f1.add(l);
                f1.add(l0);
                l.setText("Welcome " + rs.getString(1));
                l.setForeground(Color.red);
                l.setFont(new Font("Serif", Font.BOLD, 30));
                userID = (Integer) session.save(user); 
                session.getTransaction().commit();
                rs.close();
                ps.close();
                session.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                   "Incorrect email-Id or password..Try Again with correct detail");
            }
    }
}