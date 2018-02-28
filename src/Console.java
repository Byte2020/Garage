
import javax.swing.JOptionPane;

public class Console {

	public static void main(String[] args) {
		Object[] options = {  "Check in", "Check out","create new garage", "register new vehicule", "print garage historic" };
		JOptionPane frame = new JOptionPane("GARAGE 1.0");

		int num = JOptionPane.showOptionDialog(frame, "What do you want?", "CRYPTOBUD", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
	}

}
