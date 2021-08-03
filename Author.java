package Rhythm_5767441;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rhythm
 */
import java.io.Serializable;
public class Author implements Serializable{
    private String idNumber;
    private String title;
    private String fname;
    private String mname;
    private String lname;
    public Author()
    {
        //null
    }
    public Author(String id,String title,String fname,String mname,String lname)
    {
        this.idNumber=id;
        this.title=title;
        this.fname=fname;
        this.mname=mname;
        this.lname=lname;
    }
    public void setId(String id)
    {
        this.idNumber=id;
    }
    public void setTitle(String value)
    {
        this.title=value;
    }
    public void setFName(String value)
    {
        this.fname=value;
    }
    public void setMName(String value)
    {
        this.mname=value;
    }
    public void setLName(String value)
    {
        this.lname=value;
    }
    public String getId()
    {
        return this.idNumber;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getFirstName()
    {
        return this.fname;
    }
    public String getMiddleName()
    {
        return this.mname;
    }
    public String getLastName()
    {
        return this.lname;
    }
    public String getFullName()
    {
        return this.fname+" "+this.mname+" "+this.lname;
    }
  
    @Override
    public String toString()
    {
      return "ID: "+idNumber+" Title : "+title+" FullName :"+this.getFullName()+"";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Author) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}