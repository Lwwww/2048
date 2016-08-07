package test;

import javax.swing.JFrame;

import contorll.Controller;
import entity.GameBody;
import view.GamePanel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GamePanel gamePanel = new GamePanel();
		GameBody gameBody = new GameBody(gamePanel);
		Controller controller = new Controller(gameBody,gamePanel);

		//创建窗体
		JFrame frame = new JFrame("Game2048");
		frame.setSize(409, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);

		//将图层添加到窗口上
		frame.add(gamePanel);

		//添加监听器
		frame.addKeyListener(controller);

		gamePanel.display(gameBody);
	}
}
