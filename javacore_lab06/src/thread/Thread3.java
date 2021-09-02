package thread;

public class Thread3 extends Thread1 {
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(super.cityName[i]);
			} catch (Exception e) {
				System.err.println("error!");
			}
		}
	}

	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.start();
//		Thread1 t1 = new Thread1();
//		t1.start();
//		t1.setPriority(MAX_PRIORITY);
//		t3.setPriority(NORM_PRIORITY);
	}
}
