package bt5;

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

public class ProductManagement {
	static List<Product> pts = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductManagement pt = new ProductManagement();
		
		do {
			System.out.println("***********MENU**************");
			System.out.println("1.Nhap thong tin n san pham");
			System.out.println("2.Sap xep san pham theo gia tang dan");
			System.out.println("3.Hien thi thong tin san pham");
			System.out.println("4.Ghi tat ca cac san pham co gia lon hon 500.000d ra file product.txt");
			System.out.println("5.Doc file product.txt va hien thi cac san pham co gia nho hon 1.000.000d");
			System.out.println("6.Thoat.");
			System.out.print("Nhap lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				pt.inputData(sc);
				break;
			case 2:
				pt.sortUp();
				break;
			case 3:
				pt.showData();
				break;
			case 4:
				pt.writerOfFile();
				break;
			case 5:
				pt.printProduct();
				break;
			case 6:
				System.exit(0);

			default:
				System.out.print("Nhap lai lua chon cua ban tu 1-6: ");
				break;
			}
		} while (true);
	}
	
	public void inputData(Scanner sc) {
		System.out.print("So luong san pham ban muon nhap la: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Product pt = new Product();
			pt.inputData(sc);
			pts.add(pt);
		}
	}
	
	public void sortUp() {
		Collections.sort(pts, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
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
		System.out.println("da sap xep xong!");
	}
	
	public void showData() {
		for (Product product : pts) {
			product.displayData();
		}
	}
	
	public void writerOfFile() {
		//Danh sach nhung san pham co gia lon hon 500.000d
		List<Product> npts = new ArrayList<>();
		for (Product product : pts) {
			if (product.getPrice()>500000) {
				npts.add(product);
			}
		}
		//Ghi danh sach san pham ra file
		try {
			//B1.Khoi tao doi tuong file
			File file = new File("Product.txt");
			//B2. Khoi tao doi tuong fileOutputStream
			FileOutputStream fos = new FileOutputStream(file);
			//B3. Khoi tao doi tuong ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//B4. Ghi Object ra file
			oos.writeObject(npts);
			//B5. Dong Stream
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("da ghi du lieu ra file Produc.txt");
	}
	
	public void printProduct() {
		List<Product> ls = new ArrayList<>();
		// Doc san pham tu file Product.txt
		try {
			//B1. Khoi tao doi tuong file
			File file = new File("Product.txt");
			//B2. Khoi tao doi tuong fileInputStream
			FileInputStream fis = new FileInputStream(file);
			//B3. Khoi tao doi tuong ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			//B4. Doc du lieu tu file ra List
			ls = (List<Product>)ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//san pham trong file Product.txt
		System.out.println("San pham co trong file Product.txt la: ");
		for (Product product : ls) {
			product.displayData();
		}
		List<Product> nls = new ArrayList<>();
		for (Product product : ls) {
			if (product.getPrice()>1000000) {
				nls.add(product);
			}
		}
		System.out.println("San pham co gia lon hon 1tr la: ");
		for (Product product : nls) {
			product.displayData();
		}
	}
}
