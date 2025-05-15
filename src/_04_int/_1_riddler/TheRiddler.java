package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String number1 = JOptionPane.showInputDialog("I am an odd number. Take away a letter and I am even."
				+ " What number am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(number1.equalsIgnoreCase("seven") || number1.equals("7")) {
				score +=1;
			JOptionPane.showMessageDialog(null, "Correct! your score is " + score + "!");
		}else {
			
			JOptionPane.showMessageDialog(null, "Wrong! Your score's still 0!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		String question2 = JOptionPane.showInputDialog("I have a bed but never sleep, a mouth but never speak, I run but "
				+"never walk, I have a bank but no money. What am I?");
		if(question2.toLowerCase().contains("river")) {
			score +=1;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " +score +"!");
		}else {
			
			JOptionPane.showMessageDialog(null, "Surely you must be an alien, HOW ON EARTH"
					+ "(Or some other planet) DID YOU NOT KNOW THAT! YOUR SCORE IS "+score+"!");
		}
		String finale = JOptionPane.showInputDialog("I have no life, but I can die. What am I?");
			if(finale.toLowerCase().contains("battery")) {
				score +=1;
				JOptionPane.showMessageDialog(null, "Correct Mi Amor! Your score is "+score+"!");
			}else {
				
				JOptionPane.showMessageDialog(null, "I acually don't blame you for once."
						+ " That riddles super hard. SIKE!. I DONT CARE HOW HARD IT IS IM STILL BLAMING YOU IDIOT. "
						+ "GO GET YOUR MONEY UP NOT YOUR FUNNY UP"+"Somehow, your score is "+score+". ARE YOU STUPID?!");
			}
			String imNotDoneWithU = JOptionPane.showInputDialog("What occurs once in a minute, twice in a moment, but never in 1,000,000 years?");
			if(imNotDoneWithU.contains("m")) {
				JOptionPane.showMessageDialog(null, 
						  "Alright, I've been nice to you, the player doing well for this whole time, and INSAINLY rude to \n"
						+ "the stupid player. Lets flip the script. \n\nYOU THINK YOUR BETTER THAN EVERYONE. YOU ARE ADOPETED \n"
						+ "BECAUSE YOUR PARENTS LEFT YOU BECAUSE YOU WeRe A SMART ALEC. YOU ARE A MIGIT, GO DIE IN A WHOLE. \nWISE GUY YOUR SCORE IS "+score);
			}else {
				
				JOptionPane.showMessageDialog(null, "I just finished screaming at the the smart player (As in not you cuz u stupid) and I don't have energy left. C"
						+ "onsider yourself blessed.");
			}
		// 6. Add some more riddles
			if(score>=3) {
				JOptionPane.showMessageDialog(null, "YOU SMARTALEC! YOUR SCORE IS "+score);
			}
			else if(score==2) {
				JOptionPane.showMessageDialog(null, "Your acutally normal. Your score is 2.");
			}
			else{
				JOptionPane.showMessageDialog(null, "YOUR ACTUALLY STUPID. >:( YOU GOT "+score+" RIGHT. IM ACTUALLY AT A LOSS FOR WORDS");
			}
		// 2. Make a pop up to show the score.
		
	}
}

