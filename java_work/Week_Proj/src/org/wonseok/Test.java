package org.wonseok;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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





class MoveCh extends JFrame {

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
	
	int direct = 0;
	
	Timer bulletTimer = null;
	
	int score = 0;
	
	JLabel[] stage1 = new JLabel[3];
	JLabel scoreLabel = new JLabel("점수 : " + score);
	
	ArrayList Monster = new ArrayList<>();
	
	
//	ArrayList enemy_List = new ArrayList();
//	ArrayList bullet_List = new ArrayList();
//	
//	Image buffImage;
//	Graphics buffg;
	
	public void createEnemy(int stage) {
		for (int i = 0; i < stage1.length; i++) {
			int ranx = (int) (Math.random() * windowX-50);
			int rany = (int) (Math.random() * windowY-50);
			stage1[i] = new JLabel(icon);
			stage1[i].setLocation(ranx, rany);
			stage1[i].setSize(40, 40);
			Monster.add(stage1[i]);
			contentpane.add(stage1[i]);
		}
	}

	public void enemyMove(JLabel monster) {
		monster.setLocation(monster.getX() + (int) (Math.random() * monsterMoveRadius), monster.getY() + (int) (Math.random() * monsterMoveRadius));
	}

	Timer timer = new Timer(500, new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < stage1.length; i++) {
				enemyMove(stage1[i]);
			}
		}
	});

	final int FLYING_UNIT = 10;

	public MoveCh() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPane);
		mainPane.setLayout(new BorderLayout());
		la.setLocation(250, 250);
		la.setSize(20, 20);
		createEnemy(1);
		contentpane.add(la);
		timer.start();
		contentpane.setSize(windowX, windowY);
//		contentpane.backg
		this.setSize(windowX+300, windowY);
		this.setVisible(true);
		mainPane.addKeyListener(new MyKeyListener());
		mainPane.requestFocus();
		mainPane.add(contentpane, BorderLayout.CENTER);
		contentpane.setVisible(true);
		mainPane.add(scorepane,BorderLayout.EAST);
	}
	public void createB(int dir) {
		JLabel bb = new JLabel(bImage);
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
						if ((stage1[i].getX() - 10 <= bb.getX() && bb.getX() <= stage1[i].getX() + 10)
								&& (stage1[i].getY() - 10 <= bb.getY() && bb.getY() <= stage1[i].getY() + 10)) {
//							System.out.println("충돌");
//							if(Monster.get(i) != null){
//								Monster.remove(i);
//							}
							
							contentpane.remove(bb);
							contentpane.remove(stage1[i]);
							contentpane.repaint();
							
							Container parent = la.getParent();
							Component[] checkcount = parent.getComponents();
							for(int j=0; j<checkcount.length; j++)
							{
								System.out.println(checkcount[i].getName());
							}
							
//							System.out.println(Monster.size());
//							score++;
//							System.out.println(stage1.length);
							
//							checkMonster();
						}
					}
				}
				if (bb.getX()<0||bb.getX()>windowX||bb.getY()<0||bb.getY()>windowY) {
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
//			System.out.println(Monster.size()+" "+stage1.length);
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

}

public class Test {

	public static void main(String[] args) {
		new MoveCh();

	}
}
