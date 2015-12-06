/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfarmchat.farmchat;

import javax.swing.SwingUtilities;

/**
 *
 * @author sothria
 */
public class Farmchat {
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run()
            {
                new Index().setVisible(true);
            }

        });
    }
    
}
