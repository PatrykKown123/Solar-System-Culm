import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PlanetButton extends JButton {

	private Color buttonColor;

	public PlanetButton(String label, Color c, int x, int y, int width, int height, ImageIcon gif) {
		super(label);

		buttonColor = c;
		// Inputs the width and height into the constructor of Dimension class
		Dimension size = new Dimension(width, height);
		// Sets the size of the button
		setPreferredSize(size);

		// Sets where the button will be and its width & height
		setBounds(x, y, width, height);

		// This fills the circular button and make it clickable, if it was true, then it
		// would make the square button clickable and it would be seen
		setContentAreaFilled(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// If the button is clicked it turns light Grey, if not then it stays as the
		// color of the programmers choice
		if (getModel().isArmed()) {
			g.setColor(Color.lightGray);
		} else {
			g.setColor(buttonColor);
		}

		// Draws the circle button and gets the width and height of the button
		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

		// Calls the parent's paint logic to draw the component
		super.paintComponent(g);
	}

	// Based on the button's correct circumference, this paints the border of it
	// It gets the width and height from "size" from the constructor in this class
	@Override
	protected void paintBorder(Graphics g) {
		g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	}

	Shape shape;

	// This method determines if the user missed the button or has clicked it
	// correctly. It calculates if the button was clicked.
	@Override
	public boolean contains(int x, int y) {
		if (shape == null) {
			shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return shape.contains(x, y);
	}
}
