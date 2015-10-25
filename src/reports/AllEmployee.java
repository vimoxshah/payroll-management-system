package reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import main.DbConnect;
import net.proteanit.sql.DbUtils;

import java.awt.SystemColor;

import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

public class AllEmployee extends JFrame {

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
					AllEmployee frame = new AllEmployee();
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
	public AllEmployee() {
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
		JButton btnShowAllEmployee = new JButton("Show All Employee Details");
		btnShowAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String sql = "select emp_id Employee_id, dept_id_emp  Department_Id,job_id_emp  Job_Id , type_id_emp Employee_Type_id, last_name Last_Name, first_name First_Name, dob Date_of_Birth, gender Gender, country Country,state State,city City,address Address, pincode Pincode,email Email,mobile_no Mobile from employee";
				
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
