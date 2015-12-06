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
public class AppUser
{
    String name, lastName, username, email, password;
    
    //Methods for setting & getting information
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setUsername(String newUsername)
    {
        username = newUsername;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public String getEmail()
    {
        
        return email;
    }
    
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
    
    public String getPassword()
    {
        
        return password;
    }
}
