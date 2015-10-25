package employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.jdesktop.xswingx.PromptSupport;
import org.jdesktop.xswingx.PromptSupport.FocusBehavior;

import main.DbConnect;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;



public class Salary_Detail extends JFrame {

	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary_Detail frame = new Salary_Detail();
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
	public Salary_Detail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 476);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn= DbConnect.doConnect();
		
		JLabel lblSalaryDetails = new JLabel("Salary Details");
		lblSalaryDetails.setBounds(294, 27, 204, 42);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 73, 1363, 22);
		contentPane.add(separator);
		
		JLabel lblSalaryId = new JLabel("Salary ID");
		lblSalaryId.setBounds(56, 106, 76, 14);
		contentPane.add(lblSalaryId);
		
		JLabel lblEmplyeeId = new JLabel("Employee ID");
		lblEmplyeeId.setBounds(56, 148, 86, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Base Year");
		lblBaseYear.setBounds(56, 222, 76, 14);
		contentPane.add(lblBaseYear);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setBounds(56, 253, 76, 14);
		contentPane.add(lblRemarks);
		
		textField = new JTextField();
		textField.setBounds(142, 103, 187, 20);
		//textField.setBounds(178, 103, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 145, 187, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 219, 187, 20);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(142, 248, 187, 77);
		contentPane.add(textArea);
		

		PromptSupport.setPrompt("Enter Salary ID", textField);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField);

		PromptSupport.setPrompt("Enter Employee ID", textField_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField_1);
		

		PromptSupport.setPrompt("Enter Base Year", textField_2);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_2);
		PromptSupport.setFontStyle(Font.ITALIC, textField_2);
		PromptSupport.setForeground(Color.darkGray, textField_2);

		PromptSupport.setPrompt("Enter Description ID", textArea);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
		PromptSupport.setFontStyle(Font.ITALIC, textArea);
		PromptSupport.setForeground(Color.darkGray, textArea);
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
		

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 184, 187, 20);
		contentPane.add(textField_3);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(56, 187, 76, 14);
		contentPane.add(lblSalary);
		
		JButton btnConfirmDetails = new JButton("Save Details");
		btnConfirmDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s_id = textField.getText().toString();
				String e_id = textField_1.getText().toString();
				String byr = textField_2.getText().toString();
				String nt =  textArea.getText().toString();
				String sal = textField_3.getText().toString();
			//	System.out.print(byr);
				
				try {
				String sql = "insert into salary(salary_id,emp_id_salary,salary,baseryr,note) "
						+ "values('"+s_id+"','"+e_id+"', '"+sal+"',"+byr+",'"+nt+"')";
				System.out.println(sql);
				stmt.executeUpdate(sql);
				
				
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				
				
			}
		});
		btnConfirmDetails.setBounds(73, 343, 127, 31);
		contentPane.add(btnConfirmDetails);
		
		JButton button = new JButton("Cancel");
		button.setBounds(226, 343, 127, 31);
		contentPane.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
	
		
		
	}
}
