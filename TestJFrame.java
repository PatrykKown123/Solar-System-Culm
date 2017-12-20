
import culminating.Mercury;
import culminating.Venus;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestJFrame {

    static PlanetButton sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;

    public static void main(String[] args) throws IOException {

        BufferedReader descBR = new BufferedReader(
                new InputStreamReader(TestJFrame.class.getResourceAsStream("sun facts.txt")));

        BufferedReader descBR2 = new BufferedReader(
                new InputStreamReader(TestJFrame.class.getResourceAsStream("mercury facts.txt")));

        BufferedReader descBR3 = new BufferedReader(
                new InputStreamReader(TestJFrame.class.getResourceAsStream("venus facts.txt")));

        // The JFrame
        JFrame f = new JFrame("Anton's JFrame.");

        // Here we make the buttons
        sun = new PlanetButton("Sun", Color.yellow, 0, 300, 250, 250,
                new ImageIcon(TestJFrame.class.getResource("sun2.jpg")));

        mercury = new PlanetButton("Mercury", Color.gray, 300, 408, 35, 35,
                new ImageIcon(TestJFrame.class.getResource("mercury.jpg")));

        venus = new PlanetButton("Venus", Color.DARK_GRAY, 380, 397, 55, 55,
                new ImageIcon(TestJFrame.class.getResource("venus.jpg")));

        earth = new PlanetButton("Earth", Color.BLUE, 490, 395, 60, 60,
                new ImageIcon(TestJFrame.class.getResource("earth.jpg")));

        mars = new PlanetButton("Mars", Color.red, 600, 403, 45, 45,
                new ImageIcon(TestJFrame.class.getResource("mars.jpg")));

        jupiter = new PlanetButton("Jupiter", Color.cyan, 720, 377, 100, 100,
                new ImageIcon(TestJFrame.class.getResource("jupiter.jpg")));

        saturn = new PlanetButton("Saturn", Color.YELLOW, 900, 383, 90, 90,
                new ImageIcon(TestJFrame.class.getResource("saturn.jpg")));

        uranus = new PlanetButton("Uranus", Color.blue, 1050, 390, 75, 75,
                new ImageIcon(TestJFrame.class.getResource("uranus.jpg")));

        neptune = new PlanetButton("Neptune", Color.blue, 1175, 387, 75, 75,
                new ImageIcon(TestJFrame.class.getResource("neptune.jpg")));
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

        sunAction(descBR);
        mercuryAction(descBR2);
        venusAction(descBR3);
        earthAction();
        marsAction();
        jupiterAction();
        saturnAction();
        uranusAction();
        neptuneAction();

        // Makes the JFrame visible
        f.setVisible(true);
    }

    public static void sunAction(BufferedReader fr) {
        sun.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String desc = "";
                String shortInfo = "";
                String line = null;
                boolean foundATSymbol = false;

                try {
                    // Reads from the text file
                    // This reads everything and the short description too
                    while ((line = fr.readLine()) != null) {
                        desc += line;
                        if (line.contains("@")) {
                            foundATSymbol = true;
                        }
                        if (!foundATSymbol) {
                            shortInfo += line;
                        }
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                // Replaces the @ character in the text file with and empty string so that the
                // character won't pop up in the description
                desc = desc.replace("@", "");

                Sun s = new Sun(desc, shortInfo);

                s.bulidSunJFrame(fr);
            }
        });
    }

    public static void mercuryAction(BufferedReader fr) {
        mercury.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String desc = "";
                String shortInfo = "";
                String line = null;
                boolean foundATSymbol = false;

                try {

                    // Reads from the text file
                    // This reads everything and the short description too
                    while ((line = fr.readLine()) != null) {
                        desc += line;
                        if (line.contains("@")) {
                            foundATSymbol = true;
                        }
                        if (!foundATSymbol) {
                            shortInfo += line;
                        }
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                // Replaces the @ character in the text file with and empty string so that the
                // character won't pop up in the description
                desc = desc.replace("@", "");

                Mercury mer = new Mercury(desc, shortInfo);

                mer.bulidMercuryJFrame(fr);
            }
        });
    }

    public static void venusAction(BufferedReader fr) {
        venus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String desc = "";
                String shortInfo = "";
                String line = null;
                boolean foundATSymbol = false;

                try {

                    // Reads from the text file
                    // This reads everything and the short description too
                    while ((line = fr.readLine()) != null) {
                        desc += line;
                        if (line.contains("@")) {
                            foundATSymbol = true;
                        }
                        if (!foundATSymbol) {
                            shortInfo += line;
                        }
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                // Replaces the @ character in the text file with and empty string so that the
                // character won't pop up in the description
                desc = desc.replace("@", "");

                Venus ven = new Venus(desc, shortInfo);

                ven.bulidVenusJFrame(fr);
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
