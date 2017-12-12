import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJFrame {

	static PlanetButton sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;

	public static void main(String[] args) {
		// The JFrame
		JFrame f = new JFrame("Anton's JFrame.");

		// Here we make the buttons
		sun = new PlanetButton("Sun", Color.yellow, 0, 300, 250, 250, new ImageIcon(getClass().getClassLoader().getResource("")));
       		mercury = new PlanetButton("Mercury", Color.gray, 300, 408, 35, 35, new ImageIcon(getClass().getClassLoader().getResource("")));
        	venus = new PlanetButton("Venus", Color.DARK_GRAY, 380, 397, 55, 55, new ImageIcon(getClass().getClassLoader().getResource("")));
        	earth = new PlanetButton("Earth", Color.BLUE, 490, 395, 60, 60, new ImageIcon(getClass().getClassLoader().getResource("")));
        	mars = new PlanetButton("Mars", Color.red, 600, 403, 45, 45, new ImageIcon(getClass().getClassLoader().getResource("")));
        	jupiter = new PlanetButton("Jupiter", Color.cyan, 720, 377, 100, 100, new ImageIcon(getClass().getClassLoader().getResource("")));
        	saturn = new PlanetButton("Saturn", Color.YELLOW, 900, 383, 90, 90, new ImageIcon(getClass().getClassLoader().getResource("")));
        	uranus = new PlanetButton("Uranus", Color.blue, 1050, 390, 75, 75, new ImageIcon(getClass().getClassLoader().getResource("")));
        	neptune = new PlanetButton("Neptune", Color.blue, 1175, 387, 75, 75, new ImageIcon(getClass().getClassLoader().getResource("")));
		JPanel p = new JPanel();

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

		// sets the background color of the JFrame ot black
		p.setBackground(Color.BLACK);

		sunAction();
		mercuryAction();
		venusAction();
		earthAction();
		marsAction();
		jupiterAction();
		saturnAction();
		uranusAction();
		neptuneAction();

		// Makes the JFrame visible
		f.setVisible(true);
	}

	public static void sunAction() {
		sun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on the Sun");
			}
		});
	}

	public static void mercuryAction() {
		mercury.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Mercury");
			}
		});
	}

	public static void venusAction() {
		venus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Venus");
			}
		});
	}

	public static void earthAction() {
		earth.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Earth");
			}
		});
	}

	public static void marsAction() {
		mars.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Mars");
			}
		});
	}

	public static void jupiterAction() {
		jupiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Jupiter");
			}
		});
	}

	public static void saturnAction() {
		saturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Saturn");
			}
		});
	}

	public static void uranusAction() {
		uranus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Uranus");
			}
		});
	}

	public static void neptuneAction() {
		neptune.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You clicked on Neptune");
			}
		});
	}
}
