import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Cursor;


public class Etudiant {

	 JFrame frame;
	 private Panel home;
	 private JTextField textmat;
	 private JTable table;
	 private  Connection connection = null;
	private  Statement stmt = null;
	private  ResultSet rs = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Etudiant window = new Etudiant();
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
	public Etudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","BDDAdmin","TPAdmin");
			stmt = connection.createStatement();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 1107, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 23, 198, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Andalus", Font.PLAIN, 18));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\student.png"));
		lblNewLabel.setBounds(79, 22, 40, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\logout.png"));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_1.setBounds(165, 10, 22, 30);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Wingdings 3", Font.PLAIN, 25));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface f= new Interface();
				f.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(204, 255, 153));
		btnNewButton.setFont(new Font("Andalus", Font.PLAIN, 18));
		btnNewButton.setBounds(155, 10, 33, 23);
		panel.add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(-11, -31, 1134, 667);
		frame.getContentPane().add(tabbedPane);
		
		home = new Panel();
		home.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("home", null, home, null);
		home.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\uF026");
		lblNewLabel_4.setForeground(new Color(204, 204, 204));
		lblNewLabel_4.setFont(new Font("Wingdings", Font.PLAIN, 99));
		lblNewLabel_4.setBounds(573, 307, 121, 110);
		home.add(lblNewLabel_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(197, 37, 799, 9);
		home.add(separator_2);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(197, 47, 700, 14);
		home.add(separator_1_2);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(197, 56, 600, 14);
		home.add(separator_1_1_2);
		
		JSeparator separator_1_1_1_2 = new JSeparator();
		separator_1_1_1_2.setBounds(197, 66, 500, 14);
		home.add(separator_1_1_1_2);
		
		JSeparator separator_1_1_1_1_2 = new JSeparator();
		separator_1_1_1_1_2.setBounds(197, 76, 400, 14);
		home.add(separator_1_1_1_1_2);
		
		JSeparator separator_1_1_1_1_1_2 = new JSeparator();
		separator_1_1_1_1_1_2.setBounds(197, 86, 300, 14);
		home.add(separator_1_1_1_1_1_2);
		
		JSeparator separator_1_1_1_1_1_1_2 = new JSeparator();
		separator_1_1_1_1_1_1_2.setBounds(197, 96, 200, 14);
		home.add(separator_1_1_1_1_1_1_2);
		
		JSeparator separator_1_1_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1_1_1.setBounds(197, 106, 100, 14);
		home.add(separator_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chers \u00E9tudiants, Bienvenue!");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblNewLabel_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_2.setBounds(363, 219, 587, 78);
		home.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uF03F");
		lblNewLabel_4_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_4_1.setFont(new Font("Wingdings", Font.PLAIN, 99));
		lblNewLabel_4_1.setBounds(678, 269, 90, 110);
		home.add(lblNewLabel_4_1);
		
		Panel etudiant = new Panel();
		etudiant.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("etudiant", null, etudiant, null);
		etudiant.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Saisissez votre matricule :");
		lblNewLabel_6.setForeground(new Color(204, 204, 204));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(446, 211, 226, 26);
		etudiant.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(200, 36, 799, 9);
		etudiant.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(200, 46, 700, 14);
		etudiant.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(200, 55, 600, 14);
		etudiant.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(200, 65, 500, 14);
		etudiant.add(separator_1_1_1);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(200, 75, 400, 14);
		etudiant.add(separator_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(200, 85, 300, 14);
		etudiant.add(separator_1_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1.setBounds(200, 95, 200, 14);
		etudiant.add(separator_1_1_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1_1.setBounds(200, 105, 100, 14);
		etudiant.add(separator_1_1_1_1_1_1_1);
		
		textmat = new JTextField();
		textmat.setHorizontalAlignment(SwingConstants.CENTER);
		textmat.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textmat.setForeground(new Color(204, 204, 204));
		textmat.setBounds(689, 212, 150, 25);
		etudiant.add(textmat);
		textmat.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 266, 500, 147);
		etudiant.add(scrollPane);
		
		table = new JTable();
		table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		table.setForeground(new Color(204, 204, 204));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Afficher");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textmat.getText().equals(""))
				{
				try {
					rs = stmt.executeQuery("select * from BDDAdmin.etudiant where matricule_etu="+textmat.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			   table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		btnNewButton_2.setBackground(new Color(51, 51, 51));
		btnNewButton_2.setForeground(new Color(204, 204, 204));
		btnNewButton_2.setBounds(593, 423, 99, 31);
		etudiant.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("HOME Page");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(102, 0, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setForeground(new Color(204, 204, 204));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1.setBounds(0, 138, 198, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Consultation");
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(102, 0, 102));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_1_1.setForeground(new Color(204, 204, 204));
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(0, 197, 198, 30);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Etudiant(e)");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 56, 198, 39);
		panel.add(lblNewLabel_3);
		
		
	}
}
