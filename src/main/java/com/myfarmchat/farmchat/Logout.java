/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfarmchat.farmchat;

import javax.swing.JFrame;
import org.hibernate.Session;

/**
 *
 * @author Tony-Driver
 */
public class Logout {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public void Logout() throws Throwable
    {      
        try{ 
            if(session!=null){
            session.disconnect();
            //JFrame indexframe = new Index(); 
            JFrame indexframe = new JFrame("Index.jsp");
            indexframe.setVisible(true);     
            }
        }
        catch(Exception ex){
            System.out.println("Error");
        }
    }
}
