package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("Whats your birthday?");
		if(date.contains("April 23") ||   date.contains("4/23")){
			JOptionPane.showMessageDialog(null, "Happy Birthday! Get off the computer and do something fun!");
		}else {
			JOptionPane.showMessageDialog(null, "Merry UNbirthday!");
		}
	}
	
}
