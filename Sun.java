
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

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
		JLayeredPane layers = new JLayeredPane();
		layers.setLayout(null);
		JLabel desc = new JLabel("<html><H3>" + info + "</H3></html>");

		desc.setForeground(Color.WHITE);
		layers.add(imageLabel, new Integer(1));
		layers.add(desc, new Integer(2));

		imageLabel.setBounds(0, 0, width, height);

		desc.setBounds(0, 200, width - 30, height - 200);

		frame.add(layers);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}

	public String getShortInfo() {
		return shortInfo;
	}

	public void setShortInfo(String shortInfo) {
		this.shortInfo = shortInfo;
	}
}
