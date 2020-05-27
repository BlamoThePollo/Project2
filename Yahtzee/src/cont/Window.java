package cont;

import javax.swing.JOptionPane;

public class Window {
	//Opens up a window displaying a message depending on the message parameter
	public static void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	//Opens up a window where a user can input a message
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	//Opens a window with different options with a message near the top
	public int option(String[] options, String msg, String string, int yesNoCancelOption) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	//System.out.prints a message into console per line
	public void println(String msg) {
		System.out.println(msg);
	}
	//System.out.prints a message into console on the same line
	public void print(String msg) {
		System.out.println(msg);
	}
	//Opens up a window displaying a message depending on the message parameter
	public void msg(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	//Opens up a window where a user can input a message
	public String in(Object msg) {
		return JOptionPane.showInputDialog(msg);
	}
	//Opens a window with different options with a message near the top
	public static int option(Object[] options, Object msg) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
}