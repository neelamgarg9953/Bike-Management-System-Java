package BikeManagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class AddNewBike extends JFrame implements ActionListener
{
    JTextField tf1, tf2, tf3, tf4, tf5;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JButton bt1, bt2;
    JPanel p1, p2, p3;
    Choice ch1,ch2,ch3,ch4,ch5;
    Font f, f1;
    AddNewBike()
    {
        super("Add New Bike Details");
        setSize(760, 720);
        setLocation(50, 10);
        f = new Font("Arial", Font.BOLD, 18);
        f1 = new Font("Arial", Font.BOLD, 25);
        ch1 = new Choice();
        l1 = new JLabel("Add New Bike Details");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.red);
        l1.setFont(f1);
        l2 = new JLabel("Brand Name");
        l3 = new JLabel("Brand Mode");
        l4 = new JLabel("Bike Name");
        l5 = new JLabel("Bike Seater");
        l6 = new JLabel("Bike Engine");
        l7 = new JLabel("Bike category");
        l8 = new JLabel("Bike Mileage");
        l9 = new JLabel("Bike Side Mirror");
        l10 = new JLabel("Bike No");
        l11 = new JLabel("Rent per Day(Rs)");
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);
        l11.setFont(f);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);
        tf5.setFont(f);
        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();
        ch4 = new Choice();
        ch5 = new Choice();
        bt1 = new JButton("Add Bike");
        bt2 = new JButton("Back");
        bt1.setBackground(Color.RED);
        bt2.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.WHITE);
        bt1.setFont(f);
        bt2.setFont(f);
    }
     public void actionPerformed(ActionEvent e)
     { 
     }
      public static void main(String[] args) {
        new AddNewBike().setVisible(true);
    }
}
