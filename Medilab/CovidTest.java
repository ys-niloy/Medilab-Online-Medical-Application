import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class CovidTest implements ActionListener{


	JFrame homeFrame;

	JLabel appTitle;

	JButton dashboard;
	JButton exit;
    JButton back;
    JButton test;

    JLabel imgLabel;

    ImageIcon logo;

    JSeparator separator;

    JTextArea covTest;


     JTextField username;
      JTextField phone;
       JTextField age;
        JTextField address;


    								public CovidTest(){

    									homeFrame = new JFrame();



    									// Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));

                                // separator
                                separator= new JSeparator();
                                separator.setForeground(new Color(0x3EB8D2));
                                separator.setBounds(0, 65, 900, 3);


                                 // dashboard button
                                dashboard = new JButton();
                                dashboard.setText("Dashboard");
                                dashboard.setBounds(725, 20, 150, 30);
                                dashboard.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                dashboard.setForeground(new Color(0xF5F5F5));
                                dashboard.setBorder(null);
                                dashboard.setOpaque(false);                        //
                                dashboard.setContentAreaFilled(false);             //  transparent Button;
                                dashboard.setBorderPainted(false); 
                                dashboard.setBorder(null);
                                dashboard.setFocusable(false);
                                dashboard.addActionListener(this);


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


                                // back button
                                back = new JButton();
                                back.setText("Back");
                                back.setBounds(20, 500, 100, 42);
                                back.setBackground(new Color(0x1D1A31));
                                back.setForeground(new Color(0xFFFBFC));
                                back.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                back.setBorder(null);
                                back.setFocusable(false);
                                back.addActionListener(this);




                                // test button
                                test = new JButton();
                                test.setText("Request Test");
                                test.setBounds(54, 420, 418, 36);
                                test.setBackground(new Color(0x3EB8D2));
                                test.setForeground(new Color(0xFFFBFC));
                                test.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                test.setBorder(null);
                                test.setFocusable(false);
                                test.addActionListener(this);



                                // username field
                                username = new JTextField();
                                username.setBounds(56,206,418,36);
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



                                // phone field
                                phone = new JTextField();
                                phone.setBounds(56,277,231,36);
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


                                 // age field
                                age = new JTextField();
                                age.setBounds(338,277,136,36);
                                age.setBorder(null); // field border
                                age.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                age.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for age field
                                age.setForeground(Color.GRAY);
                                age.setText("Age");
                                age.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (age.getText().equals("Age")) {
                                                        age.setText("");
                                                        age.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (age.getText().isEmpty()) {
                                                        age.setForeground(Color.GRAY);
                                                        age.setText("Age");
                                                    }
                                                }
                                                });



                                 // address field
                                address = new JTextField();
                                address.setBounds(56,347,418,36);
                                address.setBorder(null); // field border
                                address.setFont(new Font("JetBrains Mono", Font.PLAIN, 20)); // text field  font
                                address.setBackground(Color.decode("#FFFFFF")); // text field bg color

                                 // Setting Placeholder for address field
                                address.setForeground(Color.GRAY);
                                address.setText("Address");
                                address.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (address.getText().equals("Address")) {
                                                        address.setText("");
                                                        address.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (address.getText().isEmpty()) {
                                                        address.setForeground(Color.GRAY);
                                                        address.setText("Address");
                                                    }
                                                }
                                                });





                                // Adding Logo and message
                                logo = new ImageIcon(getClass().getResource("/images/covid_test_form.png"));
                                imgLabel = new JLabel(logo);
                                imgLabel.setBounds(597, 230, logo.getIconWidth(), logo.getIconHeight());


                                // covid test
                                covTest = new JTextArea();
						        covTest.setText("Covid Test Form");
						        covTest.setBounds(306, 108, 302, 42);
						        covTest.setFont(new Font("Consolas", Font.BOLD, 32));
						        covTest.setForeground(new Color(0xEE964B));
						        covTest.setBackground(null);
							    covTest.setEditable(false);


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
        homeFrame.add(dashboard);
        homeFrame.add(back);
        homeFrame.add(exit);
        homeFrame.add(username);
        homeFrame.add(phone);
        homeFrame.add(age);
        homeFrame.add(address);
        homeFrame.add(test);
        homeFrame.add(covTest);
        homeFrame.add(separator);
        homeFrame.add(imgLabel);
        homeFrame.add(exit);

        appTitle.requestFocusInWindow();


    								}


    								public void actionPerformed(ActionEvent e) {


                                    String textField1 = username.getText(); //Name
                                    String textField2 = phone.getText(); //phone
                                    String textField3 = age.getText(); // age
                                    String textField4 = address.getText(); // address


    									//exit button
                                        if (e.getSource() == exit) {
                                            // homeFrame.setVisible(false);
                                            System.exit(0);
                                        }

                                        //back button
                                       else if (e.getSource() == back) {
                                            homeFrame.setVisible(false);
                                            new Dashboard();
                                        }


                                        //back button
                                       else if (e.getSource() == dashboard) {
                                            homeFrame.setVisible(false);
                                            new Dashboard();
                                        }



                                        //request test button
                                       else if (e.getSource() == test) {

                                        try
                                        {
                                            if(textField4.isEmpty()) {
                                                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                                       JOptionPane.WARNING_MESSAGE);
                                            }

                                        else {
                    
                                                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()) {
                                                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                                            JOptionPane.WARNING_MESSAGE);
                                                }

                                                else{
                                                   homeFrame.setVisible(false);
                                                   new CovidTestSuccess();
                                                }
                                             }

                                        }catch(Exception ex){
                                            System.out.println(ex);
                                        }



                                }




                            }


    								public static void main(String[] args) {
    									new CovidTest();
    								}

}