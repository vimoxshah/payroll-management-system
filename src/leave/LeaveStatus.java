package leave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import main.DbConnect;

import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class LeaveStatus extends JFrame {

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
    Statement stmt,stmt1,stmt2,stmt3,stmt4,stmt5;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;
    private JTextField textField_10;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveStatus frame = new LeaveStatus();
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
	public LeaveStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		
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
		
		JLabel lblNewEntry = new JLabel("Leave Status");
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
		separator_1.setBounds(381, 140, 2, 204);
		contentPane.add(separator_1);
		

	
		
		

		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.setBounds(134, 398, 174, 22);
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
	
		
		String[] l = new String[]{"	------Select------", "Sick Leave","Vacation Leave","Cassual Leave","Convention Leave"};
		JComboBox comboBox = new JComboBox(l);
		
		
		comboBox.setBounds(139, 313, 187, 20);
		contentPane.add(comboBox);
		
		JLabel lblLeaveType = new JLabel("Leave Type");
		lblLeaveType.setBounds(37, 316, 70, 14);
		contentPane.add(lblLeaveType);
		
		JLabel lblJanuary = new JLabel("January");
		lblJanuary.setBounds(413, 140, 67, 14);
		contentPane.add(lblJanuary);
		
		textField_15 = new JTextField();
		textField_15.setBounds(472, 137, 40, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(472, 176, 40, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(472, 204, 40, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(472, 235, 40, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(472, 266, 40, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(472, 297, 40, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(661, 137, 40, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(661, 168, 40, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(661, 204, 40, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(661, 235, 40, 20);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(661, 266, 40, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(661, 297, 40, 20);
		contentPane.add(textField_26);
		
		JLabel lblFebruary = new JLabel("February");
		lblFebruary.setBounds(414, 179, 66, 14);
		contentPane.add(lblFebruary);
		
		JLabel lblMarch = new JLabel("March");
		lblMarch.setBounds(413, 207, 46, 14);
		contentPane.add(lblMarch);
		
		JLabel lblApril = new JLabel("April");
		lblApril.setBounds(413, 238, 46, 14);
		contentPane.add(lblApril);
		
		JLabel lblMay = new JLabel("May");
		lblMay.setBounds(413, 269, 46, 14);
		contentPane.add(lblMay);
		
		JLabel lblJune = new JLabel("June");
		lblJune.setBounds(413, 300, 46, 14);
		contentPane.add(lblJune);
		
		JLabel lblJuly = new JLabel("July");
		lblJuly.setBounds(574, 140, 46, 14);
		contentPane.add(lblJuly);
		
		JLabel lblAugust = new JLabel("August");
		lblAugust.setBounds(574, 168, 46, 14);
		contentPane.add(lblAugust);
		
		JLabel lblSeptember = new JLabel("September");
		lblSeptember.setBounds(574, 207, 67, 14);
		contentPane.add(lblSeptember);
		
		JLabel lblOctober = new JLabel("October");
		lblOctober.setBounds(574, 238, 77, 14);
		contentPane.add(lblOctober);
		
		JLabel lblNovember = new JLabel("November");
		lblNovember.setBounds(574, 269, 77, 14);
		contentPane.add(lblNovember);
		
		JLabel lblDecember = new JLabel("December");
		lblDecember.setBounds(574, 300, 77, 14);
		contentPane.add(lblDecember);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(456, 398, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(293, 115, 219, 14);
		contentPane.add(label_1);
		
		
		textField_27 = new JTextField();
		textField_27.setBounds(536, 337, 89, 20);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		
		try {
			stmt  = conn.createStatement();
			stmt2  = conn.createStatement();
			stmt3 = conn.createStatement();
			stmt4 = conn.createStatement();
			stmt5 = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(134, 365, 117, 14);
		contentPane.add(label);
		
		
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String sql = "Select * from leave_details ld inner join employee e on ld.emp_id_leave = e.emp_id where emp_id_leave = '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
						    textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							
							textField_4.setText("");;
							textField_15.setText("");;
							textField_16.setText("");
							textField_17.setText("");
							textField_18.setText("");
							textField_19.setText("");
							textField_20.setText("");
							textField_21.setText("");
							textField_22.setText("");
							textField_23.setText("");
							textField_24.setText("");
							textField_25.setText("");
							textField_26.setText("");
							textField_27.setText("");
							label_1.setText("");
						
						    
						    
						} 
						else {
						while(rs.next()){
							label.setText("");
							textField.setText(rs.getString("leave_id"));
							comboBox.setSelectedItem(rs.getString("leave_type"));
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
				}
					 catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				
			
						}
			
			
		});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String lt = comboBox.getSelectedItem().toString();
				
				if(lt == "Sick Leave"){
					try {
					String sql = "Select * from leave_sick where emp_id_sick = '"+srchfldEnterempId.getText().toString()+"'";
					rs = stmt2.executeQuery(sql);
				
					System.out.println(sql);
					
					while(rs.next()){
						textField_15.setText(rs.getString("jan"));
						textField_16.setText(rs.getString("feb"));
						textField_17.setText(rs.getString("mar"));
						textField_18.setText(rs.getString("april"));
						textField_19.setText(rs.getString("may"));
						textField_20.setText(rs.getString("june"));
						textField_21.setText(rs.getString("july"));
						textField_22.setText(rs.getString("aug"));
						textField_23.setText(rs.getString("sept"));
						textField_24.setText(rs.getString("oct"));
						textField_25.setText(rs.getString("nov"));
						textField_26.setText(rs.getString("decm"));
						
					}
					}
					catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					//String lt1 = comboBox.getSelectedItem().toString();
					if(lt == "Vacation Leave"){
							try{
							String sql1 = "Select * from leave_vacation where emp_id_vac = '"+srchfldEnterempId.getText().toString()+"'";
							
								rs4 = stmt3.executeQuery(sql1);
							
							
							System.out.println(sql1);
						while(rs4.next()){
							textField_15.setText(rs4.getString("jan"));
							textField_16.setText(rs4.getString("feb"));
							textField_17.setText(rs4.getString("mar"));
							textField_18.setText(rs4.getString("apr"));
							textField_19.setText(rs4.getString("may"));
							textField_20.setText(rs4.getString("june"));
							textField_21.setText(rs4.getString("july"));
							textField_22.setText(rs4.getString("aug"));
							textField_23.setText(rs4.getString("sept"));
							textField_24.setText(rs4.getString("oct"));
							textField_25.setText(rs4.getString("nov"));
							textField_26.setText(rs4.getString("decm"));
							
						}
					}catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
					}
					if(lt == "Cassual Leave"){
						try{
						String sql1 = "Select * from leave_cassual where emp_id_cas = '"+srchfldEnterempId.getText().toString()+"'";
						
							rs5 = stmt4.executeQuery(sql1);
							System.out.println(sql1);
					while(rs5.next()){
						textField_15.setText(rs5.getString("jan"));
						textField_16.setText(rs5.getString("feb"));
						textField_17.setText(rs5.getString("mar"));
						textField_18.setText(rs5.getString("apr"));
						textField_19.setText(rs5.getString("may"));
						textField_20.setText(rs5.getString("june"));
						textField_21.setText(rs5.getString("july"));
						textField_22.setText(rs5.getString("aug"));
						textField_23.setText(rs5.getString("sept"));
						textField_24.setText(rs5.getString("oct"));
						textField_25.setText(rs5.getString("nov"));
						textField_26.setText(rs5.getString("decm"));
						
					}
				}catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
					
					if(lt == "Convention Leave"){
						try{
						String sql1 = "Select * from leave_convantion where emp_id_con = '"+srchfldEnterempId.getText().toString()+"'";
						
							rs6 = stmt5.executeQuery(sql1);
						
						
						System.out.println(sql1);
					while(rs6.next()){
						textField_15.setText(rs6.getString("jan"));
						textField_16.setText(rs6.getString("feb"));
						textField_17.setText(rs6.getString("mar"));
						textField_18.setText(rs6.getString("apr"));
						textField_19.setText(rs6.getString("may"));
						textField_20.setText(rs6.getString("june"));
						textField_21.setText(rs6.getString("july"));
						textField_22.setText(rs6.getString("aug"));
						textField_23.setText(rs6.getString("sept"));
						textField_24.setText(rs6.getString("oct"));
						textField_25.setText(rs6.getString("nov"));
						textField_26.setText(rs6.getString("decm"));
						
					}
				}catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
			
				
			}
	
		});
	
		
		
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		contentPane.add(srchfldEnterempId);
		
	
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int jan  = Integer.parseInt(textField_15.getText().toString());
				int feb  = Integer.parseInt(textField_16.getText().toString());
				int mar  = Integer.parseInt(textField_17.getText().toString());
				int apr  = Integer.parseInt(textField_18.getText().toString());
				int may  = Integer.parseInt(textField_19.getText().toString());
				int june  = Integer.parseInt(textField_20.getText().toString());
				int july  = Integer.parseInt(textField_21.getText().toString());
				int aug  = Integer.parseInt(textField_22.getText().toString());
				int sep  = Integer.parseInt(textField_23.getText().toString());
				int oct  = Integer.parseInt(textField_24.getText().toString());
				int nov  = Integer.parseInt(textField_25.getText().toString());
				int dec  = Integer.parseInt(textField_26.getText().toString());
				
				
				int total = jan+feb+mar+apr+may+june+july+aug+sep+oct+nov+dec;
				
				System.out.println(total);
				textField_27.setText(String.valueOf(total));
			}
		});
		btnTotal.setBounds(401, 336, 89, 23);
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
				
				String lt = comboBox.getSelectedItem().toString();
				if(lt == "Sick Leave"){
					
					try {
						String sql = "update leave_sick set jan='"+textField_15.getText().toString()+"', feb='"+textField_16.getText().toString()+"', mar='"+textField_17.getText().toString()+"',april='"+textField_18.getText().toString()+"',may='"+textField_19.getText().toString()+"',june='"+textField_20.getText().toString()+"',july='"+textField_21.getText().toString()+"',aug='"+textField_22.getText().toString()+"',sept='"+textField_23.getText().toString()+"',oct='"+textField_24.getText().toString()+"',nov='"+textField_25.getText().toString()+"',decm ='"+textField_26.getText().toString()+"',total_sick = '"+textField_27.getText().toString()+"' where emp_id_sick = '"+srchfldEnterempId.getText().toString()+"' "; 
						
							stmt.executeUpdate(sql);
							System.out.println(sql);
							label_1.setText("Record Updated Successfully");
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
					if(lt == "Cassual Leave"){
					
					try {
						String sql = "update leave_cassual set jan='"+textField_15.getText().toString()+"', feb='"+textField_16.getText().toString()+"', mar='"+textField_17.getText().toString()+"',apr='"+textField_18.getText().toString()+"',may='"+textField_19.getText().toString()+"',june='"+textField_20.getText().toString()+"',july='"+textField_21.getText().toString()+"',aug='"+textField_22.getText().toString()+"',sept='"+textField_23.getText().toString()+"',oct='"+textField_24.getText().toString()+"',nov='"+textField_25.getText().toString()+"',decm ='"+textField_26.getText().toString()+"',total_cas = '"+textField_27.getText().toString()+"' where emp_id_cas = '"+srchfldEnterempId.getText().toString()+"' "; 
						
							stmt.executeUpdate(sql);
							
							System.out.println(sql);
							label_1.setText("Record Updated Successfully");
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
					
					if(lt == "Vacation Leave"){
						
						try {
							String sql = "update leave_vacation set jan='"+textField_15.getText().toString()+"', feb='"+textField_16.getText().toString()+"', mar='"+textField_17.getText().toString()+"',apr='"+textField_18.getText().toString()+"',may='"+textField_19.getText().toString()+"',june='"+textField_20.getText().toString()+"',july='"+textField_21.getText().toString()+"',aug='"+textField_22.getText().toString()+"',sept='"+textField_23.getText().toString()+"',oct='"+textField_24.getText().toString()+"',nov='"+textField_25.getText().toString()+"',decm ='"+textField_26.getText().toString()+"',total_vac = '"+textField_27.getText().toString()+"' where emp_id_vac = '"+srchfldEnterempId.getText().toString()+"' "; 
							
								stmt.executeUpdate(sql);
								label_1.setText("Record Updated Successfully");
								
								System.out.println(sql);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
					
					if(lt == "Convention Leave"){
						
						try {
							String sql = "update leave_convantion set jan='"+textField_15.getText().toString()+"', feb='"+textField_16.getText().toString()+"', mar='"+textField_17.getText().toString()+"',apr='"+textField_18.getText().toString()+"',may='"+textField_19.getText().toString()+"',june='"+textField_20.getText().toString()+"',july='"+textField_21.getText().toString()+"',aug='"+textField_22.getText().toString()+"',sept='"+textField_23.getText().toString()+"',oct='"+textField_24.getText().toString()+"',nov='"+textField_25.getText().toString()+"',decm ='"+textField_26.getText().toString()+"',total_con = '"+textField_27.getText().toString()+"' where emp_id_con = '"+srchfldEnterempId.getText().toString()+"' "; 
							
								stmt.executeUpdate(sql);
								
								System.out.println(sql);
								label_1.setText("Record Updated Successfully");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
			}
		});
		btnSave.setBounds(334, 398, 89, 23);
		contentPane.add(btnSave);
	
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
