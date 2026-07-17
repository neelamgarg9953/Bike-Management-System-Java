package BikeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ViewUser extends JFrame implements ActionListener
{
    String x[]={"Name", "Username","Email Name","Father_Name","Phone","Qualification","City","gender","Blood group","Age","Driving License","Address"};
    String y[][]=new String[20][30];
    int i=0, j=0;
    JTable t;
    JButton bt1;
    JTextField tf1;
    JLabel l1,l2;
    Font f,f1;
    JPanel p1,p2,p3;
    ViewUser()
    {
        super("User Information");
        setSize(1000, 400);
        setLocation(180,160);
        
        f=new Font("MS UI GOTHIC",Font.BOLD,15);
        
        try
        {
          ConnectionClass obj= new ConnectionClass();
            String q="select * from user";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("username");
                y[i][j++]=rest.getString("email");
                y[i][j++]=rest.getString("father_name");
                y[i][j++]=rest.getString("phone");
                y[i][j++]=rest.getString("qualification");
                y[i][j++]=rest.getString("city");
                y[i][j++]=rest.getString("gender");
                y[i][j++]=rest.getString("blood");
                y[i][j++]=rest.getString("age");
                y[i][j++]=rest.getString("dob");
                y[i][j++]=rest.getString("driving_lic");
                y[i][j++]=rest.getString("address");
                i++;
                j=0;
            }
            t=new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.WHITE);
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
        JScrollPane sp=new JScrollPane(t);
        
        f1=new Font("Arial",Font.BOLD,25);
        
        l1=new JLabel("Delete any User");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.YELLOW);
        l1.setFont(f1);
        
        l2=new JLabel("Customer Username");
        l2.setForeground(Color.GRAY);
        l2.setFont(f1);
        
        tf1=new JTextField();
        tf1.setFont(f);
        
        bt1=new JButton("Delete User");
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.RED);
        bt1.setFont(f);
        bt1.addActionListener(this);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,3,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(bt1);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        p3.add(p1);
        p3.add(p2);
        
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        
        add(p3,"South");
        add(sp);
    }
        public void actionPerformed(ActionEvent e)
        {
            String username=tf1.getText();
            if(e.getSource()==bt1)
            {
                if(username.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please fill the Username");
                }
                else
                {
                    try
                    {
                        ConnectionClass obj=new ConnectionClass();
                        String q="delete from user where username='"+username+"'";
                        int temp=obj.stm.executeUpdate(q);
                        if(temp==1)
                        {
                            JOptionPane.showMessageDialog(null,"User record is deleted");
                            setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"user record does not match!");
                        }
                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        }
        
        public static void main(String[] args)
        {
            new ViewUser().setVisible(true);
        }
    }


