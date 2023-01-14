import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageReader {
    
    ImageReader() {}
    
    public JLabel addAsset(String assetName, int xPosition, int yPosition) {
        BufferedImage imageBuffer = null;
        try {
            imageBuffer = ImageIO.read(new File("assets/" + assetName));
        }
        catch(IOException printException) {}
        JLabel newAsset = new JLabel(new ImageIcon(imageBuffer));
        newAsset.setBounds(xPosition, yPosition, imageBuffer.getWidth(), imageBuffer.getHeight());
        return newAsset;
    }
}