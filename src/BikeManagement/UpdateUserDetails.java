package BikeManagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class UpdateUserDetails extends JFrame implements ActionListener {
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l13, l14, l12;
    JButton bt1, bt2;
    JPanel p1, p2, p3;
    Choice ch1;
    Font f, f1;
    UpdateUserDetails() {
        super("Update User Details");
        setSize(760, 720);
        setLocation(50, 10);
        f = new Font("Arial", Font.BOLD, 18);
        f1 = new Font("Arial", Font.BOLD, 25);
        ch1 = new Choice();
        try {
            ConnectionClass obj = new ConnectionClass();
            String query = "select username from user";
            ResultSet rest = obj.stm.executeQuery(query);
            while (rest.next()) {
                ch1.add(rest.getString("username"));
            }
            rest.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ch1.setFont(f);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("BikeManagement/Icons/4.jpg"));
        Image i1 = img.getImage().getScaledInstance(340, 510, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l12 = new JLabel(img1);
        l1 = new JLabel("Update User Details");
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1 = new JLabel("Update User Details");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.red);
        l1.setFont(f1);
        l2 = new JLabel("Username");
        l3 = new JLabel("Name");
        l4 = new JLabel("Email");
        l5 = new JLabel("Father Name");
        l6 = new JLabel("Phone");
        l7 = new JLabel("Qualification");
        l8 = new JLabel("City");
        l9 = new JLabel("Gender");
        l10 = new JLabel("Blood Group");
        l11 = new JLabel("Age");
        l13 = new JLabel("DOB");
        l14 = new JLabel("Address");
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
        l13.setFont(f);
        l14.setFont(f);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();
        tf11 = new JTextField();
        bt1 = new JButton("Update Details");
        bt2 = new JButton("Back");
        bt1.setFont(f);
        bt2.setFont(f);
        bt1.setBackground(Color.RED);
        bt2.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1, 10, 10));
        p1.add(l1);
        p2 = new JPanel();
        p2.setLayout(new GridLayout(13, 2, 10, 10));
        p2.add(l2);
        p2.add(ch1);
        p2.add(l3);
        p2.add(tf1);
        p2.add(l4);
        p2.add(tf2);
        p2.add(l5);
        p2.add(tf3);
        p2.add(l6);
        p2.add(tf4);
        p2.add(l7);
        p2.add(tf5);
        p2.add(l8);
        p2.add(tf6);
        p2.add(l9);
        p2.add(tf7);
        p2.add(l10);
        p2.add(tf8);
        p2.add(l11);
        p2.add(tf9);
        p2.add(l13);
        p2.add(tf10);
        p2.add(l14);
        p2.add(tf11);
        p2.add(bt1);
        p2.add(bt2);
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 1, 10, 10));
        p3.add(l12);
        setLayout(new BorderLayout(10, 10));
        add(p1, "North");
        add(p2, "Center");
        add(p3, "West");
        ch1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                try {
                    ConnectionClass obj = new ConnectionClass();
                    String username = ch1.getSelectedItem();
                    String q1 = "select * from user where username='" + username + "'";
                    ResultSet rest1 = obj.stm.executeQuery(q1);
                    while (rest1.next()) {
                        tf1.setText(rest1.getString("name"));
                        tf2.setText(rest1.getString("email"));
                        tf3.setText(rest1.getString("father_name"));
                        tf4.setText(rest1.getString("phone"));
                        tf5.setText(rest1.getString("qualification"));
                        tf6.setText(rest1.getString("city"));
                        tf7.setText(rest1.getString("gender"));
                        tf8.setText(rest1.getString("blood"));
                        tf9.setText(rest1.getString("age"));
                        tf10.setText(rest1.getString("dob"));
                        tf11.setText(rest1.getString("address"));
                    }
                } catch (Exception ess) {
                    ess.printStackTrace();
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            String username = ch1.getSelectedItem();
            String name = tf1.getText();
            String email = tf2.getText();
            String fname = tf3.getText();
            String phone = tf4.getText();
            String qualification = tf5.getText();
            String city = tf6.getText();
            String gender = tf7.getText();
            String blood = tf8.getText();
            String age = tf9.getText();
            String dob = tf10.getText();
            String address = tf11.getText();
            try {
                ConnectionClass obj3 = new ConnectionClass();
                String q1 = "update user set name='" + name + "',email='" + email + "',father_name='" + fname + "',phone='" + phone + "',qualification='" + qualification + "',city='" + city + "',gender='" + gender + "',blood='" + blood + "',age='" + age + "',dob='" + dob + "',address='" + address + "' where username='" + username + "'";
                int aa = obj3.stm.executeUpdate(q1);
                if (aa == 1) {
                    JOptionPane.showMessageDialog(null, "User details successfully Updated");
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Please!, Fill all details carefully");
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        if (e.getSource() == bt2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateUserDetails().setVisible(true);
    }
}
