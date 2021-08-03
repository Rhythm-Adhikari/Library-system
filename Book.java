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
public class Book implements Serializable{
    private String idNumber;
    private String ISBNNumber;
    private String callNumber;
    private String title;
    private String abstractInfo;
    private String publisher;
    private String status;
    public Book()
    {
            //null constructor
    }
    public Book(String id,String isbn,String cnum,String title,String abstractInfo)
    {
        this.idNumber=id;
        this.ISBNNumber=isbn;
        this.callNumber=cnum;
        this.title=title;
        this.abstractInfo=abstractInfo;
    }
    public Book(String id,String isbn,String cnum,String title,String publihser,String status,String abstractInfo)
    {
        this.idNumber=id;
        this.ISBNNumber=isbn;
        this.callNumber=cnum;
        this.title=title;
        this.publisher=publihser;
        this.status=status;
        this.abstractInfo=abstractInfo;
    }
    public void setId(String id)
    {
        this.idNumber=id;
    }
    public void setISBN(String isbn)
    {
        this.ISBNNumber=isbn;
    }
    public void setCallNumber(String cnum)
    {
        this.callNumber=cnum;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAbstractInfo(String info)
    {
        this.abstractInfo=info;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public String getId()
    {
        return this.idNumber;
    }
    public String getISBNNumber()
    {
        return this.ISBNNumber;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getCallNumber()
    {
        return this.callNumber;
    }
    public String getAbstractInfo()
    {
        return this.abstractInfo;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    @Override
    public String toString()
    {
      return "ID: "+idNumber+" ISBN : "+ISBNNumber+" CallNumber :"+callNumber+" Publisher : "+publisher+" Status : "+status;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Book) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}