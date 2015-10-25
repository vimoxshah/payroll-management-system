package leave;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.DbConnect;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextArea;

public class LeaveEntry extends JFrame{


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
    
    
    Connection conn;
    Statement stmt,stmt1;
    ResultSet rs,rs1,rs2,rs3;
    private JTextField textField_10;
    private JTextField textField_14;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveEntry frame = new LeaveEntry();
					frame.setVisible(true);

					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					
					frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LeaveEntry() {

	

	/**
	 * Initialize the contents of the frame.
	 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 786, 560);
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
	
	JLabel lblNewEntry = new JLabel("LeaveEntry");
	lblNewEntry.setBounds(334, 62, 117, 34);
	lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
	contentPane.add(lblNewEntry);
	
	JLabel lblEmployeeId = new JLabel("Leave ID");
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
	textField_1.setBounds(139, 165, 187, 20);
	textField_1.setForeground(Color.RED);
	textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	textField_1.setEditable(false);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(139, 204, 187, 20);
	textField_2.setEditable(false);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setBounds(139, 248, 187, 20);
	textField_3.setEditable(false);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	

	
	textField_4 = new JTextField();
	textField_4.setBounds(139, 282, 187, 20);
	textField_4.setEditable(false);
	textField_4.setColumns(10);
	contentPane.add(textField_4);
	
	JLabel lblJobTitle = new JLabel("Job title");
	lblJobTitle.setBounds(37, 282, 80, 20);
	contentPane.add(lblJobTitle);
	
	

	JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
	separator_1.setBounds(381, 140, 2, 283);
	contentPane.add(separator_1);
	

	
	JButton btnCancel = new JButton("Cancel");
	btnCancel.setBounds(426, 473, 89, 23);
	contentPane.add(btnCancel);
	
	
	JLabel lblLeaveType = new JLabel("Leave Type");
	lblLeaveType.setBounds(430, 140, 85, 14);
	contentPane.add(lblLeaveType);
	
	String[] l = new String[]{"	------Select------", "Sick Leave","Vacation Leave","Cassual Leave","Convention Leave"};
	JComboBox comboBox = new JComboBox(l);
	comboBox.setBounds(525, 137, 163, 20);
	contentPane.add(comboBox);
	
	JLabel lblTotalLeave = new JLabel("Total Leave");
	lblTotalLeave.setBounds(430, 182, 85, 14);
	contentPane.add(lblTotalLeave);
	
	textField_10 = new JTextField();
	textField_10.setBounds(525, 179, 163, 20);
	contentPane.add(textField_10);
	textField_10.setColumns(10);
	
	JLabel lblLeaveFrom = new JLabel("Leave  From");
	lblLeaveFrom.setBounds(430, 221, 85, 14);
	contentPane.add(lblLeaveFrom);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(525, 221, 163, 20);
	dateChooser.setDateFormatString("yyyy-MM-dd");
	contentPane.add(dateChooser);
	
	JLabel lblTo = new JLabel("TO");
	lblTo.setBounds(562, 254, 63, 14);
	contentPane.add(lblTo);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser_1.setBounds(525, 279, 163, 20);
	dateChooser_1.setDateFormatString("yyyy-MM-dd");
	contentPane.add(dateChooser_1);
	
	textField_14 = new JTextField();
	textField_14.setBounds(525, 320, 163, 20);
	contentPane.add(textField_14);
	textField_14.setColumns(10);
	
	JLabel lblBalanceLeave = new JLabel("Balance Leave");
	lblBalanceLeave.setBounds(430, 323, 85, 14);
	contentPane.add(lblBalanceLeave);
	
	JLabel lblComment = new JLabel("Comment");
	lblComment.setBounds(430, 375, 85, 14);
	contentPane.add(lblComment);
	
	JTextArea textArea = new JTextArea();
	textArea.setBounds(525, 370, 163, 69);
	contentPane.add(textArea);

	
	JLabel label = new JLabel("");
	label.setFont(new Font("Tahoma", Font.BOLD, 11));
	label.setBounds(74, 437, 111, 14);
	contentPane.add(label);
	
	JLabel label_1 = new JLabel("");
	label_1.setBounds(292, 115, 197, 14);
	contentPane.add(label_1);
	
	JXSearchField srchfldEnterempId = new JXSearchField();
	srchfldEnterempId.setBounds(74, 473, 174, 22);
	srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
	
	try {
		stmt  = conn.createStatement();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	srchfldEnterempId.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			try {
				String sql = "Select * from leave_details ld inner join employee e on ld.emp_id_leave= e.emp_id where emp_id_leave = '"+srchfldEnterempId.getText().toString()+"' "; 
					
				
				
					rs = stmt.executeQuery(sql);
					System.out.println(sql);
					

					if (!rs.isBeforeFirst()) {
					    System.out.println("no data found");
					    label.setText("No Record Found");
					    textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						java.util.Date d =new java.util.Date();
						dateChooser.setDate(d);
						dateChooser_1.setDate(d);
						textField_4.setText("");
						textArea.setText("");
						textField_10.setText("");
						label_1.setText("");
						textField_14.setText("");
						
					    
					    
					} 
					else {
						
					while(rs.next()){
						label.setText("");
						textField.setText(rs.getString("leave_id"));
						comboBox.setSelectedItem(rs.getString("leave_type"));
						dateChooser.setDate(rs.getDate("starting_leave"));
						dateChooser_1.setDate(rs.getDate("ending_leave"));
						textField_14.setText(rs.getString("balance_leave"));
						textField_10.setText(rs.getString("total_leave"));
						textArea.setText(rs.getString("note"));
						textField_1.setText(rs.getString("emp_id"));
						textField_2.setText(rs.getString("first_name"));
						textField_3.setText(rs.getString("last_name"));
					
						
						
					}
					
					String sql2 = "Select * from job_title where emp_id_job = '"+srchfldEnterempId.getText().toString()+"' "; 
					rs3 = stmt.executeQuery(sql2);
					System.out.println(sql2);
					
					while(rs3.next()){
						textField_4.setText(rs3.getString("job_title"));
					}
				
					}			
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		
			
		
		}
	});
	
	
	
	srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
	srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
	contentPane.add(srchfldEnterempId);
	
	try {
		stmt1 = conn.createStatement();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	JButton btnSave = new JButton("Save");
	btnSave.setBounds(315, 473, 89, 23);
	btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 java.sql.Date date = new java.sql.Date(dateChooser.getDate().getTime());
				 java.sql.Date date1 = new java.sql.Date(dateChooser_1.getDate().getTime());
				 
				int d= date.compareTo(date1);
				if(date.after(date1)){
					 System.out.println("First Date is after second");
				
				  JOptionPane.showMessageDialog(null,
		                    "Please the ending date must be after the starting date.",
		                    "Date Error",
		                    JOptionPane.ERROR_MESSAGE);
				  return;
				
				}
				
				 if (date.before(date))
					      System.out.println("First Date is before second");
				 
				if(date.equals(date1)){
					 

					  JOptionPane.showMessageDialog(null,
			                    "Please enter  two different date.",
			                    "Date Error",
			                    JOptionPane.ERROR_MESSAGE);
					  return;
					 
				 }
				
				
			String sql = "update leave_details set leave_type = '"+comboBox.getSelectedItem().toString()+"', starting_leave = '"+date+"',ending_leave='"+date1+"',balance_leave='"+textField_14.getText().toString()+"',note='"+textArea.getText().toString()+"',total_leave = '"+textField_10.getText().toString()+"' where emp_id_leave = '"+srchfldEnterempId.getText().toString()+"' ";
			
							
							System.out.println(sql);
							stmt1.executeUpdate(sql);
							label_1.setText("Record Updated Successfully");
							
				stmt1.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
	});
	contentPane.add(btnSave);
	

	
	
	
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});
	
	
	}
}
