import java.awt.*;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*; 


public class GamePanel extends JPanel implements Runnable{


static final int GAME_WIDTH = 1000; 
static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);

Thread gameThread;
Graphics graphics; 

GamePanel()
{
    this.setFocusable(true);
    this.setPreferredSize(SCREEN_SIZE);
    gameThread= new Thread(this);
    gameThread.start();
}


@Override
public void run() {
    // TODO Auto-generated method stub
    
}

    
}
