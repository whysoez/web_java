package project_javacore;

import java.util.Scanner;

public class Categories implements ICategories {
	Scanner sc = new Scanner(System.in);

	private int catalogID;
	// Ma danh muc, phai la so nguyen lon hon 0, duy nhat
	private String catalogName;
	// Ten danh muc, phai bao gom 6-30 ky tu
	private String descriptions;
	// Mo ta danh muc, khong duoc de trong khi nhap
	private boolean catalogStatus;
	// Trang thai danh muc, nhan gia tri true hoac false khi nhap
	private int parenId;
	// Ma danh muc, khi nhap danh muc cha phai ton tai(chi quan ly toi da 3 cap danh
	// muc, danh muc goc co parenId=0)

	// Contructors

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(int catalogID, String catalogName, String descriptions, boolean catalogStatus, int parenId) {
		super();
		this.catalogID = catalogID;
		this.catalogName = catalogName;
		this.descriptions = descriptions;
		this.catalogStatus = catalogStatus;
		this.parenId = parenId;
	}

	// getter,setter

	public int getCatalogID() {
		return catalogID;
	}

	public void setCatalogID(int catalogID) {
		this.catalogID = catalogID;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public boolean isCatalogStatus() {
		return catalogStatus;
	}

	public void setCatalogStatus(boolean catalogStatus) {
		this.catalogStatus = catalogStatus;
	}

	public int getParenId() {
		return parenId;
	}

	public void setParenId(int parenId) {
		this.parenId = parenId;
	}

	@Override
	public void inputData(Scanner sc) {
		// TODO Auto-generated method stub
		do {
			System.out.println("Ten danh muc: ");
			this.catalogName = sc.nextLine();
			if (this.catalogName.length() > 6 && this.catalogName.length() < 30) {
				break;
			} else
				System.err.println("ten danh muc phai bao gom 6-30 ky tu");
		} while (true);

		do {
			System.out.println("Mo ta danh muc: ");
			this.descriptions = sc.nextLine();
			if (this.descriptions.length() != 0) {
				break;
			} else
				System.err.println("phai co mo ta danh muc");
		} while (true);
		
		System.out.println("Trang thai danh muc la: ");
		this.catalogStatus = Boolean.parseBoolean(sc.nextLine());
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	
	public String toString() {
		if (this.catalogStatus=true) {
			return "Categories. catalodId = "+this.catalogID+" - catalogName = "+this.catalogName+" - descriptions = "+this.descriptions+
					" - catalogStatus = Hoat dong - parenId = "+this.parenId;
		}
		else 
			return "Categories. catalodId = "+this.catalogID+" - catalogName = "+this.catalogName+" - descriptions = "+this.descriptions+
					" - catalogStatus = Khong hoat dong - parenId = "+this.parenId;
	}
}
