package cscorner;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DemoFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textUname;
    private JTextField textPword;
    private JLabel lblInfo;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DemoFrame frame = new DemoFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public DemoFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter Username");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel.setBounds(31, 24, 120, 20);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter Password");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBounds(31, 97, 120, 20);
        contentPane.add(lblNewLabel_1);

        textUname = new JTextField();
        textUname.setBounds(199, 25, 198, 20);
        contentPane.add(textUname);
        textUname.setColumns(10);

        textPword = new JTextField();
        textPword.setBounds(199, 98, 198, 20);
        contentPane.add(textPword);
        textPword.setColumns(10);

        JButton btnlogin = new JButton("Login");
        btnlogin.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String n = textUname.getText().trim(); // Get username and remove leading/trailing spaces
                    String pWord = textPword.getText().trim(); // Get password and remove leading/trailing spaces

                    // Compare username and password using equals()
                    if (pWord.equals("1470") && n.equals("alamin")) {
                        lblInfo.setText("Welcome-alamin");
                    } else {
                        lblInfo.setText("Error-Try Next");
                    }
                } catch (Exception ex) {
                    lblInfo.setText("An error occurred.");
                    ex.printStackTrace();
                }
            }
        });
        btnlogin.setBounds(166, 171, 89, 23);
        contentPane.add(btnlogin);

        lblInfo = new JLabel("");
        lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblInfo.setBounds(166, 220, 89, 30);
        contentPane.add(lblInfo);
    }
}
