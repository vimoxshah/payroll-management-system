package main;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JButton;

import payroll.BasicSalary;
import payroll.Bonus;
import payroll.Deduction;
import payroll.Incentives;
import reports.AllEmployee;
import reports.DeductionReport;
import reports.IncentivesReport;
import reports.PaySlip;
import employee.Add_Record;
import employee.Bonus_Details;
import employee.DeleteRecord;
import employee.Job_Details;
import employee.Salary_Detail;
import employee.UpdateEmpDetail;
import employee.UpdateJobDetails;
import employee.UpdateWorkDetails;
import employee.Work_Details;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;
import java.awt.SystemColor;

import leave.LeaveEntry;
import leave.LeaveReport;
import leave.LeaveSetting;
import leave.LeaveStatus;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

import aboutus.About;


public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setTitle("Home");
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					  WindowAdapter exitListener = new WindowAdapter() {

				            @Override
				            public void windowClosing(WindowEvent e) {
				                int confirm = JOptionPane.showOptionDialog(frame,
				                        "Are You Sure to Close this Application?",
				                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
				                        JOptionPane.QUESTION_MESSAGE, null, null, null);
				                if(confirm == JOptionPane.YES_OPTION){
				                   frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

				                } else if (confirm == JOptionPane.CANCEL_OPTION) {
				                    frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
				                } else {
				                    frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
				                }
				            }
				        };
				     frame. addWindowListener(exitListener);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		setBounds(100, 100, 1224, 625);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);
		mnEmployee.setFont(new Font("Roboto", Font.PLAIN, 12));
		

		
		JMenu mnAdd = new JMenu("Add");
		mnEmployee.add(mnAdd);
		
		JMenuItem menuItem = new JMenuItem("Employee Basic Details");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Record ar;
				try {
					ar = new Add_Record();
					ar.setVisible(true);
					ar.setTitle("Employee Basic Details");
					ar.setResizable(false);
					ar.setLocationRelativeTo(null);
					  WindowAdapter exitListener = new WindowAdapter() {

				            @Override
				            public void windowClosing(WindowEvent e) {
				                int confirm = JOptionPane.showOptionDialog(ar,
				                        "Are You Sure to Close this Window?",
				                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
				                        JOptionPane.QUESTION_MESSAGE, null, null, null);
				                if(confirm == JOptionPane.YES_OPTION){
				                   ar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

				                } else if (confirm == JOptionPane.CANCEL_OPTION) {
				                    ar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
				                } else {
				                    ar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
				                }
				            }
				        };
				     ar.addWindowListener(exitListener);
					
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		mnAdd.add(menuItem);
		
		JMenuItem mntmSalaryDetail = new JMenuItem("Salary Details");
		mntmSalaryDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Salary_Detail s;
				s = new Salary_Detail();
				s.setVisible(true);
				s.setTitle("Salary Details");
				
				s.setResizable(false);
				s.setLocationRelativeTo(null);
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(s,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    s.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    s.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     s. addWindowListener(exitListener);
				
			}
		});
		mnAdd.add(mntmSalaryDetail);
		
		JMenuItem mntmJobTitle = new JMenuItem("Job Details");
		mntmJobTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Job_Details j = new Job_Details();
				j.setVisible(true);
				j.setResizable(false);
				j.setLocationRelativeTo(null);
				j.setTitle("Job Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(j,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   j.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     j. addWindowListener(exitListener);
			
			}
		});
		mnAdd.add(mntmJobTitle);
		
		JMenuItem mntmWorkDetails = new JMenuItem("Work Details");
		mntmWorkDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Work_Details w = new Work_Details();
				w.setVisible(true);
				w.setResizable(false);
				w.setLocationRelativeTo(null);
				w.setTitle("Work Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(w,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   w.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    w.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    w.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     w. addWindowListener(exitListener);
				
			}
		});
		mnAdd.add(mntmWorkDetails);
		
		JMenuItem mntmBonus_1 = new JMenuItem("Bonus");
		mntmBonus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bonus_Details b =new Bonus_Details();
				b.setVisible(true);
				
				b.setTitle("Bonus Details");
				b.setResizable(false);
				b.setLocationRelativeTo(null);
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(b,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   b.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     b. addWindowListener(exitListener);
			}
		});
		mnAdd.add(mntmBonus_1);
		
		JMenu mnUpdate = new JMenu("Update");
		mnEmployee.add(mnUpdate);
		
		JMenuItem mntmEmployeeBasicDetails = new JMenuItem("Employee Basic Details");
		mntmEmployeeBasicDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateEmpDetail ue = new UpdateEmpDetail();
				ue.setVisible(true);
				ue.setResizable(false);
				ue.setLocationRelativeTo(null);
				ue.setTitle("Employee Basic Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ue,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ue.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ue.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ue.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ue. addWindowListener(exitListener);
				
			
			}
		});
		mnUpdate.add(mntmEmployeeBasicDetails);
		
		JMenuItem mntmJobDetails = new JMenuItem("Job Details");
		mntmJobDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateJobDetails uj = new UpdateJobDetails();
				uj.setVisible(true);
				uj.setResizable(false);
				uj.setLocationRelativeTo(null);
				uj.setTitle("Job Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(uj,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   uj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    uj.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    uj.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     uj. addWindowListener(exitListener);
			}
		});
		mnUpdate.add(mntmJobDetails);
		
		JMenuItem mntmWorkDetails_1 = new JMenuItem("Work Details");
		mntmWorkDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateWorkDetails uw = new UpdateWorkDetails();
				uw.setVisible(true);
				uw.setResizable(false);
				uw.setLocationRelativeTo(null);
				uw.setTitle("Work Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(uw,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   uw.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    uw.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    uw.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     uw. addWindowListener(exitListener);
				
			}
		});
		mnUpdate.add(mntmWorkDetails_1);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnEmployee.add(mntmSearch);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteRecord dr = new DeleteRecord();
				dr.setVisible(true);
				dr.setResizable(false);
				dr.setLocationRelativeTo(null);
				dr.setTitle("Delete Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(dr,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   dr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    dr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    dr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     dr. addWindowListener(exitListener);
			}
		});
		mnEmployee.add(mntmDelete);
		
		JSeparator separator = new JSeparator();
		mnEmployee.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mnEmployee.add(mntmExit);
		
		JMenu mnPayroll = new JMenu("Payroll");
		menuBar.add(mnPayroll);
		mnPayroll.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		
		JMenuItem mntmBasicPayroll = new JMenuItem("Basic Payroll");
		mntmBasicPayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicSalary bs = new BasicSalary();
				bs.setVisible(true);
				bs.setResizable(false);
				bs.setLocationRelativeTo(null);
				bs.setTitle("Basic Payroll");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(bs,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   bs.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    bs.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    bs.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     bs. addWindowListener(exitListener);
			}
		});
		mnPayroll.add(mntmBasicPayroll);
		
		
		JMenuItem mntmIncentives = new JMenuItem("Incentives");
		mntmIncentives.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Incentives b =new Incentives();
				b.setVisible(true);
				b.setTitle("Incentives Details");
				b.setResizable(false);
				b.setLocationRelativeTo(null);
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(b,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   b.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     b. addWindowListener(exitListener);
				
				
			}
		});
		mnPayroll.add(mntmIncentives);
		
		JMenuItem mntmBonus = new JMenuItem("Bonus");
		mntmBonus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Bonus b = new Bonus();
				b.setVisible(true);
				b.setResizable(false);
				b.setLocationRelativeTo(null);
				b.setTitle("Bonus Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(b,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   b.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    b.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     b. addWindowListener(exitListener);
				
			}
		});
		mnPayroll.add(mntmBonus);
		
		JMenuItem mntmDeduction = new JMenuItem("Deduction");
		mntmDeduction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Deduction d = new Deduction();
				d.setVisible(true);
				d.setResizable(false);
				d.setLocationRelativeTo(null);
				d.setTitle("Deduction Details");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(d,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    d.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    d.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     d. addWindowListener(exitListener);
			}
		});
		mnPayroll.add(mntmDeduction);
		
		JMenu mnLeave = new JMenu("Leave");
		mnLeave.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		menuBar.add(mnLeave);
		
		JMenuItem mntmLeaveEntry = new JMenuItem("Leave Entry");
		mntmLeaveEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeaveEntry l = new LeaveEntry();
				l.setVisible(true);
				l.setResizable(false);
				l.setLocationRelativeTo(null);
				l.setTitle("Leave Entry");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(l,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   l.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    l.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    l.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     l. addWindowListener(exitListener);
			}
		});
		mnLeave.add(mntmLeaveEntry);
		
		JMenuItem mntmLeaveStatus = new JMenuItem("Leave Status");
		mntmLeaveStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeaveStatus ls = new LeaveStatus();
				ls.setVisible(true);
				ls.setResizable(false);
				ls.setLocationRelativeTo(null);
				ls.setTitle("Leave Status");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ls,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ls.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ls.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ls.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ls. addWindowListener(exitListener);
			}
		});
		mnLeave.add(mntmLeaveStatus);
		
		JMenuItem mntmLeaveSetting = new JMenuItem("Leave Setting");
		mntmLeaveSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeaveSetting ls =new LeaveSetting();
				ls.setVisible(true);
				ls.setResizable(false);
				ls.setLocationRelativeTo(null);
				ls.setTitle("Leave Settings");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ls,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ls.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ls.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ls.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ls. addWindowListener(exitListener);
			}
		});
		mnLeave.add(mntmLeaveSetting);
		
		JMenuItem mntmLeaveReport = new JMenuItem("Leave Report");
		mntmLeaveReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeaveReport lr = new LeaveReport();
				lr.setVisible(true);
				
				lr.setResizable(false);
				lr.setLocationRelativeTo(null);
				lr.setTitle("Leave Settings");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(lr,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   lr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    lr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    lr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     lr. addWindowListener(exitListener);
			
				
			}
		});
		mnLeave.add(mntmLeaveReport);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		mnReport.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		
		JMenuItem mntmAllEmployees = new JMenuItem("All Employees");
		mntmAllEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AllEmployee ae = new AllEmployee();
				ae.setVisible(true);
				ae.setResizable(false);
				ae.setLocationRelativeTo(null);
				ae.setTitle("All Employees Report");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ae,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ae.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ae.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ae.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ae. addWindowListener(exitListener);
			}
		});
		mnReport.add(mntmAllEmployees);
		
		JMenuItem mntmIncentives_1 = new JMenuItem("Incentives");
		mntmIncentives_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncentivesReport ir = new IncentivesReport();
				ir.setVisible(true);
				ir.setTitle("Incentives Report");
				ir.setResizable(false);
				ir.setLocationRelativeTo(null);
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ir,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ir.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ir. addWindowListener(exitListener);
			}
		});
		mnReport.add(mntmIncentives_1);
		
		JMenuItem mntmDeduction_1 = new JMenuItem("Deduction");
		mntmDeduction_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeductionReport dr = new DeductionReport();
				dr.setVisible(true);
				dr.setResizable(false);
				dr.setLocationRelativeTo(null);
				dr.setTitle("Deduction Report");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(dr,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   dr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    dr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    dr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     dr. addWindowListener(exitListener);
			}
		});
		mnReport.add(mntmDeduction_1);
		
		JSeparator separator_1 = new JSeparator();
		mnReport.add(separator_1);
		
		JMenuItem mntmPaySlip = new JMenuItem("Pay Slip");
		mntmPaySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PaySlip ps = new PaySlip();
				ps.setVisible(true);
				ps.setResizable(false);
				ps.setLocationRelativeTo(null);
				ps.setTitle("Pay-Slip");
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ps,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ps.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ps.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ps.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ps. addWindowListener(exitListener);
			}
		});
		mnReport.add(mntmPaySlip);
		
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		mnHelp.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About ab = new About();
				ab.setVisible(true);
				ab.setResizable(false);
				ab.setTitle("About Us");
				ab.setLocationRelativeTo(null);
				
				  WindowAdapter exitListener = new WindowAdapter() {

			            @Override
			            public void windowClosing(WindowEvent e) {
			                int confirm = JOptionPane.showOptionDialog(ab,
			                        "Are You Sure to Close this Window?",
			                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
			                        JOptionPane.QUESTION_MESSAGE, null, null, null);
			                if(confirm == JOptionPane.YES_OPTION){
			                   ab.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes

			                } else if (confirm == JOptionPane.CANCEL_OPTION) {
			                    ab.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
			                } else {
			                    ab.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no
			                }
			            }
			        };
			     ab. addWindowListener(exitListener);
				
			}
		});
		mnHelp.add(mntmAboutUs);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/main/personal_insight.jpg")));
		lblNewLabel.setBounds(0, 0, 1220, 576);
		contentPane.add(lblNewLabel);
	}
}
