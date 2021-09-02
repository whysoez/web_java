package bkap.lab05;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", getAddress()=" + getAddress()
				+ ", getName()=" + getName() + "]";
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
