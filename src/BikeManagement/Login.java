package BikeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login implements ActionListener
{
    JLabel l1, l2, l3, l4, l5;
    JTextField tf;
    JButton b1, b2;
    JPasswordField pf;
    JFrame f;
    Choice ch1;
     
    Login()
    {
        f = new JFrame("Login Account");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1 = new JLabel();
        l1.setBounds(0, 0, 580, 360);
        l1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("BikeManagement/Icons/login.jpg"));
        Image i1 = img.getImage().getScaledInstance(580, 350, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1.setIcon(img1);
        
        l2=new JLabel("Login Account");
        l2.setBounds(190, 22, 500, 50);
        l2.setFont(new Font("Arial",Font.BOLD,30));
        l2.setForeground(Color.YELLOW);
        
        l1.add(l2);
        f.add(l1);
        
        l3=new JLabel("Username");
        l3.setBounds(120,135,150,30);
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        l1.add(l3);
        
        tf = new JTextField();
        tf.setBounds(320,135, 150, 30);
        tf.setFont(new Font("Arial",Font.BOLD,15));
        l1.add(tf);
        
        l4 = new JLabel("Password");
        l4.setBounds(120, 185, 150, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.WHITE);
        l1.add(l4);

        pf = new JPasswordField();
        pf.setBounds(320, 185, 150, 20);
        pf.setFont(new Font("Arial", Font.BOLD, 20));
        l1.add(pf);
        
        l5 = new JLabel("Account");
        l5.setBounds(120, 90, 150, 30);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.WHITE);
        l1.add(l5);
        
        ch1=new Choice();
        ch1.add("Admin");
        ch1.add("User");
        ch1.setBounds(320,90,150,30);
        ch1.setFont(new Font("Arial", Font.BOLD, 15));
        l1.add(ch1);
        
        b1 = new JButton("Login");
        b2 = new JButton("User Signup");

        b1.setBounds(120, 235, 150, 40);
        b2.setBounds(320, 235, 150, 40);

        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        l1.add(b1);
        l1.add(b2);
        
        f.setVisible(true);
        f.setSize(580, 360);
        f.setLocation(300, 100);
        f.setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String account=ch1.getSelectedItem();
            try
            {
                ConnectionClass obj = new ConnectionClass();
                String username=tf.getText();
                String password=pf.getText();
                
                if(account.equals("Admin"))
                {
                    String q="select*from admin where username='"+username+"' and password='"+password+"'";
                    ResultSet rs=obj.stm.executeQuery(q);
                    if(rs.next())
                    {
                        new AdminHomePage();
                        f.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "You have entered wrong username and password");
                        f.setVisible(false);
                        f.setVisible(true);
                    }
                }
                else if(account.equals("User"))
                {
                    String q="select*from user where username='"+username+"' and password='"+password+"'";
                    ResultSet rs=obj.stm.executeQuery(q);
                    if(rs.next())
                    {
//                        System.out.println("User Login");
                        new UserHomePage();
                        f.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "You have entered wrong username and password");
                        f.setVisible(false);
                        f.setVisible(true);
                    }
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        if(e.getSource()==b2)
        {
            new Singup_User();
            f.setVisible(false);
        }
    }
    public static void main (String[] args)
    {
        new Login();
    }
            
}
