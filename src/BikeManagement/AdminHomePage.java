package BikeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AdminHomePage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f,f1;
    AdminHomePage()
    {
        this.setTitle("Bike booking page for Admin");
        setLocation(0,0);
        setSize(1280,780);
        
        f=new Font("Lucida Fax",Font.BOLD,20);
        f1=new Font("Lucida Fax",Font.BOLD,18);
        
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("BikeManagement/Icons/admin.jpeg"));
        Image i1 = img.getImage().getScaledInstance(1280,780, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1=new JLabel(img1);
        
        JMenuBar m1=new JMenuBar();
        
        JMenu men1=new JMenu("User Profile");
        JMenuItem ment1=new JMenuItem("Update User Details");
        JMenuItem ment2=new JMenuItem("View User Profile");
        
        men1.add(ment1);
        men1.add(ment2);
        
        JMenu men2=new JMenu("Booking History");
        JMenuItem ment3=new JMenuItem("Add New Booking");
        JMenuItem ment4=new JMenuItem("View Booking History");
        
        men2.add(ment3);
        men2.add(ment4);
        
        JMenu men3=new JMenu("Bike Brand");
        JMenuItem ment5=new JMenuItem("Add New Brand");
        JMenuItem ment6=new JMenuItem("View Brand");
        
        men3.add(ment5);
        men3.add(ment6);
        
        JMenu men4=new JMenu("Vehicle");
        JMenuItem ment7=new JMenuItem("Add New Bike");
        JMenuItem ment8=new JMenuItem("View Bike");
        
        men4.add(ment7);
        men4.add(ment8);
        
        JMenu men5=new JMenu("Cancellation");
        JMenuItem ment9=new JMenuItem("Cancel Booking");
        
        men5.add(ment9);
        
        JMenu men6=new JMenu("Bill");
        JMenuItem ment11=new JMenuItem("Check Bill");
        
        men6.add(ment11);
        
        JMenu men8=new JMenu("Logout");
        JMenuItem ment14=new JMenuItem("Exit");
        men8.add(ment14);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
        m1.add(men6);
        m1.add(men8);
        
        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
        men6.setFont(f);
        men8.setFont(f);
        
        ment1.setFont(f1);
        ment2.setFont(f1);
        ment3.setFont(f1);
        ment4.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
        ment7.setFont(f1);
        ment8.setFont(f1);
        ment9.setFont(f1);
        ment11.setFont(f1);
        ment14.setFont(f1);
        
        m1.setBackground(new java.awt.Color(4,1,54));
        
        men1.setForeground(Color.WHITE);
        men2.setForeground(Color.WHITE);
        men3.setForeground(Color.WHITE);
        men4.setForeground(Color.WHITE);
        men5.setForeground(Color.WHITE);
        men6.setForeground(Color.WHITE);
        men8.setForeground(Color.RED);
        
        ment1.setBackground(Color.BLACK);
        ment2.setBackground(Color.BLACK);
        ment3.setBackground(Color.BLACK);
        ment4.setBackground(Color.BLACK);
        ment5.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment7.setBackground(Color.BLACK);
        ment8.setBackground(Color.BLACK);
        ment9.setBackground(Color.BLACK);
        ment11.setBackground(Color.BLACK);
        ment14.setBackground(Color.BLACK);
        
        ment1.setForeground(new java.awt.Color(204,102,39));
        ment2.setForeground(new java.awt.Color(204,102,39));
        ment3.setForeground(new java.awt.Color(204,102,39));
        ment4.setForeground(new java.awt.Color(204,102,39));
        ment5.setForeground(new java.awt.Color(204,102,39));
        ment6.setForeground(new java.awt.Color(204,102,39));
        ment7.setForeground(new java.awt.Color(204,102,39));
        ment8.setForeground(new java.awt.Color(204,102,39));
        ment9.setForeground(new java.awt.Color(204,102,39));
        ment11.setForeground(new java.awt.Color(204,102,39));
        ment14.setForeground(Color.RED);
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment11.addActionListener(this);
        ment14.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
    }
    public void actionPerformed(ActionEvent e)
    {
        String comnd=e.getActionCommand();
        
        if(comnd.equals("Update User Details"))
        {
            new UpdateUserDetails();
        }
        else if(comnd.equals("View User Profile"))
        {
          new ViewUser().setVisible(true);
        }
        else if(comnd.equals("View Booking History"))
        {
            
        }
         else if(comnd.equals("Add New Booking"))
        {
            
        }
         else if(comnd.equals("Add New Brand"))
        {
            new AddNewBrand();
        }
         else if(comnd.equals("View Brand"))
        {
            new ViewBrand().setVisible(true);
        } 
         else if(comnd.equals("Add New Bike"))
        {
            new AddNewBike().setVisible(true);
        }
         else if(comnd.equals("View Bike"))
        {
             new ViewBike().setVisible(true);
        }
         else if(comnd.equals("Cancel Booking"))
        {
            
        }
         else if(comnd.equals("Check Bill"))
        {
            new CheckBill().setVisible(true);
        }
         else if(comnd.equals("Exit"))
        {
            System.exit(0);
        }
        
    }
    public static void main (String[] args)
    {
        new AdminHomePage().setVisible(true);
    }
}
