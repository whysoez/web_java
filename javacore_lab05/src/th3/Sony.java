package th3;

public class Sony extends DigitalCamere {
	private String autoFocus;
	private String panorama;

	public Sony() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sony(String make, String model, int megapixels, double price, String autoFocus, String panorama) {
		super(make, model, megapixels, price);
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}

	public void showDetails() {
		System.out.printf("make: %s - model: %s - megapixels: %d - price: %f - autoFocus: %s - panorama: %s", model,
				megapixels, price, autoFocus, panorama);
	}

	public void capture() {
		System.out.println("may anh Sony.");
	}
}
