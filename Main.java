import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {

  public static void main(String avg[]) throws Exception {
   // BufferedImage img = ImageIO.read(new URL(
   //     "http://www.java2s.com/style/download.png"));
    ImageIcon icon = new ImageIcon("Dog1.png");
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setSize(1000, 1000);
    JLabel lbl = new JLabel();
    lbl.setIcon(icon);
    frame.add(lbl);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
