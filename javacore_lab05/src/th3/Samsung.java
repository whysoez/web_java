package th3;

public class Samsung extends DigitalCamere {
	private String autoFocus;
	private String panorama;

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samsung(String make, String model, int megapixels, double price, String autoFocus, String panorama) {
		super(make, model, megapixels, price);
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}

	public void showDetails() {
		super.showDetails();
		System.out.printf("make: %s - model: %s - megapixels: %d - price: %f - autoFocus: %s - panorama: %s",
				super.make, super.model, super.megapixels, super.price, autoFocus, panorama);
	}

	public void capture() {
		System.out.println("may anh Samsung.");
	}
}
