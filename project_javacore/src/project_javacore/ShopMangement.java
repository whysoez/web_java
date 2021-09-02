package project_javacore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShopMangement {
	// Danh sach danh muc san pham
	static List<Categories> cts = new ArrayList<>();
	// Danh sach san pham
	static List<Product> pts = new ArrayList<>();
	// Cac danh muc duoc luu tru trong file categories.txt
	// Cac san pham duoc luu tru trong file product.txt

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShopMangement sm = new ShopMangement();

		sm.readObjectToFile();
		do {
			System.out.println("**************MENU***************");
			System.out.println("1. Quan ly danh muc");
			System.out.println("2. Quan ly san pham");
			System.out.println("3. Thoat.");
			System.out.print("Su lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				int choi1;
				do {
					System.out.println("***********QUAN LY DANH MUC**************");
					System.out.println("1. Danh sach danh muc");
					System.out.println("2. Them danh muc");
					System.out.println("3. Xoa danh muc");
					System.out.println("4. Tim kiem danh muc");
					System.out.println("5. Quay lai");
					System.out.print("Su lua chon cua ban: ");
					choi1 = Integer.parseInt(sc.nextLine());
					switch (choi1) {
					case 1:
						int choi2;
						do {
							System.out.println("**********DANH SACH DANH MUC***********");
							System.out.println("1. Danh sach cay danh muc");
							System.out.println("2. Thong tin chi tiet danh muc");
							System.out.println("3. Quay lai.");
							System.out.print("Su lua chon cua ban: ");
							choi2 = Integer.parseInt(sc.nextLine());
							switch (choi2) {
							case 1:
								sm.displayDataCategories111();
								break;
							case 2:
								sm.detailCategories112(sc);
								break;
							case 3:
								break;
							default:
								System.out.println("Vui long chon 1-3: ");
								break;
							}
						} while (choi2 != 3);
						break;
					case 2:
						// Cho phep them nhieu danh muc
						sm.inputCategories12(sc);
						break;
					case 3:
						// Cho phep xoa danh muc theo ma danh muc
						sm.deleteCategories13(sc);
						break;
					case 4:
						// Cho phep tim kiem danh muc theo ten danh muc
						sm.searchCategories14(sc);
						break;
					case 5:
						break;
					default:
						System.out.println("Vui long chon 1-5: ");
						break;
					}
				} while (choi1 != 5);
				break;
			case 2:
				int choi3;
				do {
					System.out.println("***************QUAN LY SAN PHAM**************");
					System.out.println("1. Them san pham moi");
					System.out.println("2. Tinh loi nhuan san pham");
					System.out.println("3. Hien thi thong tin san pham");
					System.out.println("4. Sap xep san pham");
					System.out.println("5. Cap nhat thong tin san pham");
					System.out.println("6. Cap nhat trang thai san pham");
					System.out.println("7. Quay lai.");
					System.out.println("Nhap su lua chon cua ban: ");
					choi3 = Integer.parseInt(sc.nextLine());
					switch (choi3) {
					case 1:
						// Cho phep them nhieu san pham vao danh muc da co
						sm.inputProduct21(sc);
						break;
					case 2:
						// Cho phep tinh loi nhuan cac san pham dang quan ly
						sm.ceculatorFrefit22();
						break;
					case 3:
						int choi4;
						do {
							System.out.println("**********THONG TIN SAN PHAM**********");
							System.out.println("1. Hien thi san pham theo danh muc");
							System.out.println("2. Hien thi chi tiet san pham");
							System.out.println("3. Quay lai.");
							System.out.println("Su lua chon cua ban la: ");
							choi4 = Integer.parseInt(sc.nextLine());
							switch (choi4) {
							case 1:
								sm.displayProduct231(sc);
								break;
							case 2:
								sm.displayDetailProduct232(sc);
								break;
							case 3:
								break;
							default:
								System.out.println("Vui long nhap 1-3: ");
								break;
							}
						} while (choi4 != 3);
						break;
					case 4:
						int choi5;
						do {
							System.out.println("************SAP XEP SAN PHAM************");
							System.out.println("1. Sap xep san pham theo gia suat tang dan");
							System.out.println("2. Sap xep san pham theo loi nhuan giam dan");
							System.out.println("3. Quay lai.");
							System.out.println("Su lua chon cua ban la: ");
							choi5 = Integer.parseInt(sc.nextLine());
							switch (choi5) {
							case 1:
								sm.sortUp241();
								break;
							case 2:
								sm.sortDown242();
								break;
							case 3:
								break;
							default:
								System.out.println("Vui long chon 1-3: ");
								break;
							}
						} while (choi5 != 3);
						break;
					case 5:
						sm.updateInfoProduct25(sc);
						break;
					case 6:
						sm.updateStatusProduct26(sc);
						break;
					case 7:
						break;
					default:
						System.out.println("Vui long chon 1-7: ");
						break;
					}
				} while (choi3 != 7);
				break;
			case 3:
				sm.writerFileToObject();
				System.exit(0);
			default:
				System.out.println("Vui long chon lai 1-3: ");
				break;
			}
		} while (true);
		
	}

	public void displayDataCategories111() {
		int i = 1;
		for (Categories ct : cts) {
			if (ct.getParenId() == 0) {
				System.out.println(i + ". " + ct.getCatalogName());
				int j = 1;
				for (Categories ct1 : cts) {
					if (ct1.getParenId() == ct.getCatalogID()) {
						System.out.println("\t" + i + "." + j + ". " + ct1.getCatalogName());
						int k = 1;
						for (Product product : pts) {
							if (product.getCatalog().getCatalogID() == ct1.getCatalogID()) {
								System.out.println("\t\t" + i + "." + j + "." + k + ". " + product.getProductName());
								k++;
							}
						}
						j++;
					}
				}
				i++;
			}
		}
	}

	public void detailCategories112(Scanner sc) {
		System.out.println("Nhap vao ten danh muc ban muon xem thong tin: ");
		String t = sc.nextLine();
		boolean check = true;
		for (Categories ct : cts) {
			if (ct.getCatalogName().startsWith(t)) {
				System.out.println(ct.toString());
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co ma danh muc ma ban dang tim kiem.");
		}
	}

	public void inputCategories12(Scanner sc) {
		System.out.println("So luong danh muc muon them la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Categories ct = new Categories();
			do {
				try {
					System.out.println("Ma danh muc san pham la: ");
					ct.setCatalogID(Integer.parseInt(sc.nextLine()));
					if (ct.getCatalogID() > 0) {
						boolean check = true;
						for (Categories categories : cts) {
							if (ct.getCatalogID() == categories.getCatalogID()) {
								check = false;
								break;
							}
						}
						if (check) {
							break;
						} else
							System.err.println("Ma danh muc san pham da ton tai. Vui long nhap lai!");
					} else
						System.err.println("Ma danh muc phai la so nguyen lon hon 0");
				} catch (Exception e) {
					System.err.println("Ma danh muc phai la so nguyen");
				}
			} while (true);

			ct.inputData(sc);

			System.out.println("Ma danh muc cha cua danh muc la: ");
			do {
				try {
					String t = sc.nextLine();
					if (t.length() == 0) {
						ct.setParenId(0);
					} else {
						ct.setParenId(Integer.parseInt(t));
						boolean check = true;
						for (Categories categories : cts) {
							if (ct.getParenId() == categories.getParenId()) {
								check = false;
								break;
							}
						}
						if (!check) {
							break;
						} else
							System.err.println("Ma danh muc cha khong ton tai");
					}
				} catch (Exception e) {
					System.err.println("Ma danh muc cha phai la so nguyen");
				}
			} while (true);
			cts.add(ct);
		}
	}

	public void deleteCategories13(Scanner sc) {
		System.out.println("Ma danh muc ban muon xoa la: ");
		int i = Integer.parseInt(sc.nextLine());
		boolean check = true;
		for (Categories ct : cts) {
			if (ct.getCatalogID() == i) {
				cts.remove(i);
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co ma san pham ban muon xoa.");
		}
	}

	public void searchCategories14(Scanner sc) {
		System.out.println("Ten danh muc ban muon tim la: ");
		String t = sc.nextLine();
		boolean check = true;
		for (Categories ct : cts) {
			if (ct.getCatalogName() == t) {
				System.out.println(ct.toString());
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co danh muc ban muon tim.");
		}
	}

	public void inputProduct21(Scanner sc) {
		System.out.println("So luong san pham ban muon them la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Product pt = new Product();
			this.bonusInput(sc, pt);
			pts.add(pt);
		}
	}

	public void ceculatorFrefit22() {
		for (Product product : pts) {
			product.calProfit();
		}
		System.out.println("Da tinh xong loi nhuan.");
	}

	public void displayProduct231(Scanner sc) {
		System.out.println("Ten san pham ban muon xem la: ");
		String t = sc.nextLine();
		boolean check = true;
		for (Product product : pts) {
			if (product.getProductName() == t) {
				for (Categories ct : cts) {
					if (ct.getCatalogID() == product.getCatalog().getCatalogID()) {
						System.out.println(ct.getCatalogName());
					}
				}
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co san pham ban muon tim.");
		}
	}

	public void displayDetailProduct232(Scanner sc) {
		System.out.println("Ten san pham ban muon xem la: ");
		String t = sc.nextLine();
		boolean check = true;
		for (Product product : pts) {
			if (product.getProductName() == t) {
				System.out.println(product.toString());
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co san pham ban muon tim.");
		}
	}

	public void sortUp241() {
		Collections.sort(pts, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getExportPrice() < o2.getExportPrice()) {
					return 1;
				} else if (o1.getExportPrice() == o2.getExportPrice()) {
					return 0;
				} else
					return -1;
			}
		});
		System.out.println("Da sap xep san pham theo gia tang dan!");
	}

	public void sortDown242() {
		Collections.sort(pts, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getProfit() > o2.getProfit()) {
					return 1;
				} else if (o1.getProfit() == o2.getProfit()) {
					return 0;
				} else
					return -1;
			}
		});
		System.out.println("Da sap xep san pham theo loi nhuan giam dan!");
	}

	public void updateInfoProduct25(Scanner sc) {
		System.out.println("Ma san pham ban muon cap nhat thong tin la: ");
		String t = sc.nextLine();
		boolean check = true;
		for (Product product : pts) {
			if (product.getProducId() == t) {
				this.bonusInput(sc, product);
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Khong co ma san pham ban muon chinh sua.");
		}
	}

	public void updateStatusProduct26(Scanner sc) {
		System.out.println("Ma san pham ban muon cap nhat trang thai la: ");
		String i = sc.nextLine();
		boolean check = true;
		for (Product product : pts) {
			if (product.getProducId() == i) {
				product.setProductStatus(!product.isProductStatus());
				check = false;
				break;
			}
		}
		if (check) {
			System.err.println("Khong co ma san pham ban muon thay doi.");
		}
	}

	public void bonusInput(Scanner sc, Product pt) {
		do {
			try {
				System.out.println("Danh muc san pham cua san pham la: ");
				int idCatalog = Integer.parseInt(sc.nextLine());
				boolean check = true;
				for (Categories ct : cts) {
					if (ct.getCatalogID() == idCatalog) {
						pt.setCatalog(ct);
						check = false;
						break;
					}
				}
				if (check) {
					System.err.println("Ma danh muc san pham khong ton tai, vui long nhap lai.");
				} else
					break;

			} catch (Exception e) {
				System.err.println("Ma danh muc san pham phai la so nguyen, vui long nhap lai.");
			}
		} while (true);

		do {
			System.out.println("Ma san pham la: ");
			pt.setProducId(sc.nextLine());
			if (pt.getProducId().startsWith("C")) {
				if (pt.getProducId().length() == 4) {
					boolean check = true;
					for (Product product : pts) {
						if (pt.getProducId() == product.getProducId()) {
							check = false;
							break;
						}
					}
					if (!check) {
						System.err.println("Ma san pham da ton tai. Vui long nhap lai.");
					} else
						break;
				} else
					System.err.println("Ma san pham phai co do dai 4 ky tu, vui long nhap lai.");
			} else
				System.err.println("Ma san pham phai bat dau bang chu \"C\", vui long nhap lai.");
		} while (true);

		do {
			System.out.println("Ten san pham la: ");
			pt.setProductName(sc.nextLine());
			if (pt.getProductName().length() > 6 && pt.getProductName().length() < 50) {
				boolean check = true;
				for (Product product : pts) {
					if (pt.getProductName() == product.getProductName()) {
						check = false;
						break;
					}
				}
				if (!check) {
					System.err.println("Ten san pham da ton tai, vui long nhap lai.");
				} else
					break;
			} else
				System.err.println("Ten san pham phai co do dai tu 5-60 ky tu, vui long nhap lai.");
		} while (true);

		pt.inputData(sc);
		pt.calProfit();
	}
	
	public void writerFileToObject() {
		try {
			// Khoi tao doi tuong file
			File file = new File("Product.txt");
			File file1 = new File("Categories.txt");
			// Khoi tao doi tuong fileOuputStream
			FileOutputStream fos = new FileOutputStream(file);
			FileOutputStream fos1 = new FileOutputStream(file1);
			// Khoi tao doi tuong ObjectoutputStream
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			ObjectOutputStream ous1 = new ObjectOutputStream(fos1);
			// Viet du lieu ra file
			ous.writeObject(pts);
			ous1.writeObject(cts);
			// dong luong
			ous.close();
			ous1.close();
			fos.close();
			fos1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readObjectToFile() {
		try {
			// Khoi tao doi tuong file
			File file = new File("Product.txt");
			File file1 = new File("Categories.txt");
			// Khoi tao doi tuong fileInputStream
			FileInputStream fis = new FileInputStream(file);
			FileInputStream fis1 = new FileInputStream(file1);
			// Khoi tao doi tuong ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectInputStream ois1 = new ObjectInputStream(fis1);
			// Ghi object ra file
			pts = (List<Product>) ois.readObject();
			cts = (List<Categories>) ois1.readObject();
			// dong luong
			fis1.close();
			fis.close();
			ois.close();
			ois1.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
