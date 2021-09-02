package thread;

import java.util.Calendar;
import java.util.Date;

public class Thread4 extends Thread {
	public void run() {
		Calendar cl = Calendar.getInstance();
		Date date = (Date) cl.getTime();
		System.out.println(date);
		System.out.println(Math.random()*100);
	}
	public static void main(String[] args) {
		Thread4 t = new Thread4();
		t.start();
	}
}
