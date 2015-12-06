package Users;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnyWalker
 */

//Implemanting interface of User
public interface User 
{
    public void setName(String newName);
    public String getName();
    
    public void setPassword(char[] newPassword);
    public char[] getPassword();
    
    public void setEmail(String newEmail);
    public String getEmail();
}
