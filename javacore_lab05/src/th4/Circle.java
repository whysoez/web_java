package th4;

public class Circle {
	private double darius = 1.0;
	private String color = "red";

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double darius) {
		super();
		this.darius = darius;
	}

	public Circle(double darius, String color) {
		super();
		this.darius = darius;
		this.color = color;
	}

	public double getDarius() {
		return darius;
	}

	public void setDarius(double darius) {
		this.darius = darius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [darius=" + darius + ", color=" + color + "]";
	}

}
