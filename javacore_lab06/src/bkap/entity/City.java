package bkap.entity;

import java.util.Scanner;

import bkap.ICity;

public class City implements ICity {
	private String cityId;
	private String cityName;
	private String province;
	private double area;
	private int population;
	private double consistence;
	private boolean status;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String cityId, String cityName, String province, double area, int population, double consistence,
			boolean status) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.province = province;
		this.area = area;
		this.population = population;
		this.consistence = consistence;
		this.status = status;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getConsistence() {
		return consistence;
	}

	public void setConsistence(double consistence) {
		this.consistence = consistence;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void calConsistence() {
		this.consistence = this.population / this.area;
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("province: ");
		this.province = sc.nextLine();
		if(this.province.length()==0)
			this.province = "Trung Uong";
		
		System.out.println("are: ");
		do {
			try {
				this.area = Double.parseDouble(sc.nextLine());
				if(this.area >0) {
					break;
				}else
					System.err.println("vui long nhap lai so lon hon 0.");
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("dien tich phai la so thuc lon hon 0, vui long nhap lai.");
			}
		} while (true);
		
		System.out.println("population: ");
		do {
			try {
				this.population = Integer.parseInt(sc.nextLine());
				if(this.population >0) {
					break;
				}else
					System.err.println("vui long nhap lai so nguyen lon hon 0.");
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("dan so phai la so nguyen.");
			}
		} while (true);
		
		System.out.println("status: ");
		do {
			String str = sc.nextLine();
			try {
				if(str.equals(true)||str.equals(false)) {
					this.status = Boolean.parseBoolean(str);
					break;
				}else
					System.err.println("gia tri status phai la true hoac false.");
			} catch (Exception e) {
				// : handle exception
				System.err.println("vui long nhap lai.");
			}
		} while (true);
	}
	
	

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.printf("cityId=%s cityName=%s province=%s are=%f", cityId, cityName, province, area);
		System.out.printf("consistence=%f population=%d status=%b", consistence, population, status);
	}
}
