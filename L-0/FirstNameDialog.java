import javax.swing.*;

public class FirstNameDialog {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!");
		System.exit(0);
	}

}