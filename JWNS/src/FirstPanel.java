package JWNS.src;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {

    @Override

    public void paintComponent(java.awt.Graphics g) {
        g.fillRect(50, 50, 200, 200);
        g.fillOval(300, 200, 100, 1000);
        g.fill3DRect(500, 400, 200, 200, getFocusTraversalKeysEnabled());
        g.fillArc(600, 600, 200, 200, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}
