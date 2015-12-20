/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfarmchat.farmchat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import org.hibernate.Session;

/**
 *
 * @author Tony-Driver
 */
public class Logout implements ActionListener {
    public void logout() throws Throwable
    {                  
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.disconnect();
            
        JFrame indexframe = new JFrame("Index.java");
        indexframe.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
