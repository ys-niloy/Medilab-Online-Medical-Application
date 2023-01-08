import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class AppointmentForm implements ActionListener {
    JFrame homeFrame;

    JLabel appTitle;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;

    JSeparator separator;

    JLabel frameTitle;

    JTextField patientName;
    JTextField phoneOrEmail;
    JTextField division;
    JTextField zilla;
    JTextField thana;

    // JTextField specialization;
    JComboBox specialization;
    // JTextField doctors;
    JComboBox doctors;

    Hashtable hash = new Hashtable();

    JTextField date;
    JTextField time;

    JLabel platform;

    JRadioButton zoom;
    JRadioButton meet;
    JRadioButton teams;

    JTextField platformUsername;

    JButton makeAnAppointment;

    JTextArea receipt;
    JTextArea doctorList;

    JButton generateReceipt;
    JButton here;

    JButton back;
    JButton logout;
    JButton exit;

    JButton switchToOffline;

    AppointmentForm() {
        homeFrame = new JFrame();

        appTitle = new JLabel();

        home = new JButton();
        services = new JButton();
        contact = new JButton();
        emergency = new JButton();

        separator = new JSeparator();

        frameTitle = new JLabel();

        patientName = new JTextField();
        phoneOrEmail = new JTextField();
        division = new JTextField();
        zilla = new JTextField();
        thana = new JTextField();
        // specialization = new JTextField();
        // doctors = new JTextField();
        date = new JTextField();
        time = new JTextField();

        platform = new JLabel();

        zoom = new JRadioButton();
        meet = new JRadioButton();
        teams = new JRadioButton();

        platformUsername = new JTextField();

        makeAnAppointment = new JButton();

        receipt = new JTextArea();

        generateReceipt = new JButton();

        back = new JButton();
        logout = new JButton();
        exit = new JButton();

        switchToOffline = new JButton();

        // Application Title
        appTitle.setText("Medilab");
        appTitle.setBounds(20, 10, 212, 54);
        appTitle.setFont(new Font("Jetbrains Mono", Font.BOLD, 32));
        appTitle.setForeground(new Color(0xF5F5F5));


        // Home
        home.setText("Home");
        home.setBounds(345, 20, 80, 30);
        home.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        home.setForeground(new Color(0x8ED8EE));
        home.setBackground(null);
        home.setBorder(null);
        home.setFocusable(false);
        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setContentAreaFilled(false);
        home.addActionListener(this);
        // services
        services.setText("Services");
        services.setBounds(445, 20, 130, 30);
        services.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        services.setForeground(new Color(0xF5F5F5));
        services.setBackground(null);
        services.setBorder(null);
        services.setFocusable(false);
        services.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        services.setContentAreaFilled(false);
        // contact
        contact.setText("Contact");
        contact.setBounds(595, 20, 120, 30);
        contact.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        contact.setForeground(new Color(0xF5F5F5));
        contact.setBackground(null);
        contact.setBorder(null);
        contact.setFocusable(false);
        contact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contact.setContentAreaFilled(false);
        // emergency
        emergency.setText("Emergency");
        emergency.setBounds(730, 20, 140, 30);
        emergency.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        emergency.setForeground(new Color(0xEE964B));
        emergency.setBackground(null);
        emergency.setBorder(null);
        emergency.setFocusable(false);
        emergency.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        emergency.setContentAreaFilled(false);

        // separator
        separator.setForeground(new Color(0x8ED8EE));
        separator.setBounds(0, 65, 900, 2);

        // frame title
        frameTitle.setText("Online Appointment Form");
        frameTitle.setBounds(230, 90, 445, 45);
        frameTitle.setFont(new Font("Jetbrains Mono", Font.PLAIN, 28));
        frameTitle.setForeground(new Color(0xEE964B));




        // doctors list label
        doctorList = new JTextArea();
        doctorList.setText("Want to see doctor's list?");
        doctorList.setBounds(185, 465, 300, 30);
        doctorList.setFont(new Font("Consolas", Font.PLAIN, 18));
        doctorList.setForeground(new Color(0xF5F5F5));
        doctorList.setBackground(null);
        doctorList.setEditable(false);


        // form fields
        // patient's name
        patientName.setBounds(20, 150, 370, 30);
        patientName.setBorder(null);
        patientName.setBackground(new Color(0xF5F5F5));
        patientName.setForeground(Color.GRAY);
        patientName.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        patientName.setText("Patient's Name");
        patientName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(patientName.getText().equals("Patient's Name")) {
                    patientName.setForeground(Color.BLACK);
                    patientName.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (patientName.getText().isEmpty()) {
                    patientName.setForeground(Color.GRAY);
                    patientName.setText("Patient's Name");
                }
            }
        });

        // phoneOrEmail
        phoneOrEmail.setBounds(20, 185, 370, 30);
        phoneOrEmail.setBorder(null);
        phoneOrEmail.setBackground(new Color(0xF5F5F5));
        phoneOrEmail.setForeground(Color.GRAY);
        phoneOrEmail.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        phoneOrEmail.setText("Phone or Email");
        phoneOrEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(phoneOrEmail.getText().equals("Phone or Email")) {
                    phoneOrEmail.setForeground(Color.BLACK);
                    phoneOrEmail.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (phoneOrEmail.getText().isEmpty()) {
                    phoneOrEmail.setForeground(Color.GRAY);
                    phoneOrEmail.setText("Phone or Email");
                }
            }
        });
        // division
        division.setBounds(20, 221, 118, 30);
        division.setBorder(null);
        division.setBackground(new Color(0xF5F5F5));
        division.setForeground(Color.GRAY);
        division.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        division.setText("Division");
        division.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(division.getText().equals("Division")) {
                    division.setForeground(Color.BLACK);
                    division.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (division.getText().isEmpty()) {
                    division.setForeground(Color.GRAY);
                    division.setText("Division");
                }
            }
        });
        // zilla
        zilla.setBounds(143, 221, 121, 30);
        zilla.setBorder(null);
        zilla.setBackground(new Color(0xF5F5F5));
        zilla.setForeground(Color.GRAY);
        zilla.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        zilla.setText("Zilla");
        zilla.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(zilla.getText().equals("Zilla")) {
                    zilla.setForeground(Color.BLACK);
                    zilla.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (zilla.getText().isEmpty()) {
                    zilla.setForeground(Color.GRAY);
                    zilla.setText("Zilla");
                }
            }
        });
        // thana
        thana.setBounds(268, 221, 122, 30);
        thana.setBorder(null);
        thana.setBackground(new Color(0xF5F5F5));
        thana.setForeground(Color.GRAY);
        thana.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        thana.setText("Thana");
        thana.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(thana.getText().equals("Thana")) {
                    thana.setForeground(Color.BLACK);
                    thana.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (thana.getText().isEmpty()) {
                    thana.setForeground(Color.GRAY);
                    thana.setText("Thana");
                }
            }
        });
        // specialization
        // specialization.setBounds(20, 256, 183, 30);
        // specialization.setBorder(null);
        // specialization.setBackground(new Color(0xF5F5F5));
        // specialization.setForeground(new Color(0x1D1A31));
        // specialization.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        // specialization.setText("Specialization");
        // specialization.addFocusListener(new FocusListener() {
        //     @Override
        //     public void focusGained(FocusEvent e) {
        //         if(specialization.getText().equals("Specialization")) {
        //             specialization.setText("");
        //         }
        //     }
        //     @Override
        //     public void focusLost(FocusEvent e) {
        //         if (specialization.getText().isEmpty()) {
        //             specialization.setText("Specialization");
        //         }
        //     }
        // });

        String[] specializations = {"Specialization", "Medicine", "Surgery", "Gastroliver"};

        specialization = new JComboBox(specializations); 
        specialization.setBounds(20, 256, 183, 30);
        specialization.addActionListener(this);

        doctors = new JComboBox();
        doctors.setBounds(208, 256, 182, 30);


        String[] hashCardiologist = {"Choose a Medicine", "Dr. Jahid Hossain", "Dr. Riad Hossain", "Prof. Rizbi"};
        hash.put(specializations[1], hashCardiologist);

        String[] hashNeurologist = {"Choose a Surgery", "Prof. A.B.M. Jamal", "Dr. Syed Ahsan", "Dr. Monowarul Islam"};
        hash.put(specializations[2], hashNeurologist);

        String[] hashPathologist = {"Choose a Gastroliver", "Dr. Wadud Ali", "Prof. Mokhlesur Rahman", "Prof. Motahar Hossain"};
        hash.put(specializations[3], hashPathologist);

        //String[] hashDermatologist = {"Choose a Dermatologist", "Ten", "Elevel", "Twelve"};
        //hash.put(specializations[4], hashDermatologist);

        //String[] hashMedicine = {"Choose a Medicine", "Thirteen", "Fourteen", "Fifteen"};
        //hash.put(specializations[5], hashMedicine);

        specialization.setSelectedIndex(0);



        // doctors
        // doctors.setBounds(208, 256, 182, 30);
        // doctors.setBorder(null);
        // doctors.setBackground(new Color(0xF5F5F5));
        // doctors.setForeground(new Color(0x1D1A31));
        // doctors.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        // doctors.setText("Doctors");
        // doctors.addFocusListener(new FocusListener() {
        //     @Override
        //     public void focusGained(FocusEvent e) {
        //         if(doctors.getText().equals("Doctors")) {
        //             doctors.setText("");
        //         }
        //     }
        //     @Override
        //     public void focusLost(FocusEvent e) {
        //         if (doctors.getText().isEmpty()) {
        //             doctors.setText("Doctors");
        //         }
        //     }
        // });

        // date
        date.setBounds(20, 291, 182, 30);
        date.setBorder(null);
        date.setBackground(new Color(0xF5F5F5));
        date.setForeground(Color.GRAY);
        date.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        date.setText("Date (DD/MM/YYYY)");
        date.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(date.getText().equals("Date (DD/MM/YYYY)")) {
                    date.setForeground(Color.BLACK);
                    date.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (date.getText().isEmpty()) {
                    date.setForeground(Color.GRAY);
                    date.setText("Date (DD/MM/YYYY)");
                }
            }
        });
        // time
        time.setBounds(208, 291, 182, 30);
        time.setBorder(null);
        time.setBackground(new Color(0xF5F5F5));
        time.setForeground(Color.GRAY);
        time.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        time.setText("Time (HH:MM)");
        time.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(time.getText().equals("Time (HH:MM)")) {
                    time.setForeground(Color.BLACK);
                    time.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (time.getText().isEmpty()) {
                    time.setForeground(Color.GRAY);
                    time.setText("Time (HH:MM)");
                }
            }
        });
        // radio buttons
        // platform
        platform.setText("Platform: ");
        platform.setBounds(20, 326, 120, 30);
        platform.setFont(new Font("Jetbrains Mono", Font.BOLD, 18));
        platform.setForeground(new Color(0xF5F5F5));

        // zoom
        zoom.setText("Zoom");
        zoom.setBounds(135, 327, 80, 30);
        zoom.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        zoom.setForeground(new Color(0xF5F5F5));
        zoom.setBackground(null);
        zoom.setFocusable(false);
        zoom.setEnabled(true);
        zoom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // meet
        meet.setText("Meet");
        meet.setBounds(225, 327, 80, 30);
        meet.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        meet.setForeground(new Color(0xF5F5F5));
        meet.setBackground(null);
        meet.setFocusable(false);
        meet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // teams
        teams.setText("Teams");
        teams.setBounds(315, 327, 80, 30);
        teams.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        teams.setForeground(new Color(0xF5F5F5));
        teams.setBackground(null);
        teams.setFocusable(false);
        teams.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // platformUsername
        platformUsername.setBounds(20, 362, 370, 30);
        platformUsername.setBorder(null);
        platformUsername.setBackground(new Color(0xF5F5F5));
        platformUsername.setForeground(Color.GRAY);
        platformUsername.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        platformUsername.setText("Platform Username");
        platformUsername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(platformUsername.getText().equals("Platform Username")) {
                    platformUsername.setForeground(Color.BLACK);
                    platformUsername.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (platformUsername.getText().isEmpty()) {
                    platformUsername.setForeground(Color.GRAY);
                    platformUsername.setText("Platform Username");
                }
            }
        });

        // makeAnAppointment
        makeAnAppointment.setText("Make an Appointment");
        makeAnAppointment.setBounds(20, 400, 370, 45);
        makeAnAppointment.setBackground(new Color(0x3EB8D2));
        makeAnAppointment.setForeground(new Color(0xF5F5F5));
        makeAnAppointment.setFont(new Font("Jetbrains Mono", Font.BOLD, 20));
        makeAnAppointment.setFocusable(false);
        makeAnAppointment.setBorder(null);
        makeAnAppointment.addActionListener(this);
        makeAnAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // receipt
        receipt.setBounds(475, 150, 380, 240);
         receipt.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        receipt.setEditable(false);
        receipt.setVisible(false);
        


        // generateReceipt
        generateReceipt.setText("Proceed To Payment");
        generateReceipt.setBounds(475, 400, 380, 45);
        generateReceipt.setBackground(new Color(0x3EB8D2));
        generateReceipt.setForeground(new Color(0xF5F5F5));
        generateReceipt.setFont(new Font("Jetbrains Mono", Font.BOLD, 20));
        generateReceipt.setFocusable(false);
        generateReceipt.setBorder(null);
        generateReceipt.setVisible(false);
        generateReceipt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        generateReceipt.addActionListener(this);

        // footer
        // back
        back.setText("Back");
        back.setBounds(20, 520, 60, 30);
        back.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        back.setForeground(new Color(0xF5F5F5));
        back.setBackground(null);
        back.setBorder(null);
        back.setFocusable(false);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
        back.addActionListener(this);

        // switchToOffline
        switchToOffline.setText("Switch to Offline");
        switchToOffline.setBounds(50, 520, 250, 30);
        switchToOffline.setFont(new Font("Jetbrains Mono", Font.PLAIN, 12));
        switchToOffline.setForeground(new Color(0xF5F5F5));
        switchToOffline.setBackground(null);
        switchToOffline.setBorder(null);
        switchToOffline.setFocusable(false);
        switchToOffline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        switchToOffline.setContentAreaFilled(false);
        switchToOffline.addActionListener(this);
        // logout
        logout.setText("Logout");
        logout.setBounds(705, 520, 80, 30);
        logout.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        logout.setForeground(new Color(0xF5F5F5));
        logout.setBackground(null);
        logout.setBorder(null);
        logout.setFocusable(false);
        logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logout.setContentAreaFilled(false);
        logout.addActionListener(this);

        // exit
        exit.setText("Exit");
        exit.setBounds(790, 520, 80, 30);
        exit.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        exit.setForeground(new Color(0xF5F5F5));
        exit.setBackground(null);
        exit.setBorder(null);
        exit.setFocusable(false);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.setContentAreaFilled(false);
        exit.addActionListener(this);


        // click here button
        here = new JButton();
        here.setText("Click Here");
        here.setBounds(475, 458, 150, 30);
        here.setFont(new Font("Jetbrains Mono", Font.PLAIN, 18));
        here.setForeground(new Color(0x3EB8D2));
        here.setBackground(null);
        here.setBorder(null);
        here.setFocusable(false);
        here.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        here.setContentAreaFilled(false);
        here.addActionListener(this);


        // frame
        homeFrame.setTitle("Medilab - Online Appointment Form");
        homeFrame.setSize(900, 600);
        homeFrame.getContentPane().setBackground(new Color(0x1D1A31));
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setResizable(false);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setLayout(null);
        homeFrame.setVisible(true);

        appTitle.requestFocusInWindow();

        homeFrame.add(appTitle);
        
        homeFrame.add(separator);
        homeFrame.add(frameTitle);
        homeFrame.add(patientName);
        homeFrame.add(phoneOrEmail);
        homeFrame.add(division);
        homeFrame.add(zilla);
        homeFrame.add(thana);
        homeFrame.add(specialization);
        homeFrame.add(doctors);
        homeFrame.add(date);
        homeFrame.add(time);
        homeFrame.add(platform);
        homeFrame.add(zoom);
        homeFrame.add(meet);
        homeFrame.add(teams);
        homeFrame.add(platformUsername);
        homeFrame.add(makeAnAppointment);
        homeFrame.add(receipt);
        homeFrame.add(generateReceipt);
        homeFrame.add(back);
        homeFrame.add(logout);
        homeFrame.add(exit);
        homeFrame.add(doctorList);
        homeFrame.add(here);
        

        appTitle.requestFocusInWindow();
    }

    public void actionPerformed(ActionEvent e) {





        try{

        if (e.getSource() == back) {
            homeFrame.setVisible(false);
            new Dashboard();
        }

        //make an appointment button
        else if (e.getSource() == makeAnAppointment) {
            

        String textField1 = patientName.getText(); // user name
        String textField2 = phoneOrEmail.getText(); // Email
        String textField3 = division.getText(); // division
        String textField4 = zilla.getText(); // zilla
        String textField5 = thana.getText(); // thana
        String textField6 = String.valueOf(specialization.getSelectedItem()); // specialization selected item
        String textField7 = String.valueOf(doctors.getSelectedItem()); // doctors
        String textField8 = date.getText(); // date
        String textField9 = time.getText(); // time
        String textField10 = platformUsername.getText(); // platform username

            if (textField10.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                       JOptionPane.WARNING_MESSAGE);
            }

            else {
                    
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || ((specialization.getSelectedIndex()) == 0) || ((doctors.getSelectedIndex()) == 0) || textField8.isEmpty()
                             || textField9.isEmpty() || textField10.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
    }
        

        else if (e.getSource() == exit) {
            System.exit(0);
        }

        //
        else if(e.getSource()==specialization){

                String str = (String)specialization.getSelectedItem();
                Object o = hash.get(str);
         
                if (o == null){
                doctors.setModel(new DefaultComboBoxModel());
                }
                else{
                doctors.setModel(new DefaultComboBoxModel((String[])o));
                }
        }



        // logout button
        else if (e.getSource() == here) {
            homeFrame.setVisible(false);
            new TestTableSortFilter();
        }



        


        // logout button
        else if (e.getSource() == logout) {
            homeFrame.setVisible(false);
            new Home();
        }


        //all the fields have to be filled up
        

         //make an apointment button
         if (e.getSource() == makeAnAppointment) {

            
            String cost;
            if(doctors.getSelectedItem().equals("Dr. Jahid Hossain")){

                cost = "500";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }


            
            else if(doctors.getSelectedItem().equals("Dr. Riad Hossain")){

                cost = "500";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Prof. Rizbi")){

                cost = "1000";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }


            else if(doctors.getSelectedItem().equals("Prof. A.B.M. Jamal")){

                cost = "1000";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Dr. Syed Ahsan")){

                cost = "500";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Dr. Monowarul Islam")){

                cost = "500";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Dr. Wadud Ali")){

                cost = "500";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Prof. Mokhlesur Rahman")){

                cost = "1000";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

            else if(doctors.getSelectedItem().equals("Prof. Motahar Hossain")){

                cost = "1000";
                receipt.setVisible(true);
                generateReceipt.setVisible(true);
                receipt.setText("   Medilab Online Appointment Receipt   "                  + "\r\n"+ "\r\n" +

                                " Your Name :   "   +  patientName.getText()                + "\r\n"+ "\r\n" +
                                " Doctor    :   "   +  doctors.getSelectedItem().toString() + "\r\n"+ "\r\n" + "\r\n" +
                                "****************************************"                  + "\r\n"+ 
                                " Fees(BDT) :   "   +  cost                                 + "\r\n"+ "\r\n" +

                                "       Please proceed to payment"
                            );

            }

        }

            else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Prof. Motahar Hossain")){

                        String fee = "1000";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);
                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Dr. Jahid Hossain")){

                        String fee = "500";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText("          "+ "\r\n"+
                                           " Fee   :  " + fee + "\r\n"+ 
                                           " Status:   Paid");

                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Dr. Riad Hossain")){

                        String fee = "500";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Prof. Rizbi")){

                        String fee = "1000";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Prof. A.B.M. Jamal")){

                        String fee = "1000";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Dr. Syed Ahsan")){

                        String fee = "500";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Dr. Monowarul Islam")){

                        String fee = "500";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }

        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Dr. Wadud Ali")){

                        String fee = "500";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }


        else if(e.getSource()== generateReceipt && doctors.getSelectedItem().equals("Prof. Mokhlesur Rahman")){

                        String fee = "1000";

                        homeFrame.setVisible(false);
                        Payment frame = new Payment();
                        frame.slip.setText(" Fee   :   " + fee + "\r\n"+ 
                                           " Status:   Paid");
                        frame.slip.setVisible(false);

                        
        }


    } catch(Exception ex){
            System.out.print(ex);
        }
        

        //
}

    public static void main(String[] args) {
        new AppointmentForm();
    }
}
