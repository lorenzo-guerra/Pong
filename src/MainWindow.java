import java.awt.*;
import javax.swing.*;
import java.io.*;

public class MainWindow {
    JFrame windowObject = new JFrame("Pong");
    ImageReader imageConstructor = new ImageReader();
    JLabel background = imageConstructor.addAsset("background.png", 0, 0);
    JLabel ball = imageConstructor.addAsset("ball.png", 500, 300);
    JLabel leftPaddle = imageConstructor.addAsset("paddle.png", 20, 210);
    JLabel rightPaddle = imageConstructor.addAsset("paddle.png", 970, 350);
    
    MainWindow() {
        ConstructWindow();
    }
    
    private void ConstructWindow() {
        windowObject.add(background);
        background.add(ball);
        background.add(leftPaddle);
        background.add(rightPaddle);
        windowObject.add(background);
        windowObject.setLayout(null);
        windowObject.getContentPane().setPreferredSize(new Dimension(1000, 600));
        windowObject.setResizable(false);
        windowObject.pack();
        windowObject.setVisible(true);
    }
}