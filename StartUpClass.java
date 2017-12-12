package startupclass;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartUpClass {

    private String runTimeInfo;

    public StartUpClass(String runTimeInfo) {

        this.runTimeInfo = runTimeInfo;
    }

    public void buildFrame() {

        JFrame screen = new JFrame("StartUpClass");

        JPanel panel = new JPanel();

        JLabel label = new JLabel();

        panel.add(label);

        screen.add(panel);

        panel.setLayout(null);

        screen.setSize(new Dimension(1400, 800));

        screen.setLocationRelativeTo(null);

        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screen.setVisible(true);

    }

    public void DisplayStars() {
        
       // add star gif heretonight
             
    }

}

