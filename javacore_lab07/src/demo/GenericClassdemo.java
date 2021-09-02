package demo;

public class GenericClassdemo<I, V> {
	I a;
	V b;
	public I getA() {
		return a;
	}
	public void setA(I a) {
		this.a = a;
	}
	public V getB() {
		return b;
	}
	public void setB(V b) {
		this.b = b;
	}
	public void inputData() {
		
	}
	public void displayData() {
		System.out.println("gia tri a la: "+this.a+" gia tri b la: "+this.b);
	}
	
	public <a> void abs(a[] arr) {
		System.out.println("gia tri cua a la: ");
		for (a a : arr) {
			System.out.println(a);
		}
	}
}
