import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Services implements ActionListener {

    JFrame homeFrame;


    JTextArea oServices;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabelMini;
    JLabel imgLabelOnCon;
    JLabel imgLabelCovTest;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logIn;
    JButton onConBtn;
    JButton covTestBtn;


    JTextField username;
    JPasswordField password;


    ImageIcon miniLogo;
    ImageIcon onCon;
    ImageIcon covTest;

    JSeparator separator;


                                public Services(){
        


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


                                // our services Title
                                oServices = new JTextArea();
                                oServices.setText("Our Services");
                                oServices.setBounds(305, 115, 240, 54);
                                oServices.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                oServices.setForeground(new Color(0x3EB8D2));
                                oServices.setBackground(new Color(0x1D1A31));


                                //mini logo
                                miniLogo = new ImageIcon(getClass().getResource("/images/medilab_mini_logo.png"));
                                imgLabelMini = new JLabel(miniLogo);
                                imgLabelMini.setBounds(560, 110, 69, 52);


                                //online consultation logo
                                onCon = new ImageIcon(getClass().getResource("/images/online_consultation.png"));
                                imgLabelOnCon = new JLabel(onCon);
                                imgLabelOnCon.setBounds(190, 243, onCon.getIconWidth(), onCon.getIconHeight());


                                //covid test logo
                                covTest = new ImageIcon(getClass().getResource("/images/covid_test.png"));
                                imgLabelCovTest = new JLabel(covTest);
                                imgLabelCovTest.setBounds(590, 238, covTest.getIconWidth(), covTest.getIconHeight());


                                // online consultation button
                                onConBtn = new JButton();
                                onConBtn.setText("Online Consultation");
                                onConBtn.setBounds(102, 375, 300, 85);
                                onConBtn.setBackground(new Color(0x3EB8D2));
                                onConBtn.setForeground(new Color(0xFFFBFC));
                                onConBtn.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                onConBtn.setBorder(null);
                                onConBtn.setFocusable(false);
                                onConBtn.addActionListener(this);


                                 // online covid test button
                                covTestBtn = new JButton();
                                covTestBtn.setText("Covid Test at Your Doorstep");
                                covTestBtn.setBounds(521, 375, 300, 85);
                                covTestBtn.setBackground(new Color(0x3EB8D2));
                                covTestBtn.setForeground(new Color(0xFFFBFC));
                                covTestBtn.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                covTestBtn.setBorder(null);
                                covTestBtn.setFocusable(false);
                                covTestBtn.addActionListener(this);






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
        homeFrame.add(separator);
        homeFrame.add(exit);
        homeFrame.add(oServices);
        homeFrame.add(imgLabelMini);
        homeFrame.add(imgLabelOnCon);
        homeFrame.add(imgLabelCovTest);
        homeFrame.add(onConBtn);
        homeFrame.add(covTestBtn);


}
                            



                            // action listener
                            public void actionPerformed(ActionEvent e) {


                                // Exit button
                                if (e.getSource() == exit) {
                                    // homeFrame.setVisible(false);
                                    System.exit(0);
                                }


                                // dashboard button
                                else if (e.getSource() == home) {
                                    homeFrame.setVisible(false);
                                    new Dashboard();
                                }


                                else if( e.getSource()== onConBtn ){
                                    
                                    homeFrame.setVisible(false);
                                    new AppointmentForm();
                                }

                                else if( e.getSource()== covTestBtn ){
                                    
                                    homeFrame.setVisible(false);
                                    new CovidTest();
                                }

                            }






        public static void main(String[] args) {
            new Services();
        }
    }