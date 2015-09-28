package letterrr;

import javax.swing.JOptionPane;

public class Mathem{
	public int oper(String oper_type, int last_num, String current_num) {
		
		//if(last_num == null) {
			//last_num = Integer.parseInt(current_num);
		//} else {
			if (oper_type == "PLUS") { last_num = last_num + Integer.parseInt(current_num); }
			if (oper_type == "MINUS") { last_num = last_num - Integer.parseInt(current_num); }
			if (oper_type == "MULT") { last_num = last_num * Integer.parseInt(current_num); }
			if (oper_type == "DIV") { last_num = last_num / Integer.parseInt(current_num); }
			if (oper_type == "CHNG") { last_num = Integer.parseInt(current_num); last_num *= -last_num; }
		//}
		//JOptionPane.showMessageDialog(null, "returned: " + last_num);
		return last_num;
		//return 0;
	}
}
