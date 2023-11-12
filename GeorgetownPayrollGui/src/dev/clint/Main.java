package dev.clint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField txtEmployeeName;
	private JTextField txtHourlySalary;
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
	private JButton btnProcess;
	private JLabel lblMonday;
	private JLabel lblTuesday;
	private JLabel lblWednesday;
	private JLabel lblThursday;
	private JLabel lblFriday;
	private JLabel lblSaturday;
	private JLabel lblSunday;
	private JButton btnNewButton;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblHours;
	private JLabel lblAmount;
	private JTextField textField_18;
	private JLabel lblNetPay;
	private JLabel lblRegular;
	private JLabel lblOvertime;

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
	static double[] getHours(double[] weekHours){
		double[] hours = new double[2];
		for(int i = 0 ; i< weekHours.length ; i++){
			if(weekHours[i] > 8){
				hours[1] += weekHours[i] - 8;
				hours[0] += 8;
			}
			else{
				hours[0] += weekHours[i];
			}
		}
		return hours;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1001, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 38, 949, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(60, 51, 131, 20);
		panel.add(lblEmployeeName);
		
		txtEmployeeName = new JTextField();
		lblEmployeeName.setLabelFor(txtEmployeeName);
		txtEmployeeName.setBounds(206, 48, 229, 26);
		panel.add(txtEmployeeName);
		txtEmployeeName.setColumns(10);
		
		JLabel lblHourlySalary = new JLabel("Hourly Salary:");
		lblHourlySalary.setBounds(471, 51, 101, 20);
		panel.add(lblHourlySalary);
		
		txtHourlySalary = new JTextField();
		txtHourlySalary.setBounds(587, 48, 208, 26);
		panel.add(txtHourlySalary);
		txtHourlySalary.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(15, 167, 949, 172);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstWeek = new JLabel("First Week:");
		lblFirstWeek.setBounds(34, 78, 103, 20);
		panel_1.add(lblFirstWeek);
		
		JLabel lblSecondWeek = new JLabel("Second Week:");
		lblSecondWeek.setBounds(34, 122, 103, 20);
		panel_1.add(lblSecondWeek);
		
		textField = new JTextField();
		textField.setBounds(137, 75, 87, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 75, 87, 26);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(341, 75, 87, 26);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(443, 75, 87, 26);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(545, 75, 87, 26);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(647, 75, 87, 26);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(749, 75, 87, 26);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(749, 116, 87, 26);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(647, 116, 87, 26);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(545, 116, 87, 26);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(443, 116, 87, 26);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(341, 116, 87, 26);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(239, 116, 87, 26);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(137, 116, 87, 26);
		panel_1.add(textField_13);
		
		lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(137, 39, 87, 26);
		panel_1.add(lblMonday);
		
		lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(239, 39, 87, 26);
		panel_1.add(lblTuesday);
		
		lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(341, 39, 87, 26);
		panel_1.add(lblWednesday);
		
		lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(443, 39, 87, 26);
		panel_1.add(lblThursday);
		
		lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(545, 39, 87, 26);
		panel_1.add(lblFriday);
		
		lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setBounds(647, 39, 87, 26);
		panel_1.add(lblSaturday);
		
		lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(749, 39, 87, 26);
		panel_1.add(lblSunday);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(15, 362, 949, 139);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		btnProcess = new JButton("Process It");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				double[] week1Hours = {Double.valueOf(textField.getText()),Double.valueOf(textField_1.getText()),Double.valueOf(textField_2.getText()),Double.valueOf(textField_3.getText()),Double.valueOf(textField_4.getText()),Double.valueOf(textField_5.getText()),Double.valueOf(textField_6.getText())};
				double[] week2Hours = {Double.valueOf(textField_13.getText()),Double.valueOf(textField_12.getText()),Double.valueOf(textField_11.getText()),Double.valueOf(textField_10.getText()),Double.valueOf(textField_9.getText()),Double.valueOf(textField_8.getText()),Double.valueOf(textField_7.getText())};
				double[] time = getHours(week1Hours);
				double[] time1 = getHours(week2Hours);
				double regularHours = time[0] + time1[0];
				double overtimeHours = time[1] + time1[1];
				double hourlySalary = Double.valueOf(txtHourlySalary.getText());
				double regularPay = regularHours * hourlySalary;
				double overtimePay = overtimeHours * hourlySalary;
				double netPay = regularPay + overtimePay;
				textField_14.setText(String.valueOf(regularHours));
				textField_15.setText(String.valueOf(regularPay));
				textField_16.setText(String.valueOf(overtimeHours));
				textField_17.setText(String.valueOf(overtimePay));
				textField_18.setText(String.valueOf(netPay));
			}
		});
		btnProcess.setBounds(15, 35, 121, 88);
		panel_2.add(btnProcess);
		
		btnNewButton = new JButton("Close");
		btnNewButton.setBounds(807, 35, 127, 88);
		panel_2.add(btnNewButton);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(285, 66, 87, 26);
		panel_2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(406, 66, 87, 26);
		panel_2.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(285, 97, 87, 26);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(406, 97, 87, 26);
		panel_2.add(textField_17);
		
		lblHours = new JLabel("Hours");
		lblHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblHours.setBounds(285, 35, 87, 26);
		panel_2.add(lblHours);
		
		lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(406, 35, 87, 26);
		panel_2.add(lblAmount);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(680, 66, 87, 26);
		panel_2.add(textField_18);
		
		lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetPay.setBounds(578, 66, 87, 26);
		panel_2.add(lblNetPay);
		
		lblRegular = new JLabel("Regular:");
		lblRegular.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegular.setBounds(170, 66, 87, 26);
		panel_2.add(lblRegular);
		
		lblOvertime = new JLabel("Overtime:");
		lblOvertime.setHorizontalAlignment(SwingConstants.CENTER);
		lblOvertime.setBounds(170, 97, 87, 26);
		panel_2.add(lblOvertime);
	}
}
