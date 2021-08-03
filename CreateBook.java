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
import java.awt.*;
import java.awt.event.*;
public class CreateBook extends JPanel {
    private BookRegistrationSystem _sys;
    private JPanel panel;
    private JButton b1,b2;
    private JLabel t1,t2,t3;
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField a1,a2,a3,a4,a5,a6,a7;
    private JTextField aid,atitle,af,am,al;
    private JLabel lid,ltitle,lf,lm,ll;
    private JLabel locId,locName,locFloor,locNum;
    private JTextField llocId,llocName,llocFloor,llocNum;
    public CreateBook(BookRegistrationSystem sys)
    {
        _sys=sys;
        t1 = new JLabel("Book Informations");
        t2 = new JLabel("Author Informations");
        t3 = new JLabel("Location Informations");

        
        locId = new JLabel("Location ID");
        locName = new JLabel("Campus Name");
        locFloor = new JLabel("Floor");
        locNum = new JLabel("Shelf Number");

        
        llocId= new JTextField(30);
        llocName= new JTextField(30);
        llocFloor= new JTextField(30);
        llocNum= new JTextField(30);

        l1 = new JLabel("Id Number");
        l2 = new JLabel("ISBN");
        l3 = new JLabel("Call Number");
        l4 = new JLabel("Title");
        l5 = new JLabel("Abstract");
        l6 = new JLabel("Publisher");
        l7 = new JLabel("Status");


        lid = new JLabel("Author Id");
        ltitle = new JLabel("Title");
        lf = new JLabel("First Name");
        lm = new JLabel("Middle Name");
        ll = new JLabel("Last Name");


        aid= new JTextField(30);
        atitle= new JTextField(30);
        af= new JTextField(30);
        am= new JTextField(30);
        al= new JTextField(30);

        a1= new JTextField(30);
        a2= new JTextField(30);
        a3= new JTextField(30);
        a4= new JTextField(30);
        a5= new JTextField(30);
        a6= new JTextField(30);
        a7= new JTextField(30);

       

        b1 = new JButton("Save");
        b2 = new JButton("Back");
        b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                if(a1.getText()=="")    //if no data then terminate
                return;
                //save here
                Book book = new Book(a1.getText(),a2.getText(),a3.getText(),a4.getText(),a5.getText(),a6.getText(),a7.getText());
                Location location = new Location(llocId.getText(),llocName.getText(),llocFloor.getText(),llocNum.getText());
                Author author = new Author(aid.getText(),atitle.getText(),af.getText(),am.getText(),al.getText());
                _sys.addNewBook(book,location,author);
			}
        });
        b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToBookRegistrationSystem();
			}
		});
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(t1);
        p.add(l1);
        p.add(a1);
        p.add(l2);
        p.add(a2);
        p.add(l3);
        p.add(a3);
        p.add(l4);
        p.add(a4);
        p.add(l5);
        p.add(a5);
        p.add(l6);
        p.add(a6);
        p.add(l7);
        p.add(a7);
        p.add(t2);
        p.add(lid);
        p.add(aid);
        p.add(ltitle);
        p.add(atitle);
        p.add(lf);
        p.add(af);
        p.add(lm);
        p.add(am);
        p.add(ll);
        p.add(al);
        p.add(t3);
        p.add(locId);
        p.add(llocId);
        p.add(locName);
        p.add(llocName);
        p.add(locFloor);
        p.add(llocFloor);
        p.add(locNum);
        p.add(llocNum);
		p.add(b1);
		p.add(b2);
		panel = p;
    }
    public JPanel getPanel()
    {
        return panel;
    }
}