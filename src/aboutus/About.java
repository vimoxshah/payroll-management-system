package aboutus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
					frame.setTitle("About Us");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(About.class.getResource("/main/r.jpg")));
		lblNewLabel.setBounds(0, 0, 983, 324);
		contentPane.add(lblNewLabel);
		
		JLabel lblPayrollManagementSystem = new JLabel("Payroll Management System");
		lblPayrollManagementSystem.setForeground(new Color(0, 0, 0));
		lblPayrollManagementSystem.setBackground(new Color(102, 102, 255));
		lblPayrollManagementSystem.setFont(new Font("Raleway", Font.BOLD, 18));
		lblPayrollManagementSystem.setBounds(362, 345, 254, 35);
		contentPane.add(lblPayrollManagementSystem);
		
		JLabel lblPayrollSystem = new JLabel("Payroll System  Version 1.0");
		lblPayrollSystem.setFont(new Font("Raleway", Font.BOLD, 15));
		lblPayrollSystem.setBounds(325, 406, 222, 35);
		contentPane.add(lblPayrollSystem);
		
		JLabel lblVersion = new JLabel("Version");
		lblVersion.setFont(new Font("Raleway", Font.BOLD, 15));
		lblVersion.setBounds(165, 411, 125, 25);
		contentPane.add(lblVersion);
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setFont(new Font("Raleway", Font.BOLD, 15));
		lblLanguage.setBounds(167, 458, 82, 25);
		contentPane.add(lblLanguage);
		
		JLabel lblJavaSe = new JLabel("Java SE-1.8");
		lblJavaSe.setFont(new Font("Raleway", Font.BOLD, 15));
		lblJavaSe.setBounds(325, 452, 222, 25);
		contentPane.add(lblJavaSe);
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setFont(new Font("Raleway", Font.BOLD, 15));
		lblOperatingSystem.setBounds(165, 495, 136, 25);
		contentPane.add(lblOperatingSystem);
		
		JLabel lblWindowsPro = new JLabel("Windows 10 Pro");
		lblWindowsPro.setFont(new Font("Raleway", Font.BOLD, 15));
		lblWindowsPro.setBounds(325, 488, 222, 35);
		contentPane.add(lblWindowsPro);
		
		JLabel lblDeveloper = new JLabel("Developer");
		lblDeveloper.setFont(new Font("Raleway", Font.BOLD, 15));
		lblDeveloper.setBounds(165, 539, 136, 25);
		contentPane.add(lblDeveloper);
		
		JLabel lblThisSoftwareIs = new JLabel("This Software is Developed & Maintained By ");
		lblThisSoftwareIs.setFont(new Font("Raleway", Font.BOLD, 15));
		lblThisSoftwareIs.setBounds(325, 534, 327, 35);
		contentPane.add(lblThisSoftwareIs);
		
		JLabel lblVimoxSShah = new JLabel("Vimox S Shah");
		lblVimoxSShah.setForeground(new Color(204, 51, 51));
		lblVimoxSShah.setFont(new Font("Roboto", Font.BOLD, 15));
		lblVimoxSShah.setBounds(660, 539, 136, 25);
		contentPane.add(lblVimoxSShah);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Raleway", Font.BOLD, 15));
		lblEmail.setBounds(165, 575, 136, 25);
		contentPane.add(lblEmail);
		
		JLabel lblVmokshshahhotmailcom = new JLabel("vmoksh_shah179@hotmail.com");
		lblVmokshshahhotmailcom.setFont(new Font("Raleway", Font.BOLD, 15));
		lblVmokshshahhotmailcom.setBounds(325, 565, 254, 35);
		contentPane.add(lblVmokshshahhotmailcom);
		
		JLabel label = new JLabel("Copyright2015 \u00a9, All rights reserved.");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(165, 624, 222, 46);
		label.putClientProperty("html", null);
		   
		contentPane.add(label);
		
		
	}

}
