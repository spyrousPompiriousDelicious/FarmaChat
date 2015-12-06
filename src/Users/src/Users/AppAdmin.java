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
public class AppAdmin implements User
{
    String name, email;
    char[] password;
    
    //Methods for setting & getting information
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        
        return name;
    }
    
    public void setPassword(char[] newPassword)
    {
        password = newPassword;
    }
    public char[] getPassword()
    {
        
        return password;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    public String getEmail()
    {
        
        return email;
    }
}
