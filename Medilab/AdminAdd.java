//package Classes;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;



public class AdminAdd implements ActionListener {

    JFrame homeFrame;

    JLabel appTitle;
    JLabel imgLabel;
    JLabel pass;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton register;
    JButton cancel;

    JTextField username;
    JTextField email;
    JTextField phone;
    JTextField age;

    JPasswordField password;

    JTextArea adminAdd;


    ImageIcon logo;

    JSeparator separator;

                                public AdminAdd(){

                                homeFrame = new JFrame();


                                home = new JButton();
                                services = new JButton();
                                contact = new JButton();
                                emergency = new JButton();

                                separator = new JSeparator();


                                //__________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));


                                // Home
                                home.setText("Home");
                                home.setBounds(370, 20, 100, 30);
                                home.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                home.setForeground(new Color(0xF5F5F5));
                                home.setBorder(null);
                                home.setOpaque(false);                        //
                                home.setContentAreaFilled(false);             //  transparent Button;
                                home.setBorderPainted(false); 
                                home.setBorder(null);
                                home.setFocusable(false);
                                home.addActionListener(this);


                                // services
                                services.setText("Services");
                                services.setBounds(470, 20, 150, 30);
                                services.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                services.setForeground(new Color(0xF5F5F5));
                                services.setOpaque(false);                        //
                                services.setContentAreaFilled(false);             //  transparent Button;
                                services.setBorderPainted(false); 
                                services.setBorder(null);
                                services.setFocusable(false);
                                services.addActionListener(this);


                                // contact
                                contact.setText("Contact");
                                contact.setBounds(615, 20, 130, 30);
                                contact.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                contact.setForeground(new Color(0xF5F5F5));
                                contact.setOpaque(false);                        //
                                contact.setContentAreaFilled(false);             //  transparent Button;
                                contact.setBorderPainted(false); 
                                contact.setBorder(null);
                                contact.setFocusable(false);
                                contact.addActionListener(this);


                                // emergency
                                emergency.setText("Emergency");
                                emergency.setBounds(745, 20, 150, 30);
                                emergency.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                emergency.setForeground(new Color(0xEE964B));
                                emergency.setOpaque(false);                        //
                                emergency.setContentAreaFilled(false);             //  transparent Button;
                                emergency.setBorderPainted(false); 
                                emergency.setBorder(null);
                                emergency.setFocusable(false);
                                emergency.addActionListener(this);


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


                                // username field
                                username = new JTextField();
                                username.setBounds(260,166,380,42);
                                username.setBorder(null); // field border
                                username.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                username.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for username field
                                username.setForeground(Color.GRAY);
                                username.setText("Username");
                                username.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (username.getText().equals("Username")) {
                                                        username.setText("");
                                                        username.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (username.getText().isEmpty()) {
                                                        username.setForeground(Color.GRAY);
                                                        username.setText("Username");
                                                    }
                                                }
                                                });



                                // admin panel Title
                                adminAdd = new JTextArea();
                                adminAdd.setText("Add  By Admin");
                                adminAdd.setBounds(365, 105, 200, 26);
                                adminAdd.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
                                adminAdd.setForeground(new Color(0xEE964B));
                                adminAdd.setBackground(new Color(0x1D1A31));
                                adminAdd.setEditable(false);




                                
                                //email field
                                email = new JTextField();
                                email.setBounds(260,217,380,42);
                                email.setBorder(null); // field border
                                email.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                email.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for email field
                                email.setForeground(Color.GRAY);
                                email.setText("E-mail");
                                email.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (email.getText().equals("E-mail")) {
                                                        email.setText("");
                                                        email.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (email.getText().isEmpty()) {
                                                        email.setForeground(Color.GRAY);
                                                        email.setText("E-mail");
                                                    }
                                                }
                                                });



                                // phone field
                                phone = new JTextField();
                                phone.setBounds(260,268,380,42);
                                phone.setBorder(null); // field border
                                phone.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                phone.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for phone field
                                phone.setForeground(Color.GRAY);
                                phone.setText("Phone");
                                phone.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (phone.getText().equals("Phone")) {
                                                        phone.setText("");
                                                        phone.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (phone.getText().isEmpty()) {
                                                        phone.setForeground(Color.GRAY);
                                                        phone.setText("Phone");
                                                    }
                                                }
                                                });



                                // age ;
                                age = new JTextField();
                                age.setBounds(260,319,380,42);
                                age.setBorder(null); // field border
                                age.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                age.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for phone field
                                age.setForeground(Color.GRAY);
                                age.setText("Your Age");
                                age.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (age.getText().equals("Your Age")) {
                                                        age.setText("");
                                                        age.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (age.getText().isEmpty()) {
                                                        age.setForeground(Color.GRAY);
                                                        age.setText("Your Age");
                                                    }
                                                }
                                                });

                                // password label
                                pass = new JLabel();
                                pass.setText("Password");
                                pass.setBounds(260, 388, 100, 15);
                                pass.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                pass.setForeground(new Color(0xF5F5F5));



                                // password field
                                password = new JPasswordField();
                                password.setBounds(260,414,380,42);
                                password.setBorder(null); // field border
                                password.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                password.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 
                                // adding button
                                register = new JButton();
                                register.setText("Add User");
                                register.setBounds(283, 477, 190, 42);
                                register.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                register.setForeground(new Color(0x1D1A31));
                                register.setBackground(Color.decode("#FFFFFF"));
                                register.setBorder(null);
                                register.setFocusable(false);
                                register.addActionListener(this);


                                // Cancel button
                                cancel = new JButton();
                                cancel.setText("Cancel");
                                cancel.setBounds(505, 485, 100, 26);
                                cancel.setBackground(new Color(0x1D1A31));
                                cancel.setForeground(new Color(0xFFFBFC));
                                //home.setOpaque(false);                        //
                                //home.setContentAreaFilled(false);             //  transparent Button;
                                //home.setBorderPainted(false);                 //
                                cancel.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                cancel.setBorder(null);
                                cancel.setFocusable(false);
                                cancel.addActionListener(this);




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
        homeFrame.add(username);
        //homeFrame.add(logIn);
        //homeFrame.add(imgLabel);
        homeFrame.add(email);
        homeFrame.add(phone);
        homeFrame.add(age);
        homeFrame.add(pass);
        homeFrame.add(password);
        homeFrame.add(register);
        homeFrame.add(cancel);
        homeFrame.add(adminAdd);

        
        appTitle.requestFocusInWindow();

        }


                                // Exit button action
                                public void actionPerformed(ActionEvent e) {


                                String textField1 = username.getText().toLowerCase(); // User Name
                                String textField2 = email.getText(); // Email
                                String textField3 = phone.getText(); // phone
                                String textField4 = age.getText(); // age
                                String textField5 = password.getText(); // password



                                //exit button
                                if (e.getSource() == exit) {
                                    // homeFrame.setVisible(false);
                                    System.exit(0);
                                }

                                
                                


                                 //cancel button
                                else if (e.getSource() == cancel) {
                                    homeFrame.setVisible(false);
                                    new UserData();
                                }

                                // register button
                                else if (e.getSource() == register) {
                                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                                        || textField5.isEmpty() ) {
                                JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                                    
                                }

                                else{

                                    try {
                                                File file = new File(".\\data\\user_data.txt");
                                                if (!file.exists()) {
                                                    file.createNewFile();
                                                }
                                                FileWriter fw = new FileWriter(file, true);
                                                BufferedWriter bw = new BufferedWriter(fw);
                                                PrintWriter pw = new PrintWriter(bw);

                                                LocalDateTime myDateObj = LocalDateTime.now();
                                                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                                                String timeAndDate = myDateObj.format(myFormatObj);

                                                pw.println("             ## Added by Admin ##");
                                                pw.println("User Name : " + textField1);
                                                pw.println("E-mail : " + textField2);
                                                pw.println("Phone : " + textField3);
                                                pw.println("Age : " + textField4);
                                                pw.println("Password : " + textField5);
                                                pw.println("Time & Date : " + timeAndDate);
                                                pw.println("===============================================");
                                                pw.close();

                                            } catch (Exception ex) {
                                                System.out.print(ex);
                                            }

                                            JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                                            JOptionPane.WARNING_MESSAGE);
                                            homeFrame.setVisible(false);
                                            new UserData();

                                }
                            }
                        }

                            /*
                            public void actionPerformed2(ActionEvent e) {
                                if (e.getSource() == home) {
                                    // homeFrame.setVisible(false);
                                    System.exit(0);
                                }
                            }
                            */

                            public static void main(String[] args) {
                                new AdminAdd();
                            }
}