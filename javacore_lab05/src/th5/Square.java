package th5;

public class Square extends Rectangle {
	private double side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		super.setLength(length);
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", getSide()=" + getSide() + ", getWidth()=" + getWidth() + ", getLength()="
				+ getLength() + ", getColor()=" + getColor() + "]";
	}

}
