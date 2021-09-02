package th4;

public class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double darius) {
		super(darius);
	}

	public Cylinder(double darius, String color) {
		super(darius, color);
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double darius, String color, double height) {
		super(darius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolum() {
		return super.getDarius();
	}
}
