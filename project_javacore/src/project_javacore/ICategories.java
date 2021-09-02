package project_javacore;

import java.io.Serializable;
import java.util.Scanner;

public interface ICategories extends Serializable {
	Scanner sc = new Scanner(System.in);
	// Nhap thong tin danh muc san pham
	public void inputData(Scanner sc);
	// Hien thi thong tin danh muc san pham
	public void displayData();
}
