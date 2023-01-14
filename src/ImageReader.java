import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageReader {
    ImageReader() {
        try {
            JFrame f = new JFrame("test");
            JPanel panel = new JPanel();
            
            BufferedImage img = ImageIO.read(new File("background.png"));
            JComponent bg = new JLabel(new ImageIcon(img));
            panel.setBounds(0,0, 1000, 600);
            panel.add(bg);
            
            BufferedImage img1 = ImageIO.read(new File("paddle.png"));
            JComponent paddle1 = new JLabel(new ImageIcon(img1));
            JComponent paddle2 = new JLabel(new ImageIcon(img1));
            paddle1.setBounds(20, 300, 10, 80);
            paddle2.setBounds(970, 400, 10, 80);
            bg.add(paddle1);
            bg.add(paddle2);
            
            BufferedImage img2 = ImageIO.read(new File("ball.png"));
            JComponent ball = new JLabel(new ImageIcon(img1));
            ball.setBounds(550, 250, 10, 10);
            bg.add(ball);
            
            f.add(panel);
            f.setLayout(null);
            f.setVisible(true);
            f.getContentPane().setPreferredSize(new Dimension(1000,600));
            f.setResizable(false);
            f.pack();
        }
        catch(IOException printException) {}
    }
}