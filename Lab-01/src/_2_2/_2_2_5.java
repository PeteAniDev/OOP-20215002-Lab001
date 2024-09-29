package _2_2;

import javax.swing.JOptionPane;

public class _2_2_5 {

	public static void main(String[] args) {
		double a = readDouble("Please enter a number: ", "Input the first number");
		double b;
		do {
			b = readDouble("Please enter a non-zero number: ", "Input the second number");
		} while (b == 0);

		JOptionPane.showMessageDialog(null,
				String.format(
						"The sum of two numbers is: %.2f\n" + "The difference of two numbers is: %.2f\n"
								+ "The product of two numbers is: %.2f\n" + "The quotient of two numbers is: %.2f\n",
						a + b, Math.abs(a - b), a * b, a / b),
				"2.2.5", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	private static double readDouble(String msg, String title) {
		double d = 0;
		do {
			try {
				String n = JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
				d = Double.parseDouble(n);
			} catch (NumberFormatException e) {
				continue;
			}
			break;
		} while (true);
		return d;
	}

}
