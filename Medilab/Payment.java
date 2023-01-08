import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Payment implements ActionListener {

    JFrame homeFrame;


    JLabel uname;
    JLabel pass;
    JLabel weAccept;
    JLabel CVV;

    JLabel appTitle;
    JLabel imgLabel;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton exit;
    JButton logIn;
    JButton cPayment;
    JButton gReciept;
    JButton cancel;


    // 
    ImageIcon visaImage;
    ImageIcon mastercardImage;
    ImageIcon amexImage;

    JLabel visa;
    JLabel mastercard;
    JLabel amex;


    JTextField username;
    JTextField nameCard;
    JTextField cardNo;
    JTextField validTill;
    JPasswordField cvv;

    JTextArea slip;


    ImageIcon logo;

    JSeparator separator;


                                public Payment(){
        


                                homeFrame = new JFrame();


                                //___________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Medilab");
                                appTitle.setBounds(20, 10, 212, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));



                                // Adding payment option icons
                                visaImage = new ImageIcon(getClass().getResource("/images/visa.png"));
                                visa = new JLabel(visaImage);
                                visa.setBounds(150, 168, 40, 50);

                                mastercardImage = new ImageIcon(getClass().getResource("/images/mastercard.png"));
                                mastercard = new JLabel(mastercardImage);
                                mastercard.setBounds(200, 168, 40, 50);

                                amexImage = new ImageIcon(getClass().getResource("/images/amex.png"));
                                amex = new JLabel(amexImage);
                                amex.setBounds(250, 168, 40, 50);


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
                                exit.setBounds(780, 500, 100, 45);
                                exit.setBackground(new Color(0x1D1A31));
                                exit.setForeground(new Color(0xFFFBFC));
                                exit.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                exit.setBorder(null);
                                exit.setFocusable(false);
                                exit.addActionListener(this);


                                 // cancel button
                                cancel = new JButton();
                                cancel.setText("Cancel");
                                cancel.setBounds(20, 500, 100, 45);
                                cancel.setBackground(new Color(0x1D1A31));
                                cancel.setForeground(new Color(0xFFFBFC));
                                cancel.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                cancel.setBorder(null);
                                cancel.setFocusable(false);
                                cancel.addActionListener(this);


                                // we accept label
                                weAccept = new JLabel();
                                weAccept.setText("We Accept:");
                                weAccept.setBounds(43, 179, 120, 26);
                                weAccept.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
                                weAccept.setForeground(new Color(0xF5F5F5));


                                // name on card field
                                nameCard = new JTextField();
                                nameCard.setBounds(42,220,418,30);
                                nameCard.setBorder(null); // field border
                                nameCard.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                nameCard.setBackground(Color.decode("#F5F5F5")); // text field bg color

                                 // Setting Placeholder for nameCard field
                                nameCard.setForeground(Color.GRAY);
                                nameCard.setText("Name On Card");
                                nameCard.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (nameCard.getText().equals("Name On Card")) {
                                                        nameCard.setText("");
                                                        nameCard.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (nameCard.getText().isEmpty()) {
                                                        nameCard.setForeground(Color.GRAY);
                                                        nameCard.setText("Name On Card");
                                                    }
                                                }
                                                });



                                // Card number field
                                cardNo = new JTextField();
                                cardNo.setBounds(42,288,418,30);
                                cardNo.setBorder(null); // field border
                                cardNo.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                cardNo.setBackground(Color.decode("#F5F5F5")); // text field bg color

                                 // Setting Placeholder for cardNo field
                                cardNo.setForeground(Color.GRAY);
                                cardNo.setText("Card Number");
                                cardNo.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (cardNo.getText().equals("Card Number")) {
                                                        cardNo.setText("");
                                                        cardNo.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (cardNo.getText().isEmpty()) {
                                                        cardNo.setForeground(Color.GRAY);
                                                        cardNo.setText("Card Number");
                                                    }
                                                }
                                                });



                                // valid till field
                                validTill = new JTextField();
                                validTill.setBounds(42,356,203,30);
                                validTill.setBorder(null); // field border
                                validTill.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                validTill.setBackground(Color.decode("#F5F5F5")); // text field bg color

                                 // Setting Placeholder for validTill field
                                validTill.setForeground(Color.GRAY);
                                validTill.setText("Valid Till");
                                validTill.addFocusListener(new FocusListener() {

                                                @Override
                                                public void focusGained(FocusEvent e) {
                                                    if (validTill.getText().equals("Valid Till")) {
                                                        validTill.setText("");
                                                        validTill.setForeground(Color.BLACK);
                                                    }
                                                }
                                                @Override
                                                public void focusLost(FocusEvent e) {
                                                    if (validTill.getText().isEmpty()) {
                                                        validTill.setForeground(Color.GRAY);
                                                        validTill.setText("Valid Till");
                                                    }
                                                }
                                                });



                                // cvv field
                                cvv = new JPasswordField();
                                cvv.setBounds(256,356,203,30);
                                cvv.setBorder(null); // field border
                                cvv.setFont(new Font("JetBrains Mono", Font.PLAIN, 16)); // text field  font
                                cvv.setBackground(Color.decode("#F5F5F5")); // text field bg color
                                cvv.addKeyListener(new KeyAdapter(){
                                    public void keyTyped(KeyEvent e) {
                                        if(cvv.getText().length() >= 3) {
                                            e.consume();
                                        }
                                    }
                                });



                                // CVV label
                                CVV = new JLabel();
                                CVV.setText("CVV:");
                                CVV.setBounds(256, 332, 48, 25);
                                CVV.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
                                CVV.setForeground(new Color(0xF5F5F5));


                                // Confirm Payment button
                                cPayment = new JButton();
                                cPayment.setText("Confirm Payment");
                                cPayment.setBounds(42, 424, 418, 30);
                                cPayment.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                cPayment.setForeground(new Color(0xF5F5F5));
                                cPayment.setBackground(Color.decode("#3EB8D2"));
                                cPayment.setBorder(null);
                                cPayment.setFocusable(false);
                                cPayment.addActionListener(this);


                                // payment slip text area
                                slip = new JTextArea();
                                slip.setBounds(477, 220, 385, 190);
                                slip.setFont(new Font("JetBrains Mono", Font.BOLD, 18));
                                slip.setBackground(new Color(0xF5F5F5));
                                slip.setEditable(false);
                                slip.setVisible(false);



                                 // confirm appointment button
                                gReciept = new JButton();
                                gReciept.setText("Confirm Appointment");
                                gReciept.setBounds(477, 424, 385, 30);
                                gReciept.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                gReciept.setForeground(new Color(0xF5F5F5));
                                gReciept.setBackground(Color.decode("#3EB8D2"));
                                gReciept.setBorder(null);
                                gReciept.setFocusable(false);
                                gReciept.addActionListener(this);



                                



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
        homeFrame.add(weAccept);
        homeFrame.add(nameCard);
        homeFrame.add(exit);
        homeFrame.add(cardNo);
        homeFrame.add(validTill);
        homeFrame.add(cvv);
        homeFrame.add(CVV);
        homeFrame.add(cPayment);
        homeFrame.add(slip);
        homeFrame.add(gReciept);
        homeFrame.add(cancel);
        homeFrame.add(visa);
        homeFrame.add(mastercard);
        homeFrame.add(amex);




        appTitle.requestFocusInWindow();

}


                                public void actionPerformed(ActionEvent e){

                                    String textField1 = nameCard.getText(); //name on card
                                    String textField2 = cardNo.getText(); // caard number
                                    String textField3 = validTill.getText(); // valid till
                                    String textField4 = cvv.getText(); // cvv code

                                    

                                    //confirm appointment button
                                    if(e.getSource()== gReciept){
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
                                                    slip.setVisible(true);
                                                    homeFrame.setVisible(false);
                                                    new PaySuccess();
                                                }
                                        }

                                    }




                                    //exit button
                                    else if(e.getSource()==  exit){
                                        System.exit(0);

                                    }


                                    //cancel appointment button
                                    else if(e.getSource()==  cancel){
                                        homeFrame.setVisible(false);
                                        new Dashboard();
                                    }



                                    // confirm payment button
                                    else if(e.getSource()== cPayment){

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
                                                    slip.setVisible(true);
                                                }
                                        }
                                    }
                                }




public static void main(String[] args) {
    new Payment();
}
}