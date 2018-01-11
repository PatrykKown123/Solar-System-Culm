
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.AttributedCharacterIterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestJFrame {

	static PlanetButton sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;

	static Sun sunInfo = null;
	static Mercury merInfo = null;
	static Venus venusInfo = null;
	static Earth earthInfo = null;
	static Mars marsInfo = null;

	public static void main(String[] args) throws IOException {

		BufferedReader descBR = new BufferedReader(
				new InputStreamReader(TestJFrame.class.getResourceAsStream("sun facts.txt")));

		BufferedReader descBR2 = new BufferedReader(
				new InputStreamReader(TestJFrame.class.getResourceAsStream("mercury facts.txt")));

		BufferedReader descBR3 = new BufferedReader(
				new InputStreamReader(TestJFrame.class.getResourceAsStream("venus facts.txt")));

		BufferedReader descBR4 = new BufferedReader(
				new InputStreamReader(TestJFrame.class.getResourceAsStream("earth facts.txt")));

		BufferedReader descBR5 = new BufferedReader(
				new InputStreamReader(TestJFrame.class.getResourceAsStream("mars facts.txt")));

		// The JFrame
		JFrame f = new JFrame("Anton's & Patryk's culminating.");

		// Here we make the buttons
		sun = new PlanetButton("Sun", Color.black, 0, 300, 250, 250,
				new ImageIcon(TestJFrame.class.getResource("Sun.png")));

		mercury = new PlanetButton("Mercury", Color.black, 300, 408, 35, 35,
				new ImageIcon(TestJFrame.class.getResource("mercury.png")));

		venus = new PlanetButton("Venus", Color.black, 380, 397, 55, 55,
				new ImageIcon(TestJFrame.class.getResource("venus.png")));

		earth = new PlanetButton("Earth", Color.black, 490, 395, 60, 60,
				new ImageIcon(TestJFrame.class.getResource("earth.png")));

		mars = new PlanetButton("Mars", Color.black, 600, 403, 45, 45,
				new ImageIcon(TestJFrame.class.getResource("mars.png")));

		jupiter = new PlanetButton("Jupiter", Color.black, 700, 367, 118, 118,
				new ImageIcon(TestJFrame.class.getResource("jupiter.png")));

		saturn = new PlanetButton("Saturn", Color.black, 870, 373, 120, 120,
				new ImageIcon(TestJFrame.class.getResource("saturn.png")));

		uranus = new PlanetButton("Uranus", Color.black, 1050, 390, 75, 75,
				new ImageIcon(TestJFrame.class.getResource("uranus.png")));

		neptune = new PlanetButton("Neptune", Color.black, 1175, 387, 75, 75,
				new ImageIcon(TestJFrame.class.getResource("neptune.png")));

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon(TestJFrame.class.getResource("SpaceBackground.png")));

		// Sets the size of the JFrame by pixels
		f.setSize(new Dimension(1400, 800));

		// Sets the JFrame to the center of the screen
		f.setLocationRelativeTo(null);

		// Makes the red X button on the corner of the JFrame close and terminate the
		// program
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Makes the JPanel fill all of the JFrame so you can position components
		p.setLayout(null);

		// Adds the buttons to the panel
		p.add(sun);
		p.add(mercury);
		p.add(venus);
		p.add(earth);
		p.add(mars);
		p.add(jupiter);
		p.add(saturn);
		p.add(uranus);
		p.add(neptune);

		// Adds the panel to the JFrame, with all the buttons on it
		f.add(p);

		// Stores the information into variables and make the buttons clickable
		sunInfo = getSunInfo(descBR);
		addSunAction();

		merInfo = getMercuryInfo(descBR2);
		addMercuryAction();

		venusInfo = getVenusInfo(descBR3);
		addVenusAction();

		earthInfo = getEarthInfo(descBR4);
		addEarthAction();

		marsInfo = getMarsInfo(descBR5);
		addMarsAction();

		addJupiterAction();
		addSaturnAction();
		addUranusAction();
		addNeptuneAction();

		// Displays the information when you put your mouse over the planet
		sun.setToolTipText(sunInfo.getShortInfo());
		mercury.setToolTipText(merInfo.getShortInfo());
		venus.setToolTipText(venusInfo.getShortInfo());
		earth.setToolTipText(earthInfo.getShortInfo());
		mars.setToolTipText(marsInfo.getShortInfo());

		// Makes the JFrame visible
		f.setVisible(true);
	}

	static Sun getSunInfo(BufferedReader fr) {
		String desc = "";
		String shortInfo = "";
		String line = null;
		boolean foundATSymbol = false;

		try {
			// Reads from the text file
			// This reads everything and the short description as well
			while ((line = fr.readLine()) != null) {
				desc += line;
				if (line.contains("@")) {
					foundATSymbol = true;
				}
				if (!foundATSymbol) {
					shortInfo += "<br>" + line;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Replaces the @ character in the text file with and empty string so that the
		// character won't pop up in the description
		desc = desc.replace("@", "");

		return new Sun(desc, "<html>" + shortInfo + "</html>");
	}

	public static void addSunAction() {
		sun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sunInfo.bulidSunJFrame();
			}
		});
	}

	public static Mercury getMercuryInfo(BufferedReader fr) {
		String desc = "";
		String shortInfo = "";
		String line = null;
		boolean foundATSymbol = false;

		try {

			// Reads from the text file
			// This reads everything and the short description as well
			while ((line = fr.readLine()) != null) {
				desc += line;
				if (line.contains("@")) {
					foundATSymbol = true;
				}
				if (!foundATSymbol) {
					shortInfo += "<br>" + line;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Replaces the @ character in the text file with and empty string so that the
		// character won't pop up in the description
		desc = desc.replace("@", "");

		return new Mercury(desc, "<html>" + shortInfo + "</html>");
	}

	public static void addMercuryAction() {
		mercury.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				merInfo.bulidMercuryJFrame();
			}
		});
	}

	public static Venus getVenusInfo(BufferedReader fr) {
		String desc = "";
		String shortInfo = "";
		String line = null;
		boolean foundATSymbol = false;

		try {

			// Reads from the text file
			// This reads everything and the short description as well
			while ((line = fr.readLine()) != null) {
				desc += line;
				if (line.contains("@")) {
					foundATSymbol = true;
				}
				if (!foundATSymbol) {
					shortInfo += "<br>" + line;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Replaces the @ character in the text file with and empty string so that the
		// character won't pop up in the description
		desc = desc.replace("@", "");

		return new Venus(desc, "<html>" + shortInfo + "</html>");

	}

	public static void addVenusAction() {
		venus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				venusInfo.bulidVenusJFrame();
			}
		});
	}

	public static Earth getEarthInfo(BufferedReader fr) {
		String desc = "";
		String shortInfo = "";
		String line = null;
		boolean foundATSymbol = false;

		try {

			// Reads from the text file
			// This reads everything and the short description as well
			while ((line = fr.readLine()) != null) {
				desc += line;
				if (line.contains("@")) {
					foundATSymbol = true;
				}
				if (!foundATSymbol) {
					shortInfo += "<br>" + line;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Replaces the @ character in the text file with and empty string so that the
		// character won't pop up in the description
		desc = desc.replace("@", "");

		return new Earth(desc, "<html>" + shortInfo + "</html>");
	}

	public static void addEarthAction() {
		earth.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				earthInfo.bulidEarthJFrame();
			}
		});
	}

	public static Mars getMarsInfo(BufferedReader fr) {
		String desc = "";
		String shortInfo = "";
		String line = null;
		boolean foundATSymbol = false;

		try {

			// Reads from the text file
			// This reads everything and the short description as well
			while ((line = fr.readLine()) != null) {
				desc += line;
				if (line.contains("@")) {
					foundATSymbol = true;
				}
				if (!foundATSymbol) {
					shortInfo += "<br>" + line;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Replaces the @ character in the text file with and empty string so that the
		// character won't pop up in the description
		desc = desc.replace("@", "");

		return new Mars(desc, "<html>" + shortInfo + "</html>");
	}

	public static void addMarsAction() {
		mars.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				marsInfo.bulidMarsJFrame();
			}
		});
	}

	public static void addJupiterAction() {
		jupiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Jupiter");
			}
		});
	}

	public static void addSaturnAction() {
		saturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Saturn");
			}
		});
	}

	public static void addUranusAction() {
		uranus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Uranus");
			}
		});
	}

	public static void addNeptuneAction() {
		neptune.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Neptune");
			}
		});
	}
}
