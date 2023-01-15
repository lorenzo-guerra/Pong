import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.*;

public class MainWindow {
    JFrame windowObject = new JFrame("Pong");
    ImageReader imageConstructor = new ImageReader();
    JLabel background = imageConstructor.addAsset("background", "assets/background.png", 0, 0);
    int xVelocity = 10, yVelocity = 10;
    int xPosition = 500, yPosition = 300;
    JLabel ball = imageConstructor.addAsset("ball", "assets/ball.png", yPosition, xPosition);
    JLabel leftPaddle = imageConstructor.addAsset("leftPaddle", "assets/paddle.png", 20, 210);
    JLabel rightPaddle = imageConstructor.addAsset("rightPaddle", "assets/paddle.png", 970, 350);
    javax.swing.Timer updatePosition;
    
    ActionListener incrementPosition = new ActionListener () {
        public void actionPerformed(ActionEvent e) {
            xPosition += xVelocity;
            yPosition += yVelocity;
            if (xPosition + 10 == 1000 || xPosition == 0) {
                xVelocity *= -1;
            }
            if (yPosition + 10 == 600 || yPosition == 0 ) {
                yVelocity *= -1;
            }
            background.add(imageConstructor.addAsset("ball", "assets/ball.png", xPosition, yPosition));
        }
    };
    
    MainWindow() {
        ConstructWindow();
        updatePosition = new javax.swing.Timer(1, incrementPosition);
        updatePosition.start();

    }
    
    private void ConstructWindow() {
        windowObject.add(background);
        windowObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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