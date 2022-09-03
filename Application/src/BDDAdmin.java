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
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BDDAdmin {

	 JFrame frame;
	 private Panel home;
	 private JTextField textmat;
	 private JTextField textnom;
	 private JTextField textprenom;
	 private JTextField textnaiss;
	 private JTextField textadr;
	 private JTable table;
	 private  Connection connection = null;
	private  Statement stmt = null;
	private  ResultSet rs = null;
	private ButtonGroup lg = new ButtonGroup();
	private ButtonGroup lg_1 = new ButtonGroup();
	private ButtonGroup lg_2 = new ButtonGroup();
	private ButtonGroup lg_3 = new ButtonGroup();
	private ButtonGroup lg_4 = new ButtonGroup();
	private JTextField textmatens;
	private JTextField textnomens;
	private JTextField textprenomens;
	private JTable table_1;
	private JTextField textcode;
	private JTextField textlibelle;
	private JTextField textheures;
	private JTextField textuniteens;
	private JTable table_2;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BDDAdmin window = new BDDAdmin();
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
	public BDDAdmin() {
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
		panel.setForeground(new Color(51, 51, 51));
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 23, 198, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Andalus", Font.PLAIN, 18));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\admin.png"));
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
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface f= new Interface();
				f.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(204, 255, 153));
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
		
		Panel unite = new Panel();
		unite.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("unite", null, unite, null);
		unite.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(200, 35, 799, 9);
		unite.add(separator_3);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(200, 45, 700, 14);
		unite.add(separator_1_3);
		
		JSeparator separator_1_1_3 = new JSeparator();
		separator_1_1_3.setBounds(200, 54, 600, 14);
		unite.add(separator_1_1_3);
		
		JSeparator separator_1_1_1_3 = new JSeparator();
		separator_1_1_1_3.setBounds(200, 64, 500, 14);
		unite.add(separator_1_1_1_3);
		
		JSeparator separator_1_1_1_1_3 = new JSeparator();
		separator_1_1_1_1_3.setBounds(200, 74, 400, 14);
		unite.add(separator_1_1_1_1_3);
		
		JSeparator separator_1_1_1_1_1_3 = new JSeparator();
		separator_1_1_1_1_1_3.setBounds(200, 84, 300, 14);
		unite.add(separator_1_1_1_1_1_3);
		
		JSeparator separator_1_1_1_1_1_1_3 = new JSeparator();
		separator_1_1_1_1_1_1_3.setBounds(200, 94, 200, 14);
		unite.add(separator_1_1_1_1_1_1_3);
		
		JSeparator separator_1_1_1_1_1_1_1_2 = new JSeparator();
		separator_1_1_1_1_1_1_1_2.setBounds(200, 104, 100, 14);
		unite.add(separator_1_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Donnez les informations des unit\u00E9s que vous voulez ins\u00E9rer :");
		lblNewLabel_6_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_6_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6_2.setBounds(399, 181, 512, 26);
		unite.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_6 = new JLabel("Code_unit\u00E9");
		lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_6.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_6.setBounds(332, 230, 150, 28);
		unite.add(lblNewLabel_7_6);
		
		textcode = new JTextField();
		textcode.setHorizontalAlignment(SwingConstants.CENTER);
		textcode.setForeground(new Color(204, 204, 204));
		textcode.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textcode.setColumns(10);
		textcode.setBounds(332, 258, 150, 25);
		unite.add(textcode);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Libelle");
		lblNewLabel_7_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_1_2.setBounds(510, 230, 107, 28);
		unite.add(lblNewLabel_7_1_2);
		
		textlibelle = new JTextField();
		textlibelle.setHorizontalAlignment(SwingConstants.CENTER);
		textlibelle.setForeground(new Color(204, 204, 204));
		textlibelle.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textlibelle.setColumns(10);
		textlibelle.setBounds(492, 258, 150, 25);
		unite.add(textlibelle);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("Nbr_heures");
		lblNewLabel_7_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_2_2.setBounds(652, 230, 150, 28);
		unite.add(lblNewLabel_7_2_2);
		
		textheures = new JTextField();
		textheures.setHorizontalAlignment(SwingConstants.CENTER);
		textheures.setForeground(new Color(204, 204, 204));
		textheures.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textheures.setColumns(10);
		textheures.setBounds(652, 258, 150, 25);
		unite.add(textheures);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("Matricule_ens");
		lblNewLabel_7_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_3_1.setBounds(812, 230, 150, 28);
		unite.add(lblNewLabel_7_3_1);
		
		textuniteens = new JTextField();
		textuniteens.setHorizontalAlignment(SwingConstants.CENTER);
		textuniteens.setForeground(new Color(204, 204, 204));
		textuniteens.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textuniteens.setColumns(10);
		textuniteens.setBounds(812, 258, 150, 25);
		unite.add(textuniteens);
		
		JRadioButton rdbtnAfficher_2 = new JRadioButton("Afficher");
		rdbtnAfficher_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnAfficher_2.setContentAreaFilled(false);
		rdbtnAfficher_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnAfficher_2.setForeground(new Color(204, 204, 204));
		rdbtnAfficher_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAfficher_2.setBounds(714, 316, 112, 21);
		unite.add(rdbtnAfficher_2);
		rdbtnAfficher_2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAfficher_2.isSelected())
				{
				try {
					rs = stmt.executeQuery("select * from Unite");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			table_2.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		lg_2.add(rdbtnAfficher_2);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Ajouter");
		rdbtnNewRadioButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBounds(479, 313, 103, 25);
		unite.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_2.isSelected())
				{
					if((!textcode.getText().equals(""))&&(!textlibelle.getText().equals(""))&&(!textheures.getText().equals(""))&&(!textuniteens.getText().equals("")))
				{
						try {
					rs = stmt.executeQuery(" insert into unite values('"+textcode.getText()+"','"+textlibelle.getText()+"',"
							+textheures.getText()+","+textuniteens.getText()+")");
				} catch (SQLException e) { 
					e.printStackTrace();
				}
				}
				}
			}
		});
		lg_2.add(rdbtnNewRadioButton_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(364, 358, 575, 213);
		unite.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_2.setForeground(new Color(204, 204, 204));
		table_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		scrollPane_2.setViewportView(table_2);
		
		Panel enseignant = new Panel();
		enseignant.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("enseignant", null, enseignant, null);
		enseignant.setLayout(null);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(201, 34, 799, 9);
		enseignant.add(separator_4);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(201, 44, 700, 14);
		enseignant.add(separator_1_4);
		
		JSeparator separator_1_1_4 = new JSeparator();
		separator_1_1_4.setBounds(201, 53, 600, 14);
		enseignant.add(separator_1_1_4);
		
		JSeparator separator_1_1_1_4 = new JSeparator();
		separator_1_1_1_4.setBounds(201, 63, 500, 14);
		enseignant.add(separator_1_1_1_4);
		
		JSeparator separator_1_1_1_1_4 = new JSeparator();
		separator_1_1_1_1_4.setBounds(201, 73, 400, 14);
		enseignant.add(separator_1_1_1_1_4);
		
		JSeparator separator_1_1_1_1_1_4 = new JSeparator();
		separator_1_1_1_1_1_4.setBounds(201, 83, 300, 14);
		enseignant.add(separator_1_1_1_1_1_4);
		
		JSeparator separator_1_1_1_1_1_1_4 = new JSeparator();
		separator_1_1_1_1_1_1_4.setBounds(201, 93, 200, 14);
		enseignant.add(separator_1_1_1_1_1_1_4);
		
		JSeparator separator_1_1_1_1_1_1_1_3 = new JSeparator();
		separator_1_1_1_1_1_1_1_3.setBounds(201, 103, 100, 14);
		enseignant.add(separator_1_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("Donnez les informations des enseignants que vous voulez ins\u00E9rer :");
		lblNewLabel_6_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_6_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6_1.setBounds(406, 164, 497, 28);
		enseignant.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_5 = new JLabel("Matricule_ens");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_5.setBounds(416, 202, 150, 28);
		enseignant.add(lblNewLabel_7_5);
		
		textmatens = new JTextField();
		textmatens.setHorizontalAlignment(SwingConstants.CENTER);
		textmatens.setForeground(new Color(204, 204, 204));
		textmatens.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textmatens.setColumns(10);
		textmatens.setBounds(416, 230, 150, 25);
		enseignant.add(textmatens);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Nom_ens");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_1_1.setBounds(594, 202, 107, 28);
		enseignant.add(lblNewLabel_7_1_1);
		
		textnomens = new JTextField();
		textnomens.setHorizontalAlignment(SwingConstants.CENTER);
		textnomens.setForeground(new Color(204, 204, 204));
		textnomens.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textnomens.setColumns(10);
		textnomens.setBounds(576, 230, 150, 25);
		enseignant.add(textnomens);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Pr\u00E9nom_ens");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_2_1.setBounds(736, 202, 150, 28);
		enseignant.add(lblNewLabel_7_2_1);
		
		textprenomens = new JTextField();
		textprenomens.setHorizontalAlignment(SwingConstants.CENTER);
		textprenomens.setForeground(new Color(204, 204, 204));
		textprenomens.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textprenomens.setColumns(10);
		textprenomens.setBounds(736, 230, 150, 25);
		enseignant.add(textprenomens);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ajouter");
		rdbtnNewRadioButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(482, 287, 103, 25);
		enseignant.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
				if((!textmatens.getText().equals(""))&&(!textnomens.getText().equals(""))&&(!textprenomens.getText().equals(""))) {
				try {
					rs = stmt.executeQuery(" insert into Enseignant values('"+textmatens.getText()+"','"+textnomens.getText()+"','"
							+textprenomens.getText()+"')");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
				}
			}
		});
		lg_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnAfficher_1 = new JRadioButton("Afficher");
		rdbtnAfficher_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnAfficher_1.setContentAreaFilled(false);
		rdbtnAfficher_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnAfficher_1.setForeground(new Color(204, 204, 204));
		rdbtnAfficher_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAfficher_1.setBounds(717, 288, 113, 21);
		enseignant.add(rdbtnAfficher_1);
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
		lg_1.add(rdbtnAfficher_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(367, 330, 575, 213);
		enseignant.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_1.setForeground(new Color(204, 204, 204));
		table_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_1);
		
		Panel EtudiantUnite = new Panel();
		EtudiantUnite.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("EtudiantUnite", null, EtudiantUnite, null);
		EtudiantUnite.setLayout(null);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(199, 33, 799, 9);
		EtudiantUnite.add(separator_5);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setBounds(199, 43, 700, 14);
		EtudiantUnite.add(separator_1_5);
		
		JSeparator separator_1_1_5 = new JSeparator();
		separator_1_1_5.setBounds(199, 52, 600, 14);
		EtudiantUnite.add(separator_1_1_5);
		
		JSeparator separator_1_1_1_5 = new JSeparator();
		separator_1_1_1_5.setBounds(199, 62, 500, 14);
		EtudiantUnite.add(separator_1_1_1_5);
		
		JSeparator separator_1_1_1_1_5 = new JSeparator();
		separator_1_1_1_1_5.setBounds(199, 72, 400, 14);
		EtudiantUnite.add(separator_1_1_1_1_5);
		
		JSeparator separator_1_1_1_1_1_5 = new JSeparator();
		separator_1_1_1_1_1_5.setBounds(199, 82, 300, 14);
		EtudiantUnite.add(separator_1_1_1_1_1_5);
		
		JSeparator separator_1_1_1_1_1_1_5 = new JSeparator();
		separator_1_1_1_1_1_1_5.setBounds(199, 92, 200, 14);
		EtudiantUnite.add(separator_1_1_1_1_1_1_5);
		
		JSeparator separator_1_1_1_1_1_1_1_4 = new JSeparator();
		separator_1_1_1_1_1_1_1_4.setBounds(199, 102, 100, 14);
		EtudiantUnite.add(separator_1_1_1_1_1_1_1_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(364, 355, 575, 213);
		EtudiantUnite.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_3.setForeground(new Color(204, 204, 204));
		table_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("Donnez les informations que vous voulez ins\u00E9rer dans la table EtudiantUnit\u00E9:");
		lblNewLabel_6_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_6_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6_3.setBounds(336, 174, 652, 26);
		EtudiantUnite.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_7 = new JLabel("Matricule_\u00E9tu");
		lblNewLabel_7_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_7.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_7.setBounds(254, 227, 150, 28);
		EtudiantUnite.add(lblNewLabel_7_7);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setForeground(new Color(204, 204, 204));
		text1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		text1.setColumns(10);
		text1.setBounds(254, 255, 150, 25);
		EtudiantUnite.add(text1);
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setForeground(new Color(204, 204, 204));
		text2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		text2.setColumns(10);
		text2.setBounds(414, 255, 150, 25);
		EtudiantUnite.add(text2);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("Code_unit\u00E9");
		lblNewLabel_7_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_1_3.setBounds(432, 227, 107, 28);
		EtudiantUnite.add(lblNewLabel_7_1_3);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Ajouter");
		rdbtnNewRadioButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_3.setContentAreaFilled(false);
		rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_3.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNewRadioButton_3.setBounds(479, 311, 103, 26);
		EtudiantUnite.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_3.isSelected())
				{
		       if((!text1.getText().equals(""))&&(!text2.getText().equals(""))&&(!text3.getText().equals(""))
		    		   &&(!text4.getText().equals(""))&&(!text5.getText().equals(""))   )	{	
				try {
					rs = stmt.executeQuery(" insert into EtudiantUnite values("+text1.getText()+",'"+text2.getText()+"',"
							+text3.getText()+","+text4.getText()+","+text5.getText()+")");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		       }
				}
			}
		});
		lg_3.add(rdbtnNewRadioButton_3);
		
		text3 = new JTextField();
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setForeground(new Color(204, 204, 204));
		text3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		text3.setColumns(10);
		text3.setBounds(574, 255, 150, 25);
		EtudiantUnite.add(text3);
		
		JLabel lblNewLabel_7_2_3 = new JLabel("Note_CC");
		lblNewLabel_7_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_2_3.setBounds(574, 227, 150, 28);
		EtudiantUnite.add(lblNewLabel_7_2_3);
		
		JLabel lblNewLabel_7_3_2 = new JLabel("Note_TP");
		lblNewLabel_7_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_3_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_3_2.setBounds(734, 227, 150, 28);
		EtudiantUnite.add(lblNewLabel_7_3_2);
		
		text4 = new JTextField();
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setForeground(new Color(204, 204, 204));
		text4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		text4.setColumns(10);
		text4.setBounds(734, 255, 150, 25);
		EtudiantUnite.add(text4);
		
		JRadioButton rdbtnAfficher_3 = new JRadioButton("Afficher");
		rdbtnAfficher_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnAfficher_3.setContentAreaFilled(false);
		rdbtnAfficher_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnAfficher_3.setForeground(new Color(204, 204, 204));
		rdbtnAfficher_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAfficher_3.setBounds(714, 313, 113, 21);
		EtudiantUnite.add(rdbtnAfficher_3);
		rdbtnAfficher_3 .addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAfficher_3 .isSelected())
				{
				try {
					rs = stmt.executeQuery("select * from EtudiantUnite");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			table_3.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		lg_3.add(rdbtnAfficher_3 );
		
		JLabel lblNewLabel_7_4_1 = new JLabel("Note_examen");
		lblNewLabel_7_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_4_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_4_1.setBounds(894, 227, 150, 28);
		EtudiantUnite.add(lblNewLabel_7_4_1);
		
		text5 = new JTextField();
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setForeground(new Color(204, 204, 204));
		text5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		text5.setColumns(10);
		text5.setBounds(894, 255, 150, 25);
		EtudiantUnite.add(text5);
		
		Panel RequettesType1 = new Panel();
		RequettesType1.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("RequettesType1", null, RequettesType1, null);
		RequettesType1.setLayout(null);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(200, 33, 799, 9);
		RequettesType1.add(separator_6);
		
		JSeparator separator_1_6 = new JSeparator();
		separator_1_6.setBounds(200, 43, 700, 14);
		RequettesType1.add(separator_1_6);
		
		JSeparator separator_1_1_6 = new JSeparator();
		separator_1_1_6.setBounds(200, 52, 600, 14);
		RequettesType1.add(separator_1_1_6);
		
		JSeparator separator_1_1_1_6 = new JSeparator();
		separator_1_1_1_6.setBounds(200, 62, 500, 14);
		RequettesType1.add(separator_1_1_1_6);
		
		JSeparator separator_1_1_1_1_6 = new JSeparator();
		separator_1_1_1_1_6.setBounds(200, 72, 400, 14);
		RequettesType1.add(separator_1_1_1_1_6);
		
		JSeparator separator_1_1_1_1_1_6 = new JSeparator();
		separator_1_1_1_1_1_6.setBounds(200, 82, 300, 14);
		RequettesType1.add(separator_1_1_1_1_1_6);
		
		JSeparator separator_1_1_1_1_1_1_6 = new JSeparator();
		separator_1_1_1_1_1_1_6.setBounds(200, 92, 200, 14);
		RequettesType1.add(separator_1_1_1_1_1_1_6);
		
		JSeparator separator_1_1_1_1_1_1_1_5 = new JSeparator();
		separator_1_1_1_1_1_1_1_5.setBounds(200, 102, 100, 14);
		RequettesType1.add(separator_1_1_1_1_1_1_1_5);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(368, 153, 575, 213);
		RequettesType1.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		table_4.setForeground(new Color(204, 204, 204));
		scrollPane_4.setViewportView(table_4);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Afficher pour chaque \u00E9tudiant :  nom,  pr\u00E9nom , moyenne par unit\u00E9 d'enseignement et le libell\u00E9");
		rdbtnNewRadioButton_4.setContentAreaFilled(false);
		rdbtnNewRadioButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_4.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnNewRadioButton_4.setBounds(298, 400, 721, 31);
		RequettesType1.add(rdbtnNewRadioButton_4);
		lg_4.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_4.isSelected())
				{
					try {
						rs = stmt.executeQuery(" select nom_etu,prenom_etu,libelle,(note_CC+note_TP+note_examen*2)/4 as moyenne from "
								+ "etudiant,etudiantunite,unite where etudiant.matricule_etu=etudiantunite.matricule_etu and etudiantunite.code_Unite=unite.code_Unite");
					} catch (SQLException e) {
					e.printStackTrace();
					} 
									
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("Afficher les libell\u00E9s des unit\u00E9s d'enseignement dont aucun \u00E9tudiant n'est inscrit");
		rdbtnNewRadioButton_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_4_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnNewRadioButton_4_1.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_4_1.setBounds(298, 441, 617, 31);
		RequettesType1.add(rdbtnNewRadioButton_4_1);
		lg_4.add(rdbtnNewRadioButton_4_1 );
		rdbtnNewRadioButton_4_1 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_4_1 .isSelected())
				{
					try {
						rs = stmt.executeQuery(" select libelle from unite where code_Unite not in(select code_Unite from EtudiantUnite)");
					} catch (SQLException e) {
					e.printStackTrace();
					}
									
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_4_2 = new JRadioButton("Afficher les noms et pr\u00E9noms des \u00E9tudiants qui ne sont pas inscrits dans l'unit\u00E9 \u00AB POO \u00BB");
		rdbtnNewRadioButton_4_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_4_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnNewRadioButton_4_2.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_4_2.setBounds(298, 482, 681, 31);
		RequettesType1.add(rdbtnNewRadioButton_4_2);
		lg_4.add(rdbtnNewRadioButton_4_2);
		rdbtnNewRadioButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_4_2.isSelected()){
					try {
						rs = stmt.executeQuery("select nom_etu,prenom_etu from Etudiant where matricule_etu "
								+ "not in (select matricule_etu from EtudiantUnite where code_Unite "
								+ "in ( select code_Unite from unite where libelle='POO'))");
					} catch (SQLException e) {
					e.printStackTrace();
					}
									
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_4_3 = new JRadioButton("Afficher les noms et pr\u00E9noms des \u00E9tudiants ayant obtenus des notes d'examens \u00E9gales \u00E0 20");
		rdbtnNewRadioButton_4_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton_4_3.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnNewRadioButton_4_3.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton_4_3.setBounds(298, 523, 703, 31);
		RequettesType1.add(rdbtnNewRadioButton_4_3);
		lg_4.add(rdbtnNewRadioButton_4_3);
		rdbtnNewRadioButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_4_3.isSelected())
				{
						try {
							 rs = stmt.executeQuery("select nom_etu,prenom_etu from Etudiant where matricule_etu in(select matricule_etu from EtudiantUnite where note_examen=20)");
								} catch (SQLException e) {
									e.printStackTrace();
								}
							
							table_4.setModel(DbUtils.resultSetToTableModel(rs));
				}
			}
		});
		

		
		
		Panel RequettesType2 = new Panel();
		RequettesType2.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("RequettesType2", null, RequettesType2, null);
		RequettesType2.setLayout(null);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(293, 376, 715, 1);
		RequettesType2.add(separator_8);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(201, 33, 799, 9);
		RequettesType2.add(separator_7);
		
		JSeparator separator_1_7 = new JSeparator();
		separator_1_7.setBounds(201, 43, 700, 14);
		RequettesType2.add(separator_1_7);
		
		JSeparator separator_1_1_7 = new JSeparator();
		separator_1_1_7.setBounds(201, 52, 600, 14);
		RequettesType2.add(separator_1_1_7);
		
		JSeparator separator_1_1_1_7 = new JSeparator();
		separator_1_1_1_7.setBounds(201, 62, 500, 14);
		RequettesType2.add(separator_1_1_1_7);
		
		JSeparator separator_1_1_1_1_7 = new JSeparator();
		separator_1_1_1_1_7.setBounds(201, 72, 400, 14);
		RequettesType2.add(separator_1_1_1_1_7);
		
		JSeparator separator_1_1_1_1_1_7 = new JSeparator();
		separator_1_1_1_1_1_7.setBounds(201, 82, 300, 14);
		RequettesType2.add(separator_1_1_1_1_1_7);
		
		JSeparator separator_1_1_1_1_1_1_7 = new JSeparator();
		separator_1_1_1_1_1_1_7.setBounds(201, 92, 200, 14);
		RequettesType2.add(separator_1_1_1_1_1_1_7);
		
		JSeparator separator_1_1_1_1_1_1_1_6 = new JSeparator();
		separator_1_1_1_1_1_1_1_6.setBounds(201, 102, 100, 14);
		RequettesType2.add(separator_1_1_1_1_1_1_1_6);
		
		JScrollPane scrollPane_4_1 = new JScrollPane();
		scrollPane_4_1.setBounds(364, 153, 575, 213);
		RequettesType2.add(scrollPane_4_1);
		
		table_5 = new JTable();
		table_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table_5.setForeground(new Color(204, 204, 204));
		table_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		scrollPane_4_1.setViewportView(table_5);
		
		JButton btnNewButton_2 = new JButton("Afficher pour chaque unit\u00E9 son libell\u00E9 et la moyenne de la section"); 
		btnNewButton_2.setHideActionText(true);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorder(null);
	    JButton btnNewButton_2_1 = new JButton("Le nombre totale d'etudiants ");
	    btnNewButton_2_1.setHideActionText(true);
	    btnNewButton_2_1.setFocusable(false);
	    btnNewButton_2_1.setFocusTraversalKeysEnabled(false);
	    btnNewButton_2_1.setFocusPainted(false);
	    btnNewButton_2_1.setBorder(null);
		JButton btnNewButton_2_2 = new JButton("La note d'examen la plus haute et la plus basse ");
		btnNewButton_2_2.setHideActionText(true);
		btnNewButton_2_2.setFocusable(false);
		btnNewButton_2_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_2_2.setFocusPainted(false);
		btnNewButton_2_2.setBorder(null);
		JButton btnNewButton_2_3 = new JButton("Afficher pour chaque \u00E9tudiant son matricule et sa moyenne g\u00E9n\u00E9rale");
		btnNewButton_2_3.setHideActionText(true);
		btnNewButton_2_3.setFocusable(false);
		btnNewButton_2_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_2_3.setFocusPainted(false);
		btnNewButton_2_3.setBorder(null);
		JButton btnNewButton_2_4 = new JButton("Afficher pour chaque unit\u00E9 d'enseignement son code et le nombre d'\u00E9tudiants inscrits");
		btnNewButton_2_4.setHideActionText(true);
		btnNewButton_2_4.setFocusable(false);
		btnNewButton_2_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_2_4.setFocusPainted(false);
		btnNewButton_2_4.setBorder(null);
		JButton btnNewButton_2_5 = new JButton("Afficher, pour chaque libell\u00E9 d'unit\u00E9 d'enseignement, la plus haute moyenne");
		btnNewButton_2_5.setHideActionText(true);
		btnNewButton_2_5.setFocusable(false);
		btnNewButton_2_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_2_5.setFocusPainted(false);
		btnNewButton_2_5.setBorder(null);
		
		  btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2.setForeground(new Color(204, 102,153));
					btnNewButton_2_1.setForeground(new Color(204, 204,204));
					btnNewButton_2_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_3.setForeground(new Color(204, 204,204));
					btnNewButton_2_4.setForeground(new Color(204, 204,204));
					btnNewButton_2_5.setForeground(new Color(204, 204,204));
					
				}
			});
		  btnNewButton_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2_1.setForeground(new Color(204, 102,153));
					btnNewButton_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_3.setForeground(new Color(204, 204,204));
					btnNewButton_2_4.setForeground(new Color(204, 204,204));
					btnNewButton_2_5.setForeground(new Color(204, 204,204));
					
				}
			});
		  btnNewButton_2_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2_2.setForeground(new Color(204, 102,153));
					btnNewButton_2_1.setForeground(new Color(204, 204,204));
					btnNewButton_2.setForeground(new Color(204, 204,204)); 
					btnNewButton_2_3.setForeground(new Color(204, 204,204));
					btnNewButton_2_4.setForeground(new Color(204, 204,204));
					btnNewButton_2_5.setForeground(new Color(204, 204,204));
					
				}
			});
		  btnNewButton_2_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2_3.setForeground(new Color(204, 102,153));
					btnNewButton_2_1.setForeground(new Color(204, 204,204));
					btnNewButton_2_2.setForeground(new Color(204, 204,204));
					btnNewButton_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_4.setForeground(new Color(204, 204,204));
					btnNewButton_2_5.setForeground(new Color(204, 204,204));
					
				}
			});
		  btnNewButton_2_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2_4.setForeground(new Color(204, 102,153));
					btnNewButton_2_1.setForeground(new Color(204, 204,204));
					btnNewButton_2_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_3.setForeground(new Color(204, 204,204));
					btnNewButton_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_5.setForeground(new Color(204, 204,204));
					
				}
			});
		  btnNewButton_2_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					btnNewButton_2_5.setForeground(new Color(204, 102,153));
					btnNewButton_2_1.setForeground(new Color(204, 204,204));
					btnNewButton_2_2.setForeground(new Color(204, 204,204));
					btnNewButton_2_3.setForeground(new Color(204, 204,204));
					btnNewButton_2_4.setForeground(new Color(204, 204,204));
					btnNewButton_2.setForeground(new Color(204, 204,204));
					
				}
			});
		
		btnNewButton_2.setSelected(true);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs = stmt.executeQuery("select libelle,avg(moy) as moy_section from v_moy group by libelle");
				} catch (SQLException e) {
				e.printStackTrace();
				} 
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2.setBackground(new Color(0,255, 153, 255));
		btnNewButton_2.setForeground(new Color(204, 204, 204));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2.setBounds(293, 387, 715, 31);
		RequettesType2.add(btnNewButton_2);
		
		
		btnNewButton_2_1.setSelected(true);
		btnNewButton_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs = stmt.executeQuery(" select count(*) as Nbr_Totale_Etu from Etudiant");
				} catch (SQLException e) {
				e.printStackTrace();
				}
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2_1.setForeground(new Color(204, 204, 204));
		btnNewButton_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2_1.setBounds(293, 422, 715, 31);
		RequettesType2.add(btnNewButton_2_1);
		
		
		btnNewButton_2_2.setSelected(true);
		btnNewButton_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2_2.setBorderPainted(false);
		btnNewButton_2_2.setContentAreaFilled(false);
		btnNewButton_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs = stmt.executeQuery(" select MIN(note_examen) as NoteEX_Min,MAX(note_examen) as NoteEX_MAX from EtudiantUnite");
				} catch (SQLException e) {
				e.printStackTrace();
				}
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2_2.setBackground(new Color(204, 255, 153));
		btnNewButton_2_2.setForeground(new Color(204, 204, 204));
		btnNewButton_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2_2.setBounds(293, 457, 715, 31);
		RequettesType2.add(btnNewButton_2_2);
		
		
		btnNewButton_2_3.setSelected(true);
		btnNewButton_2_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2_3.setBorderPainted(false);
		btnNewButton_2_3.setContentAreaFilled(false);
		btnNewButton_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs = stmt.executeQuery(" select mat,moyenne from v_moy_generale");
				} catch (SQLException e) {
				e.printStackTrace();
				}
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2_3.setForeground(new Color(204, 204, 204));
		btnNewButton_2_3.setBounds(293, 492, 715, 31);
		RequettesType2.add(btnNewButton_2_3);
		
		
		btnNewButton_2_4.setSelected(true);
		btnNewButton_2_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2_4.setBorderPainted(false);
		btnNewButton_2_4.setContentAreaFilled(false);
		btnNewButton_2_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rs = stmt.executeQuery(" select code_unite,count(*) as nbr_etudiants from EtudiantUnite group by code_unite");
				} catch (SQLException e) {
				e.printStackTrace();
				}
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2_4.setBackground(new Color(204, 255, 153));
		btnNewButton_2_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2_4.setForeground(new Color(204, 204, 204));
		btnNewButton_2_4.setBounds(293, 527, 715, 31);
		RequettesType2.add(btnNewButton_2_4);
		
		
		btnNewButton_2_5.setSelected(true);
		btnNewButton_2_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2_5.setBorderPainted(false);
		btnNewButton_2_5.setContentAreaFilled(false);
		btnNewButton_2_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					rs = stmt.executeQuery("select libelle, max(moy) as max_moy from v_moy group by libelle");
				} catch (SQLException e) {
				e.printStackTrace();
				}
								
				table_5.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2_5.setForeground(new Color(204, 204, 204));
		btnNewButton_2_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_2_5.setBounds(293, 562, 715, 31);
		RequettesType2.add(btnNewButton_2_5);
		
		 
		
		JLabel lblNewLabel_3 = new JLabel("\uF034");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Wingdings", Font.PLAIN, 50));
		lblNewLabel_3.setBounds(704, 240, 45, 56);
		home.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uF03A");
		lblNewLabel_4.setForeground(new Color(204, 204, 204));
		lblNewLabel_4.setFont(new Font("Wingdings", Font.PLAIN, 99));
		lblNewLabel_4.setBounds(617, 306, 94, 110);
		home.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uF031");
		lblNewLabel_5.setForeground(new Color(204, 204, 204));
		lblNewLabel_5.setFont(new Font("Wingdings", Font.PLAIN, 60));
		lblNewLabel_5.setBounds(430, 324, 122, 100);
		home.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uF034");
		lblNewLabel_3_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_3_1.setFont(new Font("Wingdings", Font.PLAIN, 50));
		lblNewLabel_3_1.setBounds(562, 415, 45, 56);
		home.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("\uF034");
		lblNewLabel_3_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_3_2.setFont(new Font("Wingdings", Font.PLAIN, 50));
		lblNewLabel_3_2.setBounds(562, 240, 45, 56);
		home.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("\uF034");
		lblNewLabel_3_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3_3.setFont(new Font("Wingdings", Font.PLAIN, 50));
		lblNewLabel_3_3.setBounds(704, 415, 45, 56);
		home.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("\uF031");
		lblNewLabel_5_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_5_1.setFont(new Font("Wingdings", Font.PLAIN, 60));
		lblNewLabel_5_1.setBounds(818, 324, 122, 100);
		home.add(lblNewLabel_5_1);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Bienvenue chez vous Admin !");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblNewLabel_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_2.setBounds(348, 163, 610, 78);
		home.add(lblNewLabel_2);
		
		Panel etudiant = new Panel();
		etudiant.setBackground(new Color(102, 0, 102));
		tabbedPane.addTab("etudiant", null, etudiant, null);
		etudiant.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Donnez les informations des \u00E9tudiants que vous voulez ins\u00E9rer :");
		lblNewLabel_6.setForeground(new Color(204, 204, 204));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(393, 178, 541, 26);
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
		
		JLabel lblNewLabel_7 = new JLabel("Matricule_\u00E9tu");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(204, 204, 204));
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(260, 231, 150, 28);
		etudiant.add(lblNewLabel_7);
		
		textmat = new JTextField();
		textmat.setHorizontalAlignment(SwingConstants.CENTER);
		textmat.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textmat.setForeground(new Color(204, 204, 204));
		textmat.setBounds(260, 259, 150, 25);
		etudiant.add(textmat);
		textmat.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("Nom_\u00E9tu");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_1.setBounds(438, 231, 107, 28);
		etudiant.add(lblNewLabel_7_1);
		
		textnom = new JTextField();
		textnom.setHorizontalAlignment(SwingConstants.CENTER);
		textnom.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textnom.setForeground(new Color(204, 204, 204));
		textnom.setColumns(10);
		textnom.setBounds(420, 259, 150, 25);
		etudiant.add(textnom);
		
		JLabel lblNewLabel_7_2 = new JLabel("Pr\u00E9nom_\u00E9tu");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_2.setBounds(580, 231, 150, 28);
		etudiant.add(lblNewLabel_7_2);
		
		textprenom = new JTextField();
		textprenom.setHorizontalAlignment(SwingConstants.CENTER);
		textprenom.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textprenom.setForeground(new Color(204, 204, 204));
		textprenom.setColumns(10);
		textprenom.setBounds(580, 259, 150, 25);
		etudiant.add(textprenom);
		
		JLabel lblNewLabel_7_3 = new JLabel("Date_naissance");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_3.setBounds(740, 231, 150, 28);
		etudiant.add(lblNewLabel_7_3);
		
		textnaiss = new JTextField();
		textnaiss.setToolTipText("");
		textnaiss.setHorizontalAlignment(SwingConstants.CENTER);
		textnaiss.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textnaiss.setForeground(new Color(204, 204, 204));
		textnaiss.setColumns(10);
		textnaiss.setBounds(740, 259, 150, 25);
		etudiant.add(textnaiss);
		
		JLabel lblNewLabel_7_4 = new JLabel("Adresse");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setForeground(new Color(204, 204, 204));
		lblNewLabel_7_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_7_4.setBounds(900, 231, 150, 28);
		etudiant.add(lblNewLabel_7_4);
		
		textadr = new JTextField();
		textadr.setHorizontalAlignment(SwingConstants.CENTER);
		textadr.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textadr.setForeground(new Color(204, 204, 204));
		textadr.setColumns(10);
		textadr.setBounds(900, 259, 150, 25);
		etudiant.add(textadr);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(370, 359, 575, 213);
		etudiant.add(scrollPane);
		
		table = new JTable();
		table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		table.setForeground(new Color(204, 204, 204));
		scrollPane.setViewportView(table);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ajouter");
		rdbtnNewRadioButton.setContentAreaFilled(false);
		rdbtnNewRadioButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewRadioButton.setForeground(new Color(204, 204, 204));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(485, 315, 103, 26);
		etudiant.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected())
				{
	if((!textmat.getText().equals(""))&&(!textnom.getText().equals(""))&&(!textprenom.getText().equals(""))&&(!textnaiss.getText().equals("")&&(!textadr.getText().equals(""))))		
		{ try {
					rs = stmt.executeQuery(" insert into etudiant values("+textmat.getText()+",'"+textnom.getText()+"','"
							+textprenom.getText()+"','"+textnaiss.getText()+"','"+textadr.getText()+"')");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
				}
			}
		});
		lg.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAfficher = new JRadioButton("Afficher");
		rdbtnAfficher.setContentAreaFilled(false);
		rdbtnAfficher.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnAfficher.setForeground(new Color(204, 204, 204));
		rdbtnAfficher.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnAfficher.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAfficher.setBounds(720, 317, 112, 21);
		etudiant.add(rdbtnAfficher);
		rdbtnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAfficher.isSelected())
				{
				try {
					rs = stmt.executeQuery("select * from Etudiant");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			}
		});
		lg.add(rdbtnAfficher);
		
		JButton btnNewButton_1 = new JButton("HOME Page");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		JButton btnNewButton_1_1 = new JButton("Etudiants");
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBackground(new Color(102, 0, 102));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		btnNewButton_1_1.setForeground(new Color(204, 204, 204));
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(0, 197, 198, 30);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Enseignants");
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setBackground(new Color(102, 0, 102));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1_2.setForeground(new Color(204, 204, 204));
		btnNewButton_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(0, 260, 198, 30);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Unit\u00E9s");
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.setBackground(new Color(102, 0, 102));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_1_3.setForeground(new Color(204, 204, 204));
		btnNewButton_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(0, 325, 198, 30);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("EtudiantUnit\u00E9s");
		btnNewButton_1_4.setContentAreaFilled(false);
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.setBackground(new Color(102, 0, 102));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_1_4.setForeground(new Color(204, 204, 204));
		btnNewButton_1_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(0, 390, 198, 30);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Requ\u00EAtes TP7");
		btnNewButton_1_5.setContentAreaFilled(false);
		btnNewButton_1_5.setBorderPainted(false);
		btnNewButton_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5.setBackground(new Color(102, 0, 102));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_1_5.setForeground(new Color(204, 204, 204));
		btnNewButton_1_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_5.setBounds(0, 455, 198, 30);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Requ\u00EAtes TP9");
		btnNewButton_1_6.setContentAreaFilled(false);
		btnNewButton_1_6.setBorderPainted(false);
		btnNewButton_1_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_6.setBackground(new Color(102, 0, 102));
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		btnNewButton_1_6.setForeground(new Color(204, 204, 204));
		btnNewButton_1_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton_1_6.setBounds(0, 520, 198, 30);
		panel.add(btnNewButton_1_6);
		
		JLabel lblNewLabel_9 = new JLabel("Administrateur");
		lblNewLabel_9.setForeground(new Color(204, 204, 204));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_9.setBounds(0, 61, 198, 28);
		panel.add(lblNewLabel_9);
		
		
	}
}
