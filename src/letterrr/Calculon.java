package letterrr;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculon extends JFrame{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_plus,b_minus,b_mult,b_div,b_change,b_equal,b_clear;
	String inout_string, next_operation_type;
	int first_num = 0;
	int second_flag = 0;
	JTextField inout;
	eHandler handler = new eHandler();
	
	public Calculon(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		b_plus = new JButton(" + ");
		b_minus = new JButton(" - ");
		b_mult = new JButton(" * ");
		b_div = new JButton(" / ");
		b_change = new JButton ("+/-");
		b_equal = new JButton ("=");
		b_clear = new JButton ("CE");
		inout = new JTextField(11);
		
		add (inout); add (b_clear);
		add (b1); add (b2); add (b3); add (b_div);
		add (b4); add (b5); add (b6); add (b_mult);
		add (b7); add (b8); add (b9); add (b_plus);
		add (b0); add (b_minus); add (b_equal); add (b_change);
		
		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b_minus.addActionListener(handler);
		b_equal.addActionListener(handler);
		b_change.addActionListener(handler);
		b_div.addActionListener(handler);
		b_mult.addActionListener(handler);
		b_plus.addActionListener(handler);
		b_equal.addActionListener(handler);
		b_change.addActionListener(handler);
		b_clear.addActionListener(handler);
		
	}
	
	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Pressed number key	
			if (e.getSource() == b0) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}				
				inout_string = inout.getText() + "0";
				inout.setText(inout_string);
			}
			if (e.getSource() == b1) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "1";
				inout.setText(inout_string);
			}
			if (e.getSource() == b2) { 
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "2";
				inout.setText(inout_string);
			}
			if (e.getSource() == b3) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "3";
				inout.setText(inout_string);
			}
			if (e.getSource() == b4) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "4";
				inout.setText(inout_string);
			}
			if (e.getSource() == b5) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "5";
				inout.setText(inout_string);
			}
			if (e.getSource() == b6) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "6";
				inout.setText(inout_string);
			}
			if (e.getSource() == b7) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "7";
				inout.setText(inout_string);
			}
			if (e.getSource() == b8) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "8";
				inout.setText(inout_string);
			}
			if (e.getSource() == b9) {
				if (first_num != 0 && second_flag == 1 ) { 
					inout.setText(null);
					second_flag = 0;
				}	
				inout_string = inout.getText() + "9";
				inout.setText(inout_string);
			}
			//
			// Pressed plus button
			//
			// next_operation_type
			// first_num - last operand
			// inout_string - inputed operand
			if ((e.getSource() == b_plus || e.getSource() == b_minus || e.getSource() == b_div || e.getSource() == b_mult || e.getSource() == b_equal) && inout.getText() != null) {
				inout_string = inout.getText();
				second_flag = 1;
				Mathem m = new Mathem();
				first_num = m.oper(next_operation_type, first_num, inout_string);
				
				if (e.getSource() == b_plus) { next_operation_type = "PLUS"; }
				if (e.getSource() == b_minus) { next_operation_type = "MINUS"; }
				if (e.getSource() == b_div) { next_operation_type = "DIV"; }
				if (e.getSource() == b_mult) { next_operation_type = "MULT"; }
				
				inout.setText(Integer.toString(first_num));		
				if (e.getSource() == b_equal) { next_operation_type = ""; first_num = 0; second_flag = 0; }
				
			}
			if (e.getSource() == b_change && inout.getText() != null) {
				inout_string = inout.getText();
				Mathem m = new Mathem();
				inout.setText(Integer.toString(m.oper("CHNG", first_num, inout_string)));
			}
			if (e.getSource() == b_clear) {
				inout.setText("");
				first_num = 0;
				second_flag = 0;
			}
			
			
		}
	}
}
