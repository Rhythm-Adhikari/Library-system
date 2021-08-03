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
public class UserRegistrationSystem extends JPanel {
    private ArrayList<User> users;
    public UserInformationDisplay _userInfoDisplay;
    public UserQuery _queryUser;
    private CreateUser _createUser;
    private String userFile;
    private JButton backBtn,cBtn,qBtn,sBtn;
    private JPanel panel;
    private MainSystem _sys;
    public UserRegistrationSystem()
    {
        userFile="users.dat";
        users = new ArrayList<User>();
        ReadUserInformationFromFile(userFile);
    }
    public UserRegistrationSystem(MainSystem sys)
    {
        userFile="users.dat";
        _sys=sys;
        _userInfoDisplay = new UserInformationDisplay(this);
        _queryUser= new UserQuery(this);
        _createUser = new CreateUser(this);
        backBtn= new JButton("Back");
        cBtn= new JButton("Create New User");
        sBtn= new JButton("Save All To File");
        qBtn= new JButton("Query User");
        backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToMain();
			}
        });
        cBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.CreateNewUser();
			}
        });
        qBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.DisplayUserQueryPage();
			}
        });
        sBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                WriteUserInformationToFile(users);
			}
        });
        ReadUserInformationFromFile(userFile);
        JPanel p = new JPanel();
		p.add(cBtn);
		p.add(qBtn);
		p.add(sBtn);
		p.add(backBtn);
		panel=p;
    }
    public JPanel getPanel()
    {
        _createUser= new CreateUser(this);
        _queryUser=new UserQuery(this);
        _userInfoDisplay = new UserInformationDisplay(this);
        return panel;
    }
    public ArrayList<User> getAllUser()
    {
        return users;
    }
    public void SearchAndDisplayInformation(String qry)
    {
        String result="No Result Found";
        //search here
        //try to find by name
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).getFirstName()==qry || users.get(i).getFirstName().equals(qry)
            || users.get(i).getLastName()==qry || users.get(i).getLastName().equals(qry))
            {
                result=users.get(i).toString();
                break;
            }
        }
        ShowUserInfo(result);
    }
    public void addNewUser(User user)
    {
        users.add(user);
        ShowUserInfo(user.toString());
    } 
    public void addUser(User user)
    {
        users.add(user);
    }
    public JPanel CreateNewUser()
	{
        JPanel pnl=_createUser.getPanel();
        return pnl;
    }
    public void ShowUserInfo(String info)
    {
        _userInfoDisplay.setInformation(info);
        _sys.DisplayUserInformation();
    }
    public void WriteUserInformationToFile(ArrayList<User> lists)
    {
        try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream(userFile));)
        {
                for(User book : lists)
                {
                    objStream.writeObject(book);
                }
        }catch(Exception e)
        {
            
        }
    }
    public void ReadUserInformationFromFile(String filename)
    {
        ArrayList<User> books = new ArrayList<User>();
        try(
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));
        )
        {
                while(true)
                {
                    User book = (User)objStream.readObject();
                    books.add(book);
                }
        }catch(Exception e)
        {
            System.out.println("Exception : "+e.toString());
        }
        this.users=books;
    }
    public void backToUserRegistrationSystem()
    {
        _sys.backToUserRegistrationSystem();
    }
}