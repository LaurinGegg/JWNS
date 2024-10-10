package JWNS.src;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyImage {
    private String name;
    private Image img = null;

    public MyImage(String name) {
        this.name = name;
    }

    public Image get() {
        if (img == null)
            try {
                img = ImageIO.read(getClass().getResource("test.png"));
            } catch (IOException e) {

                e.printStackTrace();
            }
        ;

        return img;
    }

}