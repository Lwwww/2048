package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import entity.GameBody;


public class GamePanel extends JPanel{
	
	GameBody gameBody;
	Color BG_COLOR = new Color(0xbbada0);
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(BG_COLOR);
		g.fillRect(0, 0, this.getSize().width, this.getSize().height);
		g.setFont(new Font("Arial",Font.BOLD, 35));
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				drawTile(j,i,gameBody.array[j][i],g);
			}
		}
	}

	
	public void drawTile(int x,int y,int value,Graphics g) {
		int i=x,j=y;
		x=x*100-60;
		y=y*100-40;
		int fix=10;
		Color fontColor =new Color(0x776e65);
		g.setColor(getBackground(value));
		g.fillRoundRect(i*100-90, j*100-90, 80, 80, 20, 20);
		switch (value) {
			case 2:
				
			case 4:
				
			case 8:
				
				break;
			case 16:
				
			case 32:
				
			case 64:
				x-=fix;
				fontColor=Color.WHITE;
				break;
			case 128:
			
			case 256:
			
			case 512:
				
				x-=2*fix;
				fontColor=Color.WHITE;
				break;
			case 1024:
			
			case 2048:
			
			default:
				x-=3*fix;
				fontColor=Color.WHITE;
				break;
			
		}
		g.setColor(Color.BLACK);
		if(gameBody.array[i][j]!=0)
		{
			g.setColor(fontColor);
			g.drawString(gameBody.array[i][j]+"", x, y);
		}
	}
	
	public Color getBackground(int value) {
		switch (value) {
			case 2:
				return new Color(0xeee4da);
			case 4:
				return new Color(0xede0c8);
			case 8:
				return new Color(0xf2b179);
			case 16:
				return new Color(0xf59563);
			case 32:
				return new Color(0xf67c5f);
			case 64:
				return new Color(0xf65e3b);
			case 128:
				return new Color(0xedcf72);
			case 256:
				return new Color(0xedcc61);
			case 512:
				return new Color(0xedc850);
			case 1024:
				return new Color(0xedc53f);
			case 2048:
				return new Color(0xedc22e);
			case 4096:
				return new Color(0x65da92);
			case 8192:
				return new Color(0x5abc65);
			case 16384:
				return new Color(0x248c51);
			default:
				return new Color(0xcdc1b4);
		}
	}
	
	//传入对象
	public void display(GameBody gameBody) {
		this.gameBody = gameBody;
		repaint();
	}
}
