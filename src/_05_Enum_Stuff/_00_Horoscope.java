package _05_Enum_Stuff;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	enum Zodiac {
		Aries, Taurus, Gemeni, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
	}

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public static void ZodiacEnum(Zodiac zc) {

		
		switch (zc) {
		case Aries:
			JOptionPane.showMessageDialog(null, "If u r happy u will make more money");
		case Taurus:
			JOptionPane.showMessageDialog(null, "U r going to be a normal human being");
		case Gemeni:
			JOptionPane.showMessageDialog(null, "Admit to cheating on your wife");
		case Cancer:
			JOptionPane.showMessageDialog(null, "Something about sports");
		case Leo:
			JOptionPane.showMessageDialog(null, "Pull a Micheal Scott on Sex. Ed");
		case Virgo:
			JOptionPane.showMessageDialog(null, "You are going to die alone");
		case Libra:
			JOptionPane.showMessageDialog(null, "You will doo... (Refer to Taurus)");
		case Scorpio:
			JOptionPane.showMessageDialog(null, "u don't need ur friends be an office drone for the rest of ur life");
		case Sagittarius:
			JOptionPane.showMessageDialog(null, "u r dead broke but who needs food when u have ur imagination");
		case Capricorn:
			JOptionPane.showMessageDialog(null, "Im sorry but i couldnt read this horrorscope cuz there was an ad with a mother smothering her daughter in the corner");
		case Aquarius:
			JOptionPane.showMessageDialog(null, "The reason ur life is failing is bcuz of u");
		case Pisces:
			JOptionPane.showMessageDialog(null, "INstead of being a normal person and dealing with ur porblems u should flood random stangers in ur life to help fix them(Dont do this this is horrible advice");
			
		}
	}
		// 3. Make a main method to test your method
		public static void main(String[] args) {
			Zodiac zodiac = Zodiac.Aries;
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			frame.add(panel);
			JButton button1 = new JButton();
			JButton button2 = new JButton();
			JButton button3 = new JButton();
			JButton button4 = new JButton();
			JButton button5 = new JButton();
			JButton button6 = new JButton();
			JButton button7 = new JButton();
			JButton button8 = new JButton();
			JButton button9 = new JButton();
			JButton button10 = new JButton();
			JButton button11 = new JButton();
			JButton button12 = new JButton();
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			panel.add(button10);
			panel.add(button11);
			panel.add(button12);
			button1.setText("Aries");
			button2.setText("Taurus");
			button3.setText("Gemeni");
			button4.setText("Cancer");
			button5.setText("Leo");
			button6.setText("Virgo");
			button7.setText("Libra");
			button8.setText("Scorpio");
			button9.setText("Sagittarius");
			button10.setText("Capricorn");
			button11.setText("Aquarius");
			button12.setText("Pisces");
//			button1.addActionListener(this);
//			button2.addActionListener(this);
//			button3.addActionListener(this);
//			button4.addActionListener(this);
//			button5.addActionListener(this);
//			button6.addActionListener(this);
//			button7.addActionListener(this);
//			button8.addActionListener(this);
//			button9.addActionListener(this);
//			button10.addActionListener(this);
//			button11.addActionListener(this);
//			button12.addActionListener(this);
			frame.pack();
			frame.setVisible(true);
		
			
			ZodiacEnum(zodiac);
		}
	
}
