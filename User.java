package Rhythm_5767441;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rrhythm
 */
import java.io.Serializable;
public class User implements Serializable,Cloneable 
{
    private String idNumber;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String userType;
    public User()
    {
            //null constructor
    }
    public User(String id,String uname,String fname,String lname)
    {
        this.idNumber=id;
        this.userName=uname;
        this.firstName=fname;
        this.lastName=lname;
    }
    public User(String id,String uname,String fname,String lname,String pass,String userType)
    {
        this.idNumber=id;
        this.userName=uname;
        this.firstName=fname;
        this.lastName=lname;
        this.password=pass;
        this.userType=userType;
    }
    public void setId(String id)
    {
        this.idNumber=id;
    }
    public void setFName(String fname)
    {
        this.firstName=fname;
    }
    public void setLName(String lname)
    {
        this.lastName=lname;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void setUserType(String userType)
    {
        this.userType=userType;
    }
    public String getId()
    {
        return this.idNumber;
    }
    public String getFullName()
    {
        return this.firstName+" "+this.lastName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public String getUserPassword()
    {
        return this.password;
    }
    public String getUserType()
    {
        return this.userType;
    }
    @Override
    public String toString()
    {
      return "ID: "+idNumber+" User Name : "+userName+" FullName :"+firstName+lastName+" Type : "+userType;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User) super.clone(); 
    }
  
}