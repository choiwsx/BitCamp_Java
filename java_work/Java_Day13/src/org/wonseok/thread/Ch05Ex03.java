package org.wonseok.thread;

public class Ch05Ex03 implements Runnable{
	
	@Override
	public void run()
	{
		for(int i=0; i<50; i++)
		{
		
			System.out.println("스레드 실행"+i);
			try {
				if(i==20)
				{
					synchronized (this) {
						this.wait();
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
	}
	
	//메인에서 제어하는 함수를 만들어 준다.
	//상태 전이
	public void restart()
	{
		synchronized (this) {
			this.notify();
		}
	}
	
	public void stop()
	{
		synchronized (this) {
			this.stop();
		}
	}
	
	
	
	public static void main(String[] args) {
			Ch05Ex03 r = new Ch05Ex03();
			Thread t = new Thread(r);
			t.start();
			
			Thread m = Thread.currentThread();
			
			for(int i=0; i<50; i++)
			{
				System.out.println("메인스레드 실행"+i);
				try {
					if(i==30)
					{
//						r.restart();
//						stop은 사용하지 않는것이 좋음
						m.stop();
					}
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
	}
}
