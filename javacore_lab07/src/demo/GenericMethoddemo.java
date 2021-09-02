package demo;

public class GenericMethoddemo {
	public <i> void display(i[] arr) {
		for (i i : arr) {
			System.out.println(i);
		}
	}
}
