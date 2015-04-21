import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorGui implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField textfield1;
	private JTextField textfield2;
	private JButton button;
	
	    public CalculatorGui() {
		frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(250,130);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.BLUE);
		
		label=new JLabel();
		label.setText("Enter number ");
		output=new JLabel();
		output.setText("-----");
		label.setForeground(Color.BLACK);
		output.setForeground(Color.WHITE);
		
		textfield1=new JTextField(4);
		textfield2=new JTextField(4);
		
		button=new JButton("Find the Total of 2 numbers");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(button);
		panel.add(output);
		frame.add(panel);
	}
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textfield1.getText());
		double num2 = Double.parseDouble(textfield2.getText());
		double total = num1+num2;
		output.setText(String.valueOf(total));
		}
}
