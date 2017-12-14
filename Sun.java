
import java.awt.Dimension;
import java.io.BufferedReader;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sun {

	private BufferedReader info, shortInfo;
	private int size;

	public Sun(BufferedReader fr, BufferedReader shortInfo) {
		info = fr;
		size = 1391400;
		this.shortInfo = shortInfo;
	}

	public void bulidSunJFrame() {
		JFrame frame = new JFrame("The Sun");
		JPanel panel = new JPanel();
		JLabel backGround = new JLabel(new ImageIcon(Sun.class.getResource("sun.jpg")));

		panel.add(backGround);
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setLayout(null);
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
	}

	public BufferedReader getInfo() {
		return info;
	}

	public void setInfo(BufferedReader info) {
		this.info = info;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public BufferedReader getShortInfo() {
		return shortInfo;
	}

	public void setShortInfo(BufferedReader shortInfo) {
		this.shortInfo = shortInfo;
	}
}
