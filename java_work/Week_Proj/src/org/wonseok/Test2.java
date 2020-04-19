package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;




class MoveCh2 extends JFrame implements Runnable, KeyListener {

	final int windowX = 1000;
	final int windowY = 1000;
	final int monsterMoveRadius = 20;
	final int bulletSpped = 10;
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeySpace = false;
	
	JFrame mainFrame;
	JPanel mainPane = new JPanel();
	JPanel contentpane = new JPanel();
	JPanel scorepane = new JPanel();
	Icon icon = new ImageIcon("src/image/enemy3.gif");
	JLabel enemy = new JLabel(icon);
	
	Image playerImg;
	Image enemyImg;
	Image rocketImg;
	
	
	int direct = 0;
	
	Timer bulletTimer = null;
	
	int score = 0;
	
	JLabel[] stage1 = new JLabel[3];
	JLabel scoreLabel = new JLabel("점수 : " + score);
	

	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	
	Thread th;
	
	Image buffImage;
	Graphics buffg;
	int px,py;
	int MonsterCount = 10;
	int cnt=0;
	final int FLYING_UNIT = 10;
	public MoveCh2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		th = new Thread(this);
		th.start();
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout());
		contentpane.setSize(windowX, windowY);
		scorepane.setSize(300, windowY);
		this.setSize(windowX+300, windowY);
		this.setVisible(true);
		addKeyListener(this);
		mainPane.add(contentpane, BorderLayout.CENTER);
		scorepane.add(scoreLabel);
		mainPane.add(scorepane,BorderLayout.EAST);
	}
	
	public void init()
	{
		px = 300;
		py = 300;
		playerImg = new ImageIcon("src/image/bullet.jpg").getImage();
		enemyImg = new ImageIcon("src/image/enemy1.gif").getImage();
		rocketImg = new ImageIcon("src/image/bullet2.jpg").getImage();
	}
	
	void makeEnemy()
	{
		enemies.add(new Enemy(enemyImg, (int) (Math.random() *500)+50, (int) (Math.random() * 500)+50));
		
	}
	
	@Override
	public void paint(Graphics g) {
		buffImage = createImage(800, 800);
		buffg = buffImage.getGraphics();
		update(g);
	}
	
	@Override
	public void update(Graphics g) {
		drawEnemy();
		drawPlayer();
		drawRocket();
		g.drawImage(buffImage, 0, 0, this);
	}
	
	public void drawPlayer()
	{
		buffg.drawImage(playerImg, px, py, this);
	}
	
	public void drawEnemy() {
		for(int i=0; i<enemies.size(); i++)
		{
			Enemy e = (Enemy)enemies.get(i);
			buffg.drawImage(enemyImg, e.x, e.y, this);

		}
	}
	public void drawRocket()
	{
		for(int i=0; i<rockets.size(); i++)
		{
			Rocket r = (Rocket)rockets.get(i);
			buffg.drawImage(rocketImg, r.x, r.y, this);
		}
	}

	public void RocketP()
	{
		if(KeySpace)
		{
			Rocket r = new Rocket(rocketImg, px, py, direct);
			rockets.add(r);
			
		}
		for(int i=0; i<rockets.size(); i++)
		{
			Rocket r = (Rocket)rockets.get(i);
			r.move();
			if(r.x<0||r.x>800||r.y<20||r.y>800)
			{
				rockets.remove(i);
			}
			for(int j=0; j<enemies.size(); j++)
			{
				Enemy e = (Enemy)enemies.get(j);
				
				if(Math.abs(r.x-e.x)<20&&Math.abs(r.y-e.y)<20)
					{
						rockets.remove(i);
						enemies.remove(j);
						if(enemies.size()==0)
						{
							System.out.println("다음 스테이지로~");
						}
					}
			}
		}
	}

	@Override
	public void run() {
		try {
			while(true)
			{
				while(cnt<MonsterCount) {
					makeEnemy();
					cnt++;
				}
				moveEnemy();
				KeyProcess();
				RocketP();
				repaint();
				Thread.sleep(50);
			}
		}catch(Exception e)
		{
			
		}
	}
	public void moveEnemy()
	{

		for(int i=0; i<enemies.size(); i++)
		{
			Enemy e = enemies.get(i);
			e.move();
		
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP :
		KeyUp = true;
		direct = 1;
		break;
		case KeyEvent.VK_DOWN :
		KeyDown = true;
		direct = 2;
		break;
		case KeyEvent.VK_LEFT :
		KeyLeft = true;
		direct = 4;
		break;
		case KeyEvent.VK_RIGHT :
		KeyRight = true;
		direct = 3;
		break;

		case KeyEvent.VK_SPACE :
		KeySpace = true;
		break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP :
		KeyUp = false;
		break;
		case KeyEvent.VK_DOWN :
		KeyDown = false;
		break;
		case KeyEvent.VK_LEFT :
		KeyLeft = false;
		break;
		case KeyEvent.VK_RIGHT :
		KeyRight = false;
		break;

		case KeyEvent.VK_SPACE :
		KeySpace = false;
		break;

		}
		
	}
	public void KeyProcess() {
		if (KeyUp == true) {
			if (py > 40)
				py -= 5;
		}
		if (KeyDown == true) {
			if (py + playerImg.getHeight(null) < 800)
				py += 5;
		}
		if (KeyLeft == true) {
			if (px > 0)
				px -= 5;
		}
		if (KeyRight == true) {
			if (px + playerImg.getWidth(null) < 800)
				px += 5;
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}

class Rocket
{
	Image img;
	int x,y,w,h;
	int width, height;
	int dir;
	public Rocket(Image rocketImg, int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.img = rocketImg;
		this.dir = dir;
	}
	public void move()
	{
		switch(dir)
		{
		case 1:
			this.y -= 10;
			break;
		case 2:
			this.y += 10;
			break;
		case 3:
			this.x += 10;
			break;
		case 4:
			this.x -= 10;
			break;
		}
	}
}

class Enemy{
	Image img;
	int x,y, w, h;
	int width, height;
	public Enemy(Image enemyImg, int i, int j) {
		this.x = i;
		this.y = j;
		this.img = enemyImg;
	}
	public void move() {
		int ran = (int)(Math.random()*2);
		int tmpx,tmpy;
		if(ran==1) {
			tmpx = this.x + (int) (Math.random() * 10); 
			tmpy = this.y + (int) (Math.random() * 10);
		}
		else
		{
			tmpx = this.x - (int) (Math.random() * 10); 
			tmpy = this.y - (int) (Math.random() * 10);
		}
		if(tmpx<800&&tmpy<800&&tmpx>0&&tmpy>40)
		{
			this.x = tmpx;
			this.y = tmpy;
		}
		else
		{
			move();
		}
	}
}




public class Test2 extends Thread{

	public static void main(String[] args) {
		new MoveCh2();

	}
}
