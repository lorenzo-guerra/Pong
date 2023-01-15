import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.util.HashMap;

public class ImageReader {
    private HashMap<String, JLabel> imageCache = new HashMap();
    
    ImageReader() {}
    
    public JLabel addAsset(String assetName, String filePath, int xPosition, int yPosition) {
        BufferedImage imageBuffer = null;
        if (imageCache.get(assetName) == null) {
            try {
                imageBuffer = ImageIO.read(new File(filePath));
            }
            catch(IOException printException) {}
            JLabel newAsset = new JLabel(new ImageIcon(imageBuffer));
            newAsset.setBounds(xPosition, yPosition, imageBuffer.getWidth(), imageBuffer.getHeight());
            imageCache.put(assetName, newAsset);
            return newAsset;
        }
        JLabel asset = imageCache.get(assetName);
        asset.setBounds(xPosition, yPosition, asset.getWidth(), asset.getHeight());
        return asset;
    }
}