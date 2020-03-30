package org.wonseok;


class MusicPlayer{
	private Music[] musics = new Music[7];
	static int top = 0;
	
	public void add(Music m)
	{
		if(top<musics.length){
			musics[top++] = m;
		}
		else
		{
			System.out.println("MP3가 꽉찼슴다");
		}
	}
	public void play()
	{
		while(top>0)
		{
			musics[--top].play();
		}
		System.out.println("더 이상 실행할 곡이 없슴");
	}	
}


class Music{
	private String Singer;
	private String Song;
	private MusicPlayer mp3;
	
	public Music() {
		// TODO Auto-generated constructor stub
		this("가수누군지모름","노래뭔지모름");
	}
	public Music(String Singer, String Song) {
		// TODO Auto-generated constructor stub
		this.Singer = Singer;
		this.Song = Song;

	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public String getSong() {
		return Song;
	}
	public void setSong(String song) {
		Song = song;
	}
	public void play()
	{
		System.out.println(Singer+"의 "+Song + " 실행중입니다.");
	}
}



public class Ch04Ex102 {
	public static void main(String[] args) {
		Music m1 = new Music("룰라","3!4!");
		Music m2 = new Music();
		m2.setSinger("투투");
		m2.setSong("1과2분의1");
		Music m3 = new Music("이선희","아~옛날이여");
		Music m4 = new Music("핑클","짜장면");
		Music m5 = new Music("god","광대");
		Music m6 = new Music("아이유","마시멜로우");
//		Music m7 = new Music("아이유","마시멜로우");
//		Music m8 = new Music("아이유","마시멜로우");
		
//		m1.play(); //룰라의 3!4!를 실행중입니다.
//		m2.play(); //투투의 1과2분의1 실행중입니다.
//		m3.play(); //이선희의 아~옛날이여 실행중입니다.
	
		MusicPlayer mp = new MusicPlayer();
		//최대 7곡 까지 추가 가능.
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(m4);
		mp.add(m5);
		mp.add(m6);
	// 주말 과제 : 전화번호부를 구현한다.(클래스를 최대한 많이 만들어서 구현하세요.)
		mp.play();
	}
}
