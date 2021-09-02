package project_javacore;

import java.io.Serializable;
import java.util.Scanner;

public interface IProduct extends Serializable {
	Scanner sc = new Scanner(System.in);
	
	// Lai suat nho nhat tren tung san pham
	final float MIN_INTEREST_RATE = 0.2f;
	
	// Nhap thong tin san pham
	public void inputData(Scanner sc);
	// Hien thi thong tin san pham
	public void displayData();
	// Tinh loi nhuan tren tat ca san pham
	public void calProfit();
}
