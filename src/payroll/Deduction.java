package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import main.DbConnect;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deduction extends JFrame {

	private JPanel contentPane;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_7;
    private JTextField textField_8;
   
   
    private JTextField textField_6;
    private JTextField textField_9;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    
    
    Connection conn;
    Statement stmt,stmt1;
    ResultSet rs,rs1,rs2,rs3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deduction frame = new Deduction();
					frame.setVisible(true);

					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Deduction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 516);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		

		JLabel lblPayrollManagementSystem = new JLabel("Payroll Management System");
		lblPayrollManagementSystem.setBounds(256, 24, 369, 40);
		lblPayrollManagementSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblPayrollManagementSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 1363, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Deductions");
		lblNewEntry.setBounds(334, 62, 117, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Deduction  ID");
		lblEmployeeId.setBounds(37, 140, 100, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Employee ID");
		lblDepartmentId.setBounds(37, 168, 100, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("First Name");
		lblJobId.setBounds(37, 207, 73, 14);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Last Name");
		lblEmployeeTypeId.setBounds(37, 251, 67, 20);
		contentPane.add(lblEmployeeTypeId);
		
		textField = new JTextField();
		textField.setBounds(139, 140, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setEditable(false);
		textField_1.setBounds(139, 165, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(139, 204, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(139, 248, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
	
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(139, 282, 187, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel lblJobTitle = new JLabel("Job title");
		lblJobTitle.setBounds(37, 282, 80, 20);
		contentPane.add(lblJobTitle);
		
		JLabel lblIncentivesInfo = new JLabel("Deduction Info.");
		lblIncentivesInfo.setFont(new Font("Roboto",Font.BOLD,14));
		lblIncentivesInfo.setBounds(504, 115, 106, 14);
		contentPane.add(lblIncentivesInfo);
		
		JLabel lblHra = new JLabel("P.F");
		lblHra.setBounds(470, 143, 46, 14);
		contentPane.add(lblHra);
		
		JLabel lblDa = new JLabel("G.P.F");
		lblDa.setBounds(470, 168, 46, 14);
		contentPane.add(lblDa);
		
		JLabel lblT = new JLabel("Income Tax");
		lblT.setBounds(470, 207, 68, 14);
		contentPane.add(lblT);
		
		JLabel lblMedical = new JLabel("Loan");
		lblMedical.setBounds(470, 232, 46, 14);
		contentPane.add(lblMedical);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(470, 268, 68, 14);
		contentPane.add(lblInsurance);
		
		textField_6 = new JTextField();
		textField_6.setBounds(563, 140, 80, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(563, 165, 80, 20);
		contentPane.add(textField_9);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(563, 204, 80, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(563, 235, 80, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(563, 265, 80, 20);
		contentPane.add(textField_13);

		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(381, 137, 2, 189);
		contentPane.add(separator_1);
		
	
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(465, 390, 89, 23);
		contentPane.add(btnCancel);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(563, 326, 80, 20);
		contentPane.add(textField_14);
		
		textField_6.setText("0");
		textField_9.setText("0");
		textField_11.setText("0");
		textField_12.setText("0");
		textField_13.setText("0");
		textField_14.setText("0");
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(152, 354, 117, 14);
		contentPane.add(label);
		
		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		try {
			stmt  = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(294, 115, 200, 14);
		contentPane.add(label_1);
		
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String sql = "Select * from deduction d inner join employee e on d.emp_id_deduct = e.emp_id where d.emp_id_deduct = '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
						
						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
						    textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							
							textField_4.setText("");
							textField_9.setText("");
							textField_6.setText("");
							textField_11.setText("");
							textField_12.setText("");
							textField_13.setText("");
							textField_14.setText("");
							label_1.setText("");
						    
						} 
						else {
						while(rs.next()){
							
							textField.setText(rs.getString("deduct_id"));
							label.setText("");
							textField_6.setText(rs.getString("pf"));
							textField_9.setText(rs.getString("gpf"));
							textField_11.setText(rs.getString("it"));
							textField_12.setText(rs.getString("loan"));
							textField_13.setText(rs.getString("insurance"));
							textField_14.setText(rs.getString("amount"));
							textField_1.setText(rs.getString("emp_id"));
							textField_2.setText(rs.getString("first_name"));
							textField_3.setText(rs.getString("last_name"));
							
						}
						rs.close();
						
						String sql2 = "Select * from job_title where emp_id_job = '"+srchfldEnterempId.getText().toString()+"' "; 
						rs3 = stmt.executeQuery(sql2);
						System.out.println(sql2);
						
						while(rs3.next()){
							textField_4.setText(rs3.getString("job_title"));
						}
						rs3.close();
						
				
						
						
						
						
					} }catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
			
				
			
			}
		});
		
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterempId.setBounds(152, 390, 174, 22);
		contentPane.add(srchfldEnterempId);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				double  pf = Double.parseDouble((textField_6.getText().toString()));
				double gpf =  Double.parseDouble((textField_9.getText().toString()));
				double it = Double.parseDouble((textField_11.getText().toString()));
				double loan =  Double.parseDouble((textField_12.getText().toString()));
				double ins =  Double.parseDouble((textField_13.getText().toString()));
				
				double total = pf+gpf+it+loan+ins;
				
				textField_14.setText(String.valueOf(total));
				
				
			}
		});
		btnTotal.setBounds(449, 325, 89, 23);
		contentPane.add(btnTotal);
		
		try {
			stmt1 = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		

		
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
				String sql = "update deduction set deduct_id = '"+textField.getText().toString() +"' ,amount = '"+textField_14.getText().toString()+"', pf = '"+textField_6.getText().toString()+"',gpf='"+textField_9.getText().toString()+"',it='"+textField_11.getText().toString()+"',loan='"+textField_12.getText().toString()+"',insurance='"+textField_13.getText().toString()+"' where emp_id_deduct = '"+srchfldEnterempId.getText().toString()+"' ";
				
				
					System.out.print(sql);
					stmt1.executeUpdate(sql);
					
					label_1.setText("Record Updated Successfully");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnSave.setBounds(355, 390, 89, 23);
		contentPane.add(btnSave);
		
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
