import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;


public class UserData implements ActionListener {

    JFrame homeFrame;

    JButton add;
    JButton remove;
    JButton back;
    JButton exit;
    JLabel appTitle;

    JTextArea adminPanel;
    JTextArea uInfo;

    JSeparator separator;

    String[] column = { "User Name", "E-mail", "Phone", "Age", "Password", "Time and Date" };
    String[] rows = new String[7];


     String file = ".\\Data\\user_data.txt";
	 String temp = ".\\Data\\temp.txt";




    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;



    								public UserData(){


    									homeFrame = new JFrame();



    									// separator 
                                        separator = new JSeparator();
                                        separator.setForeground(new Color(0x3EB8D2));
                                        separator.setBounds(0, 65, 900, 3);

                                        // Application Title
                                        appTitle = new JLabel();
                                        appTitle.setText("Medilab");
                                        appTitle.setBounds(20, 10, 212, 54);
                                        appTitle.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                        appTitle.setForeground(new Color(0xF5F5F5));



                                        // admin panel Title
                                        adminPanel = new JTextArea();
                                        adminPanel.setText("Admin Panel");
                                        adminPanel.setBounds(620, 20, 250, 40);
                                        adminPanel.setFont(new Font("JetBrains Mono", Font.BOLD, 32));
                                        adminPanel.setForeground(new Color(0xEE964B));
                                        adminPanel.setBackground(new Color(0x1D1A31));
                                        adminPanel.setEditable(false);


                                        // UPDATE info Title
                                        uInfo = new JTextArea();
                                        uInfo.setText("User Data");
                                        uInfo.setBounds(375, 90, 293, 40);
                                        uInfo.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
                                        uInfo.setForeground(new Color(0xF5F5F5));
                                        uInfo.setBackground(new Color(0x1D1A31));
                                        uInfo.setEditable(false);



                                        // add button
                                        add = new JButton();
                                        add.setText("Add User");
                                        add.setBounds(250, 470, 181, 42);
                                        add.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                        add.setForeground(new Color(0xFFFFFF));
                                        add.setBackground(Color.decode("#3EB8D2"));
                                        add.setBorder(null);
                                        add.setFocusable(false);
                                        add.addActionListener(this);

                                        // remove button
                                        remove = new JButton();
                                        remove.setText("Remove User");
                                        remove.setBounds(500, 470, 181, 42);
                                        remove.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
                                        remove.setForeground(new Color(0xFFFFFF));
                                        remove.setBackground(Color.decode("#3EB8D2"));
                                        remove.setBorder(null);
                                        remove.setFocusable(false);
                                        remove.addActionListener(this);


                                        // Exit button
                                        exit = new JButton();
                                        exit.setText("Exit");
                                        exit.setBounds(780, 520, 100, 40);
                                        exit.setBackground(new Color(0x1D1A31));
                                        exit.setForeground(new Color(0xFFFBFC));
                                        exit.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                        exit.setBorder(null);
                                        exit.setFocusable(false);
                                        exit.addActionListener(this);


                                        // back button
                                        back = new JButton();
                                        back.setText("Back");
                                        back.setBounds(680, 520, 100, 40);
                                        back.setBackground(new Color(0x1D1A31));
                                        back.setForeground(new Color(0xFFFBFC));
                                        back.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                                        back.setBorder(null);
                                        back.setFocusable(false);
                                        back.addActionListener(this);


                                        // JTable Layout
								        table = new JTable();
								        model = new DefaultTableModel();
								        model.setColumnIdentifiers(column);

								        table.setModel(model);
								        table.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
								        table.setSelectionBackground(Color.decode("#8AC5FF"));
								        table.setBackground(Color.WHITE);
								        table.setRowHeight(30);
								        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
								        table.getColumnModel().getColumn(0).setPreferredWidth(120);
								        table.getColumnModel().getColumn(1).setPreferredWidth(300);
								        table.getColumnModel().getColumn(2).setPreferredWidth(120);
								        table.getColumnModel().getColumn(3).setPreferredWidth(220);
								        table.getColumnModel().getColumn(4).setPreferredWidth(200);
								        table.getColumnModel().getColumn(5).setPreferredWidth(220);

								        scroll = new JScrollPane(table);
								        scroll.setBounds(170, 140, 578, 300);
								        scroll.setBackground(Color.WHITE);




								       
								        // To input data in the table
								        try {

								            BufferedReader reader = new BufferedReader(new FileReader(file));
								            int totalLines = 0;
								            while (reader.readLine() != null)
								                totalLines++;
								            reader.close();

								            for (int i = 0; i < totalLines; i++) {
								                String line = Files.readAllLines(Paths.get(file)).get(i);
								                String x = line.substring(0, 4);
								                if (x.equals("User")) {
								                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
								                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(9); // email
								                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // phone
								                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(6); // age 
								                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(11); // password
								                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
								                    model.addRow(rows);
								                }
								            }

								        } catch (Exception ex) {
								            return;
								        }







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
        homeFrame.add(adminPanel);
        homeFrame.add(uInfo);
        homeFrame.add(exit);
        homeFrame.add(add);
        homeFrame.add(remove);
        homeFrame.add(exit);
        homeFrame.add(scroll);
        homeFrame.add(back);
      



    	}




    	public void actionPerformed(ActionEvent e) {

                                        //exit button
                                        if (e.getSource() == exit) {
                                            // homeFrame.setVisible(false);
                                            System.exit(0);
                                        }


                                         //add button
                                        if (e.getSource() == add) {
                                             homeFrame.setVisible(false);
                                             new AdminAdd();
                                        }


                                        //remove button
                                        else if (e.getSource() == remove) {

                                        	if (table.getSelectionModel().isSelectionEmpty()) {

								                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
								                            JOptionPane.WARNING_MESSAGE);
								                } else {
								                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

								                    File oldFile = new File(file);
								                    File newFile = new File(temp);

								                    int q = 0;

								                    try {

								                        BufferedReader reader = new BufferedReader(new FileReader(file));
								                        int totalLines = 0;
								                        while (reader.readLine() != null)
								                            totalLines++;
								                        reader.close();

								                        for (int i = 0; i < totalLines; i++) {
								                            String line = Files.readAllLines(Paths.get(file)).get(i);
								                            String x = line.substring(0, 4);
								                            if (x.equals("User")) {
								                                String userName = Files.readAllLines(Paths.get(file)).get(i);
								                                if (userName.substring(12).equals(removeUser)) {
								                                    q = i;
								                                }
								                            }
								                        }
								                    } catch (Exception ex) {
								                        return;
								                    }

								                    try {

								                        FileWriter fw = new FileWriter(temp, true);
								                        BufferedWriter bw = new BufferedWriter(fw);
								                        PrintWriter pw = new PrintWriter(bw);

								                        FileReader fr = new FileReader(file);
								                        BufferedReader br = new BufferedReader(fr);

								                        BufferedReader reader = new BufferedReader(new FileReader(file));
								                        int totalLines = 0;
								                        while (reader.readLine() != null)
								                            totalLines++;
								                        reader.close();

								                        for (int j = 0; j < totalLines; j++) {
								                            String line = Files.readAllLines(Paths.get(file)).get(j);
								                            String x = line.substring(0, 4);

								                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
								                                String userName = Files.readAllLines(Paths.get(file)).get(j);
								                                pw.println("#Removed! " + userName);
								                            } else {
								                                String userName = Files.readAllLines(Paths.get(file)).get(j);
								                                pw.println(userName);
								                            }
								                        }
								                        pw.flush();
								                        pw.close();
								                        fr.close();
								                        br.close();
								                        bw.close();
								                        fw.close();

								                    } catch (Exception ex) {
								                        System.out.print(ex);
								                    }

								                    oldFile.delete();
								                    File dump = new File(file);
								                    newFile.renameTo(dump);

								                    homeFrame.setVisible(false);
								                    new UserData();
								                }

            							}
            							// end of remove button



            							// back button
            							//exit button
                                        if (e.getSource() == back) {
                                            homeFrame.setVisible(false);
                                            new AdminPanel();
                                        }


                                            
                                }


                                public static void main(String[] args) {
                                	new UserData();
                                }


}