import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminPanel  implements ActionListener{

    JFrame homeFrame;


    JLabel uname;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabel;
    JTextArea adminPanel;

    JButton userData;
    JButton cInfo;
    JButton exit;
    JButton logout;
    

    JTextField username;
    JPasswordField password;


    ImageIcon logo;

    JSeparator separator;


                                    public AdminPanel(){

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



                                        //online consultation logo
                                        logo = new ImageIcon(getClass().getResource("/images/admin_panel.png"));
                                        imgLabel = new JLabel(logo);
                                        imgLabel.setBounds(211, 125, logo.getIconWidth(), logo.getIconHeight());




                                        // user data consultation button
                                        userData = new JButton();
                                        userData.setText("User Data");
                                        userData.setBounds(322, 324, 256, 56);
                                        userData.setBackground(new Color(0xFFFBFC));
                                        userData.setForeground(new Color(0x1D1A31));
                                        userData.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                        userData.setBorder(null);
                                        userData.setFocusable(false);
                                        userData.addActionListener(this);



                                        // change info button
                                        cInfo = new JButton();
                                        cInfo.setText("Change Info");
                                        cInfo.setBounds(322, 393, 256, 56);
                                        cInfo.setBackground(new Color(0xFFFBFC));
                                        cInfo.setForeground(new Color(0x1D1A31));
                                        cInfo.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                        cInfo.setBorder(null);
                                        cInfo.setFocusable(false);
                                        cInfo.addActionListener(this);


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


                                        // logout button
                                        logout = new JButton();
                                        logout.setText("Logout");
                                        logout.setBounds(680, 500, 100, 45);
                                        logout.setBackground(new Color(0x1D1A31));
                                        logout.setForeground(new Color(0xFFFBFC));
                                        logout.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                        logout.setBorder(null);
                                        logout.setFocusable(false);
                                        logout.addActionListener(this);






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
        homeFrame.add(adminPanel);
        homeFrame.add(separator); 
        homeFrame.add(imgLabel);   
        homeFrame.add(userData);    
        homeFrame.add(cInfo);
        homeFrame.add(exit); 
        homeFrame.add(logout);                      

                                    }



                                    public void actionPerformed(ActionEvent e){

                                        //exit button
                                        if(e.getSource()== exit){
                                            System.exit(0);
                                        }

                                        //change info button
                                        else if(e.getSource()== cInfo){
                                            homeFrame.setVisible(false);
                                            new AdminUpdate();
                                        }

                                        //user data button
                                        else if(e.getSource()== userData){
                                            homeFrame.setVisible(false);
                                            new UserData();
                                        }

                                        //logout  button
                                        else if(e.getSource()== logout){
                                            homeFrame.setVisible(false);
                                            new Admin();
                                        }
                                    }


                                    public static void main(String[] args) {
                                        new AdminPanel();
                                    }
}