package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String mother = "Amsome at... Being the best mom!";
	String papA = "Amsome at... Being awsome!";
	String sister = "Awsome at... Being nice (As in giving me M and Ms and popcorn :D)";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String question = JOptionPane.showInputDialog(null, "What is your name?");
	
	if(question.equalsIgnoreCase("Talia")){
		JOptionPane.showMessageDialog(null, sister);
	}
	if(question.contains("Sharon") || question.contains("mom")){
		JOptionPane.showMessageDialog(null, mother);
	}
	if(question.contains("dad") || question.equalsIgnoreCase("amit")||question.contains("father")) {
		JOptionPane.showMessageDialog(null, papA);
	}
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	
	}
}

