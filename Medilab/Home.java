import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Home implements ActionListener {

    JFrame homeFrame;

    JLabel appTitle;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;

    JSeparator separator;

    JTextArea slogan;

    JButton login;
    JButton register;

    JLabel imageLabel;
    ImageIcon mainLogo;

    JLabel bottomBG;

    JButton adminButton;
    JButton courseTeacher;
    JButton contributors;
    JButton exit;

    Home() {
        homeFrame = new JFrame();

        appTitle = new JLabel();

        home = new JButton();
        services = new JButton();
        contact = new JButton();
        emergency = new JButton();

        separator = new JSeparator();

        slogan = new JTextArea();

        login = new JButton();
        register = new JButton();



        bottomBG = new JLabel();

        adminButton = new JButton();
        courseTeacher = new JButton();
        contributors = new JButton();
        exit = new JButton();

        // Application Title
        appTitle.setText("Medilab");
        appTitle.setBounds(20, 10, 212, 54);
        appTitle.setFont(new Font("Consolas", Font.BOLD, 32));
        appTitle.setForeground(new Color(0xF5F5F5));

        // home button
        home = new JButton();
        home.setText("Home");
        home.setBounds(370, 20, 100, 30);
        home.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
        home.setForeground(new Color(0x8ED8EE));
        home.setBorder(null);
        home.setOpaque(false);                        //
        home.setContentAreaFilled(false);             //  transparent Button;
        home.setBorderPainted(false); 
        home.setBorder(null);
        home.setFocusable(false);
        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

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
        services.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        contact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        emergency.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        emergency.addActionListener(this);

        // separator
        separator.setForeground(new Color(0xFFFFFF));
        separator.setBounds(0, 65, 900, 2);

        // slogan
        slogan.setText("Best Care &\r\nBetter Doctor");
        slogan.setBounds(20, 210, 310, 100);
        slogan.setFont(new Font("Consolas", Font.BOLD, 40));
        slogan.setForeground(new Color(0xF5F5F5));
        slogan.setBackground(null);
	    slogan.setEditable(false);

        // login button
        login.setText("Login");
        login.setBounds(20, 320, 150, 40);
        login.setBackground(new Color(0xFFFBFC));
        login.setForeground(new Color(0x1D1A31));
        login.setFont(new Font("Consolas", Font.PLAIN, 18));
        login.setBorder(null);
        login.setFocusable(false);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.addActionListener(this);

        // register button
        register.setText("Register");
        register.setBounds(200, 320, 150, 40);
        register.setBackground(new Color(0xFFFBFC));
        register.setForeground(new Color(0x1D1A31));
        register.setFont(new Font("Consolas", Font.PLAIN, 18));
        register.setBorder(null);
        register.setFocusable(false);
        register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        register.addActionListener(this);

        //
        mainLogo = new ImageIcon(getClass().getResource("/images/medilab-logo.png"));
        imageLabel = new JLabel(mainLogo);
        imageLabel.setBounds(580, 165, 287, 228);

        // bottomBG
        bottomBG.setBounds(0, 485, 900, 80);
        bottomBG.setBackground(new Color(0xFFFBFC));
        bottomBG.setOpaque(true);

        // adminButton
        adminButton.setText("Admin");
        adminButton.setBounds(20, 503, 200, 45);
        adminButton.setBackground(new Color(0x1D1A31));
        adminButton.setForeground(new Color(0xFFFBFC));
        adminButton.setFont(new Font("Consolas", Font.PLAIN, 18));
        adminButton.setBorder(null);
        adminButton.setFocusable(false);
        adminButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        adminButton.addActionListener(this);
        // courseTeacher
        courseTeacher.setText("Course Teacher");
        courseTeacher.setBounds(235, 503, 200, 45);
        courseTeacher.setBackground(new Color(0x1D1A31));
        courseTeacher.setForeground(new Color(0xFFFBFC));
        courseTeacher.setFont(new Font("Consolas", Font.PLAIN, 18));
        courseTeacher.setBorder(null);
        courseTeacher.setFocusable(false);
        courseTeacher.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        courseTeacher.addActionListener(this);
        // contributors
        contributors.setText("Contributors");
        contributors.setBounds(450, 503, 200, 45);
        contributors.setBackground(new Color(0x1D1A31));
        contributors.setForeground(new Color(0xFFFBFC));
        contributors.setFont(new Font("Consolas", Font.PLAIN, 18));
        contributors.setBorder(null);
        contributors.setFocusable(false);
        contributors.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contributors.addActionListener(this);

        // exit
        exit.setText("Exit");
        exit.setBounds(665, 503, 200, 45);
        exit.setBackground(new Color(0x1D1A31));
        exit.setForeground(new Color(0xFFFBFC));
        exit.setFont(new Font("Consolas", Font.PLAIN, 18));
        exit.setBorder(null);
        exit.setFocusable(false);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.addActionListener(this);

        // frame
        homeFrame.setTitle("Medilab - Home");
        homeFrame.setSize(900, 600);
        homeFrame.getContentPane().setBackground(new Color(0x1D1A31));
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setResizable(false);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setLayout(null);
        homeFrame.setVisible(true);

        homeFrame.add(appTitle);
        homeFrame.add(home);
        homeFrame.add(services);
        homeFrame.add(contact);
        homeFrame.add(emergency);
        homeFrame.add(separator);
        homeFrame.add(slogan);
        homeFrame.add(login);
        homeFrame.add(register);
        homeFrame.add(imageLabel);
        homeFrame.add(adminButton);
        homeFrame.add(courseTeacher);
        homeFrame.add(contributors);
        homeFrame.add(exit);
        homeFrame.add(bottomBG);
    }

    // action listener
    public void actionPerformed(ActionEvent e) {

        // Exit button
        if (e.getSource() == exit) {
            // homeFrame.setVisible(false);
            System.exit(0);
        }

        //Login button
        else if (e.getSource() == login) {
            homeFrame.setVisible(false);
            new LogIn();
        }
        // register button
        else if (e.getSource() == register) {
            homeFrame.setVisible(false);
            new Register();
        }


        // services button
        else if (e.getSource() == services) {
            homeFrame.setVisible(false);
            new ServicesForNonUser();
        }

        // contact button
        else if (e.getSource() == contact) {
            homeFrame.setVisible(false);
            new ContactForNonUser();
        }

        // emergency button
        else if (e.getSource() == emergency) {
            homeFrame.setVisible(false);
            new EmergencyForNonUser();
        }


        // contributors button
        else if (e.getSource() == contributors) {
            homeFrame.setVisible(false);
            new ProjectMembers();
        }

        // adminButton button
        else if (e.getSource() == adminButton) {
            homeFrame.setVisible(false);
            new Admin();
        }

         // course teacher button
        else if (e.getSource() == courseTeacher) {
            homeFrame.setVisible(false);
            new CourseTeacher();
        }
    }


    public static void main(String[] args) {
        new Home();
    }
}