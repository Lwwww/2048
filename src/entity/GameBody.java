package entity;

import java.util.Random;

import view.GamePanel;

public class GameBody {
	public int[][] array = new int[5][5];
	GamePanel gamePanel;
	
	Random random = new Random();
	
	public void moveUp() { 
		int isMoveAble=0,isMoved=0;
		for(int x=1;x<=4;x++)
		{
			do
			{
				isMoveAble=0;//移动一次就够啦
				for(int y=2;y<=4;y++)
				{
					if((array[x][y-1]==0 || array[x][y-1]==array[x][y]) && array[x][y]!=0)
					{
						array[x][y-1]+=array[x][y];
						array[x][y]=0;
						isMoveAble=1;
						isMoved=1;
					}
				}
			}
			while(isMoveAble!=0);
		}
		if(isMoved==1)
			newRandom();
	}
	public void moveDown() {
		int isMoveAble=0,isMoved=0;
		for(int x=1;x<=4;x++)
		{
			do
			{
				isMoveAble=0;
				for(int y=3;y>=1;y--)
				{
					if((array[x][y+1]==0 || array[x][y+1]==array[x][y]) && array[x][y]!=0)
					{
						array[x][y+1]+=array[x][y];
						array[x][y]=0;
						isMoveAble=1;
						isMoved=1;
					}
				}
			}
			while(isMoveAble!=0);
		}
		if(isMoved==1)
			newRandom();
	}
	public void moveRight() {
		int isMoveAble=0,isMoved=0;
		for(int y=1;y<=4;y++)
		{
			do
			{
				isMoveAble=0;
				for(int x=3;x>=1;x--)
				{
					if((array[x+1][y]==0 || array[x+1][y]==array[x][y]) && array[x][y]!=0)
					{
						array[x+1][y]+=array[x][y];
						array[x][y]=0;
						isMoveAble=1;
						isMoved=1;
					}
				}
			}
			while(isMoveAble!=0);
		}
		if(isMoved==1)
			newRandom();
	}
	public void moveLeft() {
		int isMoveAble=0,isMoved=0;
		for(int y=1;y<=4;y++)
		{
			do
			{
				isMoveAble=0;
				for(int x=2;x<=4;x++)
				{
					if((array[x-1][y]==0 || array[x-1][y]==array[x][y]) && array[x][y]!=0)
					{
						array[x-1][y]+=array[x][y];
						array[x][y]=0;
						isMoveAble=1;
						isMoved=1;
					}
				}
			}
			while(isMoveAble!=0);
		}
		if(isMoved==1)
			newRandom();
	}
	
	//产生一个新的2
	public void newRandom() {
		int x,y;
		do
		{
			y=Math.abs(random.nextInt())%4+1;
			x=Math.abs(random.nextInt())%4+1;
		}while(array[x][y]!=0);
		array[x][y]=2;
	}
	
	public void display() {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	//构造方法
	public GameBody(GamePanel gamePanel) {
		newRandom();
		newRandom();
		this.gamePanel = gamePanel;
	}
}
