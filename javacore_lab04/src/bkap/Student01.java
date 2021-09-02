package bkap;

import java.util.Scanner;

public class Student01 {
	private String studentId;
	private String studentName;
	private int age;
	private String phone;
	private String address;
	private boolean status;
	
	public Student01() {
		
	}
	public Student01(String studentId, String studentName, int age, String phone, String address, boolean status) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.status = status;
	}
	
	public String getstudentId() {
		return studentId;
	}
	
	public void setstudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public String getphone() {
		return phone;
	}
	
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public boolean getstatus() {
		return status;
	}
	
	public void setstatus(boolean status) {
		this.status = status;
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ma so sinh vien");
		this.studentId = sc.nextLine();
		System.out.println("nhap vao ten sinh vien");
		this.studentName = sc.nextLine();
		System.out.println("nhap vao tuoi sinh vien");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("nhap vao so dien thoai sinh vien");
		this.phone = sc.nextLine();
		System.out.println("nhap vao dia chi nha sinh vien");
		this.address = sc.nextLine();
		System.out.println("trang thai cua sinh vien");
		this.status = Boolean.parseBoolean(sc.nextLine());
		
	}
	
	public void displayData() {
		System.out.printf("ma so sinh vien: %s - ten sinh vien: %s - tuoi sinh vien: %d\n",this.studentId,this.studentName,this.age);
		System.out.printf("so dien thoai: %s - dia chi: %s - trang thai: %b.",this.phone,this.address,this.status);
	}
}
