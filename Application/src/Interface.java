 
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;



import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
public class Interface {

	 JFrame frame;
	private  Connection connection = null;
	@SuppressWarnings("unused")
	private  Statement stmt = null;
	private JPasswordField txtpass;
	private JTextField txtuser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{ 
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		
		}
		catch(Exception e)
		{
		 JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(0, 0, 478, 532);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(new Color(255, 239, 213));
		separator_1_1_1.setBounds(230, 321, 130, 6);
		panel.add(separator_1_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(255, 239, 213));
		separator_1_1.setBounds(230, 261, 130, 6);
		panel.add(separator_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 239, 213));
		separator.setBounds(85, 194, 100, 10);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 239, 213));
		separator_1.setBounds(189, 441, 100, 10);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username  :");
		lblNewLabel_1_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_1_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1.setBounds(117, 236, 102, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password  :");
		lblNewLabel_1_1_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1_1.setBounds(121, 296, 96, 26);
		panel.add(lblNewLabel_1_1_1);
		
		JButton btnLogin = new JButton("SIGN UP");
		btnLogin.setMnemonic(KeyEvent.VK_STOP);
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setFocusPainted(false);
		btnLogin.setDefaultCapable(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 9, true));
		btnLogin.setBorderPainted(false);
		btnLogin.setForeground(new Color(204, 204, 204));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String user= txtuser.getText();
					
					@SuppressWarnings("deprecation")
					String password= txtpass.getText();
					if(user.contentEquals("BDDAdmin")&& password.equals("TPAdmin"))
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE",user,password);
						stmt = connection.createStatement();
						JOptionPane.showMessageDialog(null, " user & password correcte ");
						BDDAdmin pf= new BDDAdmin();
						pf.frame.setVisible(true);
						frame.setVisible(false);
						
					}
					else if(user.contentEquals("Etudiant")&& password.equals("TPEtudiant"))
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE",user,password);
						stmt = connection.createStatement();
						JOptionPane.showMessageDialog(null, " user & password correcte ");
						Etudiant pff= new Etudiant();
						pff.frame.setVisible(true);
						frame.setVisible(false);
						
					}
					else if(user.contentEquals("Enseignant")&& password.equals("TPEnseignant"))
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE",user,password);
						stmt = connection.createStatement();
						JOptionPane.showMessageDialog(null, " user & password correcte ");
						Enseignant ff= new Enseignant();
						ff.frame.setVisible(true);
						frame.setVisible(false);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Invalide User Or Password");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			
		});
		
		btnLogin.setBackground(new Color(51, 51, 51));
		btnLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(117, 351, 243, 32);
		panel.add(btnLogin);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("forgot my password");
		lblNewLabel_1_1_2.setForeground(new Color(204, 153, 153));
		lblNewLabel_1_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1_2.setBounds(184, 424, 110, 18);
		panel.add(lblNewLabel_1_1_2);
		
		txtpass = new JPasswordField();
		txtpass.setOpaque(false);
		txtpass.setBorder(null);
		txtpass.setHorizontalAlignment(SwingConstants.CENTER);
		txtpass.setForeground(new Color(204, 204, 204));
		txtpass.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtpass.setEchoChar('*');
		txtpass.setBackground(new Color(51, 51, 51));
		txtpass.setBounds(220, 295, 130, 25);
		panel.add(txtpass);
		
		txtuser = new JTextField();
		txtuser.setOpaque(false);
		txtuser.setBorder(null);
		txtuser.setHorizontalAlignment(SwingConstants.CENTER);
		txtuser.setForeground(new Color(204, 204, 204));
		txtuser.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtuser.setBackground(new Color(51, 51, 51));
		txtuser.setBounds(220, 235, 130, 25);
		panel.add(txtuser);
		txtuser.setColumns(10);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBackground(new Color(255, 239, 213));
		separator_1_2.setBounds(290, 194, 100, 10);
		panel.add(separator_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(168, 72, 150, 150);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\login.png"));
	}
}
