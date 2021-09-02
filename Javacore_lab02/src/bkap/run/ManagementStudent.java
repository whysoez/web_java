package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkap.entity.Student;

public class ManagementStudent {
	static List<Student> st = new ArrayList<>();

	public static void main(String[] args) {
		ManagementStudent mn = new ManagementStudent();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("***********MENU*************");
			System.out.println("1.nhap thong tin n sinh vien");
			System.out.println("2.tinh diem trung binh sinh vien");
			System.out.println("3.xet diem qua cho sinh vien");
			System.out.println("4.hien thi thong tin sinh vien");
			System.out.println("5.thoat!");
			System.out.print("nhap lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				mn.input(sc);
				break;
			case 2:
				mn.diemTB();
				break;
			case 3:
				mn.xetDiem();
				break;
			case 4:
				mn.in();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("nhap lai 1-5:");
				break;
			}
		} while (true);
	}

	public void input(Scanner sc) {
		for (int i = 0; i < st.size(); i++) {
			Student s = new Student();
			s.inputData();
			st.add(s);
		}
	}
	
	public void diemTB() {
		for (int i = 0; i < st.size(); i++) {
			st.get(i).diemTrungBinh();
		}
		System.out.println("tinh xong!");
	}
	
	public void xetDiem() {
		for (int i = 0; i < st.size(); i++) {
			st.get(i).currentStatus();
		}
		System.out.println("xet xong!");
	}
	
	public void in() {
		for (int i = 0; i < st.size(); i++) {
			st.get(i).displayData();
		}
	}
}
