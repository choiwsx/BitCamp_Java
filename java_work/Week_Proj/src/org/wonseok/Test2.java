package org.wonseok;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

class MoveCh2 extends JFrame implements Runnable, KeyListener {

	public static Connection conn = Test_jdbc.getConnection();
	public static PreparedStatement pstmt;
	public static String sql;
	static{
	sql = "UPDATE PLAYER SET TIME=?, SCORE=? WHERE NAME=?";
	}
	final int windowX = 800;
	final int windowY = 800;
	final int monsterMoveRadius = 20;
	final int bulletSpped = 10;

	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeySpace = false;
	boolean bCollision = false;
	JFrame mainFrame;
	JPanel mainPane = new JPanel();
	JPanel contentpane = new JPanel();
	JPanel scorepane = new JPanel();
	Icon icon = new ImageIcon("src/image/enemy3.gif");
	JLabel enemy = new JLabel(icon);

	Image buffImage;
	Image playerImg;
	Image enemyImg;
	Image enemyImg2;
	Image enemyImg3;
	Image rocketImg;
	Image backImg;
	Image collisionImg;
	Image bombImg;
	Image lifeImg;
	
	
	Graphics buffg;

	int direct = 0; //미사일 방향
	int score = 0;

	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	ArrayList<Collision> collisions = new ArrayList<>();
	ArrayList<Bomb>bombs = new ArrayList<>();

	Thread th;
	
	String playerName;
	
	int px, py;
	int MonsterCount = 5;
	int cnt = 0;
	int Tcnt = 0;
	final int FLYING_UNIT = 10;
	int stage = 1;
	int gameTime = 0;
	long startTime = System.currentTimeMillis();
	int playerLife = 5;
	
	
	public MoveCh2(String name) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerName = name;
		System.out.println(playerName);
		init();
		th = new Thread(this);
		th.start();
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout());
//		mainPane.setLayout(new CardLayout());
		contentpane.setSize(windowX, windowY);
//		contentpane.add(Name);
//		Name.setSize(200,200);
//		Name.setBounds(300, 300, 300, 100);
//		add(Name);
		this.setSize(windowX, windowY);
		this.setVisible(true);
		addKeyListener(this);
		mainPane.add(contentpane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}

	public void init() {
		px = 300;
		py = 300;
		Date startDate = new Date();
		playerImg = new ImageIcon("src/image/bullet.jpg").getImage();
		enemyImg = new ImageIcon("src/image/enemy1.gif").getImage();
		enemyImg2 = new ImageIcon("src/image/enemy2.gif").getImage();
		enemyImg3 = new ImageIcon("src/image/enemy3.gif").getImage();
		rocketImg = new ImageIcon("src/image/bullet2.jpg").getImage();
		backImg = new ImageIcon("src/image/back.jpg").getImage();
		collisionImg = new ImageIcon("src/image/collision.png").getImage();
		bombImg = new ImageIcon("src/image/bomb.jpg").getImage();
		lifeImg = new ImageIcon("src/image/life.png").getImage();
	}

	void makeEnemy() {
		switch (stage) {
		case 1:
			enemies.add(new Enemy(enemyImg, (int) (Math.random() * 500) + 50, (int) (Math.random() * 500) + 50));
			break;
		case 2:
			enemies.add(new Enemy(enemyImg2, (int) (Math.random() * 500) + 50, (int) (Math.random() * 500) + 50));
			break;			
		case 3:
			enemies.add(new Enemy(enemyImg3, (int) (Math.random() * 500) + 50, (int) (Math.random() * 500) + 50));
			break;			
		case 4:
//			long EndTime = System.currentTimeMillis();
//			int gameT = (int)(EndTime-startTime);
//			System.out.printf("%d초 걸림",(int)(EndTime-startTime)/1000);
//			System.out.println(playerName);
//			try {
//				pstmt = conn.prepareStatement(sql);
//				pstmt.setInt(1, gameT);
//				pstmt.setInt(2, score);
//				pstmt.setString(3, playerName);
//				pstmt.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			EndFrame.main(null);
//			this.dispose();
			
			break;
		}

	}

	@Override
	public void paint(Graphics g) {
		buffImage = createImage(1000, 1000);
		buffg = buffImage.getGraphics();
		buffg.drawImage(backImg, 0, 0, null);
		update(g);
	}

	@Override
	public void update(Graphics g) {
		drawEnemy();
		drawPlayer();
		drawRocket();
		drawCollision();
		drawScore();
		drawBomb();
		drawLife();
		g.drawImage(buffImage, 0, 0, this);
	}

	public void drawScore() {
		buffg.setFont(new Font("맑은고딕", Font.BOLD, 25));
		buffg.drawString("Stage : " + stage, 650, 100);
		buffg.drawString("Score : " + score, 650, 150);
		buffg.drawString("Monster : " + enemies.size(), 620, 200);
	}
	public void drawBomb()
	{
		for(int i=0; i<bombs.size(); i++)
		{
			Bomb b = (Bomb)bombs.get(i);
			buffg.drawImage(bombImg, b.x, b.y, this);
		}
	}
	

	public void drawCollision() {
		for (int i = 0; i < collisions.size(); i++) {
			Collision c = (Collision) collisions.get(i);
			buffg.drawImage(collisionImg, c.x, c.y, this);
			c.delCnt++;
			if (c.delCnt >= 5)
				collisions.remove(i);
		}
	}

	public void drawPlayer() {
		buffg.drawImage(playerImg, px, py, this);
	}

	public void drawEnemy() {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy e = (Enemy) enemies.get(i);
			buffg.drawImage(e.img, e.x, e.y, this);

		}
	}

	public void drawRocket() {
		for (int i = 0; i < rockets.size(); i++) {
			Rocket r = (Rocket) rockets.get(i);
			buffg.drawImage(rocketImg, r.x, r.y, this);
		}
	}
	public void drawLife()
	{
		int[] lifeArr = { 200, 260, 320, 380, 440};
		for(int i=0; i<playerLife; i++)
		{
			buffg.drawImage(lifeImg, lifeArr[i], 750, this);	
		}
	}
	public void BombP()
	{
		if(Tcnt % 25 ==0)
		{
			for(int i=0; i<enemies.size(); i++)
			{
				Enemy e = (Enemy)enemies.get(i);
				Bomb b = new Bomb(bombImg, e.x, e.y, (int)(Math.random()*4+1));
				bombs.add(b);
			}
		}
		for (int i=0; i<bombs.size(); i++)
		{
			Bomb b = (Bomb)bombs.get(i);
			b.move();
			if (b.x < 0 || b.x > 800 || b.y < 20 || b.y > 800) {
				bombs.remove(i);
			}
			if(Math.abs(px-b.x)<20&&Math.abs(py-b.y)<20)
			{
				System.out.println("미사일 맞음");
				collisions.add(new Collision(collisionImg, px, py));
				playerLife--;
				bombs.remove(i);
				if(playerLife==0)
				{
					//게임 오버
					GameOverFrame.main(playerName);
					this.dispose();
				}
			}
		}
	}

	public void RocketP() {
		if (KeySpace) {
			if (Tcnt % 3 == 0) {
				Rocket r = new Rocket(rocketImg, px, py, direct);
				rockets.add(r);
			}

		}
		for (int i = 0; i < rockets.size(); i++) {
			Rocket r = (Rocket) rockets.get(i);
			r.move();
			if (r.x < 0 || r.x > 800 || r.y < 20 || r.y > 800) {
				rockets.remove(i);
			}
			for (int j = 0; j < enemies.size(); j++) {
				Enemy e = (Enemy) enemies.get(j);
				if (Math.abs(r.x - e.x) < 20 && Math.abs(r.y - e.y) < 20) {
					rockets.remove(i);
					enemies.remove(j);
					score += 10;
					collisions.add(new Collision(collisionImg, r.x, e.y));
					if (enemies.size() == 0) {
						stage++;
						System.out.println("다음 스테이지로~");
						cnt = 0;
						if(stage==4){
							endGame();
						}
					}
				}
			}
		}
	}
	public void endGame()
	{
		long EndTime = System.currentTimeMillis();
		int gameT = (int)(EndTime-startTime)/1000;
		System.out.println(playerName);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gameT);
			pstmt.setInt(2, score);
			pstmt.setString(3, playerName);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EndFrame.main(null);
		this.dispose();
	}

	@Override
	public void run() {
		try {
			while (true) {
				while (cnt < MonsterCount) {
					makeEnemy();
					cnt++;
				}
				moveEnemy();
				KeyProcess();
				RocketP();
				BombP();
				Tcnt++;
				repaint();
				Thread.sleep(50);
			}
		} catch (Exception e) {

		}
	}

	public void moveEnemy() {

		for (int i = 0; i < enemies.size(); i++) {
			Enemy e = enemies.get(i);
			e.move();

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = true;
			direct = 1;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = true;
			direct = 2;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = true;
			direct = 4;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = true;
			direct = 3;
			break;

		case KeyEvent.VK_SPACE:
			KeySpace = true;
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = false;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = false;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = false;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = false;
			break;

		case KeyEvent.VK_SPACE:
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
			if (py  < 800)
				py += 5;
		}
		if (KeyLeft == true) {
			if (px > 0)
				px -= 5;
		}
		if (KeyRight == true) {
			if (px < 800)
				px += 5;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
class Bomb
{
	Image img;
	int x,y;
	int rand = 0;
	public Bomb(Image img, int x, int y, int rand) {
		// TODO Auto-generated constructor stub
		this.img = img;
		this.x = x;
		this.y = y;
		this.rand = rand;
	}
	void move()
	{
		switch(rand)
		{
			case 1:
				x -= 10;
				break;
			case 2:
				x += 10;
				break;
			case 3:
				y -= 10;
				break;
			case 4:
				y+=10;
				break;
		}
	}
	
	
}
class Collision {
	Image img;
	int x, y;
	int delCnt = 0;
	public Collision(Image collisionImg, int x, int y) {
		// TODO Auto-generated constructor stub
		this.img = collisionImg;
		this.x = x;
		this.y = y;
	}
}

class Rocket {
	Image img;
	int x, y, w, h;
	int width, height;
	int dir;

	public Rocket(Image rocketImg, int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.img = rocketImg;
		this.dir = dir;
	}

	public void move() {
		switch (dir) {
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

class Enemy {
	Image img;
	int x, y, w, h;
	int width, height;

	public Enemy(Image Img, int i, int j) {
		this.x = i;
		this.y = j;
		this.img = Img;
	}

	public void move() {
		int ran = (int) (Math.random() * 2);
		int tmpx, tmpy;
		if (ran == 1) {
			tmpx = this.x + (int) (Math.random() * 10);
			tmpy = this.y + (int) (Math.random() * 10);
		} else {
			tmpx = this.x - (int) (Math.random() * 10);
			tmpy = this.y - (int) (Math.random() * 10);
		}
		if (tmpx < 800 && tmpy < 800 && tmpx > 0 && tmpy > 40) {
			this.x = tmpx;
			this.y = tmpy;
		} else {
			move();
		}
	}
}

public class Test2 extends Thread {

	public static void main(String name) {
		new MoveCh2(name);

	}
}
