package bkap.run;

import java.util.Scanner;
import bkap.*;

public class ManagementStudent {
	public static void main(String[] args) {
		//nhap thong tin sinh vien.
		Student01 student1 = new Student01();
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("nhap thong tin sinh vien: ");
		System.out.println("nhap ma so sinh vien 1:");
		student1.setstudentId(sc.nextLine());
		System.out.println("nhap  ten sinh vien:");
		student1.setstudentName(sc.nextLine());
		System.out.println("nhap tuoi sinh vien:");
		student1.setage(Integer.parseInt(sc.nextLine()));
		System.out.println("nhap so dien thoai sinh vien:");
		student1.setphone(sc.nextLine());
		System.out.println("nhap dia chi sinh vien:");
		student1.setaddress(sc.nextLine());
		System.out.println("nhap trang thai hoc tap cua sinh vien:");
		student1.setstatus(Boolean.parseBoolean(sc.nextLine()));
		}
		
		//nhap thong tin sinh vien 2
		Student01 student2 = new Student01("SV001", "trinh van cuong", 23, "0928372638", "trai duc", true);
		
		//nhap thong tin sinh vien 3
		Student01 student3 = new Student01();
		System.out.println("nhap thong tin sinh vien 3:");
		student3.inputData();
		
		//hien thi thong tin sinh vien.
		System.out.println("hien thi thong tin sinh vien:");
		System.out.printf("MSsv:%s - tensv:%s - tuoisv:%d ",student1.getstudentId(),student1.getstudentName(),student1.getage());
		System.out.printf(" - phone:%s - address:%s - status:%b.",student1.getphone(),student1.getaddress(),student1.getstatus());
		
		//hien thi thong tin sinh vien 2,3
		student2.displayData();
		student3.displayData();
	}
}
