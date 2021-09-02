package bkap.entity;

import java.util.Scanner;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	
	//contructor default
	public Employee() {
}
	
	//contructor 
	public Employee(String employeeId, String employeeName, int age, float rate, float salary, boolean employeeStatus) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	
	public String getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age =age;
	}
	
	public float getrate() {
		return rate;
	}
	public void setrate(float rate) {
		this.rate = rate;
	}
	
	public float getsalary() {
		return salary;
	}
	public void setsalary(float salary) {
		this.salary = salary;
	}
	
	public boolean getemployeeStatus() {
		return employeeStatus;
	}
	public void setemployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	
	
	//nhap thong tin nhan vien
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so nhan vien:");
		this.employeeId = sc.nextLine();
		System.out.println("nhap ten nhan vien:");
		this.employeeName = sc.nextLine();
		System.out.println("nhap tuoi nhan vien:");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("nhap he so luong nhan vien:");
		this.rate = Float.parseFloat(sc.nextLine());
		System.out.println("nhap trang thai nhan vien:");
		this.employeeStatus = Boolean.parseBoolean(sc.nextLine());
	}
	
	//hien thi thong tin nhan vien
	public void displayData() {
		System.out.printf("msnv:%s - tennv:%s - tuoinv:%d - ",this.employeeId,this.employeeName,this.age);
		System.out.printf("hsl:%f - salary:%f - status:%b.",this.rate,this.salary,this.employeeStatus);
	}
	
	public void calSalary() {
		this.salary = this.rate*1300000;
	}
}
	
	
