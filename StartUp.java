import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class StartUp {

	public void createStartScreen() {
		JFrame f = new JFrame("Starting Screen");
		f.setSize(new Dimension(1400, 800));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setResizable(false);

		ImageIcon icon = new ImageIcon(StartUp.class.getResource("StartSScreen.png"));
		Image image = icon.getImage().getScaledInstance(1400, 800, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);
		JLabel l = new JLabel(icon);

		JLayeredPane layers = new JLayeredPane();
		layers.setLayout(null);
		layers.add(l, new Integer(1));

		JButton b = new JButton("Click to Continue");
		b.setBounds(600, 600, 130, 40);
		layers.add(b, new Integer(2));

		f.add(layers);

		addbutttonAction(b, f);
		f.setVisible(true);
	}

	public void addbutttonAction(JButton b, JFrame f) {
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// I did this to make sure when the start screen button is pressed, it creates
				// the main program, as intended.
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
				TestJFrame.showMainScreen();
			}
		});
	}
}
