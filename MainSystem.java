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


import javax.swing.*;
public class MainSystem {
    private JFrame mainPage;
    private MainPage _main;
	private BookRegistrationSystem _bookRegistrationSystem;
	private UserRegistrationSystem _UserRegistrationSystem;
    public MainSystem()
    {
		_main=new MainPage(this);
		_UserRegistrationSystem=new UserRegistrationSystem(this);
        _bookRegistrationSystem=new BookRegistrationSystem(this);
        mainPage = new JFrame("System");
		mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPage.setSize(800,600);
        backToMain();
    }
    public void OpenBookRegistrationSystem()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_bookRegistrationSystem.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
	}
	public void OpenUserRegistrationSystem()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_UserRegistrationSystem.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void DisplayBookInformation()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_bookRegistrationSystem._bookInfoDisplay.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void DisplayUserInformation()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_UserRegistrationSystem._userInfoDisplay.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void DisplayBookQueryPage()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_bookRegistrationSystem._bookQuery.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void CreateNewBook()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_bookRegistrationSystem.CreateNewBook();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void CreateNewUser()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_UserRegistrationSystem.CreateNewUser();
		this.mainPage.add(pnl);
		this.mainPage.show();
	}
	public void DisplayUserQueryPage()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		JPanel pnl=_UserRegistrationSystem._queryUser.getPanel();
		this.mainPage.add(pnl);
		this.mainPage.show();
    }
    public void backToMain()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		this.mainPage.add(this._main.getPanel());
		this.mainPage.show();
    }
    public void backToBookRegistrationSystem()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		this.mainPage.add(this._bookRegistrationSystem.getPanel());
		this.mainPage.show();
	}
    public void backToUserRegistrationSystem()
	{
		this.mainPage.getContentPane().removeAll();
		this.mainPage.repaint();
		this.mainPage.add(this._UserRegistrationSystem.getPanel());
		this.mainPage.show();
	}
}