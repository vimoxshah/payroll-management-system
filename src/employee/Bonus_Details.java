package employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.DbConnect;

import org.jdesktop.xswingx.PromptSupport;
import org.jdesktop.xswingx.PromptSupport.FocusBehavior;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.toedter.calendar.JDateChooser;


public class Bonus_Details extends JFrame {

	private JPanel contentPane;


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTextField textField_4;
	
	

	Connection conn;
    Statement stmt;
    ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bonus_Details frame = new Bonus_Details();
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
	public Bonus_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 525);
		contentPane = new JPanel();
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		
		JLabel lblSalaryDetails = new JLabel("Bonus Details");
		lblSalaryDetails.setBounds(294, 27, 204, 42);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 73, 1363, 2);
		contentPane.add(separator);
		
		JLabel lblSalaryId = new JLabel("Bonus ID");
		lblSalaryId.setBounds(56, 106, 76, 14);
		contentPane.add(lblSalaryId);
		
		JLabel lblEmplyeeId = new JLabel("Employee ID");
		lblEmplyeeId.setBounds(56, 148, 86, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Date");
		lblBaseYear.setBounds(56, 187, 76, 14);
		contentPane.add(lblBaseYear);
		
		JLabel lblBonusPmt = new JLabel("Bonus Payment");
		lblBonusPmt.setBounds(52, 232, 101, 14);
		contentPane.add(lblBonusPmt);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setBounds(56, 298, 76, 14);
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
	
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(142, 274, 187, 77);
		contentPane.add(textArea);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(142, 183, 187, 22);
		contentPane.add(dateChooser);
		
		
		String[] cb = new String[]{"Annual","Diwali","Special"};
		JComboBox comboBox = new JComboBox(cb);
		comboBox.setBounds(139, 362, 187, 20);
		contentPane.add(comboBox);
		
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		textField_4 = new JTextField();
		textField_4.setBounds(142, 229, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		PromptSupport.setPrompt("Enter Bonus ID", textField);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField);

		PromptSupport.setPrompt("Enter Employee ID", textField_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
		PromptSupport.setFontStyle(Font.ITALIC, textField_1);
		PromptSupport.setForeground(Color.darkGray, textField_1);
		

		PromptSupport.setPrompt("Enter Bonus Payment", textField_4);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_4);
		PromptSupport.setFontStyle(Font.ITALIC, textField_4);
		PromptSupport.setForeground(Color.darkGray, textField_4);

		PromptSupport.setPrompt("Enter Description ID", textArea);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
		PromptSupport.setFontStyle(Font.ITALIC, textArea);
		PromptSupport.setForeground(Color.darkGray, textArea);
		
		
		JLabel label = new JLabel("");
		label.setBounds(358, 80, 204, 14);
		contentPane.add(label);

		
		JButton btnConfirmDetails = new JButton("Save Details");
		btnConfirmDetails.setBounds(80, 426, 127, 31);
		btnConfirmDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String b_id = textField.getText().toString();
				String e_id = textField_1.getText().toString();
				java.sql.Date date = new java.sql.Date(dateChooser.getDate().getTime());
				String bonus = textField_4.getText().toString();
				String nt = textArea.getText();
				String tb = comboBox.getSelectedItem().toString();
				try {
				String sql = "insert into bonus(bonus_id,emp_id_bonus,date,bonus_payment,note,bonus_type)  values('"+b_id+"','"+e_id+"','"+date+"','"+bonus+"','"+nt+"','"+tb+"')";
				
					System.out.println(sql);
					System.out.println(date);
					stmt.executeUpdate(sql);
					
					label.setText("Record Saved Successfully");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnConfirmDetails);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		button.setBounds(233, 426, 127, 31);
		contentPane.add(button);
		
		JLabel lblTypeOfBonus = new JLabel("Type Of Bonus");
		lblTypeOfBonus.setBounds(52, 362, 101, 14);
		contentPane.add(lblTypeOfBonus);
	
		
		
		
		
	}
}
