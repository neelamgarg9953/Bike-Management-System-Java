package BikeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class Singup_User implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf9, tf10, tf11, tf13;
    JButton b1, b2;
    JPasswordField pf;
    JComboBox<String> genderBox, licenseBox;
    JFrame f;

    Singup_User() {
        f = new JFrame("Add User Details for Signup");
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 840, 600);
        l1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("BikeManagement/Icons/signup.jpg"));
        Image i1 = img.getImage().getScaledInstance(840, 600, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1.setIcon(img1);

        l2 = new JLabel("Add User Details for Signup");
        l2.setBounds(230, 30, 500, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 30));
        l2.setForeground(Color.GREEN);
        l1.add(l2);
        f.add(l1);

        l3 = new JLabel("Name");
        l3.setBounds(50, 150, 150, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.WHITE);
        l1.add(l3);

        tf1 = new JTextField();
        tf1.setBounds(200, 150, 150, 30);
        l1.add(tf1);

        l4 = new JLabel("Username");
        l4.setBounds(450, 150, 200, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.WHITE);
        l1.add(l4);

        tf2 = new JTextField();
        tf2.setBounds(600, 150, 150, 30);
        l1.add(tf2);

        l5 = new JLabel("Password");
        l5.setBounds(50, 200, 100, 30);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.WHITE);
        l1.add(l5);

        pf = new JPasswordField();
        pf.setBounds(200, 200, 150, 30);
        l1.add(pf);

        l6 = new JLabel("Email");
        l6.setBounds(450, 200, 150, 30);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.WHITE);
        l1.add(l6);

        tf3 = new JTextField();
        tf3.setBounds(600, 200, 150, 30);
        l1.add(tf3);

        l7 = new JLabel("Father Name");
        l7.setBounds(50, 250, 140, 30);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l7.setForeground(Color.WHITE);
        l1.add(l7);

        tf4 = new JTextField();
        tf4.setBounds(200, 250, 150, 30);
        l1.add(tf4);

        l8 = new JLabel("Phone");
        l8.setBounds(450, 250, 100, 30);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.WHITE);
        l1.add(l8);

        tf5 = new JTextField();
        tf5.setBounds(600, 250, 150, 30);
        l1.add(tf5);

        l9 = new JLabel("Qualification");
        l9.setBounds(50, 300, 160, 30);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.WHITE);
        l1.add(l9);

        tf6 = new JTextField();
        tf6.setBounds(200, 300, 150, 30);
        l1.add(tf6);

        l10 = new JLabel("City");
        l10.setBounds(450, 300, 100, 30);
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setForeground(Color.WHITE);
        l1.add(l10);

        tf7 = new JTextField();
        tf7.setBounds(600, 300, 150, 30);
        l1.add(tf7);

        l11 = new JLabel("Gender");
        l11.setBounds(50, 350, 100, 30);
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setForeground(Color.WHITE);
        l1.add(l11);

        genderBox = new JComboBox<>(new String[] {"Male", "Female", "Other"});
        genderBox.setBounds(200, 350, 150, 30);
        l1.add(genderBox);

        l12 = new JLabel("Blood Group");
        l12.setBounds(450, 350, 140, 30);
        l12.setFont(new Font("Arial", Font.BOLD, 20));
        l12.setForeground(Color.WHITE);
        l1.add(l12);

        tf9 = new JTextField();
        tf9.setBounds(600, 350, 150, 30);
        l1.add(tf9);

        l13 = new JLabel("Age");
        l13.setBounds(50, 400, 100, 30);
        l13.setFont(new Font("Arial", Font.BOLD, 20));
        l13.setForeground(Color.WHITE);
        l1.add(l13);

        tf10 = new JTextField();
        tf10.setBounds(200, 400, 150, 30);
        l1.add(tf10);

        l14 = new JLabel("Date of Birth");
        l14.setBounds(450, 400, 140, 30);
        l14.setFont(new Font("Arial", Font.BOLD, 20));
        l14.setForeground(Color.WHITE);
        l1.add(l14);

        tf11 = new JTextField();
        tf11.setBounds(600, 400, 150, 30);
        l1.add(tf11);

        l15 = new JLabel("Driving License");
        l15.setBounds(50, 450, 180, 30);
        l15.setFont(new Font("Arial", Font.BOLD, 20));
        l15.setForeground(Color.WHITE);
        l1.add(l15);

        licenseBox = new JComboBox<>(new String[] {"Yes", "No"});
        licenseBox.setBounds(200, 450, 150, 30);
        l1.add(licenseBox);

        l16 = new JLabel("Address");
        l16.setBounds(450, 450, 140, 30);
        l16.setFont(new Font("Arial", Font.BOLD, 20));
        l16.setForeground(Color.WHITE);
        l1.add(l16);

        tf13 = new JTextField();
        tf13.setBounds(600, 450, 150, 30);
        l1.add(tf13);

        b1 = new JButton("Submit");
        b2 = new JButton("Back");

        b1.setBounds(250, 500, 150, 40);
        b2.setBounds(450, 500, 150, 40);

        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.RED);

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.add(b1);
        l1.add(b2);

        f.setVisible(true);
        f.setSize(840, 600);
        f.setLocation(300, 100);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String name = tf1.getText();
            String username = tf2.getText();
            String password = new String(pf.getPassword());
            String email = tf3.getText();
            String fatherName = tf4.getText();
            String phone = tf5.getText();
            String qualification = tf6.getText();
            String city = tf7.getText();
            String gender = (String) genderBox.getSelectedItem();
            String blood = tf9.getText();
            String dob = tf11.getText();
            String drivingLic = (String) licenseBox.getSelectedItem();
            String address = tf13.getText();

            int age;
            try {
                age = Integer.parseInt(tf10.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Age must be a valid number.");
                return;
            }

            if (name.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || dob.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required.");
                return;
            }

            if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Invalid email format.");
                return;
            }

            if (age >= 18 && "Yes".equalsIgnoreCase(drivingLic)) {
                try {
                    ConnectionClass obj = new ConnectionClass();
                    Random r = new Random();
                    String userId = "" + Math.abs(r.nextInt() % 100000);

                    String q = "INSERT INTO user VALUES('" + userId + "','" + name + "','" + username + "','" + password + "','" + email + "','" + fatherName + "','" + phone + "','" + qualification + "','" + city + "','" + gender + "','" + blood+ "','" + age + "','" + dob + "','" + drivingLic + "','" + address + "')";
                    obj.stm.executeUpdate(q);

                    JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
                    f.setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "You are not eligible because you don't have a driving license or you are underage.");
            }
        } else if (e.getSource() == b2) {
            new Login(); // Ensure Login class exists
            f.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Singup_User();
    }
}
