package letterrr;

import javax.swing.JFrame;

public class Main {
	public static void main (String args[]){ 
		Calculon c = new Calculon("Calculon");
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(210, 200);
		c.setResizable(false);
		c.setLocationRelativeTo(null);
	}

}
