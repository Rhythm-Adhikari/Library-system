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
public class BookAuthorQuery extends JPanel{
    JButton b1,b2;
    JPanel panel; 
    JLabel label;
    JTextField info;
    BookRegistrationSystem _sys;
    public BookAuthorQuery(BookRegistrationSystem sys)
    {
        _sys=sys;
        info = new JTextField(30);
        label = new JLabel("Search By Title/Author Name");
        b1=new JButton("Search");
        b2=new JButton("Back");
        b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToBookRegistrationSystem();
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
            //search from here
            _sys.SearchAndDisplayInformation(info.getText());
			}
		});
        JPanel p = new JPanel();
        p.add(label);
        p.add(info);
		p.add(b1);
		p.add(b2);
		panel = p;
    }
    public void setInformation(String str)
    {
        info.setText(str);
    }
    public JPanel getPanel()
    {
        return panel;
    }
}