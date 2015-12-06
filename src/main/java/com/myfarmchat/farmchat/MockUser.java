package com.myfarmchat.farmchat;

/**
 *
 * @author JohnyWalker
 */
public class MockUser 
{
    String name = "Johny", lastName = "Walker", email = "JohnyWalker94email.com", password = "12345", username = name + " " + lastName;
    
    public String getName()
    {
        return name;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getEmail()
    {
        return email;
    }
}
