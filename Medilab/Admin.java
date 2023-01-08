
//package Classes;



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Admin implements ActionListener {

    JFrame homeFrame;


    JLabel uname;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabel;
    JLabel admin;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logIn;
    JButton back;

    JTextField username;
    JPasswordField password;


    ImageIcon logo;

    JSeparator separator;

                        public Admin(){
        


                                homeFrame = new JFrame();

                                

                                home = new JButton();
                                services = new JButton();
                                contact = new JButton();
                                emergency = new JButton();

                                separator = new JSeparator();

                                

                                //___________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));


                               

                               // Admin login title
                                admin = new JLabel();
                                admin.setText("Admin Login");
                                admin.setBounds(575, 128, 220, 50);
                                admin.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
                                admin.setForeground(new Color(0xEE964B));


                                
                                
                                // separator
                                separator.setForeground(new Color(0x3EB8D2));
                                separator.setBounds(0, 65, 900, 3);


                                // Exit button
                                exit = new JButton();
                                exit.setText("Exit");
                                exit.setBounds(780, 500, 100, 45);
                                exit.setBackground(new Color(0x1D1A31));
                                exit.setForeground(new Color(0xFFFBFC));
                                exit.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                exit.setBorder(null);
                                exit.setFocusable(false);
                                exit.addActionListener(this);

                                // back button
                                back = new JButton();
                                back.setText("Back");
                                back.setBounds(277, 402, 100, 42);
                                back.setBackground(new Color(0x1D1A31));
                                back.setForeground(new Color(0xFFFBFC));
                                back.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                back.setBorder(null);
                                back.setFocusable(false);
                                back.addActionListener(this);




                                // username label
                                uname = new JLabel();
                                uname.setText("Username");
                                uname.setBounds(70, 197, 148, 13);
                                uname.setFont(new Font("IBM Plex Mono", Font.PLAIN, 16));
                                uname.setForeground(new Color(0xFFFFFF));

                                // password label
                                pass = new JLabel();
                                pass.setText("Password");
                                pass.setBounds(70, 293, 148, 13);
                                pass.setFont(new Font("IBM Plex Mono", Font.PLAIN, 16));
                                pass.setForeground(new Color(0xFFFFFF));



                                // username field
                                
                                username = new JTextField();
                                username.setBounds(70,220,380,42);
                                username.setBorder(null); // field border
                                username.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                username.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                



                                // passwordfield
                                password = new JPasswordField();
                                password.setBounds(70,316,380,42);
                                password.setBorder(null);
                                password.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // pass field  font
                                password.setBackground(Color.decode("#FFFFFF")); // pass field bg color

                                /*
                                // Setting Placeholder for JPasswordField
                                password.setForeground(Color.GRAY);
                                
                                password.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (password.getText().equals("Password")) {
                                                        password.setText("");
                                                        password.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (password.getText().isEmpty()) {
                                                        password.setForeground(Color.GRAY);
                                                        password.setText("Password");
                                                        password.setEchoChar((char) 0);
                                                    }
                                                }
                                                });
                                    */



                                // Log in button
                                logIn = new JButton();
                                logIn.setText("Login");
                                logIn.setBounds(175, 402, 100, 42);
                                logIn.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                logIn.setForeground(new Color(0xFFFFFF));
                                logIn.setBackground(Color.decode("#3EB8D2"));
                                logIn.setBorder(null);
                                logIn.setFocusable(false);
                                logIn.addActionListener(this);



                                // Adding Logo and message
                                logo = new ImageIcon(getClass().getResource("/images/admin_login.png"));
                                imgLabel = new JLabel(logo);
                                imgLabel.setBounds(565, 204, logo.getIconWidth(), logo.getIconHeight());







        // frame
        homeFrame.setTitle("Medilab - Home");
        homeFrame.setSize(900, 600);
        homeFrame.getContentPane().setBackground(new Color(0x1D1A31));
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setResizable(false);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setLayout(null);
        homeFrame.setVisible(true);

        // adding all elements
        homeFrame.add(appTitle);
        homeFrame.add(separator);
        homeFrame.add(exit);
        homeFrame.add(uname);
        homeFrame.add(pass);
        homeFrame.add(back);
        
        homeFrame.add(logIn);
        homeFrame.add(imgLabel);
        homeFrame.add(username);
        homeFrame.add(password);
        homeFrame.add(admin);




        appTitle.requestFocusInWindow();
    }


    public void actionPerformed(ActionEvent e) {

         String textField1 = username.getText().toLowerCase(); // User Name 
         String textField2 = password.getText(); // Password

        //exit button
        if (e.getSource() == exit) {
            // homeFrame.setVisible(false);
            System.exit(0);
        }

        

        // back button
        else if(e.getSource() == back) {
            homeFrame.setVisible(false);
            new Home();
        }

        //logIn button
        else if(e.getSource() == logIn) {
             try {
                        String userNameS = "Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "Travel Agency!",
                                            JOptionPane.WARNING_MESSAGE);

                                    homeFrame.setVisible(false);
                                    new AdminPanel();
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

        
    }

    public static void main(String[] args) {
        new Admin();
    }
}