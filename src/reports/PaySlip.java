package reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import main.DbConnect;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class PaySlip extends JFrame implements Printable {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	
	 Connection conn;
	    Statement stmt,stmt1,stmt2,stmt3;
	    ResultSet rs,rs1,rs2,rs3,rs4,rs5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				PaySlip frame = new PaySlip();
					frame.setVisible(true);

					frame.setResizable(false);
					 frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	   public int print(Graphics g, PageFormat pf, int page) throws
       PrinterException {
				   if (page > 0) {
				       return NO_SUCH_PAGE;
				   }
				
				   Graphics2D g2d = (Graphics2D) g;
				   g2d.translate(pf.getImageableX(), pf.getImageableY() - 55);
				   new PaySlip().setVisible(true);
				   new PaySlip().print(g);
				   return PAGE_EXISTS;
				}
	/**
	 * Create the frame.
	 */
	public PaySlip() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		
		JLabel lblPayrollManagementSystem = new JLabel("Payroll Management System");
		lblPayrollManagementSystem.setBounds(406, 25, 369, 40);
		lblPayrollManagementSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblPayrollManagementSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 1363, 2);
		contentPane.add(separator);
		
		JLabel lblPayslip = new JLabel("Pay-Slip");
		lblPayslip.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblPayslip.setBounds(488, 58, 146, 32);
		contentPane.add(lblPayslip);
		
		JLabel lblEmployeeId = new JLabel("Employee ID ");
		lblEmployeeId.setBounds(118, 146, 85, 14);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(213, 143, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(118, 171, 85, 23);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 174, 137, 20);
		contentPane.add(textField_1);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(118, 205, 85, 23);
		contentPane.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 205, 137, 20);
		contentPane.add(textField_2);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(118, 239, 71, 14);
		contentPane.add(lblJobTitle);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 236, 137, 20);
		contentPane.add(textField_3);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(118, 264, 71, 14);
		contentPane.add(lblDate);
		
		Date d = new Date();
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(213, 267, 137, 20);
		dateChooser.setDate(d);
		//dateChooser.setDateFormatString("yyyy-MM-dd");
		contentPane.add(dateChooser);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
		lblBasicSalary.setBounds(118, 300, 85, 14);
		contentPane.add(lblBasicSalary);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 300, 137, 20);
		contentPane.add(textField_4);
		
		JLabel lblDeduction = new JLabel("Deduction Amount");
		lblDeduction.setFont(new Font("Roboto Black", Font.BOLD, 14));
		lblDeduction.setBounds(118, 348, 153, 14);
		contentPane.add(lblDeduction);
		
		JLabel lblPf = new JLabel("P.F");
		lblPf.setBounds(118, 388, 53, 14);
		contentPane.add(lblPf);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(213, 385, 77, 20);
		contentPane.add(textField_5);
		
		JLabel lblGpf = new JLabel("G.P.F");
		lblGpf.setBounds(118, 423, 46, 14);
		contentPane.add(lblGpf);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(213, 416, 77, 20);
		contentPane.add(textField_6);
		
		JLabel lblIt = new JLabel("I.T");
		lblIt.setBounds(118, 461, 46, 14);
		contentPane.add(lblIt);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(213, 493, 77, 20);
		contentPane.add(textField_7);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setBounds(118, 496, 46, 14);
		contentPane.add(lblLoan);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(213, 458, 77, 20);
		contentPane.add(textField_8);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(118, 534, 71, 14);
		contentPane.add(lblInsurance);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(213, 531, 77, 20);
		contentPane.add(textField_9);
		
		JLabel lblTotalDeduction = new JLabel("Total Deduction");
		lblTotalDeduction.setBounds(112, 573, 109, 23);
		contentPane.add(lblTotalDeduction);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(213, 574, 77, 20);
		contentPane.add(textField_10);
		
		JLabel lblIncentives = new JLabel("Incentives Amount");
		lblIncentives.setFont(new Font("Roboto Black", Font.BOLD, 14));
		lblIncentives.setBounds(585, 350, 153, 14);
		contentPane.add(lblIncentives);
		
		JLabel lblHra = new JLabel("H.R.A");
		lblHra.setBounds(588, 388, 61, 14);
		contentPane.add(lblHra);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(713, 385, 77, 20);
		contentPane.add(textField_11);
		
		JLabel lblDa = new JLabel("D.A");
		lblDa.setBounds(585, 423, 46, 14);
		contentPane.add(lblDa);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(713, 420, 77, 20);
		contentPane.add(textField_12);
		
		JLabel lblCca = new JLabel("C.C.A");
		lblCca.setBounds(585, 461, 64, 14);
		contentPane.add(lblCca);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(713, 458, 77, 20);
		contentPane.add(textField_13);
		
		JLabel lblTa = new JLabel("T.A");
		lblTa.setBounds(585, 496, 49, 14);
		contentPane.add(lblTa);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(713, 493, 77, 20);
		contentPane.add(textField_14);
		
		JLabel lblMedical = new JLabel("Medical");
		lblMedical.setBounds(585, 534, 77, 14);
		contentPane.add(lblMedical);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(713, 531, 77, 20);
		contentPane.add(textField_15);
		
		JLabel lblTotalIncentives = new JLabel("Total Incentives");
		lblTotalIncentives.setBounds(585, 577, 118, 14);
		contentPane.add(lblTotalIncentives);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(713, 574, 77, 20);
		contentPane.add(textField_16);
		
		JLabel lblNetSalary = new JLabel("Net Salary");
		lblNetSalary.setFont(new Font("Source Sans Pro Black", Font.BOLD, 13));
		lblNetSalary.setBounds(118, 635, 71, 14);
		contentPane.add(lblNetSalary);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(213, 632, 109, 20);
		contentPane.add(textField_17);
	
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			PrinterJob job = PrinterJob.getPrinterJob();
		        job.setPrintable(new PaySlip());
		        boolean ok = job.printDialog();
		        if (ok) {
		            try {
		                job.print();
		            } catch (PrinterException ex) {

		            }
		        }
		
			}
		});
		btnPrint.setBounds(403, 677, 102, 23);
		contentPane.add(btnPrint);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(551, 677, 98, 23);
		contentPane.add(btnCancel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(445, 348, 2, 289);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 326, 974, 11);
		contentPane.add(separator_2);

		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(69, 681, 102, 14);
		contentPane.add(label_1);
		
		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String sql = "Select * from employee e INNER join job_title j on e.emp_id = j.emp_id_job  where emp_id = '"+srchfldEnterempId.getText().toString()+"' ";
			
					rs = stmt.executeQuery(sql);
					System.out.println(sql);

					if (!rs.isBeforeFirst()) {
					    System.out.println("no data found");
					    label_1.setText("No Record Found");
					    textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");;
						textField_6.setText("");;
						textField_7.setText("");;
						textField_8.setText("");;
						textField_9.setText("");;
						textField_10.setText("");;
						textField_11.setText("");
						textField_12.setText("");
						textField_13.setText("");
						textField_14.setText("");
						textField_15.setText("");
						textField_16.setText("");;
						textField_17.setText("");;
					
					    
					    
					} 
					else {
					
					while(rs.next()){
						label_1.setText("");
						textField.setText(rs.getString("emp_id"));
						textField_1.setText(rs.getString("first_name"));
						textField_2.setText(rs.getString("last_name"));
						textField_3.setText(rs.getString("job_title"));
						
					}
				
					
				String sql2 = "Select salary from salary where emp_id_salary = '"+srchfldEnterempId.getText().toString()+"' ";
					rs2 = stmt.executeQuery(sql2);
					System.out.println(sql2);
					
					while(rs2.next()){
						textField_4.setText(rs2.getString("salary"));
					}
				String sql3 = "SELECT * from deduction d inner join incentives i ON d.emp_id_deduct = i.emp_id_ins where emp_id_deduct= '"+srchfldEnterempId.getText().toString()+"'";
						rs3 = stmt.executeQuery(sql3);
						System.out.println(sql3);
						
						while(rs3.next()){
							textField_5.setText(rs3.getString("pf"));
							textField_6.setText(rs3.getString("gpf"));
							textField_7.setText(rs3.getString("it"));
							textField_8.setText(rs3.getString("loan"));
							textField_9.setText(rs3.getString("insurance"));
							textField_10.setText(rs3.getString("amount"));
							
							textField_11.setText(rs3.getString("hra"));
							textField_12.setText(rs3.getString("da"));
							textField_13.setText(rs3.getString("cca"));
							textField_14.setText(rs3.getString("ta"));
							textField_15.setText(rs3.getString("medical"));
							textField_16.setText(rs3.getString("total"));
							
							
						}
				String sql4 = "Select netpay from payroll where emp_id= '"+srchfldEnterempId.getText().toString()+"'";
					rs4 = stmt.executeQuery(sql4);
					System.out.println(sql4);
					
						while(rs4.next()){
							textField_17.setText(rs4.getString("netpay"));
						}
					  }
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		srchfldEnterempId.setBounds(200, 677, 174, 22);
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		contentPane.add(srchfldEnterempId);
	
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
}
