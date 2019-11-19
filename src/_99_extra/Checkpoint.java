package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String Input = JOptionPane.showInputDialog("What Is Your Favorite Color");
			JOptionPane.showMessageDialog(null, Input +  "Is My Favorite Color");
			
			Robot r2d2 = new Robot ();
			r2d2.penDown();
			r2d2.setSpeed(150);
			for (int i = 0 ; i < 4 ; i++ ) {
			r2d2.move(200);
			r2d2.turn(120); }
}
}
