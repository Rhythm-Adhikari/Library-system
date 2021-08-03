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

import java.awt.event.*;
public class MainPage extends JPanel
{
	MainSystem _sys;
	JButton b1,b2,b3;
	JButton ba,bb,bc,bd;
	JPanel panel; 
	public MainPage(MainSystem sys)
	{
		_sys=sys;
		b1=new JButton("Book Registration System");
		b3=new JButton("User Registration System");
		b2=new JButton("Exit");
		
		ba=new JButton("Create Book");
		bb=new JButton("Create User");
		bc=new JButton("Query Book");
		bd=new JButton("Query user");
		
		ba.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.CreateNewBook();
			}
		});
		
		bb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.CreateNewUser();
			}
		});
		
		bc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.DisplayBookQueryPage();
			}
		});
		
		bd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.DisplayUserQueryPage();
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Closing");
				System.exit(0);
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.OpenBookRegistrationSystem();
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.OpenUserRegistrationSystem();
			}
		});
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b3);
		p.add(ba);
		p.add(bb);
		p.add(bc);
		p.add(bd);
		p.add(b2);
		panel = p;
	}
	public JPanel getPanel()
	{
		return panel;
	}
}