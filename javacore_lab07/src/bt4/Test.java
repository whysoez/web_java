package bt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	static List<Book> bs = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		do {
			System.out.println("**********MENU***********");
			System.out.println("1.Nhap thong tin cho n sach");
			System.out.println("2.Hien thi thong tin sach");
			System.out.println("3.Hien thi thong tin theo gia sach giam dan ");
			System.out.println("4.Hien thi thong tin theo gia sach tang dan");
			System.out.println("5.Thoat.");
			System.out.print("Nhap su lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				t.inputData(sc);
				break;
			case 2:
				t.displayData();
				break;
			case 3:
				t.sortDown();
				break;
			case 4:
				t.sortUp();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.print("vui long nhap tu 1-5:");
				break;
			}
		} while (true);
	}
	
	public void inputData(Scanner sc) {
		System.out.print("so luong sach ban muon nhap la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Book b = new Book();
			System.out.println("isbn: ");
			b.setIsbn(sc.nextLine());
			System.out.println("bookName: ");
			b.setBookName(sc.nextLine());
			System.out.println("author: ");
			b.setAuthor(sc.nextLine());
			System.out.println("pulisher: ");
			b.setPubliher(sc.nextLine());
			System.out.println("price: ");
			b.setPrice(Float.parseFloat(sc.nextLine()));
			bs.add(b);
		}
		
	}
	
	public void displayData() {
		for (Book book : bs) {
			System.out.println(book);
		}
	}
	
	public void sortDown() {
		Collections.sort(bs, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
			if (o1.getPrice()>o2.getPrice()) {
				return 1;
			}
			else if(o1.getPrice()==o2.getPrice()) {
				return 0;
			}
			else
				return -1;
			}
			
		});
	}
	
	public void sortUp() {
		Collections.sort(bs, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
			if (o1.getPrice()>o2.getPrice()) {
				return -1;
			}
			else if(o1.getPrice()==o2.getPrice()) {
				return 0;
			}
			else
				return 1;
			}
			
		});
	}
}
