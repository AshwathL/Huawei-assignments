import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// creating a class bank
class Bank{
	
	public String calcyr(double amt){
		double result =0;
		return String.valueOf(result);
	}
	public String calcmn(double amt){
		double result1 =0;
		return String.valueOf(result1);
	}
}
//inheriting the class bank and implementing polymorphism
class Personal extends Bank{
	public String calcyr(double amt){				//polymorphism
		double calci = ((8*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		//float result = year;
		return String.valueOf(year);
	}
	public String calcmn(double amt){				//polymorphism
		double calci = ((8*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		double result = mon%12;
		return String.valueOf(result);
	}
}
//inheriting the class bank and implementing polymorphism
class Housing extends Bank{
	public String calcyr(double amt){				//polymorphism
		double calci = ((7*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		//float result = year;
		return String.valueOf(year);
	}
	public String calcmn(double amt){				//polymorphism
		double calci = ((7*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		double result = (int)mon%12;
		return String.valueOf(result);
	}
}
//inheriting the class bank and implementing polymorphism
class Gold extends Bank{
	public String calcyr(double amt){				//polymorphism
		double calci = ((240000*amt)/100);
		double mon = (40000*amt)/calci;
		double year = (int)(mon/12);
		//float result = year;
		return String.valueOf(year);
	}
	public String calcmn(double amt){				//polymorphism
		double calci = ((240000*amt)/100);
		double mon = (40000*amt)/calci;
		double year = (int)(mon/12);
		double result = (int)mon%12;
		return String.valueOf(result);
	}
}
//inheriting the class bank and implementing polymorphism
class Educational extends Bank{
	public String calcyr(double amt){				//polymorphism
		double calci = ((7*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		//float result = year;
		return String.valueOf(year);
	}
	public String calcmn(double amt){				//polymorphism
		double calci = ((7*amt)/100);
		double mon = amt/calci;
		double year = (int)(mon/12);
		double result = mon%12;
		return String.valueOf(result);
	}
}

public class intcalc {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intcalc window = new intcalc();
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
	public intcalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 665, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("INTEREST CALCULATOR");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(181, 38, 336, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Customer Name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(70, 86, 159, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(263, 93, 296, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your Bank Name");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(70, 127, 159, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 134, 296, 19);
		frame.getContentPane().add(textField_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(70, 168, 489, 76);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Select The Type Of Loan");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_3.setBounds(0, 10, 160, 22);
		panel.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Personal Loan");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(6, 38, 103, 32);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Housing Loan");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBounds(132, 38, 103, 32);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Gold Loan");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_2.setBounds(262, 38, 103, 32);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Educational Loan");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_3.setBounds(367, 38, 116, 32);
		panel.add(rdbtnNewRadioButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(70, 254, 489, 138);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Rate Of Interest");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Period Of Repayment in Years");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Loan Amount (if Gold Enter in grams)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton_1 = new JButton("<<CLEAR ALL>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("<<CALCULATE>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()==true) {
					Bank b1 = new Personal();
					double amt = Double.parseDouble(textField_2.getText());
					textField_3.setText("8");
					textField_4.setText(b1.calcyr(amt));
					textField_5.setText(b1.calcmn(amt));
				}
				else
					if (rdbtnNewRadioButton_1.isSelected()==true) {
						Bank b1 = new Housing();
						double amt = Double.parseDouble(textField_2.getText());
						textField_3.setText("7");
						textField_4.setText(b1.calcyr(amt));
						textField_5.setText(b1.calcmn(amt));
					}
					else
						if (rdbtnNewRadioButton_2.isSelected()==true) {
							Bank b1 = new Gold();
							double amt = Double.parseDouble(textField_2.getText());
							textField_3.setText("6");
							textField_4.setText(b1.calcyr(amt));
							textField_5.setText(b1.calcmn(amt));
						}
						else
							if (rdbtnNewRadioButton_3.isSelected()==true) {
								Bank b1 = new Educational();
								double amt = Double.parseDouble(textField_2.getText());
								textField_3.setText("7");
								textField_4.setText(b1.calcyr(amt));
								textField_5.setText(b1.calcmn(amt));
							}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Months");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addGap(8))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
									.addComponent(lblNewLabel_4_2_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
							.addGap(6)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4_2_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
	}
}
