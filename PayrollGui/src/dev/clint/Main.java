package dev.clint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField txtEmployeeName;
	private JTextField txtRatePerHour;
	private JTextField txtHourPerDay;
	private JTextField txtNumberOfDays;
	private JTextField txtGrossSalary;
	private JTextField txtTaxOf;
	private JTextField txtPh;
	private JTextField txtSss;
	private JTextField txtTotalDeduction;
	private JLabel lblGrossSalary_1;
	private JTextField txtGrossSalary_1;
	private JLabel lblDeduction;
	private JTextField txtDeduction;
	private JLabel lblNetSalary;
	private JTextField txtNetSalary;
	private JLabel lblPh;
	private JLabel lblSss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSimplePayrollSystem = new JLabel("Simple Payroll System");
		lblSimplePayrollSystem.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSimplePayrollSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimplePayrollSystem.setBounds(0, 0, 1087, 49);
		frame.getContentPane().add(lblSimplePayrollSystem);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmployeeName.setBounds(64, 65, 127, 20);
		frame.getContentPane().add(lblEmployeeName);
		
		txtEmployeeName = new JTextField();
		lblEmployeeName.setLabelFor(txtEmployeeName);
		txtEmployeeName.setBounds(210, 62, 120, 26);
		frame.getContentPane().add(txtEmployeeName);
		txtEmployeeName.setColumns(10);
		
		JLabel lblRatePerHour = new JLabel("Rate Per Hour:");
		lblRatePerHour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRatePerHour.setBounds(64, 101, 127, 20);
		frame.getContentPane().add(lblRatePerHour);
		
		txtRatePerHour = new JTextField();
		lblRatePerHour.setLabelFor(txtRatePerHour);
		txtRatePerHour.setBounds(210, 98, 120, 26);
		frame.getContentPane().add(txtRatePerHour);
		txtRatePerHour.setColumns(10);
		
		JLabel lblHourPerDay = new JLabel("Hour Per Day:");
		lblHourPerDay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHourPerDay.setBounds(64, 137, 127, 20);
		frame.getContentPane().add(lblHourPerDay);
		
		txtHourPerDay = new JTextField();
		lblHourPerDay.setLabelFor(txtHourPerDay);
		txtHourPerDay.setBounds(210, 134, 120, 26);
		frame.getContentPane().add(txtHourPerDay);
		txtHourPerDay.setColumns(10);
		
		JLabel lblNumberOfDays = new JLabel("Number of days worked:");
		lblNumberOfDays.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfDays.setBounds(15, 173, 176, 20);
		frame.getContentPane().add(lblNumberOfDays);
		
		txtNumberOfDays = new JTextField();
		lblNumberOfDays.setLabelFor(txtNumberOfDays);
		txtNumberOfDays.setBounds(210, 170, 120, 26);
		frame.getContentPane().add(txtNumberOfDays);
		txtNumberOfDays.setColumns(10);
		
		JLabel lblGrossSalary = new JLabel("GROSS SALARY:");
		lblGrossSalary.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblGrossSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossSalary.setBounds(15, 220, 176, 36);
		frame.getContentPane().add(lblGrossSalary);
		
		txtGrossSalary = new JTextField();
		lblGrossSalary.setLabelFor(txtGrossSalary);
		txtGrossSalary.setEditable(false);
		txtGrossSalary.setBounds(210, 227, 120, 26);
		frame.getContentPane().add(txtGrossSalary);
		txtGrossSalary.setColumns(10);
		
		JLabel lblDeductionOfSalary = new JLabel("DEDUCTION OF SALARY:");
		lblDeductionOfSalary.setForeground(new Color(139, 0, 0));
		lblDeductionOfSalary.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDeductionOfSalary.setBounds(386, 65, 217, 20);
		frame.getContentPane().add(lblDeductionOfSalary);
		
		JLabel lblTaxOf = new JLabel("TAX  15% of Monthly Wage");
		lblTaxOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTaxOf.setBounds(369, 101, 206, 20);
		frame.getContentPane().add(lblTaxOf);
		
		txtTaxOf = new JTextField();
		lblTaxOf.setLabelFor(txtTaxOf);
		txtTaxOf.setEditable(false);
		txtTaxOf.setBounds(590, 98, 146, 26);
		frame.getContentPane().add(txtTaxOf);
		txtTaxOf.setColumns(10);
		
		txtPh = new JTextField();
		txtPh.setEditable(false);
		txtPh.setBounds(590, 134, 146, 26);
		frame.getContentPane().add(txtPh);
		txtPh.setColumns(10);
		
		txtSss = new JTextField();
		txtSss.setEditable(false);
		txtSss.setBounds(590, 170, 146, 26);
		frame.getContentPane().add(txtSss);
		txtSss.setColumns(10);
		
		txtTotalDeduction = new JTextField();
		txtTotalDeduction.setEditable(false);
		txtTotalDeduction.setBounds(590, 227, 146, 26);
		frame.getContentPane().add(txtTotalDeduction);
		txtTotalDeduction.setColumns(10);
		
		JLabel lblTotalDeduction = new JLabel("TOTAL DEDUCTION :");
		lblTotalDeduction.setLabelFor(txtTotalDeduction);
		lblTotalDeduction.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTotalDeduction.setBounds(369, 230, 220, 20);
		frame.getContentPane().add(lblTotalDeduction);
		
		lblGrossSalary_1 = new JLabel("Gross Salary :");
		lblGrossSalary_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossSalary_1.setBounds(786, 81, 99, 20);
		frame.getContentPane().add(lblGrossSalary_1);
		
		txtGrossSalary_1 = new JTextField();
		lblGrossSalary_1.setLabelFor(txtGrossSalary_1);
		txtGrossSalary_1.setEditable(false);
		txtGrossSalary_1.setBounds(913, 78, 123, 26);
		frame.getContentPane().add(txtGrossSalary_1);
		txtGrossSalary_1.setColumns(10);
		
		lblDeduction = new JLabel("Deduction :");
		lblDeduction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeduction.setBounds(786, 117, 99, 20);
		frame.getContentPane().add(lblDeduction);
		
		txtDeduction = new JTextField();
		lblDeduction.setLabelFor(txtDeduction);
		txtDeduction.setEditable(false);
		txtDeduction.setBounds(913, 114, 123, 26);
		frame.getContentPane().add(txtDeduction);
		txtDeduction.setColumns(10);
		
		lblNetSalary = new JLabel("NET SALARY :");
		lblNetSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNetSalary.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNetSalary.setBounds(751, 230, 159, 20);
		frame.getContentPane().add(lblNetSalary);
		
		txtNetSalary = new JTextField();
		lblNetSalary.setLabelFor(txtNetSalary);
		txtNetSalary.setEditable(false);
		txtNetSalary.setBounds(913, 227, 123, 26);
		frame.getContentPane().add(txtNetSalary);
		txtNetSalary.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				int ratePerHour = Integer.valueOf(txtRatePerHour.getText());
				int hourPerDay = Integer.valueOf(txtHourPerDay.getText());
				int numberOfDaysWorked = Integer.valueOf(txtNumberOfDays.getText());
				int grossSalary = ratePerHour*hourPerDay*numberOfDaysWorked;
				double tax = grossSalary * 0.15;
				double philHealth = grossSalary*0.05;
				double sss = grossSalary*0.02;
				double deduction = tax + philHealth + sss;
				double netSalary = grossSalary - deduction;
				txtTaxOf.setText(String.valueOf((int)tax));
				txtPh.setText(String.valueOf((int)philHealth));
				txtSss.setText(String.valueOf((int)sss));
				txtGrossSalary.setText(String.valueOf(grossSalary));
				txtGrossSalary_1.setText(String.valueOf(grossSalary));
				txtDeduction.setText(String.valueOf((int)deduction));
				txtTotalDeduction.setText(String.valueOf((int)deduction));
				txtNetSalary.setText(String.valueOf((int)netSalary));
			}
		});
		btnCompute.setBackground(new Color(47, 79, 79));
		btnCompute.setForeground(new Color(255, 255, 255));
		btnCompute.setBounds(422, 271, 193, 41);
		frame.getContentPane().add(btnCompute);
		
		lblPh = new JLabel("Philhealth 5%");
		lblPh.setLabelFor(txtPh);
		lblPh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPh.setBounds(476, 137, 99, 20);
		frame.getContentPane().add(lblPh);
		
		lblSss = new JLabel("SSS 2%");
		lblSss.setLabelFor(txtSss);
		lblSss.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSss.setBounds(506, 173, 69, 20);
		frame.getContentPane().add(lblSss);
	}
}
