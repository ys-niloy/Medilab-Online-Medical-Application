import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TestTableSortFilter implements ActionListener   {

    private String[] columnNames
            = {"Name", "Specialization", "Gender", "Fees"};

    private Object[][] data = {
        {"Dr. Jahid Hossain", "Medicine", "Male", "500"},
        {"Dr. Riad Hossain", "Medicine", "Male", "500"},
        {"Prof. Rizvi", "Medicine", "Male", "1000"},
        {"Prof. A.B.M. Jamal", "Surgery", "Male", "1000"},
        {"Dr. Syed Ahsan", "Surgery", "Male", "500"},
        {"Dr. Monowarul Islam", "Surgery", "Male", "500"},
        {"Dr. Wadud Ali", "Gastroliver", "Male", "500"},
        {"Prof. Mokhlesur Rahman", "Gastroliver", "Male", "1000"},
        {"Prof. Motahar Hossain", "Gastroliver", "Male", "1000"},

    };

    private DefaultTableModel model = new DefaultTableModel(data, columnNames);
    private JTable jTable = new JTable(model);
    //jTable.setEditable(false);

    private TableRowSorter<TableModel> rowSorter
            = new TableRowSorter<>(jTable.getModel());

    private JTextField jtfFilter;
    private JButton jbtFilter; 

    JScrollPane sPane;

    JFrame frame;

    JTextArea search;
    JButton back;

    public TestTableSortFilter() {
        jTable.setRowSorter(rowSorter);

        frame = new JFrame();

        jbtFilter = new JButton("Filter");
        jbtFilter.setBounds(50, 300, 100,30);

        sPane = new JScrollPane(jTable);
        sPane.setBounds(400,50,400,300);
        //sPane.setEditable(false);



        jtfFilter = new JTextField();
        jtfFilter.setBounds(50,50,300,30);


        //search label
        search = new JTextArea();
        search.setText("Search by Specialization or Name");
        search.setBounds(50, 90, 300, 30);
        search.setFont(new Font("Jetbrains Mono", Font.PLAIN, 16));
        search.setForeground(new Color(0xF5F5F5));
        search.setBackground(null);
        search.setEditable(false);


        // back button
        back = new JButton();
        back.setText("Back");
        back.setBounds(780, 500, 100, 45);
        back.setBackground(new Color(0x1D1A31));
        back.setForeground(new Color(0xFFFBFC));
        back.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
        back.setBorder(null);
        back.setFocusable(false);
        back.addActionListener(this);

        
        
        frame.setSize(900,600);
        frame.setTitle("Medilab - Home");
       //frame.pack();
        frame.getContentPane().setBackground(new Color(0x1D1A31));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setLayout(null);
       frame.setVisible(true);

        frame.add(jtfFilter);
        frame.add(sPane);
        frame.add(search);
        frame.add(back);
        //frame.add(jbtFilter);
        
        

        jtfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }


    public void actionPerformed(ActionEvent e){


        if (e.getSource()== back){
            frame.setVisible(false);
            new AppointmentForm();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
               new TestTableSortFilter();
               
            }

        });
    }
}