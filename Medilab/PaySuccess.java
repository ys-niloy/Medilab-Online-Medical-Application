import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class PaySuccess  implements ActionListener{

    JFrame homeFrame;


    JTextArea confirm;
    JTextArea thanks;
    JLabel weAccept;
    JLabel CVV;

    JLabel appTitle;
    JLabel imgLabel;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logout;
    JButton back;

    JSeparator separator;


								public PaySuccess()
								{
									homeFrame = new JFrame();


                                //___________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));


                                // Dashboard button
                                home = new JButton();
                                home.setText("Dashboard");
                                home.setBounds(680, 20, 150, 30);
                                home.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                home.setForeground(new Color(0xF5F5F5));
                                home.setBorder(null);
                                home.setOpaque(false);                        //
                                home.setContentAreaFilled(false);             //  transparent Button;
                                home.setBorderPainted(false); 
                                home.setBorder(null);
                                home.setFocusable(false);
                                home.addActionListener(this);
                               

                                /*
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
    */

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



                                // confirm text
                                confirm = new JTextArea();
								confirm.setText("  Your Appoinment"+ "\r\n" + 
												"Has Been Confirmed!");
								confirm.setBounds(245, 183, 450, 97);
								confirm.setFont(new Font("JetBrains Mono", Font.PLAIN, 36));
								confirm.setForeground(new Color(0xEE964B));
								confirm.setBackground(null);
								confirm.setEditable(false);


								// thanks 
                                thanks = new JTextArea();
								thanks.setText("Thanks For Choosing"+ "\r\n" + 
											   "    Our Service");
								thanks.setBounds(245, 300, 450, 97);
								thanks.setFont(new Font("JetBrains Mono", Font.PLAIN, 36));
								thanks.setForeground(new Color(0xF5F5F5));
								thanks.setBackground(null);
								thanks.setEditable(false);




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
        //homeFrame.add(services);
       // homeFrame.add(contact);
       // homeFrame.add(emergency);
        homeFrame.add(separator);
        homeFrame.add(exit);
        homeFrame.add(logout);
        homeFrame.add(confirm);
        homeFrame.add(thanks);

								}


                                        public void actionPerformed(ActionEvent e){

                                        if (e.getSource()== exit){
                                            System.exit(0);
                                        }

                                        else if (e.getSource()== home){
                                            homeFrame.setVisible(false);
                                            new Dashboard();
                                        }


                                        else if (e.getSource()== logout){
                                            homeFrame.setVisible(false);
                                            new Home();
                                        }
                                    }


								public static void main(String[] args) {
									new PaySuccess();
								}
}