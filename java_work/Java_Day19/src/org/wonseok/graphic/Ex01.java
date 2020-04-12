package org.wonseok.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.wonseok.MyFrame;

public class Ex01 extends MyFrame {
	public Ex01() {
		// TODO Auto-generated constructor stub
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("페인트 메소드 호출");
	
		g.setColor(Color.BLUE);
		g.fill3DRect(50, 50, 100, 100, true);
		
		g.setColor(Color.RED);
		Font font = new Font("Arial",Font.BOLD,30);
		g.setFont(font);	
		g.drawString("Heeeellllooo", 250, 100);
		
//		String imageSrc = 
		File imageSrc = new File("1.jpg");
		BufferedImage img;
		try {
			img = ImageIO.read(imageSrc);
			g.drawImage(img, 200, 200, 100, 100, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//		g.drawRect(50, 50, 100, 100);
	}
	private void reapint() {
		// TODO Auto-generated method stub
		System.out.println("리페인트 메소드 호출!");
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
}
