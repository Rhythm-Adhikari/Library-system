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
public class BookAuthorRecord {
    private String bookId;
    private ArrayList<String> authorIds;
    public BookAuthorRecord(String bookId)
    {
        this.bookId=bookId;
        authorIds = new ArrayList<String>();
    }
    public void addNewAuthor(String id)
    {
        authorIds.add(id);
    }
  public void removeAuthor(String id)
  {
    for(int i=0;i<this.authorIds.size();i++)
    {
        if(this.authorIds.get(i)==id || this.authorIds.get(i).equals(id))
        {
            authorIds.remove(i);
            break;
        }
    }
  }
    public String getBookId()
    {
        return bookId;
    }
    public ArrayList<String> getAuthorList()
    {
        return this.authorIds;
    }
}