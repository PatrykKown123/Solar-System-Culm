
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sun {

	private String info, shortInfo;

	private final int width = 900, height = 600;

	public Sun(String wholeInfo, String shortInfo) {
		info = wholeInfo;
		this.shortInfo = shortInfo;
	}

	// Builds the Sun's JFrame when the sun is clicked
	public void bulidSunJFrame(BufferedReader fr) {
		JFrame frame = new JFrame("The Sun");

		frame.setSize(new Dimension(width, height));
		// Gets the ImageIcon and converts it to a Image and make it fit to the size of
		// the JFrame and then converts it back to a ImageIcon
		ImageIcon icon = new ImageIcon(Sun.class.getResource("Sun.jpg"));
		Image image = icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);

		JLabel imageLabel = new JLabel(icon);

		// frame.setContentPane(imageLabel);
		JLabel desc = new JLabel("<html>" + info + "</html>");

		frame.add(desc);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}
}
