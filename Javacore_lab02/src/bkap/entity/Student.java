package bkap.entity;

import java.util.Scanner;

import bkap.ift.IStudent;

public class Student implements IStudent {
	private String studentId;
	private String studentName;
	private int age;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;
	private boolean status;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentId, String studentName, int age, float diemToan, float diemHoa, float diemLy,
			float diemTB, boolean status) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
		this.diemTB = diemTB;
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("ma sinh vien: ");
		setStudentId(sc.nextLine());
		System.out.println("ten sinh vien: ");
		setStudentName(sc.nextLine());
		System.out.println("age: ");
		setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("diem toan: ");
		setDiemToan(Float.parseFloat(sc.nextLine()));
		System.out.println("diem hoa: ");
		setDiemHoa(Float.parseFloat(sc.nextLine()));
		System.out.println("diem ly: ");
		setDiemLy(Float.parseFloat(sc.nextLine()));
		System.out.println("diem trung binh: ");
		setDiemTB(Float.parseFloat(sc.nextLine()));
		System.out.println("Status: ");
		setStatus(Boolean.getBoolean(sc.nextLine()));

	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.printf("ID = %s - Name = %s - age = %d \n", studentId, studentName, age);
		System.out.printf("diem toan: %f - diem ly: %f - diem hoa: %f - diemtb: %f - status: %b", diemToan, diemLy,
				diemHoa, diemTB, status);
	}

	public void diemTrungBinh() {
		diemTB = (diemHoa + diemLy + diemToan) / 3;
//		System.out.println("tinh xong diemtb!");
	}

	public void currentStatus() {
		if (diemTB > MARK_PASS) {
			status = true;
			System.out.println("pass!");
		} else {
			status = false;
			System.out.println("fail!");
		}
	}
}
