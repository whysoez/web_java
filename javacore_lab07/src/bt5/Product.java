package bt5;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable{
	private String proId;
	private String proName;
	private String producer;
	private int proMaking;
	private float price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String proId, String proName, String producer, int proMaking, float price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.producer = producer;
		this.proMaking = proMaking;
		this.price = price;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getProMaking() {
		return proMaking;
	}

	public void setProMaking(int proMaking) {
		this.proMaking = proMaking;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "Producut: ProId" + this.proId + " - proName=" + this.proName + " - producer=" + this.producer
				+ " - yearMaking=" + this.proMaking + " - price=" + this.price + " ";
	}

	public void inputData(Scanner sc) {
		System.out.println("Id cua san pham la: ");
		this.setProId(sc.nextLine());
		System.out.println("Ten cua san pham la: ");
		this.setProName(sc.nextLine());
		System.out.println("nguoi lam ra san pham la: ");
		this.setProducer(sc.nextLine());
		System.out.println("Nam san xuat san pham la: ");
		this.setProMaking(Integer.parseInt(sc.nextLine()));
		System.out.println("Gia cua san pham la: ");
		this.setPrice(Float.parseFloat(sc.nextLine()));
	}

	public void displayData() {
		System.out.println(this.toString());
	}

}
