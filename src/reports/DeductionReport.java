package reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import main.DbConnect;
import net.proteanit.sql.DbUtils;

import java.awt.SystemColor;

public class DeductionReport extends JFrame {

	private JPanel contentPane;
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeductionReport frame = new DeductionReport();
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
	public DeductionReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		JLabel lblPayrollManagementSystem = new JLabel("Payroll Management System");
		lblPayrollManagementSystem.setBounds(553, 26, 369, 40);
		lblPayrollManagementSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblPayrollManagementSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 1363, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 106, 1382, 642);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		JButton btnShowAllEmployee = new JButton("Show Deduction Details");
		btnShowAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String sql = "select * from deduction";
				
					rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowAllEmployee.setBounds(591, 73, 226, 23);
		contentPane.add(btnShowAllEmployee);


	}

}
