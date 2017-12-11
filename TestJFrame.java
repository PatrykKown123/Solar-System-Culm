import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestJFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame("Anton's JFrame.");
		PlanetButton sun = new PlanetButton("Sun", Color.yellow, 0, 300, 250, 250);
		PlanetButton mercury = new PlanetButton("Mercury", Color.gray, 300, 408, 35, 35);
		PlanetButton venus = new PlanetButton("Venus", Color.DARK_GRAY, 380, 397, 55, 55);
		PlanetButton earth = new PlanetButton("Earth", Color.BLUE, 490, 395, 60, 60);
		PlanetButton mars = new PlanetButton("Mars", Color.red, 600, 403, 45, 45);
		PlanetButton jupiter = new PlanetButton("Jupiter", Color.cyan, 720, 377, 100, 100);
		PlanetButton saturn = new PlanetButton("Saturn", Color.YELLOW, 900, 383, 90, 90);
		PlanetButton uranus = new PlanetButton("Uranus", Color.blue, 1050, 390, 75, 75);
       		PlanetButton neptune = new PlanetButton("Neptune", Color.blue, 1175, 387, 75, 75);
		JPanel p = new JPanel();
		Container c = f.getContentPane();

		f.setSize(new Dimension(1400, 800));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p.setLayout(null);

		p.add(sun);
		p.add(mercury);
		p.add(venus);
		p.add(earth);
		p.add(mars);
		p.add(jupiter);
		p.add(saturn);
		p.add(uranus);
		p.add(neptune);

		f.add(p);
		p.setBackground(Color.BLACK);

		f.setVisible(true);
	}
}
