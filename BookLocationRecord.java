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
import java.util.ArrayList;
public class BookLocationRecord {
    private String locationId;
    private ArrayList<String> bookIds;
    public BookLocationRecord(String locationId)
    {
        this.locationId=locationId;
        bookIds=new ArrayList<String>();
    }
    public void addNewBook(String id)
    {
        bookIds.add(id);
    }
  public void removeAuthor(String id)
  {
    for(int i=0;i<this.bookIds.size();i++)
    {
        if(this.bookIds.get(i)==id || this.bookIds.get(i).equals(id))
        {
            bookIds.remove(i);
            break;
        }
    }
  }
    public String getLocationId()
    {
        return this.locationId;
    }
    public ArrayList<String> getBookList()
    {
        return this.bookIds;
    }
}