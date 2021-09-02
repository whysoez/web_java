package th3;

public abstract class DigitalCamere {
	protected String make;
	protected String model;
	protected int megapixels;
	protected double price;
	
	public DigitalCamere() {
		super();
	}
	
	public DigitalCamere(String make, String model, int megapixels, double price) {
		this.make = make;
		this.model = model;
		this.megapixels = megapixels;
		this.price = price;
	}
	
	public void showDetails() {
		System.out.printf("make: %s - model: %s - megapixels: %d - price: %f.",make,model,megapixels,price);
	}
	
	public abstract void capture();
}
