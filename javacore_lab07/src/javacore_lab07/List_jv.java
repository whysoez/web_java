package javacore_lab07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class List_jv {
	static List<String> st = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List_jv l = new List_jv();
		do {
			System.out.println("**********MENU*********");
			System.out.println("1.nhap danh sach gom n so nguyen");
			System.out.println("2.hien thi danh sach ra man hinh");
			System.out.println("3.hien thi danh sach sap xep tang dan");
			System.out.println("4.thoat.");
			System.out.print("nhap lua chon cua ban: ");
			int choi;
			choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				l.input(sc);
				break;
			case 2:
				l.display();
				break;
			case 3:
				l.up();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.print("vui long nhap lai 1-4: ");
				break;
			}

		} while (true);
	}

	public List_jv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void input(Scanner sc) {
		System.out.print("so luong sach can nhap thong tin la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.printf("thong tin sach %d la: ", i);
			st.add(sc.nextLine());
		}
	}
	
	public void display() {
		Iterator<String> li = st.iterator();
		while (li.hasNext()) {
			String string = (String) li.next();
			System.out.println(string);
		}
	}
	
	public void up() {
		for (int i = 0; i < st.size()-1; i++) {
			for (int j = i+1; j < st.size(); j++) {
				if (st.get(i).compareTo(st.get(j))>0) {
					String tmp = st.get(i);
					st.set(i, st.get(j));
					st.set(j, tmp);
				}
			}
		}
		System.out.println("da sap xep xong!");
	}
}
