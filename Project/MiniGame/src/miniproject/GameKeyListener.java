package miniproject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {
    GamePanelMaker gamePanel;

    public GameKeyListener(GamePanelMaker gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_RIGHT:{
                gamePanel.moveSquare(gamePanel.getLengthOfSquare(),0);
                break;
            }
            case KeyEvent.VK_LEFT:{
                gamePanel.moveSquare(-gamePanel.getLengthOfSquare(),0);
                break;
            }
            case KeyEvent.VK_UP:{
                gamePanel.moveSquare(0,-gamePanel.getLengthOfSquare());
                break;
            }
            case KeyEvent.VK_DOWN:{
                gamePanel.moveSquare(0,gamePanel.getLengthOfSquare());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
