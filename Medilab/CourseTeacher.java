

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class CourseTeacher  implements ActionListener{

    JFrame homeFrame;


    JTextArea sir;
    JLabel pass;

    JLabel appTitle;
    JLabel imgLabel;
    JLabel imgLabelOnCon;
    JLabel imgLabelCovTest;

    JButton home;
    JButton services;
    JButton contact;
    JButton emergency;
    JButton back;
    JButton logIn;
    JButton onConBtn;
    JButton covTestBtn;


    JTextField username;
    JPasswordField password;


    ImageIcon sirImg;
    ImageIcon onCon;
    ImageIcon covTest;

    JSeparator separator;



                                public CourseTeacher(){
        


                                homeFrame = new JFrame();


                                //___________________________


                                // Application Title
                                appTitle = new JLabel();
                                appTitle.setText("Course Teacher");
                                appTitle.setBounds(20, 10, 400, 54);
                                appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                appTitle.setForeground(new Color(0xF5F5F5));



                                // sir Title
                                sir = new JTextArea();
                                sir.setText("MD.MAZID-UL-HAQUE" + "\r\n"+ "\r\n"+
                                            "mazid@aiub.edu   " + "\r\n"+ "\r\n"+
                                            "CS Faculty       ");
                                sir.setBounds(424, 233, 290, 220);
                                sir.setFont(new Font("JetBrains Mono", Font.BOLD, 26));
                                sir.setForeground(new Color(0xFFFFFF));
                                sir.setBackground(new Color(0x1D1A31));


                                //covid test logo
                                sirImg = new ImageIcon(getClass().getResource("/images/MazidSirImage.png"));
                                imgLabel = new JLabel(sirImg);
                                imgLabel.setBounds(156, 182, sirImg.getIconWidth(), sirImg.getIconHeight());


                                // back button
                                back = new JButton();
                                back.setText("Back");
                                back.setBounds(780, 520, 100, 40);
                                back.setBackground(new Color(0x1D1A31));
                                back.setForeground(new Color(0xFFFBFC));
                                back.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                back.setBorder(null);
                                back.setFocusable(false);
                                back.addActionListener(this);



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
        homeFrame.add(sir);
        homeFrame.add(imgLabel);
        homeFrame.add(back);

    }



                    public void actionPerformed(ActionEvent e){


                        // back button
                         if (e.getSource() == back) {
                            homeFrame.setVisible(false);
                            new Home();
                        }

                    }

                    public static void main(String[] args) {
                        new CourseTeacher();
                    }

                }




