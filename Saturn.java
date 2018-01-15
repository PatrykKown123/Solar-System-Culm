import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Saturn {
	
	private String info, shortInfo;

	private final int width = 900, height = 600;

	public Saturn(String wholeInfo, String shortInfo) {
		info = wholeInfo;
		this.shortInfo = shortInfo;
	}

	public void bulidSaturnJFrame() {
		JFrame frame = new JFrame("Saturn");

		frame.setSize(new Dimension(width, height));

		// Gets the ImageIcon and converts it to a Image and make it fit to the size of
		// the JFrame and then converts it back to a ImageIcon
		ImageIcon icon = new ImageIcon(Sun.class.getResource("saturn.jpg"));
		Image image = icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);

		JLabel imageLabel = new JLabel(icon);
		JLayeredPane layers = new JLayeredPane();
		layers.setLayout(null);
		JLabel desc = new JLabel("<html><H3>" + info + "</H3></html>");

		// Changes the text to white
		desc.setForeground(Color.WHITE);

		// Adds the the image and the description to the JLayeredPane. JLayeredPane's
		// "add" method adds a component and takes a value to determine which layer to
		// put the component on. The higher the number (refer to the second augment of
		// add), it will be more on "top" of other layers. The lower, it means it will
		// be more on the "bottom" of the pane.
		layers.add(imageLabel, new Integer(1));
		layers.add(desc, new Integer(2));

		imageLabel.setBounds(0, 0, width, height);
		desc.setBounds(0, 200, width - 30, height - 200);

		// Adds the JLayeredPane to the JFrame
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
