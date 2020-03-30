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
			System.out.println("MP3�� ��á����");
		}
	}
	public void play()
	{
		while(top>0)
		{
			musics[--top].play();
		}
		System.out.println("�� �̻� ������ ���� ����");
	}	
}


class Music{
	private String Singer;
	private String Song;
	private MusicPlayer mp3;
	
	public Music() {
		// TODO Auto-generated constructor stub
		this("������������","�뷡������");
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
		System.out.println(Singer+"�� "+Song + " �������Դϴ�.");
	}
}



public class Ch04Ex102 {
	public static void main(String[] args) {
		Music m1 = new Music("���","3!4!");
		Music m2 = new Music();
		m2.setSinger("����");
		m2.setSong("1��2����1");
		Music m3 = new Music("�̼���","��~�����̿�");
		Music m4 = new Music("��Ŭ","¥���");
		Music m5 = new Music("god","����");
		Music m6 = new Music("������","���ø�ο�");
//		Music m7 = new Music("������","���ø�ο�");
//		Music m8 = new Music("������","���ø�ο�");
		
//		m1.play(); //����� 3!4!�� �������Դϴ�.
//		m2.play(); //������ 1��2����1 �������Դϴ�.
//		m3.play(); //�̼����� ��~�����̿� �������Դϴ�.
	
		MusicPlayer mp = new MusicPlayer();
		//�ִ� 7�� ���� �߰� ����.
		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(m4);
		mp.add(m5);
		mp.add(m6);
	// �ָ� ���� : ��ȭ��ȣ�θ� �����Ѵ�.(Ŭ������ �ִ��� ���� ���� �����ϼ���.)
		mp.play();
	}
}
