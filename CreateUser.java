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
public class CreateUser extends JPanel{
    UserRegistrationSystem _sys;
    private JPanel panel;
    private JButton b1,b2;
    
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField a1,a2,a3,a4,a5,a6;
    public CreateUser(UserRegistrationSystem sys)
    {
        _sys=sys;
        l1 = new JLabel("Id Number");
        l2 = new JLabel("First Name");
        l3 = new JLabel("Last Name");
        l4 = new JLabel("User Name");
        l5 = new JLabel("Password");
        l6 = new JLabel("User Type");

        a1= new JTextField(30);
        a2= new JTextField(30);
        a3= new JTextField(30);
        a4= new JTextField(30);
        a5= new JTextField(30);
        a6= new JTextField(30);

        b1 = new JButton("Save");
        b2 = new JButton("Back");
        b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                //saving data here
                User user = new User(a1.getText(),a2.getText(),a3.getText(),a4.getText(),a5.getText(),a6.getText());
                _sys.addNewUser(user);
			}
        });
        b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
                _sys.backToUserRegistrationSystem();
			}
        });
        JPanel p = new JPanel();
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

        p.add(b1);
		p.add(b2);
		panel = p;
    }
    public JPanel getPanel()
    {
        return panel;
    }
}