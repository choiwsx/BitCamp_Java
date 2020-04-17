package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
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

class Enemy {
	int x;
	int y;

	int speed;

	public Enemy(int x, int y, int speed) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	public void move() {
		x += (int) (Math.random() * 1000);
		y += (int) (Math.random() * 1000);
	}
}

class MoveCh2 extends JFrame implements Runnable {

	final int windowX = 1000;
	final int windowY = 1000;
	final int monsterMoveRadius = 20;
	final int bulletSpped = 10;

	JFrame mainFrame;
	JPanel mainPane = new JPanel();
	JPanel contentpane = new JPanel();
	JPanel scorepane = new JPanel();
	ImageIcon image1 = new ImageIcon("src/image/bullet.jpg"); // 주인공 이미지
	ImageIcon bImage = new ImageIcon("src/image/bullet2.jpg"); // 총알 이미지
	ImageIcon enemy1 = new ImageIcon("src/image/enemy2.gif");
	Icon icon = new ImageIcon("src/image/enemy3.gif");
	JLabel la = new JLabel(image1, JLabel.CENTER);
	JLabel bulletL = new JLabel(bImage, JLabel.CENTER);
	JLabel enemy = new JLabel(icon);
	
	Thread th;
	int direct = 0;

	Timer bulletTimer = null;

	int score = 0;

	JLabel[] stage1 = new JLabel[3];
	JLabel scoreLabel = new JLabel("점수 : " + score);

	ArrayList enemy_List = new ArrayList();
	ArrayList bullet_List = new ArrayList();
	//

	Enemy en;

	Image buffImage;
	Graphics buffg;

//	public void createEnemy(int stage) {
//		for (int i = 0; i < stage1.length; i++) {
//			int ranx = (int) (Math.random() * windowX - 50);
//			int rany = (int) (Math.random() * windowY - 50);
//			stage1[i] = new JLabel(icon);
//			stage1[i].setLocation(ranx, rany);
//			stage1[i].setSize(40, 40);
//			contentpane.add(stage1[i]);
//		}
//	}

	public void enemyMove(JLabel monster) {
		monster.setLocation(monster.getX() + (int) (Math.random() * monsterMoveRadius),
				monster.getY() + (int) (Math.random() * monsterMoveRadius));
	}

//	Timer timer = new Timer(500, new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			for (int i = 0; i < stage1.length; i++) {
//				enemyMove(stage1[i]);
//			}
//		}
//	});

	final int FLYING_UNIT = 10;

	public MoveCh2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout());
		la.setLocation(250, 250);
		la.setSize(20, 20);
		// createEnemy(1);
		contentpane.add(la);
		th = new Thread(this);
		th.start();
//		timer.start();
		contentpane.setSize(windowX, windowY);
		// contentpane.backg
		scorepane.setSize(300, windowY);
		this.setSize(windowX + 300, windowY);
		this.setVisible(true);
		mainPane.addKeyListener(new MyKeyListener());
		mainPane.requestFocus();
		mainPane.add(contentpane, BorderLayout.CENTER);
		scorepane.add(scoreLabel);
		mainPane.add(scorepane, BorderLayout.EAST);
	}

	public void createB(int dir) {
		JLabel bb = new JLabel(bImage);
		System.out.println("총알발사");
		bb.setLocation(la.getLocation());
		bb.setSize(20, 20);
		contentpane.add(bb);
		ActionListener bulletAction = null;
		bulletTimer = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bb.isEnabled()) {
					switch (dir) {
					case 1:
						bb.setLocation(bb.getX(), bb.getY() - 10);
						break;
					case 2:
						bb.setLocation(bb.getX(), bb.getY() + 10);
						break;
					case 3:
						bb.setLocation(bb.getX() + 10, bb.getY());
						break;
					case 4:
						bb.setLocation(bb.getX() - 10, bb.getY());
						break;
					}
					for (int i = 0; i < stage1.length; i++) {
						if ((stage1[i].getX() - 20 <= bb.getX() && bb.getX() <= stage1[i].getX() + 20)
								&& (stage1[i].getY() - 20 <= bb.getY() && bb.getY() <= stage1[i].getY() + 20)) {
							System.out.println("충돌");

							Container parent = la.getParent();
							contentpane.remove(bb);
							contentpane.remove(stage1[i]);
							contentpane.repaint();
							// score++;
							// System.out.println(stage1.length);

							// checkMonster();
						}
					}
				}
				if (bb.getX() < 0 || bb.getX() > windowX || bb.getY() < 0 || bb.getY() > windowY) {
					contentpane.remove(bb);
				}
			}
		});
		bulletTimer.start();
	}

	class MyKeyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				direct = 1;
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				direct = 2;
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				direct = 3;
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				direct = 4;
				break;
			case KeyEvent.VK_SPACE:
				createB(direct);
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				EnemyThread();
				repaint();
				Thread.sleep(20);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void EnemyThread() {
		if (enemy_List.size() == 0) {
			for (int i = 0; i < 5; i++) {
				en = new Enemy((int) (Math.random() * 1000), (int) (Math.random() * 1000), 10);
				enemy_List.add(en);
			}
		} else {
			for (int i = 0; i < enemy_List.size(); i++) {
				en = (Enemy) enemy_List.get(i);
				en.move();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		buffImage = createImage(, height)
	}

}

public class Test2 {

	public static void main(String[] args) {
		new MoveCh2();

	}
}