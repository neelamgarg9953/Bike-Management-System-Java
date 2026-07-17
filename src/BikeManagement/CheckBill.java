package BikeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CheckBill extends JFrame implements ActionListener {
    JButton bt1, bt2;
    JLabel l1, l2;
    JTextArea ta;
    Choice ch1, ch2;
    JPanel p1;
    Font f;
    String q;

    CheckBill() {
        setTitle("General Bill Slip");
        setLocation(100, 100);
        setSize(600, 500);
        setResizable(false);

        f = new Font("Lucida Fax", Font.BOLD, 16);

        l1 = new JLabel("Customer Username");
        l2 = new JLabel("Booking ID");
        l1.setFont(f);
        l2.setFont(f);

        ch1 = new Choice();
        ch2 = new Choice();

        try {
            ConnectionClass obj = new ConnectionClass();
            q = "SELECT DISTINCT customer_username FROM `bike booking`";
            ResultSet rest = obj.stm.executeQuery(q);
            while (rest.next()) {
                ch1.add(rest.getString("customer_username"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        ch1.setFont(f);
        ch2.setFont(f);

        // When a username is selected, fetch their bookings
        ch1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                ch2.removeAll();
                try {
                    ConnectionClass obj = new ConnectionClass();
                    String username = ch1.getSelectedItem();
                    String q2 = "SELECT booking_id FROM `bike booking` WHERE customer_username='" + username + "'";
                    ResultSet rs = obj.stm.executeQuery(q2);
                    while (rs.next()) {
                        ch2.add(rs.getString("booking_id"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        bt1 = new JButton("Show");
        bt2 = new JButton("Print PDF");

        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.WHITE);

        bt1.setFont(f);
        bt2.setFont(f);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        ta.setFont(f);
        ta.setEditable(false);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 10, 10));
        p1.add(l1);
        p1.add(ch1);
        p1.add(l2);
        p1.add(ch2);
        p1.add(bt1);
        p1.add(bt2);

        setLayout(new BorderLayout());
        add(sp, "Center");
        add(p1, "South");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            // Show bill in text area
            try {
                ConnectionClass obj = new ConnectionClass();
                String username = ch1.getSelectedItem();
                String bookingId = ch2.getSelectedItem();

                String query = "SELECT * FROM `bike booking` WHERE customer_username='" + username + "' AND booking_id='" + bookingId + "'";
                ResultSet rs = obj.stm.executeQuery(query);

                if (rs.next()) {
                    StringBuilder bill = new StringBuilder();
                    bill.append("\n====== Bike Rental Bill ======\n");
                    bill.append("Customer Username : ").append(rs.getString("customer_username")).append("\n");
                    bill.append("Booking ID        : ").append(rs.getString("booking_id")).append("\n");
                    bill.append("Bike Number       : ").append(rs.getString("bike_no")).append("\n");
                    bill.append("Rent Per Day      : ").append(rs.getString("rent")).append("\n");
                    bill.append("Total Days        : ").append(rs.getString("days")).append("\n");
                    bill.append("Total Amount      : ").append(rs.getString("total")).append(" Rs\n");
                    bill.append("==============================");

                    ta.setText(bill.toString());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == bt2) {
            // Placeholder for PDF printing
            JOptionPane.showMessageDialog(this, "PDF printing not implemented yet.");
        }
    }

    public static void main(String[] args) {
        new CheckBill().setVisible(true);
    }
}
