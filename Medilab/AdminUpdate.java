import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminUpdate implements ActionListener {

    JFrame homeFrame;


    JLabel uname;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabel;
    JTextArea adminPanel;
    JTextArea uInfo;


    JButton updateBtn;
    JButton cancel;
    JButton emergency;
    JButton exit;
    JButton logIn;
    JButton back;

    JTextField username;
    JPasswordField password;


    ImageIcon logo;

    JSeparator separator;


                                    public AdminUpdate(){

                                        homeFrame = new JFrame();


                        
                                        // separator 
                                        separator = new JSeparator();
                                        separator.setForeground(new Color(0x3EB8D2));
                                        separator.setBounds(0, 65, 900, 3);

                                        // Application Title
                                        appTitle = new JLabel();
                                        appTitle.setText("Medilab");
                                        appTitle.setBounds(20, 10, 212, 54);
                                        appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                        appTitle.setForeground(new Color(0xF5F5F5));



                                        // admin panel Title
                                        adminPanel = new JTextArea();
                                        adminPanel.setText("Admin Panel");
                                        adminPanel.setBounds(620, 20, 250, 40);
                                        adminPanel.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                        adminPanel.setForeground(new Color(0xEE964B));
                                        adminPanel.setBackground(new Color(0x1D1A31));
                                        adminPanel.setEditable(false);


                                        // UPDATE info Title
                                        uInfo = new JTextArea();
                                        uInfo.setText("Update Info");
                                        uInfo.setBounds(315, 115, 293, 40);
                                        uInfo.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
                                        uInfo.setForeground(new Color(0xF5F5F5));
                                        uInfo.setBackground(new Color(0x1D1A31));
                                        uInfo.setEditable(false);
                                        

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



                                // username label
                                uname = new JLabel();
                                uname.setText("New Username");
                                uname.setBounds(262, 208, 144, 26);
                                uname.setFont(new Font("IBM Plex Mono", Font.PLAIN, 20));
                                uname.setForeground(new Color(0xFFFFFF));

                                // password label
                                pass = new JLabel();
                                pass.setText("New Password");
                                pass.setBounds(262, 302, 144, 26);
                                pass.setFont(new Font("IBM Plex Mono", Font.PLAIN, 20));
                                pass.setForeground(new Color(0xFFFFFF));



                                // username field
                                
                                username = new JTextField();
                                username.setBounds(262,234,380,42);
                                username.setBorder(null); // field border
                                username.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                username.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                



                                // passwordfield
                                password = new JPasswordField();
                                password.setBounds(262,328,380,42);
                                password.setBorder(null);
                                password.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // pass field  font
                                password.setBackground(Color.decode("#FFFFFF")); // pass field bg color




                                        // change button
                                        updateBtn = new JButton();
                                        updateBtn.setText("Update Info");
                                        updateBtn.setBounds(304, 404, 181, 42);
                                        updateBtn.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                        updateBtn.setForeground(new Color(0xFFFFFF));
                                        updateBtn.setBackground(Color.decode("#3EB8D2"));
                                        updateBtn.setBorder(null);
                                        updateBtn.setFocusable(false);
                                        updateBtn.addActionListener(this);


                                        // cancel in button
                                        cancel = new JButton();
                                        cancel.setText("Cancel");
                                        cancel.setBounds(535, 412, 72, 26);
                                        cancel.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                        cancel.setForeground(new Color(0xFFFFFF));
                                        cancel.setBackground(Color.decode("#1D1A31"));
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
        homeFrame.add(adminPanel);
        homeFrame.add(uInfo);
        homeFrame.add(exit);
        homeFrame.add(uname);
        homeFrame.add(pass);
        homeFrame.add(username);
        homeFrame.add(password);
        homeFrame.add(updateBtn);
        homeFrame.add(cancel);

                                    }


                                     public void actionPerformed(ActionEvent e) {


                                        String textField1 = username.getText().toLowerCase(); // User Name
                                        String textField2 = password.getText(); // Password

                                        //exit button
                                        if (e.getSource() == exit) {
                                            // homeFrame.setVisible(false);
                                            System.exit(0);
                                        }


                                        //cancel button
                                        if (e.getSource() == cancel) {
                                            homeFrame.setVisible(false);
                                            new AdminPanel();
                                        }


                                        // update button
                                        else if(e.getSource()== updateBtn){


                                                     if (textField1.isEmpty() || textField2.isEmpty()) {
                                                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                                                JOptionPane.WARNING_MESSAGE);
                                                    } else {

                                                        String adminFile = ".\\Data\\admin_data.txt";
                                                        File oldFile = new File(adminFile);
                                                        oldFile.delete();
                                                        File dump = new File(adminFile);

                                                        try {

                                                            FileWriter fw = new FileWriter(adminFile, true);
                                                            BufferedWriter bw = new BufferedWriter(fw);
                                                            PrintWriter pw = new PrintWriter(bw);

                                                            pw.println("==========================================");
                                                            pw.println("=== ###  Travel Agency Admin Data  ### ===");
                                                            pw.println("==========================================");
                                                            pw.println("Name : " + textField1);
                                                            pw.println("Password : " + textField2);
                                                            pw.println("==========================================");

                                                            pw.flush();
                                                            pw.close();
                                                            bw.close();
                                                            fw.close();

                                                            JOptionPane.showMessageDialog(null, "Admin Name and Password has been changed.",
                                                                    "Admin Passowrd", JOptionPane.INFORMATION_MESSAGE);
                                                            homeFrame.setVisible(false);
                                                            new Admin();

                                                        } catch (Exception ex) {
                                                            System.out.print(ex);
                                                        }

                                                    }
                                        }
                                    }


                                    public static void main(String[] args) {
                                        new AdminUpdate();
                                    }
}