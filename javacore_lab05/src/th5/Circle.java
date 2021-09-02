package th5;

public class Circle extends Shape {
	private double radius = 1.0;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}

}
