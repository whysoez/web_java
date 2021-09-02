package thread;

import java.util.Scanner;

public class Thread1 extends Thread {
	String[] cityName = new String[10];
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.printf("cityName[%d]: ",i);
			cityName[i] = sc.nextLine();
		}
	}
	
//	public static void main(String[] args) {
//		Thread1 t1 = new Thread1();
//		t1.start();
//	}
}
