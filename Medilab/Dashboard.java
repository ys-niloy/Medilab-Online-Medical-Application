import javax.swing.*;
import javax.swing.text.html.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Dashboard implements ActionListener {

    JFrame homeFrame;


    JLabel uname;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabel;
    JLabel wlcLabel;
    JLabel cService;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logout;
    JButton oCon;               // online consultation
    JButton ipCon;              // in person consultation

    JTextField username;
    JPasswordField password;


    ImageIcon wlcLogo;

    JSeparator separator;


                                public Dashboard(){
        


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


                                // welcome label
                                wlcLogo = new ImageIcon(getClass().getResource("/images/Welcome To Medilab!.png"));
                                wlcLabel = new JLabel(wlcLogo);
                                wlcLabel.setBounds(215, 144, wlcLogo.getIconWidth(), wlcLogo.getIconHeight());


                                // Choose service label
                                cService = new JLabel();
                                cService.setText("Choose Your Service Below");
                                cService.setBounds(255, 205, 450, 32);
                                cService.setFont(new Font("JetBrains Mono", Font.BOLD, 24));
                                cService.setForeground(new Color(0xF5F5F5));

                               
                                // Exit button
                                exit = new JButton();
                                exit.setText("Exit");
                                exit.setBounds(800, 500, 100, 45);
                                exit.setBackground(new Color(0x1D1A31));
                                exit.setForeground(new Color(0xFFFBFC));
                                exit.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                exit.setBorder(null);
                                exit.setFocusable(false);
                                exit.addActionListener(this);


                                //logout button
                                logout = new JButton();
                                logout.setText("Logout");
                                logout.setBounds(721, 500, 100, 45);
                                logout.setBackground(new Color(0x1D1A31));
                                logout.setForeground(new Color(0xFFFBFC));
                                logout.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                logout.setBorder(null);
                                logout.setFocusable(false);
                                logout.addActionListener(this);


                                // Online consult button

                                String lbl2 = "<html>" +  "Online Consultation" + "</html>";
                                
                                oCon = new JButton(lbl2);
                                //oCon.setText("Online");
                                oCon.setBounds(91, 311, 300, 85);
                                oCon.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
                                oCon.setForeground(new Color(0xFFFFFF));
                                oCon.setBackground(Color.decode("#3EB8D2"));
                                oCon.setBorder(null);
                                oCon.setFocusable(false);
                                oCon.addActionListener(this);


                                // covid test button

                                //String lbl = "<html>" + "Covid Test at Your Doorstep" + "</html>";
                                
                                ipCon = new JButton();
                                ipCon.setText("Covid Test at Your"+ "\r\n"+
                                              " Doorstep");
                                ipCon.setBounds(505, 311, 300, 85);
                                ipCon.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
                                ipCon.setForeground(new Color(0xFFFFFF));
                                ipCon.setBackground(Color.decode("#3EB8D2"));
                                ipCon.setBorder(null);
                                ipCon.setFocusable(false);
                                ipCon.addActionListener(this);




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
        homeFrame.add(logout);
        homeFrame.add(wlcLabel);
        homeFrame.add(cService);
        homeFrame.add(oCon);
        homeFrame.add(ipCon);

}
                public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == exit) {
                            // homeFrame.setVisible(false);
                            System.exit(0);
                        }

                        // home button
                        else if(e.getSource() == home) {
                            homeFrame.setVisible(false);
                            new Home();
                        }


                        // services button
                        else if (e.getSource() == services) {
                            homeFrame.setVisible(false);
                            new Services();
                        }

                        // contact button
                        else if (e.getSource() == contact) {
                            homeFrame.setVisible(false);
                            new Contact();
                        }

                        // emergency button
                        else if (e.getSource() == emergency) {
                            homeFrame.setVisible(false);
                            new Emergency();
                        }

                        // logout button
                        else if(e.getSource() == logout) {
                            homeFrame.setVisible(false);
                            new Home();
                        }

                        //consult button
                        else if(e.getSource()== oCon){
                            homeFrame.setVisible(false);
                            new AppointmentForm();
                        }


                        // covid test button
                        else if(e.getSource()== ipCon){
                            homeFrame.setVisible(false);
                            new CovidTest();
                        }


                    }

                public static void main(String[] args) {
                    new Dashboard();
                }

}