package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkap.entity.City;

public class CityManagement extends City {
	static List<City> cts = new ArrayList<>();

	public static void main(String[] args) {
		CityManagement c = new CityManagement();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*********MENU**********");
			System.out.println("1.nhap thong tin cho cac tinh thanh pho");
			System.out.println("2.tinh mat do dan so thanh pho");
			System.out.println("3.hien thi thong tin tat ca thanh pho");
			System.out.println("4.tim kiem thanh pho theo ten thanh pho");
			System.out.println("5.hien thi cac thanh pho theo ten tinh");
			System.out.println("6.sap xep thanh pho theo dan so tang dan");
			System.out.println("7.sap xep thanh pho theo mat do dan so giam dan");
			System.out.println("8.thoat!");
			System.out.print("lua chon chuc nang: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				c.inputList(sc);
				break;
			case 2:
				c.calPopulation();
				break;
			case 3:
				c.displayList();
				break;
			case 4:
				c.search(sc);
				break;
			case 5:
				c.displayName(sc);
				break;
			case 6:
				c.upPopulation();
				break;
			case 7:
				c.downPopulation();

				break;
			case 8:
				System.exit(0);

			default:
				System.out.print("nhap lai 1-8: ");
				break;
			}
		} while (true);
	}

	public void inputList(Scanner sc) {
		System.out.println("so luong thanh pho muon nhap thong tin la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < n; k++) {
			City ct = new City();
			System.out.println("ma thanh pho: ");
			do {
				try {
					String str = sc.nextLine();
					if (str.length() == 4) {
						if (str.startsWith("C")) {
							boolean check = false;
							for (City city : cts) {
								if (city.getCityId().equals(str)) {
									check = true;
									break;
								}
							}
							if (check) {
								System.err.println("ma thanh pho da ton tai");
							} else {
								ct.setCityId(str);
								break;
							}
						} else
							System.err.println("ky tu phai bat dau bang C");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("phai co 4 ky tu,vui long nhap lai");
				}
			} while (true);

			System.out.println("ten thanh pho: ");
			do {
				try {
					String str = sc.nextLine();
					if (str.length() < 60 || str.length() > 6) {
						str = str.toLowerCase();
						str = str.trim();
						String strCh = "";
						strCh += Character.toUpperCase(str.charAt(0));
						for (int i = 1; i < str.length(); i++) {
							if (str.charAt(i) == ' ') {
								// xu ly cac ky tu space
								strCh += Character.toUpperCase(str.charAt(i));
								for (int j = i + 1; j < str.length(); j++) {
									if (str.charAt(j) == ' ') {
										i++;
									} else {
										break;
									}
								}
							} else {
								if (str.charAt(i - 1) == ' ') {
									strCh += Character.toUpperCase(str.charAt(i));
								} else {
									strCh += str.charAt(i);
								}
							}
						}
						boolean check = false;
						for (City city : cts) {
							if (city.getCityName().equals(str)) {
								check = true;
								break;
							}
						}
						if (check) {
							System.err.println("ten thanh pho da ton tai");
						} else {
							ct.setCityName(strCh);
							break;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("phai co do dai tu 6-60.");
				}
			} while (true);

			ct.inputData();
		}
	}

	public void calPopulation() {
		for (City city : cts) {
			city.calConsistence();
		}
	}

	public void displayList() {
		for (City city : cts) {
			city.displayData();
		}
	}

	public void search(Scanner sc) {
		System.out.println("nhap ten thanh pho ban muon tim: ");
		String name = sc.nextLine();
		boolean check = false;
		for (City city : cts) {
			if (name.toLowerCase() == city.getCityName().toLowerCase()) {
				city.displayData();
				check = true;
				break;
			}
		}
		if (!check) {
			System.out.println("khong co thanh pho ma ban can tim.");
		}
	}

	public void displayName(Scanner sc) {
		System.out.println("nhap ten tinh ban muon tim: ");
		String name = sc.nextLine();
		boolean check = false;
		for (City city : cts) {
			if (name.toLowerCase() == city.getProvince().toLowerCase()) {
				System.out.println(city.getCityName());
				check = true;
			}
		}
		if (!check) {
			System.out.println("khong co tinh ban muon tim.");
		}
	}

	public void upPopulation() {
		for (int i = 0; i < cts.size() - 1; i++) {
			for (int j = i; j < cts.size(); j++) {
				if (cts.get(i).getPopulation() > cts.get(j).getPopulation()) {
					City temp = cts.get(j);
					cts.set(j, cts.get(i));
					cts.set(i, temp);
				}
			}
		}
		for (City city : cts) {
			city.displayData();
		}
	}

	public void downPopulation() {
		for (int i = 0; i < cts.size() - 1; i++) {
			for (int j = i; j < cts.size(); j++) {
				if (cts.get(i).getConsistence() < cts.get(j).getConsistence()) {
					City temp = cts.get(j);
					cts.set(j, cts.get(i));
					cts.set(i, temp);
				}
			}
		}
		for (City city : cts) {
			city.displayData();
		}
	}
}
