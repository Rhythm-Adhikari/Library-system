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
public class Location implements Serializable{
    private String idNumber;
    private String campusName;
    private String floor;
    private String shelfNumber;
    public Location()
    {
        //null
    }
    public Location(String id,String cname,String floor,String shelf)
    {
        this.idNumber=id;
        this.campusName=cname;
        this.floor=floor;
        this.shelfNumber=shelf;
    }
    public void setId(String id)
    {
        this.idNumber=id;
    }
    public void setFloor(String id)
    {
        this.floor=id;
    }
    public void setCampusName(String id)
    {
        this.campusName=id;
    }
    public void setShelf(String id)
    {
        this.shelfNumber=id;
    }
    public String getId()
    {
        return this.idNumber;
    }
    public String getCampusName()
    {
        return this.campusName;
    }
    public String getFloor()
    {
        return this.floor;
    }
    public String getShelfNumber()
    {
        return this.shelfNumber;
    }
    @Override
    public String toString()
    {
      return "ID: "+idNumber+" Campus Name : "+campusName+" Floor :"+floor+" Shelf Number : "+shelfNumber;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Author) super.clone(); 
    }
}