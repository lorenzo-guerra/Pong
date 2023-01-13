import javax.swing.JFrame;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*; 


public class GameFrame extends JFrame {
    

    GamePanel panel;

    GameFrame()
    {
        panel = new GamePanel(); 
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }

}
