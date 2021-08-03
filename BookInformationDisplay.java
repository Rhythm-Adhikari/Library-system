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
public class BookInformationDisplay extends JPanel{
    JButton b1,b2;
    JPanel panel; 
    JTextArea info;
    BookRegistrationSystem _sys;
    public BookInformationDisplay(BookRegistrationSystem sys)
    {
        _sys=sys;
        info = new JTextArea(20,50);
        info.setLineWrap(true);
		b2=new JButton("Back");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToBookRegistrationSystem();
			}
		});
        JPanel p = new JPanel();
        p.add(info);
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