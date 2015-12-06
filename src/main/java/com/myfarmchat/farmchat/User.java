
package com.myfarmchat.farmchat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 * 
 * @author JohnyWalker
 */
public interface User 
{
    public void setFirstName(String newName);
    public String getFirstName();
    
    public void setPassword(String newPassword);
    public String getPassword();
    
    public void setEmail(String newEmail);
    public String getEmail();
}
