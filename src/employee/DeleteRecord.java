package employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.util.*;

import main.DbConnect;




import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior;

import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;


public class DeleteRecord extends JFrame {

	private JPanel contentPane;
	

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteRecord frame = new DeleteRecord();
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
	public DeleteRecord() {
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
		lblPayrollManagementSystem.setBounds(563, 11, 436, 40);
		lblPayrollManagementSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblPayrollManagementSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 1363, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Delete Employee Details");
		lblNewEntry.setBounds(618, 62, 204, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(37, 140, 73, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Department ID");
		lblDepartmentId.setBounds(37, 168, 100, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("Job ID");
		lblJobId.setBounds(37, 207, 73, 14);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Employee Type ID");
		lblEmployeeTypeId.setBounds(37, 251, 125, 20);
		contentPane.add(lblEmployeeTypeId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(37, 291, 67, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(37, 330, 73, 14);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(139, 140, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 165, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 204, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(139, 248, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 288, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(139, 327, 187, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(37, 375, 73, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(37, 409, 67, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		rdbtnMale.setBounds(139, 405, 187, 23);
		ButtonGroup bG = new ButtonGroup();
	     bG.add(rdbtnMale);
	     bG.add(rdbtnFemale);
	   
	    
		
		
		rdbtnFemale.setBounds(139, 447, 187, 23);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		
			
	
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(138, 369, 188, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		Date dateFromDateChooser = (Date) dateChooser.getDate();
		contentPane.add(dateChooser);
		
		String[] c= new String[]{"U.S","India","U.K","Japan","China"};
		JComboBox comboBox = new JComboBox(c);
		comboBox.setBounds(139, 500, 187, 20);
		contentPane.add(comboBox);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(37, 503, 67, 14);
		contentPane.add(lblCountry);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(616, 140, 90, 22);
		contentPane.add(lblState);
		
		textField_6 = new JTextField();
		textField_6.setBounds(732, 140, 187, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(618, 194, 55, 14);
		contentPane.add(lblCity);
		
		textField_7 = new JTextField();
		textField_7.setBounds(732, 191, 187, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(599, 144, 7, 468);
		contentPane.add(separator_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(618, 234, 73, 14);
		contentPane.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(732, 222, 187, 88);
		contentPane.add(textArea);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(618, 350, 73, 14);
		contentPane.add(lblPincode);

			JFormattedTextField formattedTextField_1 = new JFormattedTextField();
			formattedTextField_1.setBounds(732, 346, 187, 22);
			contentPane.add(formattedTextField_1);
			
		 

		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(618, 451, 88, 14);
		contentPane.add(lblMobile);
	
			JFormattedTextField formattedTextField_2 = new JFormattedTextField();
			formattedTextField_2.setBounds(732, 447, 187, 22);
			contentPane.add(formattedTextField_2);
			
			JLabel lblEmilId = new JLabel("emil ID");
			lblEmilId.setBounds(618, 388, 73, 14);
			contentPane.add(lblEmilId);
			
			textField_8 = new JTextField();
			textField_8.setBounds(732, 385, 187, 20);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
		
			try {
				stmt = conn.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			JLabel label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 11));
			label.setBounds(1059, 168, 139, 14);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setBounds(484, 115, 237, 14);
			contentPane.add(label_1);

			JXSearchField srchfldEnterempId = new JXSearchField();
			srchfldEnterempId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						String sql = "Select * from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"' "; 
							
						
							rs = stmt.executeQuery(sql);
							System.out.println(sql);
							if (!rs.isBeforeFirst()) {
							    System.out.println("no data found");
							    label.setText("No Record Found");
							    java.util.Date d = new java.util.Date();
							    d.toString();
							    textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								dateChooser.setDate(d);
								comboBox.setSelectedItem("Select Country");
								textField_4.setText("");;
								textField_5.setText("");;
								textField_6.setText("");
								textField_8.setText("");
								textField_7.setText("");
								formattedTextField_1.setText("");
								formattedTextField_2.setText("");
								textArea.setText("");
								rdbtnMale.setSelected(false);
								rdbtnFemale.setSelected(false);
								label_1.setText("");
								
							    
							    
							} 
							else {
								
								
							while(rs.next()){
								label.setText("");
							textField.setText(rs.getString("emp_id"));
							textField_1.setText(rs.getString("dept_id_emp"));
							textField_2.setText(rs.getString("job_id_emp"));
							textField_3.setText(rs.getString("type_id_emp"));
							textField_4.setText(rs.getString("first_name"));
							textField_5.setText(rs.getString("last_name"));
							dateChooser.setDate(rs.getDate("dob"));
							String gen= rs.getString("gender");
							
							if(gen.equals("Male")){
								rdbtnMale.setSelected(true);
								rdbtnFemale.setSelected(false);
							}
							else{
								rdbtnFemale.setSelected(true);
								rdbtnMale.setSelected(false);
							}
							comboBox.setSelectedItem(rs.getString("country"));
							textField_6.setText(rs.getString("state"));
							textField_7.setText(rs.getString("city"));
							textArea.setText(rs.getString("address"));
							formattedTextField_1.setText(rs.getString("pincode"));
							textField_8.setText(rs.getString("email"));
							formattedTextField_2.setText(rs.getString("mobile_no"));
							
							
							}
							
							}
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
				}
			});
			srchfldEnterempId.setFocusBehavior(FocusBehavior.SHOW_PROMPT);
			srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
			srchfldEnterempId.setBounds(1053, 136, 145, 22);
			contentPane.add(srchfldEnterempId);
			
			JButton btnSearch_1 = new JButton("Search");
			btnSearch_1.setBounds(1209, 136, 89, 23);
			
			btnSearch_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				
					
					try {
						String sql = "Select * from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"' "; 
							
						
							rs = stmt.executeQuery(sql);
							System.out.println(sql);
								
							while(rs.next()){
							textField.setText(rs.getString("emp_id"));
							textField_1.setText(rs.getString("dept_id_emp"));
							textField_2.setText(rs.getString("job_id_emp"));
							textField_3.setText(rs.getString("type_id_emp"));
							textField_4.setText(rs.getString("first_name"));
							textField_5.setText(rs.getString("last_name"));
							dateChooser.setDate(rs.getDate("dob"));
							String gen= rs.getString("gender");
							
							if(gen.equals("Male")){
								rdbtnMale.setSelected(true);
								rdbtnFemale.setSelected(false);
							}
							else{
								rdbtnFemale.setSelected(true);
								rdbtnMale.setSelected(false);
							}
							comboBox.setSelectedItem(rs.getString("country"));
							textField_6.setText(rs.getString("state"));
							textField_7.setText(rs.getString("city"));
							textArea.setText(rs.getString("address"));
							formattedTextField_1.setText(rs.getString("pincode"));
							textField_8.setText(rs.getString("email"));
							formattedTextField_2.setText(rs.getString("mobile_no"));
							
							
							}
							
							
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
					
				}
			});
			

			
			contentPane.add(btnSearch_1);
			
			JButton btnSave = new JButton("Delete");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
					try {
						String sql = "delete from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"'";
						stmt.executeUpdate(sql);
						System.out.println(sql);
						 
						label_1.setText("Record Deleted Successfully");
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1);
						
					}
				}
			});
			btnSave.setBounds(519, 637, 136, 34);
			contentPane.add(btnSave);
			
			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancel.setBounds(732, 637, 136, 34);
			contentPane.add(btnCancel);
			
			
		
			
			
		}
	}


	


