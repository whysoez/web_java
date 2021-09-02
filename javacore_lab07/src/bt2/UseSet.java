package bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class UseSet {
	
	static List<City> cts = new ArrayList<>();
	static SortedSet<City> ct = new TreeSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UseSet us = new UseSet();
		do {
			System.out.println("***********MENU**********");
			System.out.println("1.nhap danh sach gom n thanh pho");
			System.out.println("2.hien thi danh sach thanh pho ra man hinh");
			System.out.println("3.hien thi danh sach sap xep tang dan");
			System.out.println("4.thoat.");
			System.out.print("nhap lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				us.inputData(sc);
				break;
			case 2:
				us.displayData();
				break;
			case 3:
				us.sortComparator();;
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("nhap lua chon 1-4: ");
				break;
			}
		} while (true);
	}
	
	public void inputData(Scanner sc) {
		System.out.print("so thanh pho ban muon nhap danh sach la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			City c = new City();
			System.out.println("cityId :");
			c.setCityId(sc.nextLine());
			System.out.println("cityName: ");
			c.setCityName(sc.nextLine());
			System.out.println("status: ");
			c.setStatus(Boolean.parseBoolean(sc.nextLine()));
			cts.add(c);
		}
		System.out.println("da nhap xong!");
	}
	
	public void displayData() {
		for (City city : cts) {
			System.out.println(city.toString());
		}
	}
	
	public void up() {
		for (int i = 0; i < cts.size(); i++) {
			ct.add(cts.get(i));
		}
	}
	
	public void sort() {
		Collections.sort(cts);
		System.out.println("danh sach da duoc sap xep.");
	}
	
	public void sortComparator() {
		Collections.sort(cts, new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if (Integer.parseInt(o1.getCityId())>Integer.parseInt(o2.getCityId())) {
					return 1;
					}
				else if (Integer.parseInt(o1.getCityId())==Integer.parseInt(o2.getCityId())) {
					return 0;
				}
				else {
					return -1;
				}
			}
			
		});
	}
}
