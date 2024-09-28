import javax.swing.*;

public class ShowTwoNumbers {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog(null, "Please enter the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String n2 = JOptionPane.showInputDialog(null, "Please enter the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "You've just entered " + n1 + " and " + n2, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}