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
public class Staff extends User{
   private String position;
   public Staff(String position)
   {
        this.position=position;
   }
   public Staff(String id,String uname,String fname,String lname,String position)
    {
       super(id,uname,fname,lname);
       this.position=position;
    }
    public Staff(String id,String uname,String fname,String lname,String pass,String userType,String position)
    {
        super(id,uname,fname,lname,pass,userType);
        this.position=position;
    }
    public void setPosition(String position)
    {
        this.position=position;
    }
    public String getPosition()
    {
        return this.position;
    }
    @Override
    public String toString()
    {
      return super.toString()+" Position : "+position;
    }
    public Staff clone()
    {
        return this.clone();
    }
}