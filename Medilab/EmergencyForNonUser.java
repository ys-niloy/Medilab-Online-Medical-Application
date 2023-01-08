import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class EmergencyForNonUser implements ActionListener {

    JFrame homeFrame;


    JTextArea emer;
    JTextArea cont;
    JTextArea num;
    JLabel weAccept;
    JLabel CVV;

    JLabel appTitle;
    JLabel imgLabel;
    JLabel imgLabelMini;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logout;
    JButton back;

    ImageIcon logo;
    ImageIcon miniLogo;

    JSeparator separator;


								public EmergencyForNonUser()
								{
									homeFrame = new JFrame();


                                //___________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));


                                // home button
                                home = new JButton();
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
                               


                                // services button
                                services = new JButton();
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


                                // contact button
                                contact = new JButton();
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


                                // emergency button
                                emergency = new JButton();
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
                                separator = new JSeparator();
                                separator.setForeground(new Color(0x3EB8D2));
                                separator.setBounds(0, 65, 900, 3);



                               
                                // Exit button
                                exit = new JButton();
                                exit.setText("Exit");
                                exit.setBounds(790, 520, 70, 30);
                                exit.setBackground(new Color(0x1D1A31));
                                exit.setForeground(new Color(0xFFFBFC));
                                exit.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                exit.setBorder(null);
                                exit.setFocusable(false);
                                exit.addActionListener(this);


                                // logout button
                                logout = new JButton();
                                logout.setText("Logout");
                                logout.setBounds(715, 520, 70, 30);
                                logout.setBackground(new Color(0x1D1A31));
                                logout.setForeground(new Color(0xFFFBFC));
                                logout.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                logout.setBorder(null);
                                logout.setFocusable(false);
                                logout.addActionListener(this);


                                // Adding Logo beside message
                                logo = new ImageIcon(getClass().getResource("/images/ambulance.png"));
                                imgLabel = new JLabel(logo);
                                imgLabel.setBounds(110, 242, logo.getIconWidth(), logo.getIconHeight());

                                // Adding mini Logo 
                                miniLogo = new ImageIcon(getClass().getResource("/images/medilabMiniLogo.png"));
                                imgLabelMini = new JLabel(miniLogo);
                                imgLabelMini.setBounds(500, 98, miniLogo.getIconWidth(), miniLogo.getIconHeight());



                                // cont text
                                cont = new JTextArea();
								cont.setText("     Contact Us"+ "\r\n" + 
											 "In Case Of Emergency");
								cont.setBounds(443, 231, 400, 100);
								cont.setFont(new Font("JetBrains Mono", Font.PLAIN, 30));
								cont.setForeground(new Color(0xEE964B));
								cont.setBackground(null);
								cont.setEditable(false);


								// num 
                                num = new JTextArea();
								num.setText("     +962 4431 28"+ "\r\n" + 
											"     +880 247 0256");
								num.setBounds(443, 332, 350, 97);
								num.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
								num.setForeground(new Color(0xF5F5F5));
								num.setBackground(null);
								num.setEditable(false);


                                // emergency 
                                emer = new JTextArea();
                                emer.setText("Emergency");
                                               
                                emer.setBounds(330, 111, 160, 50);
                                emer.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
                                emer.setForeground(new Color(0xEE964B));
                                emer.setBackground(null);
                                emer.setEditable(false);

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
        homeFrame.add(home);
        homeFrame.add(services);
        homeFrame.add(contact);
        homeFrame.add(emergency);
        homeFrame.add(separator);
        homeFrame.add(exit);
        homeFrame.add(cont);
        homeFrame.add(num);
        homeFrame.add(emer);
        homeFrame.add(imgLabelMini);
        homeFrame.add(imgLabel);
        

    }


                         public void actionPerformed(ActionEvent e){
                                // home button
                         if(e.getSource() == home) {
                            homeFrame.setVisible(false);
                            new Home();
                        }


                        // contact button
                        else if (e.getSource() == contact) {
                            homeFrame.setVisible(false);
                            new ContactForNonUser();
                        }

                        // services button
                        else if (e.getSource() == services) {
                            homeFrame.setVisible(false);
                            new ServicesForNonUser();
                        }

                        // exit button
                        else if (e.getSource() == exit) {
                            //homeFrame.setVisible(false);
                           System.exit(0);
                        }

                    }


    public static void main(String[] args) {
        new EmergencyForNonUser();
    }
}