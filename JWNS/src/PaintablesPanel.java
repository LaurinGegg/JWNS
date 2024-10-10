package JWNS.src;

import java.util.*;

import JWNS.src.util.ShowInFrame;

public class PaintablesPanel extends SizedPanel {
    List<Paintable> pas;

    public PaintablesPanel(List<Paintable> pas) {
        this.pas = pas;
    }

    public void paintComponent(java.awt.Graphics g) {
        for (Paintable pa : pas) {
            pa.paintTo(g);
        }
    }

    public static void main(String[] args) {
        List<Paintable> ps = new ArrayList<Paintable>();
        ps.add(new PaintableOval(100, 50, 30, 50));
        ps.add(new PaintableOval(200, 100, 300, 100));
        ps.add(new PaintableOval(500, 100, 300, 500));

        ShowInFrame.show("Ovale", new PaintablesPanel(ps));
    }

}
