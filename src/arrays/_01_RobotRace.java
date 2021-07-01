package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		boolean reachTop = false;
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			Robot rob = new Robot();
			rob.setY(500);
			rob.setAngle(0);
			rob.setX(i * 150 + 100);
			rob.setSpeed(100);
			robots[i] = rob;
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random ran = new Random();
		while (!reachTop) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(ran.nextInt(50));
				if (robots[i].getY() <= 0) {
					JOptionPane.showMessageDialog(null, "Congratulations to robot number " + i + " for winning. You deserve a party.");
					reachTop = true;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
