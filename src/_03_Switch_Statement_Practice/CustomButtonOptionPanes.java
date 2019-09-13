package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday" :
			System.out.println("Schools right around the corner");
		case "Monday" : 
			System.out.println("The weeks only just begun");
		case "Tuesday" :
			System.out.println("Eat up some tacos");
		case "Wedseday": 
			System.out.println("Its hump day");
		case "Thursday":
			System.out.println("Only one more day");
		case "Friday":
			System.out.println("Finally the end of the week");
		case "Saturday":
			System.out.println("Finally the weekend");
		
		}
	}
}
