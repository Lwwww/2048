package contorll;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entity.GameBody;
import view.GamePanel;

public class Controller implements KeyListener{

	GameBody gameBody = null;
	GamePanel gamePanel;
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			gameBody.moveUp();
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:
			gameBody.moveLeft();
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			gameBody.moveDown();
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			gameBody.moveRight();
			break;
		}
		//gameBody.display();
		gamePanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Controller(GameBody gameBody,GamePanel gamePanel) {
		this.gameBody = gameBody;
		this.gamePanel = gamePanel;
	}
}
