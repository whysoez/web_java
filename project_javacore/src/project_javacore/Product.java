package project_javacore;

import java.util.Scanner;

public class Product implements IProduct{
	Scanner sc = new Scanner(System.in);

	private String producId;
	// Ma san pham, bat dau bang chu "C" va phai la duy nhat
	private String productName;
	// Ten san pham, bao gom 5-60 ky tu va la duy nhat
	private String title;
	// Tieu de, bao gom 5-30 ky tu
	private float importPrice;
	// Gia san pham, la so thuc lon hon 0
	private float exportPrice;
	// Gia ban san pham, so thuc co gia tri lon hon gia ban it nhat MIN_RATE lan
	private float profit;
	// Loi nhuan san pham, tinh bang cong thuc profit = exportPrice - importPrice
	private String descreptions;
	// Mo ta san pham, khi nhap khong duoc de trong
	private boolean productStatus;
	// Trang thai san pham, chi nhan gia tri true hoac false
	private Categories catalog;
	// Danh muc san pham cua san pham
	
	// Contructors
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String producId, String productName, String title, float importPrice, float exportPrice,
			float profit, String descreptions, boolean productStatus, Categories catalog) {
		super();
		this.producId = producId;
		this.productName = productName;
		this.title = title;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.profit = profit;
		this.descreptions = descreptions;
		this.productStatus = productStatus;
		this.catalog = catalog;
	}

	
	// Getters, Setters
	

	public String getProducId() {
		return producId;
	}

	public void setProducId(String producId) {
		this.producId = producId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(float importPrice) {
		this.importPrice = importPrice;
	}

	public float getExportPrice() {
		return exportPrice;
	}

	public void setExportPrice(float exportPrice) {
		this.exportPrice = exportPrice;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	public String getDescreptions() {
		return descreptions;
	}

	public void setDescreptions(String descreptions) {
		this.descreptions = descreptions;
	}

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}

	public Categories getCatalog() {
		return catalog;
	}

	public void setCatalog(Categories catalog) {
		this.catalog = catalog;
	}

	@Override
	public void inputData(Scanner sc) {
		do {
			System.out.println("Tieu de san pham: ");
			this.title = sc.nextLine();
			if (this.title.length()>6 && this.title.length()<30) {
				break;
			}
			else
				System.err.println("tieu de phai bao gom 6-30 ky tu.");
		} while (true);
		
		do {
			System.out.println("Gia san pham nhap vao: ");
			try {
				this.importPrice = Float.parseFloat(sc.nextLine());
				if (this.importPrice>0) {
					break;
				}
				else
					System.err.println("importPrice phai la so thuc lon hon 0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
		
		do {
			System.out.println("Gia san pham ban ra: ");
			this.exportPrice  = Float.parseFloat(sc.nextLine());
			if (this.exportPrice>this.importPrice*MIN_INTEREST_RATE) {
				break;
			}
			else
				System.err.println("Gia san pham ban ra phai lon hon gia tri MIN_RATE lan.");
		} while (true);
		
		do {
			System.out.println("Mo ta san pham: ");
			this.descreptions = sc.nextLine();
			if (this.descreptions.length()!=0) {
				break;
			}
			else 
				System.err.println("hay nhap mo ta san pham");
		} while (true);
		
		do {
			System.out.println("Trang thai san pham: ");
			this.productStatus = Boolean.parseBoolean(sc.nextLine());
			if (this.productStatus==true || this.productStatus ==false) {
				break;
			}
			else
				System.err.println("trang thai san pham phai la true hoac false. Vui long nhap lai!");
		} while (true);
		

	}

	@Override
	public void displayData() {
		System.out.println(this.toString());
	}

	@Override
	public void calProfit() {
		this.profit=this.exportPrice-this.importPrice;
	}
	
	public String toString() {
		if (this.productStatus==true) {
			return "Product. ProductId = "+this.producId+" - ProductName = "+this.productName+" - Title = "+this.title+" - ImportPrice = "
					+this.importPrice+" - ExportPrice = "+this.exportPrice+" - profit = "+this.profit+
					" - desciption = "+this.descreptions+" - productStatus = Hoat dong - catalog = "+this.catalog;
		}
		else
			return "Product. ProductId = "+this.producId+" - ProductName = "+this.productName+" - Title = "+this.title+" - ImportPrice = "
			+this.importPrice+" - ExportPrice = "+this.exportPrice+" - profit = "+this.profit+
			" - desciption = "+this.descreptions+" - productStatus = Khong hoat dong - catalog = "+this.catalog;
	}

}
