import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ProjectMembers implements ActionListener{

    JFrame homeFrame;

    JLabel appTitle;
    JLabel background;

    JLabel home;
    JLabel services;
    JLabel contact;
    JLabel emergency;

    JSeparator separator;

    JTextArea slogan;

    JButton login;
    JButton register;
    //JButton exit;

    JLabel bottomBG;

    JButton adminButton;
    JButton courseTeacher;
    JButton contributors;
    JButton exit;
    JButton back;

                                    public ProjectMembers(){
                                        homeFrame = new JFrame();


                                        

                                        ImageIcon img = new ImageIcon(getClass().getResource("/images/Register.jpg"));
                                        background = new JLabel("",img,JLabel.CENTER);
                                        background.setBounds(100, 50, img.getIconWidth(), img.getIconHeight());
                                        homeFrame.add(background);

                                        // exit button
                                        exit = new JButton();
                                        exit.setText("Exit");
                                        exit.setBounds(700, 550, 80, 30);
                                        exit.setBackground(new Color(0x1D1A31));
                                        exit.setForeground(new Color(0xFFFBFC));
                                        exit.setFont(new Font("Consolas", Font.PLAIN, 18));
                                        exit.setBorder(null);
                                        exit.setFocusable(false);
                                        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                        exit.setContentAreaFilled(false);
                                        exit.addActionListener(this);
                                        homeFrame.add(exit);


                                        // back button
                                        back = new JButton();
                                        back.setText("Back");
                                        back.setBounds(600, 550, 80, 30);
                                        back.setBackground(new Color(0x1D1A31));
                                        back.setForeground(new Color(0xFFFBFC));
                                        back.setFont(new Font("Consolas", Font.PLAIN, 18));
                                        back.setBorder(null);
                                        back.setFocusable(false);
                                        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                        back.setContentAreaFilled(false);
                                        back.addActionListener(this);
                                        homeFrame.add(back);


					// frame
                                        homeFrame.setTitle("Project Members");
                                        homeFrame.setSize(915, 630);
                                        homeFrame.getContentPane().setBackground(new Color(0x1D1A31));
                                        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        homeFrame.setResizable(false);
                                        homeFrame.setLocationRelativeTo(null);
                                        homeFrame.setLayout(null);
                                        homeFrame.setVisible(true);





                                    }

                                    public void actionPerformed(ActionEvent e){
                                        if(e.getSource()== exit){
                                            System.exit(0);
                                        }
                                        else if(e.getSource()== back){
                                            homeFrame.setVisible(false);
                                            new Home();
                                        }
                                    }



                                    public static void main(String[] args) {
                                        new ProjectMembers();
                                    }
                                }
