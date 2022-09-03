import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
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
import javax.swing.JRadioButton;
import java.awt.Cursor;

public class Enseignant {

	 JFrame frame;
	 private Panel home;
	 private JTextField textmat;
	 private JTable table;
	 private  Connection connection = null;
	private  Statement stmt = null;
	private  ResultSet rs = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_1;
	private ButtonGroup lg = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enseignant window = new Enseignant();
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
	public Enseignant() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\teacher.png"));
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
		btnNewButton.setForeground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("Andalus", Font.PLAIN, 18));
		btnNewButton.setBounds(155, 12, 33, 23);
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
		
		JLabel lblNewLabel_2 = new JLabel("Bienvenue aux enseignants !");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblNewLabel_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_2.setBounds(343, 221, 590, 78);
		home.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uF024");
		lblNewLabel_4_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_4_1.setFont(new Font("Wingdings", Font.PLAIN, 99));
		lblNewLabel_4_1.setBounds(500, 282, 134, 110);
		home.add(lblNewLabel_4_1);
		
		Panel consultation = new Panel();
		consultation.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("etudiant", null, consultation, null);
		consultation.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Saisissez votre matricule :");
		lblNewLabel_6.setForeground(new Color(204, 204, 204));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(446, 211, 226, 26);
		consultation.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(200, 36, 799, 9);
		consultation.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(200, 46, 700, 14);
		consultation.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(200, 55, 600, 14);
		consultation.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(200, 65, 500, 14);
		consultation.add(separator_1_1_1);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(200, 75, 400, 14);
		consultation.add(separator_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(200, 85, 300, 14);
		consultation.add(separator_1_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1.setBounds(200, 95, 200, 14);
		consultation.add(separator_1_1_1_1_1_1);
		
		JSeparator separator_1_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1_1.setBounds(200, 105, 100, 14);
		consultation.add(separator_1_1_1_1_1_1_1);
		
		textmat = new JTextField();
		textmat.setHorizontalAlignment(SwingConstants.CENTER);
		textmat.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textmat.setForeground(new Color(204, 204, 204));
		textmat.setBounds(689, 212, 150, 25);
		consultation.add(textmat);
		textmat.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 266, 500, 147);
		consultation.add(scrollPane);
		
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
					rs = stmt.executeQuery("select * from BDDAdmin.enseignant where matricule_ens="+textmat.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			   table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		btnNewButton_2.setBackground(new Color(51, 51, 51));
		btnNewButton_2.setForeground(new Color(204, 204, 204));
		btnNewButton_2.setBounds(596, 423, 99, 31);
		consultation.add(btnNewButton_2);
		
		Panel Insertion = new Panel();
		Insertion.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("New tab", null, Insertion, null);
		Insertion.setLayout(null);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(200, 34, 799, 9);
		Insertion.add(separator_2_1);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(200, 44, 700, 14);
		Insertion.add(separator_1_2_1);
		
		JSeparator separator_1_1_2_1 = new JSeparator();
		separator_1_1_2_1.setBounds(200, 53, 600, 14);
		Insertion.add(separator_1_1_2_1);
		
		JSeparator separator_1_1_1_2_1 = new JSeparator();
		separator_1_1_1_2_1.setBounds(200, 63, 500, 14);
		Insertion.add(separator_1_1_1_2_1);
		
		JSeparator separator_1_1_1_1_2_1 = new JSeparator();
		separator_1_1_1_1_2_1.setBounds(200, 73, 400, 14);
		Insertion.add(separator_1_1_1_1_2_1);
		
		JSeparator separator_1_1_1_1_1_2_1 = new JSeparator();
		separator_1_1_1_1_1_2_1.setBounds(200, 83, 300, 14);
		Insertion.add(separator_1_1_1_1_1_2_1);
		
		JSeparator separator_1_1_1_1_1_1_2_1 = new JSeparator();
		separator_1_1_1_1_1_1_2_1.setBounds(200, 93, 200, 14);
		Insertion.add(separator_1_1_1_1_1_1_2_1);
		
		JSeparator separator_1_1_1_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1_1_1_1.setBounds(200, 103, 100, 14);
		Insertion.add(separator_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Donnez les informations des enseignants que vous voulez ins\u00E9rer :");
		lblNewLabel_6_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_6_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6_1.setBounds(363, 153, 560, 26);
		Insertion.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_5 = new JLabel("Matricule_ens");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_5.setBounds(397, 191, 150, 28);
		Insertion.add(lblNewLabel_7_5);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(204, 204, 204));
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(397, 219, 150, 25);
		Insertion.add(textField);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Nom_ens");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_1_1.setBounds(575, 191, 107, 28);
		Insertion.add(lblNewLabel_7_1_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(204, 204, 204));
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(717, 219, 150, 25);
		Insertion.add(textField_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Pr\u00E9nom_ens");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_2_1.setBounds(717, 191, 150, 28);
		Insertion.add(lblNewLabel_7_2_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(204, 204, 204));
		textField_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(557, 219, 150, 25);
		Insertion.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ajouter");
		rdbtnNewRadioButton_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_1.setBackground(new Color(51, 51, 51));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((!textField.getText().equals(""))&&(!textField_1.getText().equals(""))&&(!textField_2.getText().equals("")))
				{
				if(rdbtnNewRadioButton_1.isSelected())
				{
				try {
					rs = stmt.executeQuery(" insert into Enseignant values('"+textField.getText()+"','"+textField_1.getText()+"','"
							+textField_2.getText()+"')");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
				}
			}
		});
		lg.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(463, 274, 103, 26);
		Insertion.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnAfficher_1 = new JRadioButton("Afficher");
		rdbtnAfficher_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnAfficher_1.setContentAreaFilled(false);
		rdbtnAfficher_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAfficher_1.isSelected())
				{
				try {
					rs = stmt.executeQuery("select * from Enseignant");
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		lg.add(rdbtnAfficher_1);
		rdbtnAfficher_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnAfficher_1.setForeground(new Color(204, 204, 204));
		rdbtnAfficher_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAfficher_1.setBounds(698, 277, 112, 21);
		Insertion.add(rdbtnAfficher_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(348, 319, 575, 213);
		Insertion.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		table_1.setForeground(new Color(204, 204, 204));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_1 = new JButton("HOME Page");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
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
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(51, 51, 51));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_1_1.setForeground(new Color(204, 204, 204));
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(0, 197, 198, 30);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Insertion");
		btnNewButton_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(new Color(51, 51, 51));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(204, 204, 204));
		btnNewButton_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(0, 257, 198, 30);
		panel.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Enseignant(e)");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 54, 198, 39);
		panel.add(lblNewLabel_3);
		
		
	}
}
