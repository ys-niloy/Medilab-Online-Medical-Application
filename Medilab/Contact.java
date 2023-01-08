import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Contact implements ActionListener {

    JFrame homeFrame;


    JTextArea conUs;
    JTextArea hotline;
    JTextArea email;
    JTextArea num;
    JTextArea mail;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabelMini;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logout;

    JTextField username;
    JPasswordField password;


    ImageIcon miniLogo;

    JSeparator separator;


                                public Contact(){
        


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
                                home.setText("Dashboard");
                                home.setBounds(710, 20, 150, 30);
                                home.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                home.setForeground(new Color(0xF5F5F5));
                                home.setBorder(null);
                                home.setOpaque(false);                        //
                                home.setContentAreaFilled(false);             //  transparent Button;
                                home.setBorderPainted(false); 
                                home.setBorder(null);
                                home.setFocusable(false);
                                home.addActionListener(this);


                                


                                
                                
                                // separator
                                separator = new JSeparator();
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


                                // contact us Title
                                conUs = new JTextArea();
                                conUs.setText("Contact Us");
                                conUs.setBounds(312, 111, 221, 45);
                                conUs.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                conUs.setForeground(new Color(0x3EB8D2));
                                conUs.setBackground(new Color(0x1D1A31));
                                conUs.setEditable(false);



                                //mini logo
                                miniLogo = new ImageIcon(getClass().getResource("/images/medilab_mini_logo.png"));
                                imgLabelMini = new JLabel(miniLogo);
                                imgLabelMini.setBounds(552, 105, 69, 52);


                                // hotline Title
                                hotline = new JTextArea();
                                hotline.setText("Hotline:");
                                hotline.setBounds(101, 252, 221, 45);
                                hotline.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
                                hotline.setForeground(new Color(0xEE964B));
                                hotline.setBackground(new Color(0x1D1A31));
                                hotline.setEditable(false);



                                // numbers
                                num = new JTextArea();
                                num.setText    ("+974 337 24"+ "\r\n" + 
                                                "+880 248 0329");
                                num.setBounds(101, 305, 225, 100);
                                num.setFont(new Font("JetBrains Mono", Font.PLAIN, 28));
                                num.setForeground(new Color(0xFFFBFC));
                                num.setBackground(new Color(0x1D1A31));
                                num.setEditable(false);



                                // Email title
                                email = new JTextArea();
                                email.setText("E-mail:");
                                email.setBounds(474, 252, 221, 45);
                                email.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
                                email.setForeground(new Color(0xEE964B));
                                email.setBackground(new Color(0x1D1A31));
                                email.setEditable(false);



                                // mail address
                                mail = new JTextArea();
                                mail.setText ("contact@medilab.com");
                                mail.setBounds(474, 305, 350, 100);
                                mail.setFont(new Font("JetBrains Mono", Font.PLAIN, 28));
                                mail.setForeground(new Color(0xFFFBFC));
                                mail.setBackground(new Color(0x1D1A31));
                                mail.setEditable(false);




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
        homeFrame.add(home);
        homeFrame.add(logout);
        homeFrame.add(separator);
        homeFrame.add(exit);
        homeFrame.add(conUs);
        homeFrame.add(imgLabelMini);
        homeFrame.add(hotline);
        homeFrame.add(num);
        homeFrame.add(email);
        homeFrame.add(mail);

}



                                     public void actionPerformed(ActionEvent e){


                                        //exit button
                                        if (e.getSource() == exit) {
                                            // homeFrame.setVisible(false);
                                            System.exit(0);
                                        }


                                        //logout button
                                        if (e.getSource() == logout) {
                                            homeFrame.setVisible(false);
                                            new Home();
                                        }


                                        //dashboard button
                                        if (e.getSource() == home) {
                                            homeFrame.setVisible(false);
                                            new Dashboard();
                                        }
                                    }


                    public static void main(String[] args) {
                        new Contact();
                    }
}