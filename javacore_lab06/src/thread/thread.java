package thread;


public class thread extends Thread {
	int mix =1000;
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Math.random());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		thread t1 = new thread();
		t1.start();
	}
}
