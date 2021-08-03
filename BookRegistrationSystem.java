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

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class BookRegistrationSystem  extends JPanel{
    private String bookFile,authorFile,locationFile;
    private ArrayList<Book> books;
    private ArrayList<Author> authors;
    private ArrayList<Location> locations;
    private JPanel panel;
    public BookInformationDisplay _bookInfoDisplay;
    private JButton backBtn,cBtn,qBtn,sBtn;
    private CreateBook _createBook;
    public BookAuthorQuery _bookQuery;
    private MainSystem _sys;
    public BookRegistrationSystem()
    {
        bookFile="books.dat";
        authorFile="authors.dat";
        locationFile="locations.dat";
        books = new ArrayList<Book>();
        authors = new ArrayList<Author>();
        locations = new ArrayList<Location>();
        ReadBookInformationFromFile(bookFile);
        ReadAuthorInformationFromFile(authorFile);
        ReadLocationInformationFromFile(locationFile);
    }
    public BookRegistrationSystem(MainSystem sys)
    {
        bookFile="books.dat";
        authorFile="authors.dat";
        locationFile="locations.dat";
        books = new ArrayList<Book>();
        authors = new ArrayList<Author>();
        locations = new ArrayList<Location>();
        _sys=sys;
        _createBook= new CreateBook(this);
        _bookQuery=new BookAuthorQuery(this);
        _bookInfoDisplay = new BookInformationDisplay(this);
        backBtn = new JButton("Back");
        cBtn = new JButton("Create Book");
        qBtn = new JButton("Query Book");
        sBtn = new JButton("Save All To File");
        ReadBookInformationFromFile(bookFile);
        ReadAuthorInformationFromFile(authorFile);
        ReadLocationInformationFromFile(locationFile);
        sBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                WriteBookInformationToFile(books);
                WriteAuthorInformationToFile(authors);
                WriteLocationInformationToFile(locations);
			}
        });
        backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToMain();
			}
        });
        cBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.CreateNewBook();
			}
        });
        qBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                ShowBookQueryPage();
			}
		});
        JPanel p = new JPanel();
        p.add(cBtn);
        p.add(qBtn);
		p.add(sBtn);
		p.add(backBtn);
		panel=p;
    }
    public void SearchAndDisplayInformation(String qry)
    {
        String result="No Result Found";
        //search here
        //try to find by title
        for(int i=0;i<books.size();i++)
        {
            if(books.get(i).getTitle()==qry || books.get(i).getTitle().equals(qry))
            {
                result=books.get(i).toString();
            }
        }
        //find by author name
        for(int i=0;i<authors.size();i++)
        {
            if(authors.get(i).getFirstName()==qry || authors.get(i).getFirstName().equals(qry))
            {
                result=authors.get(i).toString();
            }
        }
        ShowBookInfo(result);
    }
    public void ShowBookQueryPage()
    {
        _sys.DisplayBookQueryPage();
    }
    public void ShowBookInfo(String info)
    {
        _bookInfoDisplay.setInformation(info);
        _sys.DisplayBookInformation();
    }
    public void addNewBook(Book book,Location location,Author author)
    {
        books.add(book);
        locations.add(location);
        authors.add(author);
        ShowBookInfo(book.toString()+locations.toString()+author.toString());
    }
    public void addNewBook(Book book)
    {
        books.add(book);
    }
    public JPanel CreateNewBook()
	{
        JPanel pnl=_createBook.getPanel();
        return pnl;
    }
    public void backToBookRegistrationSystem()
    {
        _sys.backToBookRegistrationSystem();
    }
    public ArrayList<Book> getAllBooks()
    {
        return this.books;
    }
    public JPanel getPanel()
    {
        _createBook= new CreateBook(this);
        _bookQuery=new BookAuthorQuery(this);
        _bookInfoDisplay = new BookInformationDisplay(this);
        return this.panel;
    }
    public void WriteBookInformationToFile(ArrayList<Book> lists)
    {
        try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream(bookFile));)
        {
                for(Book book : lists)
                {
                    objStream.writeObject(book);
                }
        }catch(Exception e)
        {
            
        }
    }
    public void ReadBookInformationFromFile(String filename)
    {
        ArrayList<Book> books = new ArrayList<Book>();
        try(
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));
        )
        {
                while(true)
                {
                    Book book = (Book)objStream.readObject();
                    books.add(book);
                }
        }catch(Exception e)
        {
          //  System.out.println("Exception : "+e.toString());
        }
        //System.out.println("Size : "+books.size());
        this.books=books;
    }
    public void WriteAuthorInformationToFile(ArrayList<Author> lists)
    {
        try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream(authorFile));)
        {
                for(Author author : lists)
                {
                    objStream.writeObject(author);
                }
        }catch(Exception e)
        {
            
        }
    }
    public void ReadAuthorInformationFromFile(String filename)
    {
        ArrayList<Author> authors = new ArrayList<Author>();
        try(
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));
        )
        {
                while(true)
                {
                    Author book = (Author)objStream.readObject();
                    authors.add(book);
                }
        }catch(Exception e)
        {
           // System.out.println("Exception : "+e.toString());
        }
       // System.out.println("Size : "+authors.size());
        this.authors=authors;
    }
    public void WriteLocationInformationToFile(ArrayList<Location> lists)
    {
        try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream(locationFile));)
        {
                for(Location author : lists)
                {
                    objStream.writeObject(author);
                }
        }catch(Exception e)
        {
            
        }
    }
    public void ReadLocationInformationFromFile(String filename)
    {
        ArrayList<Location> authors = new ArrayList<Location>();
        try(
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));
        )
        {
                while(true)
                {
                    Location book = (Location)objStream.readObject();
                    authors.add(book);
                }
        }catch(Exception e)
        {
            //System.out.println("Exception : "+e.toString());
        }
       // System.out.println("Size : "+authors.size());
        this.locations=authors;
    }
}