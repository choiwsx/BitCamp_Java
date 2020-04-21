package org.wonseok;

public class Player {
	String name;
	int time;
	int score;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public Player(String name, int time, int score) {
		super();
		this.name = name;
		this.time = time;
		this.score = score;
	}
	
	
	
	
}
