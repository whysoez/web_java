package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bkap.entity.Employee;

public class Test {
	static List<Employee> listemp = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		do {
			System.out.println("************MENU************");
			System.out.println("1.nhap thong tin cho n nhan vien");
			System.out.println("2.tinh luong tat ca nhan vien");
			System.out.println("3.hien thi thong tin tat ca nhan vien");
			System.out.println("4.sap xep nhan vien theo luong tang dan");
			System.out.println("5.tim kiem nhan vien theo ten nhan vien");
			System.out.println("6.cap nhat trang thai nhan vien theo ma nhan vien");
			System.out.println("7.thoat.");
			System.out.println("Nhap lua cho cua ban:");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				t.inputEmp(sc);
				break;
			case 2:
				t.outSalary();
				break;
			case 3:
				for (Employee employee : listemp) {
					employee.displayData();
					System.out.println(" ");
				}
				break;
			case 4:
				t.sort();
				break;
			case 5:
				t.search(sc);
				break;
			case 6:
				t.update(sc);
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("vui long chon 1-7:");
				break;
			}
		} while (true);
	}
	
	public void inputEmp(Scanner sc) {
		System.out.println("nhap vao so luong nhan vien:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Employee emp = new Employee();
			System.out.println("nhan vien"+(i+1));
			emp.inputData();
			listemp.add(emp);
		}
	}
	
	public void outSalary() {
		for (Employee employee : listemp) {
			int i=1;
			employee.calSalary();
			System.out.println("luong cua nhan vien"+i+" la: "+employee.getsalary());
			i++;
		}
		System.out.println("da tinh luong xong.");
	}
	
	public void sort() {
		for (int i = 0; i < listemp.size()-1; i++) {
			for (int j = i+1; j < listemp.size(); j++) {
				if (listemp.get(i).getsalary()>listemp.get(j).getsalary()) {
					Employee temp = listemp.get(i);
					listemp.set(i, listemp.get(j));
					listemp.set(j, temp);
				}
			}
		}
		System.out.println("da sap xep xong.");
	}
	
	public void search(Scanner sc) {
		System.out.println("nhap ten nhan vien can tim: ");
		String name = sc.nextLine();
		boolean check = false;
		for (Employee employee : listemp) {
			if (employee.getemployeeName().equals(name)) {
				employee.displayData();
				check = true;
			}
		}
		if (!check) {
			System.out.println("khong co nhan vien can tim.");
		}
	}
	
	public void update(Scanner sc) {
		for (Employee employee : listemp) {
			System.out.println("trang thai nhan vien"+employee.getemployeeName()+" la: ");
			employee.setemployeeStatus(Boolean.parseBoolean(sc.nextLine()));
		}
	}

}
